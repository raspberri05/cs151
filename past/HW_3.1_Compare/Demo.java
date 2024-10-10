
import java.util.*;
import java.io.*;

public class Demo {

	static public void myPrint ( ArrayList<User> m_users ) {
		for (User u: m_users ) {
			System.out.println ( u + "," );
		}
	}
	static public void myHash ( ArrayList<User> inputs ) {
		for ( User.CompareBy compare : User.CompareBy.values() ) {
			User.setCompareBy ( compare, false );
			ArrayList<User> users = new ArrayList<> ( new HashSet(inputs) ) ;
			String name = "HashSet size by " + compare  ;
			name = String.format ( "%-25s", name );
			name += " = " + users.size() ;
			System.out.println ( name );
		}
	}

	static public void mySort ( ArrayList<User> inputs , boolean reverse ) {
		for ( User.CompareBy compare : User.CompareBy.values() ) {
			User.setCompareBy ( compare, reverse );
			// xxx filter out the duplicate objects
			ArrayList<User> users = new ArrayList<> ( new HashSet(inputs) ) ;
	
        	Collections.sort ( users );
			String name = "\nSort by " + compare ;
			if ( reverse ) {
				name += " (in reversed order)" ;
			}
			System.out.println ( name);
			myPrint ( users );
		}
	}

	public static void main ( String args[] ) throws FileNotFoundException {
		ArrayList<User> users = new ArrayList<> ( );
        File file = new File( "test.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
    		String firstName = sc.nextLine() ;
			String lastName = sc.nextLine() ;
			String email  = sc.nextLine() ;
        	if  (sc.hasNextLine()) {
        		sc.nextLine();
			}
    	    User u = new  User(firstName, lastName, email ) ;
			users.add ( u );
		}
		mySort( users, false );
		mySort( users, true );
		myHash( users );

	}
}

