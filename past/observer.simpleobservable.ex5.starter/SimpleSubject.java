import java.util.Observable;

public class SimpleSubject extends Observable {
	private int value = 0;
	
	public SimpleSubject() { }
	
	public void setValue(int value) {
		// xxx your code
		this.value = value;
		setChanged();
		notifyObservers();
	}
	
	public int getValue() {
		return this.value;
	}
}
