
public interface BicycleInterface {
	// wheel revolutions per minute
	void changeCadenceInterface(int newValue);
	void changeGearInterface(int newValue);
	void speedUpInterface(int increment);
	void applyBrakesInterface(int decrement);
}
