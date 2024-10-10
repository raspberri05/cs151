// package headfirst.designpatterns.observer.course;

// import java.util.Observable;
// import java.util.Observer;
import java.util.ArrayList;
import java.util.Collections;
	
public class LowestDisplay implements Observer {
	ArrayList<Float> m_scores ;
	
	@Override
	public void update(Observable obs, Object arg) {
		// xxx your codes
		this.m_scores = (ArrayList<Float>) arg;
		toString();
	}

    @Override
    public String toString() {
        // xxx return "Lowest: 99.2"
		Float lowest = Collections.min(m_scores);
        return "Lowest: " + lowest;
    }
	
}
