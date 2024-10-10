public class Olives extends ToppingDecorator {
	
 
	public Olives(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public String toString () {
		return pizza + ", Olives";
	}
  
	@Override
	public double cost() {
		return pizza.cost() + .30; 
	}
}
