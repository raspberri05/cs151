public class Pepperoni extends ToppingDecorator {
	
	// xxx add your code
	public Pepperoni(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String toString () {
		return pizza + ", Pepperoni";
	}

	@Override
	public double cost() {
		return pizza.cost() + .15; 
	}
}
