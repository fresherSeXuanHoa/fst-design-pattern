package stackjava.design.pattern.creational.builder;

public class FastFoodBuilder implements OrderBuilder {
	private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;
	
	public OrderBuilder setType(OrderType orderType) {
		this.orderType = orderType;
		return this;
	}

	public OrderBuilder setBread(BreadType breadType) {
		this.breadType = breadType;
		return this;
	}

	public OrderBuilder setSauce(SauceType sauceType) {
		this.sauceType = sauceType;
		return this;
	}

	public OrderBuilder setVegetable(VegetableType vegetableType) {
		this.vegetableType = vegetableType;
		return this;
	}

	public Order build() {
		return new Order(orderType, breadType, sauceType, vegetableType);
	}
}
