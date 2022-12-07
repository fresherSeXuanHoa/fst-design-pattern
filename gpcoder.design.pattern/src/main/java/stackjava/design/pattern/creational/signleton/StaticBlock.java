package stackjava.design.pattern.creational.signleton;

public class StaticBlock {

	private static final StaticBlock INSTANCE;

	static {
		try {
			INSTANCE = new StaticBlock();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}

	private StaticBlock() {

	}

	public static StaticBlock getInstance() {
		return INSTANCE;
	}
}
