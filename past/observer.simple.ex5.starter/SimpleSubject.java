import java.util.*;

public class SimpleSubject implements Subject {
	private List<Observer> observers;
	private int value = 0;
	
	public SimpleSubject() {
		// xxx your codes
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		// xxx your codes
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		// xxx your codes
		observers.remove(o);
		
	}
	
	public void notifyObservers() {
		// xxx your codes
		for(Observer o : observers) {
			o.update(value);
		}
	}
	
	public void setValue(int value) {
		// xxx your codes
		this.value = value;
		notifyObservers();
	}
}
