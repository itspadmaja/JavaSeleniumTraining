package JavaTraining;

public class Employee {
	String name;
    int age; 
    double salary;
	boolean status;
	static String lastname;
	

	public static void main(String[] args) {
		
		
		  //final int i = 100;
		 // System.out.println(i);
		  lastname = "guru";
		 //System.out.println(lastname);
		 
		Employee data = new Employee();
		data.age=40;
		data.name="Prasad";
		System.out.println(data.salary);
		System.out.println(data.status);
		System.out.println("The Employee data is :  "+data.age +" "+data.name+" "+Employee.lastname);
		
		
		 
			
	}

}
