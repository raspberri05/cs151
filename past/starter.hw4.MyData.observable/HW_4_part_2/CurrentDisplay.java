import java.util.Observer;
import java.util.Observable  ;
import java.util.ArrayList;
	
public class CurrentDisplay implements Observer, Display {
	Observable   m_observable;
	ArrayList<Float> m_scores ;
	
	public CurrentDisplay(Observable  observable) {
		// xxx your codes
		this.m_observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable   obs, Object arg) {
		// xxx your codes
		this.m_scores = (ArrayList<Float>) arg;
	}

    @Override
    public String toString() {
        // xxx your codes
        // xxx return "List of scores: [xx.x, xx.x, xx.x]"
		return "List of scores: " + m_scores;
    }

	
}
