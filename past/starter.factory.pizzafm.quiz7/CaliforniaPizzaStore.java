// package headfirst.designpatterns.factory.pizzafm;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
				// xxx your codes
				return new CaliforniaStyleCheesePizza();
        	} else if (item.equals("veggie")) {
				// xxx your codes
				return new CaliforniaStyleVeggiePizza();
        	} else if (item.equals("clam")) {
				// xxx your codes
				return new CaliforniaStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
				// xxx your codes
				return new CaliforniaStylePepperoniPizza();
        	} else return null;
	}
}
