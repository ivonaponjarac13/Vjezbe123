package builder1;

public class CapricciosaBuilder implements PizzaBuilder {
	
	private Pizza pizza;
	
	public CapricciosaBuilder() {
		this.pizza = new Pizza();
	}
	
	

	@Override
	public void putDought() {
		pizza.setDough("klasicno");

	}

	@Override
	public void putSauce() {
		pizza.setSauce("kecap");

	}

	@Override
	public void putCheese() {
		pizza.setCheese("mocarela");

	}

	@Override
	public void putMeat() {
		pizza.setMeat("sunka");

	}

	@Override
	public Pizza getPizza() {
		
		return this.pizza;
	}

}
