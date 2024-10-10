// package headfirst.designpatterns.strategy;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		String s = this.getClass().getSimpleName();
		System.out.println("I'm a real " + s + ": ");
		// System.out.println("I'm a real Red Headed duck");
	}
}
