// package headfirst.designpatterns.strategy;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		String s = this.getClass().getSimpleName();
		System.out.println("I'm a " + s + ": ");
		//System.out.println("I'm a model duck");
	}
}
