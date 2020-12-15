package oop_Inheritance;

public class Audi extends Vehicle {
	@Override
	public void diesel() {
		System.out.println("Audi--diesel");
	}
	
	public void refuel() {
		System.out.println("Audi---refuel");
	}

}
