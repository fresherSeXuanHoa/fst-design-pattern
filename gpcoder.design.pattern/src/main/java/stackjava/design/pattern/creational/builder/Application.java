package stackjava.design.pattern.creational.builder;

public class Application {
	public static void main(String[] args) {
		Order fastFood = new FastFoodBuilder().setVegetable(VegetableType.CUCUMBER).setBread(BreadType.BEEF).build();
		Order otherFastFood = new FastFoodBuilder().setBread(BreadType.FRIED_EGG).setVegetable(VegetableType.CUCUMBER).setSauce(SauceType.FISH_SAUCE).setType(OrderType.ON_SITE).build();

		System.out.println(fastFood);
		System.out.println(otherFastFood);
	}
}
