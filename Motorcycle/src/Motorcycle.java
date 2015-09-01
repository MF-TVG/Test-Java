
public class Motorcycle {
	int rpm = 0;
	int speed = 0;
	int gear = 0;
	boolean clutch;
	
	void changeRpm(int newValue) {
		rpm = newValue;
	}
	
	void speedUp(int increment){
		speed = speed + increment;
	}
	
	void applyBrakes(int decrement){
		speed = speed - decrement;
	}
	
	void engageClutch(boolean clutch){
		if(clutch){
			clutch = true;
		}
	}
	
	void changeGear(int newValue){
		gear = newValue;
	}
	
	void printStates(){
		System.out.println("RPM: " + rpm + " Speed: " + speed + " Gear: " + gear + " Clutch: " + clutch);
	}
}
