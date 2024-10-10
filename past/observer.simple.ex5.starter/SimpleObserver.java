public class SimpleObserver implements Observer {
	private int value;
	private String name;
	private Subject simpleSubject;
	
	public SimpleObserver(Subject simpleSubject, String name) {
		this.name = name;
		// xxx your codes
		this.simpleSubject = simpleSubject;
		this.simpleSubject.registerObserver(this);
	}
	
	@Override
	public String toString () {
		return "Observer " + name ;
	};

	@Override
	public void update(int value) {
		// xxx your codes
		this.value = value;
		display();
	}
	
	public void display() {
        System.out.println(this + " has Value: " + value);
	}
}
