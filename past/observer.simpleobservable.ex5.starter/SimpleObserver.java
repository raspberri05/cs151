import java.util.Observable;
import java.util.Observer;
	
public class SimpleObserver implements Observer {
	private String name;
	private int value;
	private Observable observable;
	
	public SimpleObserver(Observable observable, String name) { // constructor
		this.name = name;

		// xxx your code
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override 
	public String toString () {
		return name ;
	}

	public void display() {
        System.out.println(this + " has Value: " + value);

	}

	@Override
	public void update(Observable o, Object arg) {
		// xxx your codes
		this.value = ((SimpleSubject)o).getValue();
		display();
	}
}
