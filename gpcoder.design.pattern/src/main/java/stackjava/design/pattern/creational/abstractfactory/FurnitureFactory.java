package stackjava.design.pattern.creational.abstractfactory;

public class FurnitureFactory {

	private FurnitureFactory() {

	}

	public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
		switch (materialType) {
		case PLASTIC:
			return new PlasticFactory();
		case WOOD:
			return new WoodFactory();
		case PAPER:
			return new PaperFactory();
		default:
			throw new IllegalArgumentException("Invalid MaterialType");
		}
	}
}
