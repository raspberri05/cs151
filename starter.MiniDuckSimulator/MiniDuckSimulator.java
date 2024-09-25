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

		// I added the below line with my full name and student id as there was no _your_full_name> and <your_student_id> field to replace in the code
		System.out.println("\nNaya Singhania 017192682");

		// xxx create 2 behaviors: myFly and myQuack
		// xxx your codes
        // xxx Do NOT use the lambda expression that was used in the previous assignment
		FlyBehavior myFly = new MyFly();
		QuackBehavior myQuack =  new MyQuack();


        // xxx create 4 duck objects: model,mallard, decoy, rubberDuckie
        // xxx your codes
		Duck model = new ModelDuck();
		Duck mallard = new MallardDuck();
		Duck decoy = new DecoyDuck();
		Duck rubberDuckie = new RubberDuck();

        // xxx put the 4 duck objects in a java List
		List<Duck> ducks = new ArrayList<Duck>();
		ducks.add(model);
		ducks.add(mallard);
		ducks.add(decoy);
		ducks.add(rubberDuckie);

		printTitle ( "original") ;

		for (Duck d: ducks ) {
			// xxx your codes
			// display
			// perform fly
			// perform quack
			d.display();
			d.performFly();
			d.performQuack();
		}
		printTitle ( "new") ;

		
		for (Duck d: ducks ) {
			// xxx your codes
			// xxx use the new behaviors myFlyu and myQuack
			// display
			// perform fly
			// perform quack
			d.display();
			d.setFlyBehavior(myFly);
			d.setQuackBehavior(myQuack);
			d.performFly();
			d.performQuack();
		}

	}
}
