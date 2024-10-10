// package headfirst.designpatterns.strategy;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = () -> System.out.println("Squeak");
	}
	
	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior; 
	}
 
	public void display() {
		String s = this.getClass().getSimpleName();
		System.out.println("I'm a " + s + ": ");
		// System.out.println("I'm a rubber duckie");
	}
}
