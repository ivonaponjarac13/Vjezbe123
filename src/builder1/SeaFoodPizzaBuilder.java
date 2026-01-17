package builder1;

public class SeaFoodPizzaBuilder implements PizzaBuilder {
	
	private Pizza pizza;
	public SeaFoodPizzaBuilder() {
		this.pizza = new Pizza();
	}

	@Override
	public void putDought() {
		pizza.setDough("integralno");

	}

	@Override
	public void putSauce() {
		pizza.setSauce("paradajz");

	}

	@Override
	public void putCheese() {
		pizza.setCheese("sir");

	}

	@Override
	public void putMeat() {
		pizza.setMeat("riba");

	}

	@Override
	public Pizza getPizza() {
		return this.pizza;
	}

}
