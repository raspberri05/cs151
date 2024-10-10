public class Cheese extends ToppingDecorator {
	
 
	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}
 
	@Override
	public String toString () {
		return pizza + ", Cheese";
	}
  
	@Override
	public double cost() {
		return pizza.cost(); // cheese is free
	}
}
