package stackjava.design.pattern.creational.factory;

public class Application {
	public static void main(String[] args) {
		Bank bidv = BankFactory.getBank(BankType.BIDV);
		Bank agribank = BankFactory.getBank(BankType.AGRIBANK);
		
		bidv.getName();
		agribank.getName();
	}
}
