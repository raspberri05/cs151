// package headfirst.designpatterns.strategy;


import java.util.*;

public class AnimalTest {
 
	public static void main(String[] args) {
		AnimalTest at = new AnimalTest();
		at.makeSomeAnimals();
	}
    public interface SoundBehavior { // inner class
		public String soundBehavior();
	}

	public void makeSomeAnimals() {
		Animal dog = new Dog();
		Animal cat = new Cat();
		// treat dogs and cats as their supertype, Animal

		SoundBehavior bark = () -> "Woof" ;
		SoundBehavior meow = () -> "Meow" ;

		System.out.println ("The original Sound Behavior!!!");
		List<Animal> animals = Arrays.asList ( cat, dog ); 
		animals.forEach( Animal::makeSound ); // can call makeSound on any Animal

		System.out.println ("Change Sound Behavior!!!");
		cat.setSound (bark);
		dog.setSound (meow);
		animals.forEach( Animal::makeSound ); // can call makeSound on any Animal
	}
	
	public abstract class Animal {  // inner class
		SoundBehavior sound = null;

		public void setSound (SoundBehavior s) { 
			// xxx your code
			sound = s;
		} ;
		public void makeSound()  {
			String s=this.getClass().getSimpleName() + ": " + sound.soundBehavior();
			System.out.println ( s);
		};
	}
	public class Dog extends Animal { // inner class
		public Dog () {
			// xxx your code
			// xxx use lambda expression to create a SoundBehavior object 			
			// xxx or 
			// xxx create an inner class, say Bark, that implements 
			// xxx interface SoundBehavior and then create 
            // xxx an object of that inner class for Dog
			SoundBehavior bark = () -> "Woof" ;
			setSound(bark);
		}
	}
	public class Cat extends Animal { // inner class
		public Cat () {
			// xxx your code
			// xxx use lambda expression to create a SoundBehavior object 
			// xxx or 
			// xxx create an inner class, say Meow, that implements 
			// xxx interface SoundBehavior and then create 
            // xxx an object of that inner class for Cat 
			SoundBehavior meow = () -> "Meow";
			setSound(meow);
		}
	}
}
