public class Clam extends ToppingDecorator {
	
	// xxx add your code
	public Clam(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String toString () {
		return pizza + ", Clam";
	}

	@Override
	public double cost() {
		return pizza.cost() + .90; 
	}
 
}
