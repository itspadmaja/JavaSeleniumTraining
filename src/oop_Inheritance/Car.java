package oop_Inheritance;

public class Car extends Vehicle {
	
	public void start() {
		System.out.println("Car---start");
	}
	public void stop() {
		System.out.println("Car--stop");
	}
	public void refuel() {
		System.out.println("Car---refuel");
	}
	public String price() {
		System.out.println("Car----price");
		return "The Car price is 10L";
	}
	public static void wheels() {
		System.out.println("Car----wheels");
	}
	
	public void autoparking() {
		System.out.println("Car----autoparking");
	}

	/*
	 * @Override public void diesel() { System.out.println("Car--diesel"); }
	 */
	@Override
	public void engine(){
		System.out.println("Car----engine");
	}

}
