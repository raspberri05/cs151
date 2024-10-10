// package headfirst.designpatterns.observer.course;

// import java.util.Observable;
// import java.util.Observer;
import java.util.ArrayList;
	
public class CurrentDisplay implements Observer {
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
        // xxx return "List of scores: [xx.x, xx.x, xx.x]"
        return "List of scores: " + m_scores;
    }

	
}
