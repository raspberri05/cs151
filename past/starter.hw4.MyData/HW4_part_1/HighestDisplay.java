// package headfirst.designpatterns.observer.course;

// import java.util.Observable;
// import java.util.Observer;
import java.util.ArrayList;
import java.util.Collections;
	
public class HighestDisplay implements Observer {
	ArrayList<Float> m_scores ;
	
	@Override
	public void update(Observable obs, Object arg) {
		// xxx your codes
        this.m_scores = (ArrayList<Float>) arg;
		toString();
	}

    @Override
    public String toString() {
        // xxx your codes
        // xxx return "Highest: xx.x"
        Float lowest = Collections.max(m_scores);
        return "Highest: " + lowest;
    }
	
}
