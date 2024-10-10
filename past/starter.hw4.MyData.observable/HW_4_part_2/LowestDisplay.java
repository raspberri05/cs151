import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import java.util.Collections;
	
public class LowestDisplay implements Observer, Display {
	Observable m_observable;
	ArrayList<Float> m_scores ;
	
	public LowestDisplay(Observable observable) {
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
        // xxx return "Lowest: 99.2"
		Float min = Collections.min(m_scores);
        return "Lowest: " + min;
    }
	
}
