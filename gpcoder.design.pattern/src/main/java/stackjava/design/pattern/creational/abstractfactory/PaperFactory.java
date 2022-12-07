package stackjava.design.pattern.creational.abstractfactory;

public class PaperFactory implements FurnitureAbstractFactory {

	public Chair createChair() {
		return new PaperChair();
	}

	public Table createTable() {
		return new PaperTable();
	}

	public Hat createHat() {
		return new PaperHat();
	}

}
