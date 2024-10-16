public class DroneAdapter implements Duck {
	// xxx your code
	// xxx add a member data 
	Drone drone;;
 
	public DroneAdapter(Drone drone) {
		// xxx your codes
		this.drone = drone;
	}
    
	@Override
	public void quack() {
		// xxx your codes
		// xxx quack by invoking beep
		drone.beep();
	}
  
	@Override
	public void fly() {
		// xxx your codes
		// xxx fly by invoking  spin_rotors, and then take_off
		drone.spin_rotors();
		drone.take_off();
	}
}
