package stackjava.design.pattern.creational.abstractfactory;

public class PlasticFactory implements FurnitureAbstractFactory {

	public Chair createChair() {
		return new PlasticChair();
	}

	public Table createTable() {
		return new PlasticTable();
	}

}
