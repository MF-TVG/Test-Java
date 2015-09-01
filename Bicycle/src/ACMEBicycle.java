
public class ACMEBicycle implements BicycleInterface {
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	// The compiler will now require that methods
	// changeCadence, changeGear, speedUp, and applyBrakes
	// all be implemented. Compilation will fail if those
	// methods are missing from this class.
	
	public void changeCadenceInterface(int newValue){
		cadence = newValue;
	}
	
	public void changeGearInterface(int newValue){
		gear = newValue;
	}
	
	public void speedUpInterface(int increment){
		speed = speed + increment;
	}
	
	public void applyBrakesInterface(int decrement){
		speed = speed - decrement;
	}
	
	void printStates(){
		System.out.println("cadence:" +
	cadence + " speed:" + speed + " gear:" + gear);
	}
}
