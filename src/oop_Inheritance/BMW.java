package oop_Inheritance;

public class BMW extends Car {
	@Override
	public void engine(){
		System.out.println("BMW----engine");
	}

	
	@Override
	public void start() {
		System.out.println("BMW--start");
	}
	public void autoparking() {
		System.out.println("BMW----autoparking");
	}
	@Override
	public String price() {
		System.out.println("BMW----price");
		return "The Car price is 10L";
	}
	
		
	public static void wheels() {//Static methods cannot be overriden
		System.out.println("BMW----wheels");
	}

}
