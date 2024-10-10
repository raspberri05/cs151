// package headfirst.designpatterns.strategy;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		String s = this.getClass().getSimpleName();
		System.out.println("I'm a " + s + ": ");
	}
}
