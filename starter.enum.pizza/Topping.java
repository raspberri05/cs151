	public enum Topping {
		CHEESE ("Cheese", 0.0) ,
		OLIVES ("Olives", 0.3), 
		PEPPERONI ("Pepperoni", 0.15) ,
		CLAM ("Clam", 0.9) 
		;

		String name;
	    double cost ;	

		private Topping (String n, double c ) {
			name = n ;
			cost = c ;
		}
	}
