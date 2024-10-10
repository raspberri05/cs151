
import java.util.*;
import java.io.*;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	static public void myPrint ( ArrayList<User> m_users ) {
		for (User u: m_users ) {
			System.out.println ( u + "," );
		}
	}
	static public void mySort ( ArrayList<User> users , boolean reverse ) {
		Compare cfirst 	= new CompareFirstName( reverse );
		Compare clast  	= new CompareLastName( reverse );
		Compare cid 	= new CompareId( reverse )  ;
		Compare cemail 	= new CompareEmail( reverse );
		List <Compare> comparators = Arrays.asList (cfirst,clast, cid, cemail);

		for ( Compare compare : comparators ) {
        	Collections.sort ( users, compare );
			String name = compare.getClass().getSimpleName() ;
			if ( reverse ) {
				name = "Sort by " + name + " (in reversed order)" ;
			}
			System.out.println ( "\n" + name);
			myPrint ( users );
		}
	}

	public static void main ( String args[] ) throws FileNotFoundException {
		HashSet<User> userSet = new HashSet<> ();
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
			userSet.add ( u );
		}
		ArrayList<User> users = new ArrayList<> ( userSet );
		mySort( users, false );
		mySort( users, true );
        Collections.sort ( users );
		System.out.println ( "\n" + "Sort by default (full names)");
		myPrint ( users );

	}
}

