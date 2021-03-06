package nl.cwi.swat.liveql.ast.expr;

import java.util.Map;

import nl.cwi.swat.liveql.ast.types.Numeric;
import nl.cwi.swat.liveql.ast.types.Type;

public class Neg extends Unary {

	public Neg(Expr arg) {
		super(arg);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public Type typeOf(Map<Ident, Type> typeEnv) {
		return new Numeric();
	}

}
