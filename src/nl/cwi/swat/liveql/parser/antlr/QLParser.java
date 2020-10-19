// $ANTLR 3.5.2 src/nl/cwi/swat/liveql/parser/antlr/QL.g 2020-10-15 21:22:22

package nl.cwi.swat.liveql.parser.antlr;
import nl.cwi.swat.liveql.ast.expr.*;
import nl.cwi.swat.liveql.ast.stat.*;
import nl.cwi.swat.liveql.ast.form.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class QLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "COMMENT", "COND", "FORM", 
		"Ident", "Int", "QUESTION", "Str", "WS", "'!'", "'!='", "'&&'", "'('", 
		"')'", "'*'", "'+'", "'-'", "'/'", "':'", "'<'", "'<='", "'=='", "'>'", 
		"'>='", "'bool'", "'else'", "'false'", "'form'", "'if'", "'int'", "'str'", 
		"'true'", "'{'", "'||'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int BLOCK=4;
	public static final int COMMENT=5;
	public static final int COND=6;
	public static final int FORM=7;
	public static final int Ident=8;
	public static final int Int=9;
	public static final int QUESTION=10;
	public static final int Str=11;
	public static final int WS=12;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public QLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public QLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[40+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return QLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "src/nl/cwi/swat/liveql/parser/antlr/QL.g"; }


	    @Override
	    public void reportError(RecognitionException e) {
	        throw new RuntimeException(e);
	    }


	public static class form_return extends ParserRuleReturnScope {
		public Form result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "form"
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:31:1: form returns [Form result] : 'form' Ident body= block -> ^( FORM Ident block ) ;
	public final QLParser.form_return form() throws RecognitionException {
		QLParser.form_return retval = new QLParser.form_return();
		retval.start = input.LT(1);
		int form_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal1=null;
		Token Ident2=null;
		ParserRuleReturnScope body =null;

		CommonTree string_literal1_tree=null;
		CommonTree Ident2_tree=null;
		RewriteRuleTokenStream stream_Ident=new RewriteRuleTokenStream(adaptor,"token Ident");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:32:3: ( 'form' Ident body= block -> ^( FORM Ident block ) )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:32:5: 'form' Ident body= block
			{
			string_literal1=(Token)match(input,31,FOLLOW_31_in_form86); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_31.add(string_literal1);

			Ident2=(Token)match(input,Ident,FOLLOW_Ident_in_form88); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Ident.add(Ident2);

			pushFollow(FOLLOW_block_in_form92);
			body=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(body.getTree());
			if ( state.backtracking==0 ) { retval.result = new Form(new Ident((Ident2!=null?Ident2.getText():null), Ident2.getLine()), (body!=null?((QLParser.block_return)body).result:null)); }
			// AST REWRITE
			// elements: Ident, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 32:109: -> ^( FORM Ident block )
			{
				// src/nl/cwi/swat/liveql/parser/antlr/QL.g:32:112: ^( FORM Ident block )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORM, "FORM"), root_1);
				adaptor.addChild(root_1, stream_Ident.nextNode());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, form_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "form"


	public static class block_return extends ParserRuleReturnScope {
		public Block result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:35:1: block returns [Block result] : t= '{' (s= stat )* '}' -> ^( BLOCK ( stat )* ) ;
	public final QLParser.block_return block() throws RecognitionException {
		QLParser.block_return retval = new QLParser.block_return();
		retval.start = input.LT(1);
		int block_StartIndex = input.index();

		CommonTree root_0 = null;

		Token t=null;
		Token char_literal3=null;
		ParserRuleReturnScope s =null;

		CommonTree t_tree=null;
		CommonTree char_literal3_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		 List<Stat> stats = new ArrayList<Stat>(); 
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:37:3: (t= '{' (s= stat )* '}' -> ^( BLOCK ( stat )* ) )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:37:5: t= '{' (s= stat )* '}'
			{
			t=(Token)match(input,36,FOLLOW_36_in_block130); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_36.add(t);

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:37:11: (s= stat )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==Str||LA1_0==32||LA1_0==36) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:37:13: s= stat
					{
					pushFollow(FOLLOW_stat_in_block136);
					s=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stat.add(s.getTree());
					if ( state.backtracking==0 ) { stats.add((s!=null?((QLParser.stat_return)s).result:null)); }
					}
					break;

				default :
					break loop1;
				}
			}

			char_literal3=(Token)match(input,38,FOLLOW_38_in_block143); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_38.add(char_literal3);

			if ( state.backtracking==0 ) { retval.result = new Block(stats, t.getLine()); }
			// AST REWRITE
			// elements: stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 37:99: -> ^( BLOCK ( stat )* )
			{
				// src/nl/cwi/swat/liveql/parser/antlr/QL.g:37:102: ^( BLOCK ( stat )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				// src/nl/cwi/swat/liveql/parser/antlr/QL.g:37:110: ( stat )*
				while ( stream_stat.hasNext() ) {
					adaptor.addChild(root_1, stream_stat.nextTree());
				}
				stream_stat.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, block_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "block"


	public static class stat_return extends ParserRuleReturnScope {
		public Stat result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:40:1: stat returns [Stat result] : ( 'if' '(' c= orExpr ')' tru= stat 'else' fls= stat -> ^( COND orExpr stat ) | 'if' '(' c= orExpr ')' tru= stat -> ^( COND orExpr stat ) |b= block |l= label name= Ident ':' t= type '(' e= orExpr ')' -> ^( QUESTION label Ident type orExpr ) |l= label name= Ident ':' t= type -> ^( QUESTION label Ident type ) );
	public final QLParser.stat_return stat() throws RecognitionException {
		QLParser.stat_return retval = new QLParser.stat_return();
		retval.start = input.LT(1);
		int stat_StartIndex = input.index();

		CommonTree root_0 = null;

		Token name=null;
		Token string_literal4=null;
		Token char_literal5=null;
		Token char_literal6=null;
		Token string_literal7=null;
		Token string_literal8=null;
		Token char_literal9=null;
		Token char_literal10=null;
		Token char_literal11=null;
		Token char_literal12=null;
		Token char_literal13=null;
		Token char_literal14=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope tru =null;
		ParserRuleReturnScope fls =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope l =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope e =null;

		CommonTree name_tree=null;
		CommonTree string_literal4_tree=null;
		CommonTree char_literal5_tree=null;
		CommonTree char_literal6_tree=null;
		CommonTree string_literal7_tree=null;
		CommonTree string_literal8_tree=null;
		CommonTree char_literal9_tree=null;
		CommonTree char_literal10_tree=null;
		CommonTree char_literal11_tree=null;
		CommonTree char_literal12_tree=null;
		CommonTree char_literal13_tree=null;
		CommonTree char_literal14_tree=null;
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_Ident=new RewriteRuleTokenStream(adaptor,"token Ident");
		RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
		RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");
		RewriteRuleSubtreeStream stream_label=new RewriteRuleSubtreeStream(adaptor,"rule label");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:41:3: ( 'if' '(' c= orExpr ')' tru= stat 'else' fls= stat -> ^( COND orExpr stat ) | 'if' '(' c= orExpr ')' tru= stat -> ^( COND orExpr stat ) |b= block |l= label name= Ident ':' t= type '(' e= orExpr ')' -> ^( QUESTION label Ident type orExpr ) |l= label name= Ident ':' t= type -> ^( QUESTION label Ident type ) )
			int alt2=5;
			switch ( input.LA(1) ) {
			case 32:
				{
				int LA2_1 = input.LA(2);
				if ( (synpred2_QL()) ) {
					alt2=1;
				}
				else if ( (synpred3_QL()) ) {
					alt2=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 36:
				{
				alt2=3;
				}
				break;
			case Str:
				{
				int LA2_3 = input.LA(2);
				if ( (synpred5_QL()) ) {
					alt2=4;
				}
				else if ( (true) ) {
					alt2=5;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:41:5: 'if' '(' c= orExpr ')' tru= stat 'else' fls= stat
					{
					string_literal4=(Token)match(input,32,FOLLOW_32_in_stat173); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_32.add(string_literal4);

					char_literal5=(Token)match(input,16,FOLLOW_16_in_stat175); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_16.add(char_literal5);

					pushFollow(FOLLOW_orExpr_in_stat179);
					c=orExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orExpr.add(c.getTree());
					char_literal6=(Token)match(input,17,FOLLOW_17_in_stat181); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_17.add(char_literal6);

					pushFollow(FOLLOW_stat_in_stat185);
					tru=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stat.add(tru.getTree());
					string_literal7=(Token)match(input,29,FOLLOW_29_in_stat187); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(string_literal7);

					pushFollow(FOLLOW_stat_in_stat191);
					fls=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stat.add(fls.getTree());
					if ( state.backtracking==0 ) { retval.result = new IfThenElse((c!=null?((QLParser.orExpr_return)c).result:null), (tru!=null?((QLParser.stat_return)tru).result:null), (fls!=null?((QLParser.stat_return)fls).result:null)); }
					// AST REWRITE
					// elements: stat, orExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 41:119: -> ^( COND orExpr stat )
					{
						// src/nl/cwi/swat/liveql/parser/antlr/QL.g:41:122: ^( COND orExpr stat )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COND, "COND"), root_1);
						adaptor.addChild(root_1, stream_orExpr.nextTree());
						adaptor.addChild(root_1, stream_stat.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:42:5: 'if' '(' c= orExpr ')' tru= stat
					{
					string_literal8=(Token)match(input,32,FOLLOW_32_in_stat209); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_32.add(string_literal8);

					char_literal9=(Token)match(input,16,FOLLOW_16_in_stat211); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_16.add(char_literal9);

					pushFollow(FOLLOW_orExpr_in_stat215);
					c=orExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orExpr.add(c.getTree());
					char_literal10=(Token)match(input,17,FOLLOW_17_in_stat217); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_17.add(char_literal10);

					pushFollow(FOLLOW_stat_in_stat221);
					tru=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stat.add(tru.getTree());
					if ( state.backtracking==0 ) { retval.result = new IfThen((c!=null?((QLParser.orExpr_return)c).result:null), (tru!=null?((QLParser.stat_return)tru).result:null)); }
					// AST REWRITE
					// elements: orExpr, stat
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 42:86: -> ^( COND orExpr stat )
					{
						// src/nl/cwi/swat/liveql/parser/antlr/QL.g:42:89: ^( COND orExpr stat )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COND, "COND"), root_1);
						adaptor.addChild(root_1, stream_orExpr.nextTree());
						adaptor.addChild(root_1, stream_stat.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:43:5: b= block
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_block_in_stat241);
					b=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, b.getTree());

					if ( state.backtracking==0 ) { retval.result = (b!=null?((QLParser.block_return)b).result:null); }
					}
					break;
				case 4 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:44:5: l= label name= Ident ':' t= type '(' e= orExpr ')'
					{
					pushFollow(FOLLOW_label_in_stat251);
					l=label();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_label.add(l.getTree());
					name=(Token)match(input,Ident,FOLLOW_Ident_in_stat255); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Ident.add(name);

					char_literal11=(Token)match(input,22,FOLLOW_22_in_stat257); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_22.add(char_literal11);

					pushFollow(FOLLOW_type_in_stat261);
					t=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type.add(t.getTree());
					char_literal12=(Token)match(input,16,FOLLOW_16_in_stat263); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_16.add(char_literal12);

					pushFollow(FOLLOW_orExpr_in_stat267);
					e=orExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orExpr.add(e.getTree());
					char_literal13=(Token)match(input,17,FOLLOW_17_in_stat269); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_17.add(char_literal13);

					if ( state.backtracking==0 ) { retval.result = new Computed((l!=null?((QLParser.label_return)l).result:null), new Ident((name!=null?name.getText():null), name.getLine()), (t!=null?((QLParser.type_return)t).result:null), (e!=null?((QLParser.orExpr_return)e).result:null)); }
					// AST REWRITE
					// elements: Ident, type, orExpr, label
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 45:4: -> ^( QUESTION label Ident type orExpr )
					{
						// src/nl/cwi/swat/liveql/parser/antlr/QL.g:45:7: ^( QUESTION label Ident type orExpr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUESTION, "QUESTION"), root_1);
						adaptor.addChild(root_1, stream_label.nextTree());
						adaptor.addChild(root_1, stream_Ident.nextNode());
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_orExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:46:5: l= label name= Ident ':' t= type
					{
					pushFollow(FOLLOW_label_in_stat296);
					l=label();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_label.add(l.getTree());
					name=(Token)match(input,Ident,FOLLOW_Ident_in_stat300); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Ident.add(name);

					char_literal14=(Token)match(input,22,FOLLOW_22_in_stat302); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_22.add(char_literal14);

					pushFollow(FOLLOW_type_in_stat306);
					t=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type.add(t.getTree());
					if ( state.backtracking==0 ) { retval.result = new Answerable((l!=null?((QLParser.label_return)l).result:null), new Ident((name!=null?name.getText():null), name.getLine()), (t!=null?((QLParser.type_return)t).result:null)); }
					// AST REWRITE
					// elements: label, Ident, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 47:4: -> ^( QUESTION label Ident type )
					{
						// src/nl/cwi/swat/liveql/parser/antlr/QL.g:47:7: ^( QUESTION label Ident type )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUESTION, "QUESTION"), root_1);
						adaptor.addChild(root_1, stream_label.nextTree());
						adaptor.addChild(root_1, stream_Ident.nextNode());
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, stat_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class label_return extends ParserRuleReturnScope {
		public Label result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "label"
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:50:1: label returns [Label result] : Str ;
	public final QLParser.label_return label() throws RecognitionException {
		QLParser.label_return retval = new QLParser.label_return();
		retval.start = input.LT(1);
		int label_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Str15=null;

		CommonTree Str15_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:51:3: ( Str )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:51:5: Str
			{
			root_0 = (CommonTree)adaptor.nil();


			Str15=(Token)match(input,Str,FOLLOW_Str_in_label343); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Str15_tree = (CommonTree)adaptor.create(Str15);
			adaptor.addChild(root_0, Str15_tree);
			}

			if ( state.backtracking==0 ) { retval.result = new Label((Str15!=null?Str15.getText():null), Str15.getLine()); }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, label_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "label"


	public static class type_return extends ParserRuleReturnScope {
		public nl.cwi.swat.liveql.ast.types.Type result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:54:1: type returns [nl.cwi.swat.liveql.ast.types.Type result] : (t= 'int' |t= 'str' |t= 'bool' );
	public final QLParser.type_return type() throws RecognitionException {
		QLParser.type_return retval = new QLParser.type_return();
		retval.start = input.LT(1);
		int type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token t=null;

		CommonTree t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:55:3: (t= 'int' |t= 'str' |t= 'bool' )
			int alt3=3;
			switch ( input.LA(1) ) {
			case 33:
				{
				alt3=1;
				}
				break;
			case 34:
				{
				alt3=2;
				}
				break;
			case 28:
				{
				alt3=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:55:5: t= 'int'
					{
					root_0 = (CommonTree)adaptor.nil();


					t=(Token)match(input,33,FOLLOW_33_in_type366); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (CommonTree)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new nl.cwi.swat.liveql.ast.types.Int(t.getLine()); }
					}
					break;
				case 2 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:56:5: t= 'str'
					{
					root_0 = (CommonTree)adaptor.nil();


					t=(Token)match(input,34,FOLLOW_34_in_type376); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (CommonTree)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new nl.cwi.swat.liveql.ast.types.Str(t.getLine()); }
					}
					break;
				case 3 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:57:5: t= 'bool'
					{
					root_0 = (CommonTree)adaptor.nil();


					t=(Token)match(input,28,FOLLOW_28_in_type386); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (CommonTree)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new nl.cwi.swat.liveql.ast.types.Bool(t.getLine()); }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "type"


	public static class primary_return extends ParserRuleReturnScope {
		public Expr result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:60:1: primary returns [Expr result] : ( Int | Ident | Str | bool | '(' x= orExpr ')' -> ^( orExpr ) );
	public final QLParser.primary_return primary() throws RecognitionException {
		QLParser.primary_return retval = new QLParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Int16=null;
		Token Ident17=null;
		Token Str18=null;
		Token char_literal20=null;
		Token char_literal21=null;
		ParserRuleReturnScope x =null;
		ParserRuleReturnScope bool19 =null;

		CommonTree Int16_tree=null;
		CommonTree Ident17_tree=null;
		CommonTree Str18_tree=null;
		CommonTree char_literal20_tree=null;
		CommonTree char_literal21_tree=null;
		RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
		RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:61:3: ( Int | Ident | Str | bool | '(' x= orExpr ')' -> ^( orExpr ) )
			int alt4=5;
			switch ( input.LA(1) ) {
			case Int:
				{
				alt4=1;
				}
				break;
			case Ident:
				{
				alt4=2;
				}
				break;
			case Str:
				{
				alt4=3;
				}
				break;
			case 30:
			case 35:
				{
				alt4=4;
				}
				break;
			case 16:
				{
				alt4=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:61:5: Int
					{
					root_0 = (CommonTree)adaptor.nil();


					Int16=(Token)match(input,Int,FOLLOW_Int_in_primary407); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Int16_tree = (CommonTree)adaptor.create(Int16);
					adaptor.addChild(root_0, Int16_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new Int(Integer.parseInt((Int16!=null?Int16.getText():null)), Int16.getLine()); }
					}
					break;
				case 2 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:62:5: Ident
					{
					root_0 = (CommonTree)adaptor.nil();


					Ident17=(Token)match(input,Ident,FOLLOW_Ident_in_primary417); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Ident17_tree = (CommonTree)adaptor.create(Ident17);
					adaptor.addChild(root_0, Ident17_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new Ident((Ident17!=null?Ident17.getText():null), Ident17.getLine()); }
					}
					break;
				case 3 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:63:5: Str
					{
					root_0 = (CommonTree)adaptor.nil();


					Str18=(Token)match(input,Str,FOLLOW_Str_in_primary425); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Str18_tree = (CommonTree)adaptor.create(Str18);
					adaptor.addChild(root_0, Str18_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new Str((Str18!=null?Str18.getText():null), Str18.getLine()); }
					}
					break;
				case 4 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:64:5: bool
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bool_in_primary435);
					bool19=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool19.getTree());

					if ( state.backtracking==0 ) { retval.result = (bool19!=null?((QLParser.bool_return)bool19).result:null); }
					}
					break;
				case 5 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:65:5: '(' x= orExpr ')'
					{
					char_literal20=(Token)match(input,16,FOLLOW_16_in_primary444); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_16.add(char_literal20);

					pushFollow(FOLLOW_orExpr_in_primary448);
					x=orExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orExpr.add(x.getTree());
					char_literal21=(Token)match(input,17,FOLLOW_17_in_primary450); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_17.add(char_literal21);

					if ( state.backtracking==0 ) { retval.result = (x!=null?((QLParser.orExpr_return)x).result:null); }
					// AST REWRITE
					// elements: orExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 65:46: -> ^( orExpr )
					{
						// src/nl/cwi/swat/liveql/parser/antlr/QL.g:65:49: ^( orExpr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_orExpr.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primary"


	public static class bool_return extends ParserRuleReturnScope {
		public Expr result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bool"
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:68:1: bool returns [Expr result] : (t= 'true' |t= 'false' );
	public final QLParser.bool_return bool() throws RecognitionException {
		QLParser.bool_return retval = new QLParser.bool_return();
		retval.start = input.LT(1);
		int bool_StartIndex = input.index();

		CommonTree root_0 = null;

		Token t=null;

		CommonTree t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:69:3: (t= 'true' |t= 'false' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==35) ) {
				alt5=1;
			}
			else if ( (LA5_0==30) ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:69:5: t= 'true'
					{
					root_0 = (CommonTree)adaptor.nil();


					t=(Token)match(input,35,FOLLOW_35_in_bool478); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (CommonTree)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new Bool(true, t.getLine()); }
					}
					break;
				case 2 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:70:5: t= 'false'
					{
					root_0 = (CommonTree)adaptor.nil();


					t=(Token)match(input,30,FOLLOW_30_in_bool489); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (CommonTree)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new Bool(false, t.getLine()); }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, bool_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bool"


	public static class unExpr_return extends ParserRuleReturnScope {
		public Expr result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unExpr"
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:73:1: unExpr returns [Expr result] : ( '+' x= unExpr | '-' x= unExpr | '!' x= unExpr |x= primary );
	public final QLParser.unExpr_return unExpr() throws RecognitionException {
		QLParser.unExpr_return retval = new QLParser.unExpr_return();
		retval.start = input.LT(1);
		int unExpr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal22=null;
		Token char_literal23=null;
		Token char_literal24=null;
		ParserRuleReturnScope x =null;

		CommonTree char_literal22_tree=null;
		CommonTree char_literal23_tree=null;
		CommonTree char_literal24_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:74:5: ( '+' x= unExpr | '-' x= unExpr | '!' x= unExpr |x= primary )
			int alt6=4;
			switch ( input.LA(1) ) {
			case 19:
				{
				alt6=1;
				}
				break;
			case 20:
				{
				alt6=2;
				}
				break;
			case 13:
				{
				alt6=3;
				}
				break;
			case Ident:
			case Int:
			case Str:
			case 16:
			case 30:
			case 35:
				{
				alt6=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:74:8: '+' x= unExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal22=(Token)match(input,19,FOLLOW_19_in_unExpr515); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal22_tree = (CommonTree)adaptor.create(char_literal22);
					adaptor.addChild(root_0, char_literal22_tree);
					}

					pushFollow(FOLLOW_unExpr_in_unExpr519);
					x=unExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, x.getTree());

					if ( state.backtracking==0 ) { retval.result = new Pos((x!=null?((QLParser.primary_return)x).result:null)); }
					}
					break;
				case 2 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:75:8: '-' x= unExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal23=(Token)match(input,20,FOLLOW_20_in_unExpr530); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal23_tree = (CommonTree)adaptor.create(char_literal23);
					adaptor.addChild(root_0, char_literal23_tree);
					}

					pushFollow(FOLLOW_unExpr_in_unExpr534);
					x=unExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, x.getTree());

					if ( state.backtracking==0 ) { retval.result = new Neg((x!=null?((QLParser.primary_return)x).result:null)); }
					}
					break;
				case 3 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:76:8: '!' x= unExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal24=(Token)match(input,13,FOLLOW_13_in_unExpr545); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal24_tree = (CommonTree)adaptor.create(char_literal24);
					adaptor.addChild(root_0, char_literal24_tree);
					}

					pushFollow(FOLLOW_unExpr_in_unExpr549);
					x=unExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, x.getTree());

					if ( state.backtracking==0 ) { retval.result = new Not((x!=null?((QLParser.primary_return)x).result:null)); }
					}
					break;
				case 4 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:77:8: x= primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unExpr562);
					x=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, x.getTree());

					if ( state.backtracking==0 ) { retval.result = (x!=null?((QLParser.primary_return)x).result:null); }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, unExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unExpr"


	public static class mulExpr_return extends ParserRuleReturnScope {
		public Expr result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:80:1: mulExpr returns [Expr result] : lhs= unExpr (op= ( '*' | '/' ) ^rhs= unExpr )* ;
	public final QLParser.mulExpr_return mulExpr() throws RecognitionException {
		QLParser.mulExpr_return retval = new QLParser.mulExpr_return();
		retval.start = input.LT(1);
		int mulExpr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token op=null;
		ParserRuleReturnScope lhs =null;
		ParserRuleReturnScope rhs =null;

		CommonTree op_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:81:5: (lhs= unExpr (op= ( '*' | '/' ) ^rhs= unExpr )* )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:81:9: lhs= unExpr (op= ( '*' | '/' ) ^rhs= unExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unExpr_in_mulExpr600);
			lhs=unExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lhs.getTree());

			if ( state.backtracking==0 ) { retval.result =(lhs!=null?((QLParser.unExpr_return)lhs).result:null); }
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:81:45: (op= ( '*' | '/' ) ^rhs= unExpr )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==18||LA7_0==21) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:81:47: op= ( '*' | '/' ) ^rhs= unExpr
					{
					op=input.LT(1);
					op=input.LT(1);
					if ( input.LA(1)==18||input.LA(1)==21 ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(op), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unExpr_in_mulExpr621);
					rhs=unExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rhs.getTree());

					if ( state.backtracking==0 ) { 
					      if ((op!=null?op.getText():null).equals("*")) {
					        retval.result = new Mul(retval.result, (rhs!=null?((QLParser.unExpr_return)rhs).result:null));
					      }
					      if ((op!=null?op.getText():null).equals("<=")) {
					        retval.result = new Div(retval.result, (rhs!=null?((QLParser.unExpr_return)rhs).result:null));      
					      }
					    }
					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, mulExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "mulExpr"


	public static class addExpr_return extends ParserRuleReturnScope {
		public Expr result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "addExpr"
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:93:1: addExpr returns [Expr result] : lhs= mulExpr (op= ( '+' | '-' ) ^rhs= mulExpr )* ;
	public final QLParser.addExpr_return addExpr() throws RecognitionException {
		QLParser.addExpr_return retval = new QLParser.addExpr_return();
		retval.start = input.LT(1);
		int addExpr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token op=null;
		ParserRuleReturnScope lhs =null;
		ParserRuleReturnScope rhs =null;

		CommonTree op_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:94:5: (lhs= mulExpr (op= ( '+' | '-' ) ^rhs= mulExpr )* )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:94:9: lhs= mulExpr (op= ( '+' | '-' ) ^rhs= mulExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr662);
			lhs=mulExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lhs.getTree());

			if ( state.backtracking==0 ) { retval.result =(lhs!=null?((QLParser.mulExpr_return)lhs).result:null); }
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:94:46: (op= ( '+' | '-' ) ^rhs= mulExpr )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= 19 && LA8_0 <= 20)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:94:48: op= ( '+' | '-' ) ^rhs= mulExpr
					{
					op=input.LT(1);
					op=input.LT(1);
					if ( (input.LA(1) >= 19 && input.LA(1) <= 20) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(op), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr681);
					rhs=mulExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rhs.getTree());

					if ( state.backtracking==0 ) { 
					      if ((op!=null?op.getText():null).equals("+")) {
					        retval.result = new Add(retval.result, (rhs!=null?((QLParser.mulExpr_return)rhs).result:null));
					      }
					      if ((op!=null?op.getText():null).equals("-")) {
					        retval.result = new Sub(retval.result, (rhs!=null?((QLParser.mulExpr_return)rhs).result:null));      
					      }
					    }
					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, addExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "addExpr"


	public static class relExpr_return extends ParserRuleReturnScope {
		public Expr result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relExpr"
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:105:1: relExpr returns [Expr result] : lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) ^rhs= addExpr )* ;
	public final QLParser.relExpr_return relExpr() throws RecognitionException {
		QLParser.relExpr_return retval = new QLParser.relExpr_return();
		retval.start = input.LT(1);
		int relExpr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token op=null;
		ParserRuleReturnScope lhs =null;
		ParserRuleReturnScope rhs =null;

		CommonTree op_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:106:5: (lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) ^rhs= addExpr )* )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:106:9: lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) ^rhs= addExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr716);
			lhs=addExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lhs.getTree());

			if ( state.backtracking==0 ) { retval.result =(lhs!=null?((QLParser.addExpr_return)lhs).result:null); }
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:106:46: (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) ^rhs= addExpr )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==14||(LA9_0 >= 23 && LA9_0 <= 27)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:106:48: op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) ^rhs= addExpr
					{
					op=input.LT(1);
					op=input.LT(1);
					if ( input.LA(1)==14||(input.LA(1) >= 23 && input.LA(1) <= 27) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(op), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr741);
					rhs=addExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rhs.getTree());

					if ( state.backtracking==0 ) { 
					      if ((op!=null?op.getText():null).equals("<")) {
					        retval.result = new LT(retval.result, (rhs!=null?((QLParser.addExpr_return)rhs).result:null));
					      }
					      if ((op!=null?op.getText():null).equals("<=")) {
					        retval.result = new LEq(retval.result, (rhs!=null?((QLParser.addExpr_return)rhs).result:null));      
					      }
					      if ((op!=null?op.getText():null).equals(">")) {
					        retval.result = new GT(retval.result, (rhs!=null?((QLParser.addExpr_return)rhs).result:null));
					      }
					      if ((op!=null?op.getText():null).equals(">=")) {
					        retval.result = new GEq(retval.result, (rhs!=null?((QLParser.addExpr_return)rhs).result:null));      
					      }
					      if ((op!=null?op.getText():null).equals("==")) {
					        retval.result = new Eq(retval.result, (rhs!=null?((QLParser.addExpr_return)rhs).result:null));
					      }
					      if ((op!=null?op.getText():null).equals("!=")) {
					        retval.result = new NEq(retval.result, (rhs!=null?((QLParser.addExpr_return)rhs).result:null));
					      }
					    }
					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, relExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "relExpr"


	public static class andExpr_return extends ParserRuleReturnScope {
		public Expr result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "andExpr"
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:129:1: andExpr returns [Expr result] : lhs= relExpr ( '&&' ^rhs= relExpr )* ;
	public final QLParser.andExpr_return andExpr() throws RecognitionException {
		QLParser.andExpr_return retval = new QLParser.andExpr_return();
		retval.start = input.LT(1);
		int andExpr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal25=null;
		ParserRuleReturnScope lhs =null;
		ParserRuleReturnScope rhs =null;

		CommonTree string_literal25_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:130:5: (lhs= relExpr ( '&&' ^rhs= relExpr )* )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:130:9: lhs= relExpr ( '&&' ^rhs= relExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_andExpr779);
			lhs=relExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lhs.getTree());

			if ( state.backtracking==0 ) { retval.result =(lhs!=null?((QLParser.relExpr_return)lhs).result:null); }
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:130:46: ( '&&' ^rhs= relExpr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==15) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:130:48: '&&' ^rhs= relExpr
					{
					string_literal25=(Token)match(input,15,FOLLOW_15_in_andExpr785); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal25_tree = (CommonTree)adaptor.create(string_literal25);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal25_tree, root_0);
					}

					pushFollow(FOLLOW_relExpr_in_andExpr790);
					rhs=relExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rhs.getTree());

					if ( state.backtracking==0 ) { retval.result = new And(retval.result, (rhs!=null?((QLParser.relExpr_return)rhs).result:null)); }
					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, andExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "andExpr"


	public static class orExpr_return extends ParserRuleReturnScope {
		public Expr result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "orExpr"
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:134:1: orExpr returns [Expr result] : lhs= andExpr ( '||' ^rhs= andExpr )* ;
	public final QLParser.orExpr_return orExpr() throws RecognitionException {
		QLParser.orExpr_return retval = new QLParser.orExpr_return();
		retval.start = input.LT(1);
		int orExpr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal26=null;
		ParserRuleReturnScope lhs =null;
		ParserRuleReturnScope rhs =null;

		CommonTree string_literal26_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:135:5: (lhs= andExpr ( '||' ^rhs= andExpr )* )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:135:9: lhs= andExpr ( '||' ^rhs= andExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr825);
			lhs=andExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lhs.getTree());

			if ( state.backtracking==0 ) { retval.result = (lhs!=null?((QLParser.andExpr_return)lhs).result:null); }
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:135:48: ( '||' ^rhs= andExpr )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==37) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:135:50: '||' ^rhs= andExpr
					{
					string_literal26=(Token)match(input,37,FOLLOW_37_in_orExpr831); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal26_tree = (CommonTree)adaptor.create(string_literal26);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal26_tree, root_0);
					}

					pushFollow(FOLLOW_andExpr_in_orExpr836);
					rhs=andExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rhs.getTree());

					if ( state.backtracking==0 ) { retval.result = new Or(retval.result, (rhs!=null?((QLParser.andExpr_return)rhs).result:null)); }
					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, orExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "orExpr"

	// $ANTLR start synpred2_QL
	public final void synpred2_QL_fragment() throws RecognitionException {
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope tru =null;
		ParserRuleReturnScope fls =null;


		// src/nl/cwi/swat/liveql/parser/antlr/QL.g:41:5: ( 'if' '(' c= orExpr ')' tru= stat 'else' fls= stat )
		// src/nl/cwi/swat/liveql/parser/antlr/QL.g:41:5: 'if' '(' c= orExpr ')' tru= stat 'else' fls= stat
		{
		match(input,32,FOLLOW_32_in_synpred2_QL173); if (state.failed) return;

		match(input,16,FOLLOW_16_in_synpred2_QL175); if (state.failed) return;

		pushFollow(FOLLOW_orExpr_in_synpred2_QL179);
		c=orExpr();
		state._fsp--;
		if (state.failed) return;

		match(input,17,FOLLOW_17_in_synpred2_QL181); if (state.failed) return;

		pushFollow(FOLLOW_stat_in_synpred2_QL185);
		tru=stat();
		state._fsp--;
		if (state.failed) return;

		match(input,29,FOLLOW_29_in_synpred2_QL187); if (state.failed) return;

		pushFollow(FOLLOW_stat_in_synpred2_QL191);
		fls=stat();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_QL

	// $ANTLR start synpred3_QL
	public final void synpred3_QL_fragment() throws RecognitionException {
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope tru =null;


		// src/nl/cwi/swat/liveql/parser/antlr/QL.g:42:5: ( 'if' '(' c= orExpr ')' tru= stat )
		// src/nl/cwi/swat/liveql/parser/antlr/QL.g:42:5: 'if' '(' c= orExpr ')' tru= stat
		{
		match(input,32,FOLLOW_32_in_synpred3_QL209); if (state.failed) return;

		match(input,16,FOLLOW_16_in_synpred3_QL211); if (state.failed) return;

		pushFollow(FOLLOW_orExpr_in_synpred3_QL215);
		c=orExpr();
		state._fsp--;
		if (state.failed) return;

		match(input,17,FOLLOW_17_in_synpred3_QL217); if (state.failed) return;

		pushFollow(FOLLOW_stat_in_synpred3_QL221);
		tru=stat();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_QL

	// $ANTLR start synpred5_QL
	public final void synpred5_QL_fragment() throws RecognitionException {
		Token name=null;
		ParserRuleReturnScope l =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope e =null;


		// src/nl/cwi/swat/liveql/parser/antlr/QL.g:44:5: (l= label name= Ident ':' t= type '(' e= orExpr ')' )
		// src/nl/cwi/swat/liveql/parser/antlr/QL.g:44:5: l= label name= Ident ':' t= type '(' e= orExpr ')'
		{
		pushFollow(FOLLOW_label_in_synpred5_QL251);
		l=label();
		state._fsp--;
		if (state.failed) return;

		name=(Token)match(input,Ident,FOLLOW_Ident_in_synpred5_QL255); if (state.failed) return;

		match(input,22,FOLLOW_22_in_synpred5_QL257); if (state.failed) return;

		pushFollow(FOLLOW_type_in_synpred5_QL261);
		t=type();
		state._fsp--;
		if (state.failed) return;

		match(input,16,FOLLOW_16_in_synpred5_QL263); if (state.failed) return;

		pushFollow(FOLLOW_orExpr_in_synpred5_QL267);
		e=orExpr();
		state._fsp--;
		if (state.failed) return;

		match(input,17,FOLLOW_17_in_synpred5_QL269); if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_QL

	// Delegated rules

	public final boolean synpred2_QL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_QL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_QL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_QL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_QL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_QL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_31_in_form86 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Ident_in_form88 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_block_in_form92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_block130 = new BitSet(new long[]{0x0000005100000800L});
	public static final BitSet FOLLOW_stat_in_block136 = new BitSet(new long[]{0x0000005100000800L});
	public static final BitSet FOLLOW_38_in_block143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_stat173 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stat175 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_orExpr_in_stat179 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_stat181 = new BitSet(new long[]{0x0000001100000800L});
	public static final BitSet FOLLOW_stat_in_stat185 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_stat187 = new BitSet(new long[]{0x0000001100000800L});
	public static final BitSet FOLLOW_stat_in_stat191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_stat209 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stat211 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_orExpr_in_stat215 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_stat217 = new BitSet(new long[]{0x0000001100000800L});
	public static final BitSet FOLLOW_stat_in_stat221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_stat251 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Ident_in_stat255 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stat257 = new BitSet(new long[]{0x0000000610000000L});
	public static final BitSet FOLLOW_type_in_stat261 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stat263 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_orExpr_in_stat267 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_stat269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_stat296 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Ident_in_stat300 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stat302 = new BitSet(new long[]{0x0000000610000000L});
	public static final BitSet FOLLOW_type_in_stat306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Str_in_label343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_type366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_type376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_type386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Int_in_primary407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ident_in_primary417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Str_in_primary425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_primary435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_primary444 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_orExpr_in_primary448 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_primary450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_bool478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_bool489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_unExpr515 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_unExpr_in_unExpr519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_unExpr530 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_unExpr_in_unExpr534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_unExpr545 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_unExpr_in_unExpr549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unExpr562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unExpr_in_mulExpr600 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_set_in_mulExpr608 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_unExpr_in_mulExpr621 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr662 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_set_in_addExpr670 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr681 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_addExpr_in_relExpr716 = new BitSet(new long[]{0x000000000F804002L});
	public static final BitSet FOLLOW_set_in_relExpr724 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_addExpr_in_relExpr741 = new BitSet(new long[]{0x000000000F804002L});
	public static final BitSet FOLLOW_relExpr_in_andExpr779 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_andExpr785 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_relExpr_in_andExpr790 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr825 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_orExpr831 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_andExpr_in_orExpr836 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_32_in_synpred2_QL173 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_synpred2_QL175 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_orExpr_in_synpred2_QL179 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_synpred2_QL181 = new BitSet(new long[]{0x0000001100000800L});
	public static final BitSet FOLLOW_stat_in_synpred2_QL185 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_synpred2_QL187 = new BitSet(new long[]{0x0000001100000800L});
	public static final BitSet FOLLOW_stat_in_synpred2_QL191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_synpred3_QL209 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_synpred3_QL211 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_orExpr_in_synpred3_QL215 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_synpred3_QL217 = new BitSet(new long[]{0x0000001100000800L});
	public static final BitSet FOLLOW_stat_in_synpred3_QL221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_synpred5_QL251 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Ident_in_synpred5_QL255 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_synpred5_QL257 = new BitSet(new long[]{0x0000000610000000L});
	public static final BitSet FOLLOW_type_in_synpred5_QL261 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_synpred5_QL263 = new BitSet(new long[]{0x0000000840192B00L});
	public static final BitSet FOLLOW_orExpr_in_synpred5_QL267 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_synpred5_QL269 = new BitSet(new long[]{0x0000000000000002L});
}
