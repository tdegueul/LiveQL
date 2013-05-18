package nl.cwi.swat.liveql.patch;

import java.util.Stack;

import javax.swing.tree.DefaultMutableTreeNode;

import nl.cwi.swat.liveql.ast.stat.Stat;
import nl.cwi.swat.liveql.diff.Edit;


public class AddToJTree implements Visitor {

	private Stack<DefaultMutableTreeNode> stack;

	public static void patchIntoJTree(FormPatch root, DefaultMutableTreeNode top) {
		AddToJTree p2j = new AddToJTree(top);
		root.accept(p2j);
	}
	
	private AddToJTree(DefaultMutableTreeNode top) {
		this.stack = new Stack<DefaultMutableTreeNode>();
		stack.push(top);
	}
	
	@Override
	public void visit(BlockPatch patch) {
		for (Edit<Stat> e: patch.getEdits()) {
			stack.peek().add(new DefaultMutableTreeNode(e.toString()));
		}
		for (StatPatch p: patch.getKids()) {
			p.accept(this);
		}
	}

	@Override
	public void visit(ConditionalPatch patch) {
		DefaultMutableTreeNode node = new DefaultMutableTreeNode("if");
		for (Edit<Stat> e: patch.getEdits()) {
			node.add(new DefaultMutableTreeNode(e.toString()));
		}
		DefaultMutableTreeNode thn = new DefaultMutableTreeNode("then");
		stack.push(thn);
		patch.getThenPatch().accept(this);
		stack.pop();
		
		DefaultMutableTreeNode els = new DefaultMutableTreeNode("else");
		stack.push(els);
		patch.getElsePatch().accept(this);
		stack.pop();
		
		node.add(thn);
		node.add(els);
		stack.peek().add(node);
	}

	@Override
	public void visit(QuestionPatch patch) {
		if (patch.getEdits().isEmpty()) {
			return;
		}
		for (Edit<Stat> e: patch.getEdits()) {
			stack.peek().add(new DefaultMutableTreeNode(e.toString()));
		}
	}

	@Override
	public void visit(FormPatch patch) {
		patch.getBody().accept(this);
	}

}