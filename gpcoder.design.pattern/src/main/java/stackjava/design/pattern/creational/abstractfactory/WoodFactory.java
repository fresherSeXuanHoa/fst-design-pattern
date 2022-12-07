package stackjava.design.pattern.creational.abstractfactory;

public class WoodFactory implements FurnitureAbstractFactory {

	public Chair createChair() {
		return new WoodChair();
	}

	public Table createTable() {
		return new WoodTable();
	}

	public Hat createHat() {
		return new WoodHat();
	}

}
