// $ANTLR 3.5.2 src/nl/cwi/swat/liveql/parser/antlr/QL.g 2020-10-15 17:48:40

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "Ident", "Int", "Str", 
		"WS", "'!'", "'!='", "'&&'", "'('", "')'", "'*'", "'+'", "'-'", "'/'", 
		"':'", "'<'", "'<='", "'=='", "'>'", "'>='", "'bool'", "'else'", "'false'", 
		"'form'", "'if'", "'int'", "'str'", "'true'", "'{'", "'||'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
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
	public static final int COMMENT=4;
	public static final int Ident=5;
	public static final int Int=6;
	public static final int Str=7;
	public static final int WS=8;

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
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:25:1: form returns [Form result] : 'form' Ident body= block ;
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

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:26:3: ( 'form' Ident body= block )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:26:5: 'form' Ident body= block
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal1=(Token)match(input,27,FOLLOW_27_in_form66); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal1_tree = (CommonTree)adaptor.create(string_literal1);
			adaptor.addChild(root_0, string_literal1_tree);
			}

			Ident2=(Token)match(input,Ident,FOLLOW_Ident_in_form68); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Ident2_tree = (CommonTree)adaptor.create(Ident2);
			adaptor.addChild(root_0, Ident2_tree);
			}

			pushFollow(FOLLOW_block_in_form72);
			body=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, body.getTree());

			if ( state.backtracking==0 ) { retval.result = new Form(new Ident((Ident2!=null?Ident2.getText():null), Ident2.getLine()), (body!=null?((QLParser.block_return)body).result:null)); }
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
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:29:1: block returns [Block result] : t= '{' (s= stat )* '}' ;
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

		 List<Stat> stats = new ArrayList<Stat>(); 
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:31:3: (t= '{' (s= stat )* '}' )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:31:5: t= '{' (s= stat )* '}'
			{
			root_0 = (CommonTree)adaptor.nil();


			t=(Token)match(input,32,FOLLOW_32_in_block100); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			t_tree = (CommonTree)adaptor.create(t);
			adaptor.addChild(root_0, t_tree);
			}

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:31:11: (s= stat )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==Str||LA1_0==28||LA1_0==32) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:31:13: s= stat
					{
					pushFollow(FOLLOW_stat_in_block106);
					s=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, s.getTree());

					if ( state.backtracking==0 ) { stats.add((s!=null?((QLParser.stat_return)s).result:null)); }
					}
					break;

				default :
					break loop1;
				}
			}

			char_literal3=(Token)match(input,34,FOLLOW_34_in_block113); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal3_tree = (CommonTree)adaptor.create(char_literal3);
			adaptor.addChild(root_0, char_literal3_tree);
			}

			if ( state.backtracking==0 ) { retval.result = new Block(stats, t.getLine()); }
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
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:34:1: stat returns [Stat result] : ( 'if' '(' c= orExpr ')' tru= stat 'else' fls= stat | 'if' '(' c= orExpr ')' tru= stat |b= block |l= label name= Ident ':' t= type '(' e= orExpr ')' |l= label name= Ident ':' t= type );
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

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:35:3: ( 'if' '(' c= orExpr ')' tru= stat 'else' fls= stat | 'if' '(' c= orExpr ')' tru= stat |b= block |l= label name= Ident ':' t= type '(' e= orExpr ')' |l= label name= Ident ':' t= type )
			int alt2=5;
			switch ( input.LA(1) ) {
			case 28:
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
			case 32:
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
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:35:5: 'if' '(' c= orExpr ')' tru= stat 'else' fls= stat
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal4=(Token)match(input,28,FOLLOW_28_in_stat134); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal4_tree = (CommonTree)adaptor.create(string_literal4);
					adaptor.addChild(root_0, string_literal4_tree);
					}

					char_literal5=(Token)match(input,12,FOLLOW_12_in_stat136); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal5_tree = (CommonTree)adaptor.create(char_literal5);
					adaptor.addChild(root_0, char_literal5_tree);
					}

					pushFollow(FOLLOW_orExpr_in_stat140);
					c=orExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, c.getTree());

					char_literal6=(Token)match(input,13,FOLLOW_13_in_stat142); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal6_tree = (CommonTree)adaptor.create(char_literal6);
					adaptor.addChild(root_0, char_literal6_tree);
					}

					pushFollow(FOLLOW_stat_in_stat146);
					tru=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tru.getTree());

					string_literal7=(Token)match(input,25,FOLLOW_25_in_stat148); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal7_tree = (CommonTree)adaptor.create(string_literal7);
					adaptor.addChild(root_0, string_literal7_tree);
					}

					pushFollow(FOLLOW_stat_in_stat152);
					fls=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fls.getTree());

					if ( state.backtracking==0 ) { retval.result = new IfThenElse((c!=null?((QLParser.orExpr_return)c).result:null), (tru!=null?((QLParser.stat_return)tru).result:null), (fls!=null?((QLParser.stat_return)fls).result:null)); }
					}
					break;
				case 2 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:36:5: 'if' '(' c= orExpr ')' tru= stat
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal8=(Token)match(input,28,FOLLOW_28_in_stat160); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal8_tree = (CommonTree)adaptor.create(string_literal8);
					adaptor.addChild(root_0, string_literal8_tree);
					}

					char_literal9=(Token)match(input,12,FOLLOW_12_in_stat162); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal9_tree = (CommonTree)adaptor.create(char_literal9);
					adaptor.addChild(root_0, char_literal9_tree);
					}

					pushFollow(FOLLOW_orExpr_in_stat166);
					c=orExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, c.getTree());

					char_literal10=(Token)match(input,13,FOLLOW_13_in_stat168); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal10_tree = (CommonTree)adaptor.create(char_literal10);
					adaptor.addChild(root_0, char_literal10_tree);
					}

					pushFollow(FOLLOW_stat_in_stat172);
					tru=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tru.getTree());

					if ( state.backtracking==0 ) { retval.result = new IfThen((c!=null?((QLParser.orExpr_return)c).result:null), (tru!=null?((QLParser.stat_return)tru).result:null)); }
					}
					break;
				case 3 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:37:5: b= block
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_block_in_stat182);
					b=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, b.getTree());

					if ( state.backtracking==0 ) { retval.result = (b!=null?((QLParser.block_return)b).result:null); }
					}
					break;
				case 4 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:38:5: l= label name= Ident ':' t= type '(' e= orExpr ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_label_in_stat192);
					l=label();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

					name=(Token)match(input,Ident,FOLLOW_Ident_in_stat196); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					name_tree = (CommonTree)adaptor.create(name);
					adaptor.addChild(root_0, name_tree);
					}

					char_literal11=(Token)match(input,18,FOLLOW_18_in_stat198); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal11_tree = (CommonTree)adaptor.create(char_literal11);
					adaptor.addChild(root_0, char_literal11_tree);
					}

					pushFollow(FOLLOW_type_in_stat202);
					t=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());

					char_literal12=(Token)match(input,12,FOLLOW_12_in_stat204); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal12_tree = (CommonTree)adaptor.create(char_literal12);
					adaptor.addChild(root_0, char_literal12_tree);
					}

					pushFollow(FOLLOW_orExpr_in_stat208);
					e=orExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());

					char_literal13=(Token)match(input,13,FOLLOW_13_in_stat210); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal13_tree = (CommonTree)adaptor.create(char_literal13);
					adaptor.addChild(root_0, char_literal13_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new Computed((l!=null?((QLParser.label_return)l).result:null), new Ident((name!=null?name.getText():null), name.getLine()), (t!=null?((QLParser.type_return)t).result:null), (e!=null?((QLParser.orExpr_return)e).result:null)); }
					}
					break;
				case 5 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:39:5: l= label name= Ident ':' t= type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_label_in_stat220);
					l=label();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

					name=(Token)match(input,Ident,FOLLOW_Ident_in_stat224); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					name_tree = (CommonTree)adaptor.create(name);
					adaptor.addChild(root_0, name_tree);
					}

					char_literal14=(Token)match(input,18,FOLLOW_18_in_stat226); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal14_tree = (CommonTree)adaptor.create(char_literal14);
					adaptor.addChild(root_0, char_literal14_tree);
					}

					pushFollow(FOLLOW_type_in_stat230);
					t=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, t.getTree());

					if ( state.backtracking==0 ) { retval.result = new Answerable((l!=null?((QLParser.label_return)l).result:null), new Ident((name!=null?name.getText():null), name.getLine()), (t!=null?((QLParser.type_return)t).result:null)); }
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
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:42:1: label returns [Label result] : Str ;
	public final QLParser.label_return label() throws RecognitionException {
		QLParser.label_return retval = new QLParser.label_return();
		retval.start = input.LT(1);
		int label_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Str15=null;

		CommonTree Str15_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:43:3: ( Str )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:43:5: Str
			{
			root_0 = (CommonTree)adaptor.nil();


			Str15=(Token)match(input,Str,FOLLOW_Str_in_label252); if (state.failed) return retval;
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
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:46:1: type returns [nl.cwi.swat.liveql.ast.types.Type result] : (t= 'int' |t= 'str' |t= 'bool' );
	public final QLParser.type_return type() throws RecognitionException {
		QLParser.type_return retval = new QLParser.type_return();
		retval.start = input.LT(1);
		int type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token t=null;

		CommonTree t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:47:3: (t= 'int' |t= 'str' |t= 'bool' )
			int alt3=3;
			switch ( input.LA(1) ) {
			case 29:
				{
				alt3=1;
				}
				break;
			case 30:
				{
				alt3=2;
				}
				break;
			case 24:
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
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:47:5: t= 'int'
					{
					root_0 = (CommonTree)adaptor.nil();


					t=(Token)match(input,29,FOLLOW_29_in_type275); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (CommonTree)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new nl.cwi.swat.liveql.ast.types.Int(t.getLine()); }
					}
					break;
				case 2 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:48:5: t= 'str'
					{
					root_0 = (CommonTree)adaptor.nil();


					t=(Token)match(input,30,FOLLOW_30_in_type285); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (CommonTree)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new nl.cwi.swat.liveql.ast.types.Str(t.getLine()); }
					}
					break;
				case 3 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:49:5: t= 'bool'
					{
					root_0 = (CommonTree)adaptor.nil();


					t=(Token)match(input,24,FOLLOW_24_in_type295); if (state.failed) return retval;
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
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:52:1: primary returns [Expr result] : ( Int | Ident | Str | bool | '(' x= orExpr ')' );
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

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:53:3: ( Int | Ident | Str | bool | '(' x= orExpr ')' )
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
			case 26:
			case 31:
				{
				alt4=4;
				}
				break;
			case 12:
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
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:53:5: Int
					{
					root_0 = (CommonTree)adaptor.nil();


					Int16=(Token)match(input,Int,FOLLOW_Int_in_primary316); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Int16_tree = (CommonTree)adaptor.create(Int16);
					adaptor.addChild(root_0, Int16_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new Int(Integer.parseInt((Int16!=null?Int16.getText():null)), Int16.getLine()); }
					}
					break;
				case 2 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:54:5: Ident
					{
					root_0 = (CommonTree)adaptor.nil();


					Ident17=(Token)match(input,Ident,FOLLOW_Ident_in_primary326); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Ident17_tree = (CommonTree)adaptor.create(Ident17);
					adaptor.addChild(root_0, Ident17_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new Ident((Ident17!=null?Ident17.getText():null), Ident17.getLine()); }
					}
					break;
				case 3 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:55:5: Str
					{
					root_0 = (CommonTree)adaptor.nil();


					Str18=(Token)match(input,Str,FOLLOW_Str_in_primary334); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Str18_tree = (CommonTree)adaptor.create(Str18);
					adaptor.addChild(root_0, Str18_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new Str((Str18!=null?Str18.getText():null), Str18.getLine()); }
					}
					break;
				case 4 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:56:5: bool
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bool_in_primary344);
					bool19=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool19.getTree());

					if ( state.backtracking==0 ) { retval.result = (bool19!=null?((QLParser.bool_return)bool19).result:null); }
					}
					break;
				case 5 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:57:5: '(' x= orExpr ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal20=(Token)match(input,12,FOLLOW_12_in_primary353); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal20_tree = (CommonTree)adaptor.create(char_literal20);
					adaptor.addChild(root_0, char_literal20_tree);
					}

					pushFollow(FOLLOW_orExpr_in_primary357);
					x=orExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, x.getTree());

					char_literal21=(Token)match(input,13,FOLLOW_13_in_primary359); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal21_tree = (CommonTree)adaptor.create(char_literal21);
					adaptor.addChild(root_0, char_literal21_tree);
					}

					if ( state.backtracking==0 ) { retval.result = (x!=null?((QLParser.orExpr_return)x).result:null); }
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
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:60:1: bool returns [Expr result] : (t= 'true' |t= 'false' );
	public final QLParser.bool_return bool() throws RecognitionException {
		QLParser.bool_return retval = new QLParser.bool_return();
		retval.start = input.LT(1);
		int bool_StartIndex = input.index();

		CommonTree root_0 = null;

		Token t=null;

		CommonTree t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:61:3: (t= 'true' |t= 'false' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==31) ) {
				alt5=1;
			}
			else if ( (LA5_0==26) ) {
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
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:61:5: t= 'true'
					{
					root_0 = (CommonTree)adaptor.nil();


					t=(Token)match(input,31,FOLLOW_31_in_bool381); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (CommonTree)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { retval.result = new Bool(true, t.getLine()); }
					}
					break;
				case 2 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:62:5: t= 'false'
					{
					root_0 = (CommonTree)adaptor.nil();


					t=(Token)match(input,26,FOLLOW_26_in_bool392); if (state.failed) return retval;
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
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:65:1: unExpr returns [Expr result] : ( '+' x= unExpr | '-' x= unExpr | '!' x= unExpr |x= primary );
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

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:66:5: ( '+' x= unExpr | '-' x= unExpr | '!' x= unExpr |x= primary )
			int alt6=4;
			switch ( input.LA(1) ) {
			case 15:
				{
				alt6=1;
				}
				break;
			case 16:
				{
				alt6=2;
				}
				break;
			case 9:
				{
				alt6=3;
				}
				break;
			case Ident:
			case Int:
			case Str:
			case 12:
			case 26:
			case 31:
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
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:66:8: '+' x= unExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal22=(Token)match(input,15,FOLLOW_15_in_unExpr418); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal22_tree = (CommonTree)adaptor.create(char_literal22);
					adaptor.addChild(root_0, char_literal22_tree);
					}

					pushFollow(FOLLOW_unExpr_in_unExpr422);
					x=unExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, x.getTree());

					if ( state.backtracking==0 ) { retval.result = new Pos((x!=null?((QLParser.primary_return)x).result:null)); }
					}
					break;
				case 2 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:67:8: '-' x= unExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal23=(Token)match(input,16,FOLLOW_16_in_unExpr433); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal23_tree = (CommonTree)adaptor.create(char_literal23);
					adaptor.addChild(root_0, char_literal23_tree);
					}

					pushFollow(FOLLOW_unExpr_in_unExpr437);
					x=unExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, x.getTree());

					if ( state.backtracking==0 ) { retval.result = new Neg((x!=null?((QLParser.primary_return)x).result:null)); }
					}
					break;
				case 3 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:68:8: '!' x= unExpr
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal24=(Token)match(input,9,FOLLOW_9_in_unExpr448); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal24_tree = (CommonTree)adaptor.create(char_literal24);
					adaptor.addChild(root_0, char_literal24_tree);
					}

					pushFollow(FOLLOW_unExpr_in_unExpr452);
					x=unExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, x.getTree());

					if ( state.backtracking==0 ) { retval.result = new Not((x!=null?((QLParser.primary_return)x).result:null)); }
					}
					break;
				case 4 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:69:8: x= primary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primary_in_unExpr465);
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
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:72:1: mulExpr returns [Expr result] : lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )* ;
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

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:73:5: (lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )* )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:73:9: lhs= unExpr (op= ( '*' | '/' ) rhs= unExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unExpr_in_mulExpr503);
			lhs=unExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lhs.getTree());

			if ( state.backtracking==0 ) { retval.result =(lhs!=null?((QLParser.unExpr_return)lhs).result:null); }
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:73:45: (op= ( '*' | '/' ) rhs= unExpr )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==14||LA7_0==17) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:73:47: op= ( '*' | '/' ) rhs= unExpr
					{
					op=input.LT(1);
					if ( input.LA(1)==14||input.LA(1)==17 ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(op));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unExpr_in_mulExpr523);
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
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:85:1: addExpr returns [Expr result] : lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )* ;
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

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:86:5: (lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )* )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:86:9: lhs= mulExpr (op= ( '+' | '-' ) rhs= mulExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr564);
			lhs=mulExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lhs.getTree());

			if ( state.backtracking==0 ) { retval.result =(lhs!=null?((QLParser.mulExpr_return)lhs).result:null); }
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:86:46: (op= ( '+' | '-' ) rhs= mulExpr )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= 15 && LA8_0 <= 16)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:86:48: op= ( '+' | '-' ) rhs= mulExpr
					{
					op=input.LT(1);
					if ( (input.LA(1) >= 15 && input.LA(1) <= 16) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(op));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr582);
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
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:97:1: relExpr returns [Expr result] : lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )* ;
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

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:98:5: (lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )* )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:98:9: lhs= addExpr (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr617);
			lhs=addExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lhs.getTree());

			if ( state.backtracking==0 ) { retval.result =(lhs!=null?((QLParser.addExpr_return)lhs).result:null); }
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:98:46: (op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==10||(LA9_0 >= 19 && LA9_0 <= 23)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:98:48: op= ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) rhs= addExpr
					{
					op=input.LT(1);
					if ( input.LA(1)==10||(input.LA(1) >= 19 && input.LA(1) <= 23) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(op));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr641);
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
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:121:1: andExpr returns [Expr result] : lhs= relExpr ( '&&' rhs= relExpr )* ;
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

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:122:5: (lhs= relExpr ( '&&' rhs= relExpr )* )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:122:9: lhs= relExpr ( '&&' rhs= relExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_andExpr679);
			lhs=relExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lhs.getTree());

			if ( state.backtracking==0 ) { retval.result =(lhs!=null?((QLParser.relExpr_return)lhs).result:null); }
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:122:46: ( '&&' rhs= relExpr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==11) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:122:48: '&&' rhs= relExpr
					{
					string_literal25=(Token)match(input,11,FOLLOW_11_in_andExpr685); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal25_tree = (CommonTree)adaptor.create(string_literal25);
					adaptor.addChild(root_0, string_literal25_tree);
					}

					pushFollow(FOLLOW_relExpr_in_andExpr689);
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
	// src/nl/cwi/swat/liveql/parser/antlr/QL.g:126:1: orExpr returns [Expr result] : lhs= andExpr ( '||' rhs= andExpr )* ;
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

			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:127:5: (lhs= andExpr ( '||' rhs= andExpr )* )
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:127:9: lhs= andExpr ( '||' rhs= andExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr724);
			lhs=andExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lhs.getTree());

			if ( state.backtracking==0 ) { retval.result = (lhs!=null?((QLParser.andExpr_return)lhs).result:null); }
			// src/nl/cwi/swat/liveql/parser/antlr/QL.g:127:48: ( '||' rhs= andExpr )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==33) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src/nl/cwi/swat/liveql/parser/antlr/QL.g:127:50: '||' rhs= andExpr
					{
					string_literal26=(Token)match(input,33,FOLLOW_33_in_orExpr730); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal26_tree = (CommonTree)adaptor.create(string_literal26);
					adaptor.addChild(root_0, string_literal26_tree);
					}

					pushFollow(FOLLOW_andExpr_in_orExpr734);
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


		// src/nl/cwi/swat/liveql/parser/antlr/QL.g:35:5: ( 'if' '(' c= orExpr ')' tru= stat 'else' fls= stat )
		// src/nl/cwi/swat/liveql/parser/antlr/QL.g:35:5: 'if' '(' c= orExpr ')' tru= stat 'else' fls= stat
		{
		match(input,28,FOLLOW_28_in_synpred2_QL134); if (state.failed) return;

		match(input,12,FOLLOW_12_in_synpred2_QL136); if (state.failed) return;

		pushFollow(FOLLOW_orExpr_in_synpred2_QL140);
		c=orExpr();
		state._fsp--;
		if (state.failed) return;

		match(input,13,FOLLOW_13_in_synpred2_QL142); if (state.failed) return;

		pushFollow(FOLLOW_stat_in_synpred2_QL146);
		tru=stat();
		state._fsp--;
		if (state.failed) return;

		match(input,25,FOLLOW_25_in_synpred2_QL148); if (state.failed) return;

		pushFollow(FOLLOW_stat_in_synpred2_QL152);
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


		// src/nl/cwi/swat/liveql/parser/antlr/QL.g:36:5: ( 'if' '(' c= orExpr ')' tru= stat )
		// src/nl/cwi/swat/liveql/parser/antlr/QL.g:36:5: 'if' '(' c= orExpr ')' tru= stat
		{
		match(input,28,FOLLOW_28_in_synpred3_QL160); if (state.failed) return;

		match(input,12,FOLLOW_12_in_synpred3_QL162); if (state.failed) return;

		pushFollow(FOLLOW_orExpr_in_synpred3_QL166);
		c=orExpr();
		state._fsp--;
		if (state.failed) return;

		match(input,13,FOLLOW_13_in_synpred3_QL168); if (state.failed) return;

		pushFollow(FOLLOW_stat_in_synpred3_QL172);
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


		// src/nl/cwi/swat/liveql/parser/antlr/QL.g:38:5: (l= label name= Ident ':' t= type '(' e= orExpr ')' )
		// src/nl/cwi/swat/liveql/parser/antlr/QL.g:38:5: l= label name= Ident ':' t= type '(' e= orExpr ')'
		{
		pushFollow(FOLLOW_label_in_synpred5_QL192);
		l=label();
		state._fsp--;
		if (state.failed) return;

		name=(Token)match(input,Ident,FOLLOW_Ident_in_synpred5_QL196); if (state.failed) return;

		match(input,18,FOLLOW_18_in_synpred5_QL198); if (state.failed) return;

		pushFollow(FOLLOW_type_in_synpred5_QL202);
		t=type();
		state._fsp--;
		if (state.failed) return;

		match(input,12,FOLLOW_12_in_synpred5_QL204); if (state.failed) return;

		pushFollow(FOLLOW_orExpr_in_synpred5_QL208);
		e=orExpr();
		state._fsp--;
		if (state.failed) return;

		match(input,13,FOLLOW_13_in_synpred5_QL210); if (state.failed) return;

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



	public static final BitSet FOLLOW_27_in_form66 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Ident_in_form68 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_block_in_form72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_block100 = new BitSet(new long[]{0x0000000510000080L});
	public static final BitSet FOLLOW_stat_in_block106 = new BitSet(new long[]{0x0000000510000080L});
	public static final BitSet FOLLOW_34_in_block113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_stat134 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stat136 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_orExpr_in_stat140 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stat142 = new BitSet(new long[]{0x0000000110000080L});
	public static final BitSet FOLLOW_stat_in_stat146 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stat148 = new BitSet(new long[]{0x0000000110000080L});
	public static final BitSet FOLLOW_stat_in_stat152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_stat160 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stat162 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_orExpr_in_stat166 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stat168 = new BitSet(new long[]{0x0000000110000080L});
	public static final BitSet FOLLOW_stat_in_stat172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_stat192 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Ident_in_stat196 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_stat198 = new BitSet(new long[]{0x0000000061000000L});
	public static final BitSet FOLLOW_type_in_stat202 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_stat204 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_orExpr_in_stat208 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stat210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_stat220 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Ident_in_stat224 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_stat226 = new BitSet(new long[]{0x0000000061000000L});
	public static final BitSet FOLLOW_type_in_stat230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Str_in_label252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_type275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_type285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_type295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Int_in_primary316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ident_in_primary326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Str_in_primary334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_primary344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_primary353 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_orExpr_in_primary357 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_primary359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_bool381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_bool392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_unExpr418 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_unExpr_in_unExpr422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_unExpr433 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_unExpr_in_unExpr437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_unExpr448 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_unExpr_in_unExpr452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unExpr465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unExpr_in_mulExpr503 = new BitSet(new long[]{0x0000000000024002L});
	public static final BitSet FOLLOW_set_in_mulExpr511 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_unExpr_in_mulExpr523 = new BitSet(new long[]{0x0000000000024002L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr564 = new BitSet(new long[]{0x0000000000018002L});
	public static final BitSet FOLLOW_set_in_addExpr572 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr582 = new BitSet(new long[]{0x0000000000018002L});
	public static final BitSet FOLLOW_addExpr_in_relExpr617 = new BitSet(new long[]{0x0000000000F80402L});
	public static final BitSet FOLLOW_set_in_relExpr625 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_addExpr_in_relExpr641 = new BitSet(new long[]{0x0000000000F80402L});
	public static final BitSet FOLLOW_relExpr_in_andExpr679 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_andExpr685 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_relExpr_in_andExpr689 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_andExpr_in_orExpr724 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_orExpr730 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_andExpr_in_orExpr734 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_28_in_synpred2_QL134 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_synpred2_QL136 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_orExpr_in_synpred2_QL140 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_synpred2_QL142 = new BitSet(new long[]{0x0000000110000080L});
	public static final BitSet FOLLOW_stat_in_synpred2_QL146 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_synpred2_QL148 = new BitSet(new long[]{0x0000000110000080L});
	public static final BitSet FOLLOW_stat_in_synpred2_QL152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_synpred3_QL160 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_synpred3_QL162 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_orExpr_in_synpred3_QL166 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_synpred3_QL168 = new BitSet(new long[]{0x0000000110000080L});
	public static final BitSet FOLLOW_stat_in_synpred3_QL172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_in_synpred5_QL192 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Ident_in_synpred5_QL196 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_synpred5_QL198 = new BitSet(new long[]{0x0000000061000000L});
	public static final BitSet FOLLOW_type_in_synpred5_QL202 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_synpred5_QL204 = new BitSet(new long[]{0x00000000840192E0L});
	public static final BitSet FOLLOW_orExpr_in_synpred5_QL208 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_synpred5_QL210 = new BitSet(new long[]{0x0000000000000002L});
}
