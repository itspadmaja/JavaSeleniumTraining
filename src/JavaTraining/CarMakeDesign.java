package JavaTraining;

public class CarMakeDesign {
	
	String name;
	int price;
	String model;
	static int wheels;
	public void start() {
		System.out.println("start the car");
	}
	public void stop() {
		System.out.println("stop the car");
	}
	public static void Go() {
		System.out.println("Let's go");
	}
	
	public static void main(String[] args) {
		
		//how to call static vars--1)call directly 2) call  by class name
		wheels = 4;
		System.out.println(wheels);
		Go();
		CarMakeDesign car = new CarMakeDesign();
		car.name = "BMW";
		car.price = 90;
		car.model = "12345ab";
		//car.wheels = 4;
		System.out.println(car.name+" "+car.price+" "+car.model+" "+CarMakeDesign.wheels);
		
		car.start();
		car.stop();
		car.Go();
	}

}
