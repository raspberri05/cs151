// package headfirst.designpatterns.strategy;

import java.util.*;

public class MiniDuckSimulator {
 
	public static void printTitle(String msg) {
		int n = 50;
		System.out.println ("-".repeat (n) );
		System.out.println ("My " + msg + " fly and quack behaviors");
		System.out.println ("-".repeat (n) );
	}
	public static void main(String[] args) {

		// xxx: your codes below
		System.out.println ("Naya Singhania 017192682");
 
        // xxx create 2 behaviors
		// xxx use the java lambda expression
		// xxx hints: https://www.w3schools.com/java/java_lambda.asp
		// xxx hints: https://www.geeksforgeeks.org/lambda-expressions-java-8/
		// xxx: your codes below

		FlyBehavior myFly = () -> System.out.println("I fly in a new way taught by Naya Singhania>");// xxx your codes
		QuackBehavior mySqueak = () -> System.out.println("I quack in a new way taught by Naya Singhania");; // xxx your codes0


        // xxx create 4 duck objects: model,mallard, decoy, rubberDuckie
        // xxx your codes
		ModelDuck model = new ModelDuck();
		MallardDuck mallard = new MallardDuck();
		DecoyDuck decoy = new DecoyDuck();
		RubberDuck rubberDuckie = new RubberDuck();

        // xxx put the 4 duck objects in a java List
		List<Duck> ducks = new ArrayList<Duck>();
		ducks.add(model);
		ducks.add(mallard);
		ducks.add(decoy);
		ducks.add(rubberDuckie);

		printTitle ( "original") ;

		for (Duck d: ducks ) {
			d.display();
			d.flyBehavior.fly();
			d.quackBehavior.quack();
		}
		printTitle ( "new") ;

		for (Duck d: ducks ) {
			d.display();
			d.setFlyBehavior(myFly);
			d.setQuackBehavior(mySqueak);
			d.flyBehavior.fly();
			d.quackBehavior.quack();
		}

	}
}
