// package headfirst.designpatterns.strategy;

public abstract class Duck {
	// properties
	FlyBehavior   flyBehavior = null;         //  package prive
	QuackBehavior quackBehavior = null;     //


    // Methods
	public Duck() {
	}

    // setters
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

    // setters
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	public final void performFly() {
		flyBehavior.fly();
	}
	public final void performQuack() {
		quackBehavior.quack();
	}

	public final void swim() { // inherited by all subclassess, invariant method
		System.out.println("All ducks float, even decoys!");
	}

	abstract        // benefit ?
	void display(); // to be re-defined in each subclass

}