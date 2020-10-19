package nl.cwi.swat.liveql.diff;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.TokenStream;

import com.github.gumtreediff.actions.EditScript;
import com.github.gumtreediff.actions.SimplifiedChawatheScriptGenerator;
import com.github.gumtreediff.gen.Register;
import com.github.gumtreediff.gen.TreeGenerator;
import com.github.gumtreediff.gen.TreeGenerators;
import com.github.gumtreediff.gen.antlr3.AbstractAntlr3TreeGenerator;
import com.github.gumtreediff.matchers.MappingStore;
import com.github.gumtreediff.matchers.Matchers;
import com.github.gumtreediff.tree.TreeContext;

import nl.cwi.swat.liveql.parser.antlr.QLLexer;
import nl.cwi.swat.liveql.parser.antlr.QLParser;

@Register(id = "ql", accept =  "\\.ql$")
public class AntlrQLTreeGenerator extends AbstractAntlr3TreeGenerator<QLLexer, QLParser> {
    @Override
    protected QLLexer getLexer(ANTLRStringStream stream) {
        return new QLLexer(stream);
    }

    @Override
    protected QLParser getParser(TokenStream tokens) {
        return new QLParser(tokens);
    }

    @Override
    protected RuleReturnScope getStartRule(QLParser parser) throws RecognitionException {
        return parser.form();
    }

    @Override
    protected final String[] getTokenNames() {
        return QLParser.tokenNames;
    }
    
    public static void main(String[] args) throws Exception {
    	// Register AntlrQlTreeGenerator for .ql files
		TreeGenerators.getInstance().install((Class<? extends TreeGenerator>) AntlrQLTreeGenerator.class,
				AntlrQLTreeGenerator.class.getAnnotation(com.github.gumtreediff.gen.Register.class));
		
		// Build a tree from left/right .ql files, compute node mappings
		TreeContext srcTree = TreeGenerators.getInstance().getTree("/home/dig/repositories/LiveQL/src/nl/cwi/swat/liveql/examples/box1.ql");
		TreeContext dstTree = TreeGenerators.getInstance().getTree("/home/dig/repositories/LiveQL/src/nl/cwi/swat/liveql/examples/box1-v2.ql");
		MappingStore mappings = Matchers.getInstance().get("gumtree-simple").match(srcTree.getRoot(), dstTree.getRoot());

		// Get an edit script from left to right
		EditScript script = new SimplifiedChawatheScriptGenerator().computeActions(mappings);
		
		System.out.println(srcTree.getRoot().toTreeString());
		System.out.println(dstTree.getRoot().toTreeString());
		System.out.println(mappings);
		
		script.forEach(a -> System.out.println(a));
	}
}

