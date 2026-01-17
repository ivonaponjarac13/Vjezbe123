package builder1;

public class PizzaChef {
	
	private PizzaBuilder pizzaBuilder;
	
	public PizzaChef(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}

	public Pizza getPizza() {
		return this.pizzaBuilder.getPizza();	
		}
	
	public void makePizza() {
		this.pizzaBuilder.putDought();
		this.pizzaBuilder.putCheese();
		this.pizzaBuilder.putMeat();
		this.pizzaBuilder.putSauce();
	}
}
