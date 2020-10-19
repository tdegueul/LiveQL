grammar QL;
options {backtrack=true; memoize=true; output=AST; ASTLabelType=CommonTree;}

tokens {
	FORM;
	BLOCK;
	COND;
	QUESTION;
}

@parser::header
{
package nl.cwi.swat.liveql.parser.antlr;
import nl.cwi.swat.liveql.ast.expr.*;
import nl.cwi.swat.liveql.ast.stat.*;
import nl.cwi.swat.liveql.ast.form.*;
}

@lexer::header
{
package nl.cwi.swat.liveql.parser.antlr;
}

@parser::members {
    @Override
    public void reportError(RecognitionException e) {
        throw new RuntimeException(e);
    }
}

form returns [Form result]
  : 'form' Ident body=block { $result = new Form(new Ident($Ident.text, $Ident.getLine()), $body.result); } -> ^(FORM Ident block)
  ;
  
block returns [Block result]
@init { List<Stat> stats = new ArrayList<Stat>(); }
  : t='{' ( s=stat { stats.add($s.result); } )* '}' { $result = new Block(stats, $t.getLine()); } -> ^(BLOCK stat*)
  ;
  
stat returns [Stat result]
  : 'if' '(' c=orExpr ')' tru=stat 'else' fls=stat { $result = new IfThenElse($c.result, $tru.result, $fls.result); } -> ^(COND orExpr stat)
  | 'if' '(' c=orExpr ')' tru=stat { $result = new IfThen($c.result, $tru.result); } -> ^(COND orExpr stat)
  | b=block { $result = $b.result; }
  | l=label name=Ident ':' t=type '(' e=orExpr ')' { $result = new Computed($l.result, new Ident($name.text, $name.getLine()), $t.result, $e.result); }
  	-> ^(QUESTION label Ident type orExpr)
  | l=label name=Ident ':' t=type { $result = new Answerable($l.result, new Ident($name.text, $name.getLine()), $t.result); } 
  	-> ^(QUESTION label Ident type)  
  ;

label returns [Label result]
  : Str { $result = new Label($Str.text, $Str.getLine()); }
  ;
  
type returns [nl.cwi.swat.liveql.ast.types.Type result]
  : t='int' { $result = new nl.cwi.swat.liveql.ast.types.Int(t.getLine()); }
  | t='str' { $result = new nl.cwi.swat.liveql.ast.types.Str(t.getLine()); }
  | t='bool' { $result = new nl.cwi.swat.liveql.ast.types.Bool(t.getLine()); }
  ;
  
primary returns [Expr result]
  : Int   { $result = new Int(Integer.parseInt($Int.text), $Int.getLine()); }
  | Ident { $result = new Ident($Ident.text, $Ident.getLine()); }
  | Str   { $result = new Str($Str.text, $Str.getLine()); }
  | bool  { $result = $bool.result; }
  | '(' x=orExpr ')'{ $result = $x.result; } -> ^(orExpr)
  ;
  
bool returns [Expr result]
  : t='true'  { $result = new Bool(true, $t.getLine()); }
  | t='false' { $result = new Bool(false, $t.getLine()); }
  ;
    
unExpr returns [Expr result]
    :  '+' x=unExpr { $result = new Pos($x.result); }
    |  '-' x=unExpr { $result = new Neg($x.result); }
    |  '!' x=unExpr { $result = new Not($x.result); }
    |  x=primary    { $result = $x.result; }
    ;    
    
mulExpr returns [Expr result]
    :   lhs=unExpr { $result=$lhs.result; } ( op=( '*' | '/' )^ rhs=unExpr 
    { 
      if ($op.text.equals("*")) {
        $result = new Mul($result, $rhs.result);
      }
      if ($op.text.equals("<=")) {
        $result = new Div($result, $rhs.result);      
      }
    })*
    ;
    
  
addExpr returns [Expr result]
    :   lhs=mulExpr { $result=$lhs.result; } ( op=('+' | '-')^ rhs=mulExpr
    { 
      if ($op.text.equals("+")) {
        $result = new Add($result, $rhs.result);
      }
      if ($op.text.equals("-")) {
        $result = new Sub($result, $rhs.result);      
      }
    })*
    ;
  
relExpr returns [Expr result]
    :   lhs=addExpr { $result=$lhs.result; } ( op=('<'|'<='|'>'|'>='|'=='|'!=')^ rhs=addExpr 
    { 
      if ($op.text.equals("<")) {
        $result = new LT($result, $rhs.result);
      }
      if ($op.text.equals("<=")) {
        $result = new LEq($result, $rhs.result);      
      }
      if ($op.text.equals(">")) {
        $result = new GT($result, $rhs.result);
      }
      if ($op.text.equals(">=")) {
        $result = new GEq($result, $rhs.result);      
      }
      if ($op.text.equals("==")) {
        $result = new Eq($result, $rhs.result);
      }
      if ($op.text.equals("!=")) {
        $result = new NEq($result, $rhs.result);
      }
    })*
    ;
    
andExpr returns [Expr result]
    :   lhs=relExpr { $result=$lhs.result; } ( '&&'^ rhs=relExpr { $result = new And($result, $rhs.result); } )*
    ;
    

orExpr returns [Expr result]
    :   lhs=andExpr { $result = $lhs.result; } ( '||'^ rhs=andExpr { $result = new Or($result, $rhs.result); } )*
    ;

    
// Tokens
WS  :	(' ' | '\t' | '\n' | '\r') { $channel=HIDDEN; }
    ;

COMMENT 
     : '/*' .* '*/' {$channel=HIDDEN;}
    ;

Ident:   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

Int: ('0'..'9')+;

Str: '"' .* '"';
