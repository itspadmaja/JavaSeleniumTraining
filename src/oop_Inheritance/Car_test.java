package oop_Inheritance;

public class Car_test {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();
		b.autoparking();
		b.price();
		BMW.wheels();
		b.stop();
		b.refuel();
		b.engine();
		b.diesel();
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.price();
		Car.wheels();
		c.engine();
		c.diesel();
		c.autoparking();
		
		
		Audi a = new Audi();
		a.engine();
		a.diesel();
		
		
		
		Vehicle v = new Vehicle();
		v.engine();
		v.diesel();
	
		//Overridden - Method in the Parent class having same name and same parameter also have in Child Class 
		//Static methods cannot be overridden
		//top casting --Child Object can be refered  by Parent class ref variable
		Car c1 = new BMW();
		c1.start();
		c1.refuel();
		c1.start();
		
		//reference type check
		
		Vehicle v1 =new BMW();
		v1.engine();
		Truck t = new Truck();
		t.theftsafety();
		
	//	Car c2 =(Car)new Vehicle();//ClassCastException
	}

}
