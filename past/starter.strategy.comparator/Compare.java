import java.util.* ;
public abstract class Compare implements Comparator<User> {
	protected boolean m_reverse;

	public Compare (boolean r ) { // 1-arg ctor
		m_reverse = r;
	}

	public Compare () { // no-arg ctor
		this (false );
	}

    @Override
    public abstract int compare(User o1, User o2) ; // to be overriden

    @Override
    public String toString () {
		return this.getClass().getSimpleName() ;
	}

};

