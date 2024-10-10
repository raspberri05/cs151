import  java.util.*;

public class Example {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();
	
		SimpleObserver a = new SimpleObserver(simpleSubject, "A");
		SimpleObserver b = new SimpleObserver(simpleSubject, "B");
		SimpleObserver c = new SimpleObserver(simpleSubject, "C");

        List<SimpleObserver> observers = Arrays.asList ( a,b,c);

		int x = 100;
		for ( SimpleObserver o: observers ) {
			System.out.println ("Set value = " + x );
			simpleSubject.setValue( x );
			System.out.println ();
			x += 100 ;
			System.out.println ("Remove = " + o );
			simpleSubject.removeObserver(o);

		}
	}
}
