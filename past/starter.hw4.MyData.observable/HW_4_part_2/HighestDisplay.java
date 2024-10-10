
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;
import java.util.Collections;
	
public class HighestDisplay implements Observer, Display {
	Observable m_observable;
	ArrayList<Float> m_scores ;
	
	public HighestDisplay(Observable observable) {
		// xxx your codes
		this.m_observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable obs, Object arg) {
		// xxx your codes
		this.m_scores = (ArrayList<Float>) arg;

	}

    @Override
    public String toString() {
        // xxx your codes
        // xxx return "Highest: xx.x"
		Float max = Collections.max(m_scores);
        return "Highest: " + max;
    }
	
}
