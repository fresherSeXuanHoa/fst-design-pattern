package stackjava.design.pattern.creational.signleton;

public class BillPugh {

	private static class BillPughHelper {
		private static final BillPugh instance = new BillPugh();
	}

	private BillPugh() {

	}

	public static BillPugh getInstance() {
		return BillPughHelper.instance;
	}
}
