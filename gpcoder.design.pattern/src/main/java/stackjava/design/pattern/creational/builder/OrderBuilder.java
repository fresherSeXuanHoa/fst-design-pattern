package stackjava.design.pattern.creational.builder;

public interface OrderBuilder {
	OrderBuilder setType(OrderType orderType);
	OrderBuilder setBread(BreadType breadType);
	OrderBuilder setSauce(SauceType sauceType);
	OrderBuilder setVegetable(VegetableType vegetableType);
	Order build();
}
