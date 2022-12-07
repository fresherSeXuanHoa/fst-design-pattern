package stackjava.design.pattern.creational.abstractfactory;

public class Application {
	public static void main(String[] args) {
		FurnitureAbstractFactory plasticFactory = FurnitureFactory.getFactory(MaterialType.PLASTIC);
		FurnitureAbstractFactory woodFactory = FurnitureFactory.getFactory(MaterialType.WOOD);
		FurnitureAbstractFactory paperFactory = FurnitureFactory.getFactory(MaterialType.PAPER);
		
		plasticFactory.createChair().create();
		plasticFactory.createTable().create();
		plasticFactory.createHat().create();
		
		woodFactory.createChair().create();
		woodFactory.createTable().create();
		woodFactory.createHat().create();
		
		paperFactory.createChair().create();
		paperFactory.createTable().create();
		paperFactory.createHat().create();
	}
}
