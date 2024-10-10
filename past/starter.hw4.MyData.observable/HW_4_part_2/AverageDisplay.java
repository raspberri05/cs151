import java.util.ArrayList;
import java.util.Observer;
import java.util.Observable;
	
public class AverageDisplay implements Observer, Display {
	Observable m_observable;
	ArrayList<Float> m_scores ;
	
	public AverageDisplay(Observable  observable) {
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
        // xxx return "Average: xx.xxxxx"
		float sum = 0;
		for (Float score : m_scores) {
			sum += score;
		}
		float avg = sum / m_scores.size();
		return "Average: " + avg;
    }

}
