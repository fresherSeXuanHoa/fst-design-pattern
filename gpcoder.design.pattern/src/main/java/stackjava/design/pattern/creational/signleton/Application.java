package stackjava.design.pattern.creational.signleton;

public class Application {
	public static void main(String[] args) {

		// Eager
		Eager eagerInstance = Eager.getInstance();
		Eager otherEagerInstance = Eager.getInstance();

		System.out.println(eagerInstance.hashCode());
		System.out.println(otherEagerInstance.hashCode());

		// Static Block
		StaticBlock staticBlockInstance = StaticBlock.getInstance();
		StaticBlock otherStaticBlockInstance = StaticBlock.getInstance();

		System.out.println(staticBlockInstance.hashCode());
		System.out.println(otherStaticBlockInstance.hashCode());

		// Lazy
		Lazy lazyInstance = Lazy.getInstance();
		Lazy otherLazyInstance = Lazy.getInstance();

		System.out.println(lazyInstance.hashCode());
		System.out.println(otherLazyInstance.hashCode());

		// Thread Safe
		ThreadSafe threadSafeInstance = ThreadSafe.getInstance();
		ThreadSafe otherThreadSafeInstance = ThreadSafe.getInstance();

		System.out.println(threadSafeInstance.hashCode());
		System.out.println(otherThreadSafeInstance.hashCode());

		// Double Check Locking
		DoubleCheckLocking doubleCheckLockingInstance = DoubleCheckLocking.getInstance();
		DoubleCheckLocking otherDoubleCheckLockingInstance = DoubleCheckLocking.getInstance();

		System.out.println(doubleCheckLockingInstance.hashCode());
		System.out.println(otherDoubleCheckLockingInstance.hashCode());

		// Bill Pugh
		BillPugh billPughInstance = BillPugh.getInstance();
		BillPugh otherBillPughInstance = BillPugh.getInstance();

		System.out.println(billPughInstance.hashCode());
		System.out.println(otherBillPughInstance.hashCode());

		// Enum
		Enum enumInstance = Enum.INSTANCE;
		Enum otherEnumInstance = Enum.INSTANCE;

		System.out.println(enumInstance.hashCode());
		System.out.println(otherEnumInstance.hashCode());
	}
}
