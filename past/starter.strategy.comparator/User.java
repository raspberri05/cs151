import java.util.*;
import java.io.*;
import java.io.IOException;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private String email;
	private int    m_id;
	static private int m_count;


    @Override
    public String toString () {
       StringBuilder a = new StringBuilder();
            a.append(String.format ("%2d", getId() ) ) ;
            a.append(" - " ) ;
            a.append(getFullName() );
            a.append(" - " ) ;
            a.append(getEmail()  ) ;
        return a.toString();

    }
	
    public User(String firstName, String lastName, String email ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
		m_id = m_count ;
		m_count ++;
    }

    // Getters 
    public int getId() {
        return m_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return lastName +", " + firstName;
    }

    public String getEmail() {
        return email;
    }

	@Override
    public int compareTo(User user) { 
		// xxx compare by Full Names
		// xxx your code
        String e1 = this.getFullName();
        String e2 = user.getFullName();
        if ( e1.compareTo(e2) < 0 ) return -1;
        if ( e1.compareTo(e2) > 0 ) return 1;
        return 0;
    }
	@Override
	public boolean equals (Object u) { // inherited from Object
		return this.compareTo ( (User) u ) == 0 ; 
	}
	@Override
	public int hashCode () { // inherited from Object 
		// xxx your code
        return Objects.hash(firstName, lastName, email);
	}

}
