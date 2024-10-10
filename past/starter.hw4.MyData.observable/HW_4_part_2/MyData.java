import java.util.*;
	
public class  MyData extends  Observable {
    private List<Observer> m_observers;
	ArrayList<Float> m_scores  ;


    public MyData() {
        m_observers = new ArrayList<Observer>();
    }

	public List<Observer> getObservers () {
		return m_observers;
	}

	@Override
    public void notifyObservers() {
		// xxx your code
        for (Observer o : m_observers) {
            o.update(this, m_scores);
        }
    }

    public void addObserver(Observer o) {
        m_observers.add(o);
    }

    public void displayObservers() {
        for (Observer o : m_observers) {
			System.out.println(o);
        }
    }

    public void deleteObserver(Observer o) {
        m_observers.remove(o);
        System.out.println("Number of observers: " + m_observers.size());
    }

	public void setMeasurements( ArrayList<Float> scores ) {
		// xxx your codes
        m_scores = scores;
        notifyObservers();
	}
	
}
