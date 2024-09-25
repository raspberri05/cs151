public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private String m_email;
	private int    m_id;
	static private int m_count;
	static private CompareBy   m_compareBy = CompareBy.FULLNAME;
	static private boolean m_reverse = false;

	enum CompareBy {
		FULLNAME,
  		FIRSTNAME,
  		LASTNAME,
		ID,
  		EMAIL
	};

	// xxx 2-arg setter for comparison criteria
	static void setCompareBy ( CompareBy c, boolean reverse) {
		// xxx your codes
        m_compareBy = c;
        m_reverse = reverse;
	}

	// xxx 1-arg setter for comparison criteria
	static void setCompareBy ( CompareBy c ) {
		// xxx your codes
        m_compareBy = c;
	}

    @Override
    public String toString () {
       StringBuilder a = new StringBuilder();
            a.append(String.format ("%2d", getId() ) ) ;
            a.append(" - " ) ;
            a.append(String.format ("%10s", getLastName() ) );
            a.append(", " ) ;
            a.append(String.format ("%-10s", getFirstName() ) );
            a.append(" - " ) ;
            a.append(getEmail()  ) ;
        return a.toString();

    }
	
	// CTOR
    public User(String firstName, String lastName, String email ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.m_email = email;
		m_id = m_count ;
		m_count ++;
    }

    // Getters 
    public int getId() {
        return m_id;
    }

    // Getters 
    public String getFirstName() {
        return firstName;
    }

    // Getters 
    public String getLastName() {
        return lastName;
    }

    // Getters 
    public String getFullName() {
        return lastName +", " + firstName;
    }

    // Getters 
    public String getEmail() {
        return m_email;
    }

	@Override
    public int compareTo(User user) { 
		// xxx your codes
        int result = 0;
        switch (m_compareBy) {
            case FULLNAME:
                result = getFullName().compareTo(user.getFullName());
                break;
            case FIRSTNAME:
                result = getFirstName().compareTo(user.getFirstName());
                break;
            case LASTNAME:
                result = getLastName().compareTo(user.getLastName());
                break;
            case ID:
                result = getId() - user.getId();
                break;
            case EMAIL:
                result = getEmail().compareTo(user.getEmail());
                break;
        }
        if (m_reverse) {
            result *= -1;
        }
        //System.out.println("userParam: " + user + ", userCurr: "+ toString() + ",compareTo: " + result);
        return result;
    }
	@Override
	public boolean equals (Object u) { // inherited from Object
		// xxx your codes
        User user = (User) u;
        boolean result = false;
        switch (m_compareBy) {
            case FULLNAME:
                result = getFullName().equals(user.getFullName());
                break;
            case FIRSTNAME:
                result = getFirstName().equals(user.getFirstName());
                break;
            case LASTNAME:
                result = getLastName().equals(user.getLastName());
                break;
            case ID:
                result = getId() == user.getId();
                break;
            case EMAIL:
                result = getEmail().equals(user.getEmail());
                break;
        }
        //System.out.println("equals: " + result);
        return result;

	}
	@Override
	public int hashCode () { // inherited from Object 
		// xxx your codes
        int result = 0;
        switch (m_compareBy) {
            case FULLNAME:
                result = getFullName().hashCode();
                break;
            case FIRSTNAME:
                result = getFirstName().hashCode();
                break;
            case LASTNAME:
                result = getLastName().hashCode();
                break;
            case ID:
                result = getId();
                break;
            case EMAIL: 
                result = getEmail().hashCode();
                break;
        }
        //System.out.println("hashCode: " + result);
        return result;
	}

}
