// package headfirst.designpatterns.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		String s = this.getClass().getSimpleName();
		System.out.println("I'm a " + s + ": ");
		// System.out.println("I'm a real Mallard duck");
	}
}
