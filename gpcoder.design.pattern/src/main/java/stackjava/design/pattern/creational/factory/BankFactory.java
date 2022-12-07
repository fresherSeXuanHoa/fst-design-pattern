package stackjava.design.pattern.creational.factory;

public class BankFactory {
	
	private BankFactory() {
		
	}
	
	public static final Bank getBank(BankType bankType) {
		switch (bankType) {
		case BIDV:
			return new BIDV();
		case AGRIBANK:
			return new Agribank();
		default:
			throw new IllegalArgumentException("Invalid Bank Type");
		}
	}
}
