	public enum Topping {
		CHEESE ("cheese", 0.0) ,
		CLAM ("clam", 3.0),
		PEPPERONI ("pepperoni", 1.5) ,
		OLIVES ("olives", 2.0), 

		;

		String name;
	    double cost ;	

		private Topping (String n, double c ) {
			name = n ;
			cost = c ;
		}
	}
