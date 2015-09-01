
public class MotorcycleDemo {
	public static void main(String[] args){
		Motorcycle yamaha = new Motorcycle();
		Motorcycle harley = new Motorcycle();
		
		harley.changeRpm(1500);
		harley.speedUp(10);
		harley.changeGear(1);
	}
}
