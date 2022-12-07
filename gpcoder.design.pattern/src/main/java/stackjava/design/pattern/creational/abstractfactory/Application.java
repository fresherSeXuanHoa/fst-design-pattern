package stackjava.design.pattern.creational.abstractfactory;

public class Application {
	public static void main(String[] args) {
		FurnitureAbstractFactory plasticFactory = FurnitureFactory.getFactory(MaterialType.PLASTIC);
		FurnitureAbstractFactory woodFactory = FurnitureFactory.getFactory(MaterialType.WOOD);
		
		plasticFactory.createChair().create();
		plasticFactory.createTable().create();
		
		woodFactory.createChair().create();
		woodFactory.createTable().create();
	}
}
