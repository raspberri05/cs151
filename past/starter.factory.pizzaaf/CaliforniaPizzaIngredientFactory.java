
public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {
	@Override
	public String getName () {
		return "California" ;
	}

	public Dough createDough() {
		// xxx your codes
		// xxx create class VeryThinCrustDough
		return new VeryThinCrustDough();
	}
 
	public Sauce createSauce() {
		// xxx your codes
		// xxx create class BBQSauce
		return new BBQSauce();
	}
 
	public Cheese createCheese() {
		// xxx your codes
		// xxx create class GoatCheese
		return new GoatCheese();
	}
 
	public Veggies[] createVeggies() {
		// xxx your codes
		// xxx create class RoastedGarlic
		// xxx create class MashedPotato
		// xxx create class ArtichokeHearts
		// xxx create veggies[]
		Veggies veggies[] = { new RoastedGarlic(), 
		                      new MashedPotato(), 
		                      new ArtichokeHearts() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		// xxx create an object of class SlicedPepperoni
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		// xxx create an object of class Calamari();
		return new Calamari();
	}
}
