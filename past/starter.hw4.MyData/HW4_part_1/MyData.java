import java.util.*;
	
public class  MyData extends ArrayList<Observer> implements  Observable {
	boolean m_haveChanged = false;

	public void setChanged () {
		m_haveChanged = true;
	}

	public boolean hasChanged () {
		return m_haveChanged ;
	}

	@Override
    public void addObserver(Observer o) {
		// xxx your code
		add(o);
    }

	@Override
    public void deleteObserver(Observer o) {
		// xxx your code
		remove(o);
    }

	@Override
    public void notifyObservers( Object args) {
		// xxx your code
		for (Observer o : this) {
			o.update(this, args);
			setChanged();
		}
    }

	@Override
    public int countObservers() {
		// xxx your code
		return size();
    }

	public void setMeasurements( ArrayList<Float> scores ) {
		// xxx your codes
		notifyObservers(scores);
	}
	
}
