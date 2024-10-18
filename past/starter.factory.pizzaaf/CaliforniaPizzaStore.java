// package headfirst.designpatterns.factory.pizzaaf;

public class CaliforniaPizzaStore extends PizzaStore {
 
    CaliforniaPizzaStore () {
		// xxx your codes
		// super (...)
    super ( new CaliforniaPizzaIngredientFactory() );
    }

}
