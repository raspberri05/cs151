	public enum Crust {
		Thin  ( "Thin crust pizza, with tomato sauce", 7.99 ),
		Thick ("Thick crust pizza, with tomato sauce", 8.99 ) ;

		String name;
	    double cost ;	
		Crust (String n, double c ) {
			name = n ;
			cost = c ;
		}
	}
