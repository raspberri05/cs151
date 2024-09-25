import java.util.* ;
public class CompareId extends Compare             {
	protected boolean m_reverse;
	// xxx Compare by ID
	// xxx your code
	public CompareId (boolean r ) { // 1-arg ctor
		m_reverse = r;
	}

	@Override
	public int compare( User o1, User o2 ) {
		int temp = 0;
		int e1 = o1.getId();
		int e2 = o2.getId();
		if ( e1 - e2 < 0 ) temp=-1;
		else if ( e1 - e2 > 0 ) temp=1;
		if (m_reverse) temp = -temp;
		return temp;
	}
}

