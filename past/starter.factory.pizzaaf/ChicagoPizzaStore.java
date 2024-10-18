// package headfirst.designpatterns.factory.pizzaaf;

public class ChicagoPizzaStore extends PizzaStore {

    ChicagoPizzaStore () {
		super ( new ChicagoPizzaIngredientFactory() );
	}	

}
