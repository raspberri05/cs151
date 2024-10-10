import java.util.ArrayList;
	
public class AverageDisplay implements Observer {
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
        // xxx return "Average: xx.xxxxx"
        float sum = 0;
        for (Float score : m_scores) {
            sum += score;
        }
        float average = sum / m_scores.size();
        return "Average: " + average;
    }

}
