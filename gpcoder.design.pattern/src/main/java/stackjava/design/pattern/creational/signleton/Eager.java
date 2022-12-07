package stackjava.design.pattern.creational.signleton;

public class Eager {

	private static final Eager INSTANCE = new Eager();

	private Eager() {

	}

	public static Eager getInstance() {
		return INSTANCE;
	}
}
