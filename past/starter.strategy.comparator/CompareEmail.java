import java.util.* ;
public class CompareEmail extends Compare             {
	protected boolean m_reverse;
	// xxx Compare by Email
	// xxx your code
	public CompareEmail (boolean r ) { // 1-arg ctor
		m_reverse = r;
	}

	@Override
	public int compare( User o1, User o2 ) {
		int temp = 0;
		String e1 = o1.getEmail();
		String e2 = o2.getEmail();
		if ( e1.compareTo(e2) < 0 ) temp=-1;
		else if ( e1.compareTo(e2) > 0 ) temp=1;
		if (m_reverse) temp = -temp;
		return temp;
	}
};

