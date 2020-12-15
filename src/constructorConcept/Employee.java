package constructorConcept;

public class Employee {
//class vars or global vars
	String name;
	int age;
	double price;
	boolean status;
	char gender;
	
	public Employee() {// 0 parameters or default
		System.out.println("hello employee");
		
	}
	public Employee(String name) {
		this.name = name;
		
	}
	public Employee(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	public Employee(String name,int age,double price, boolean status,char gender) {
		this.name = name;
		this.age = age;
		this.price = price;
		this.status = status;
		this.gender = gender;
		
	}
	
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println("hello");
		Employee e2 = new Employee("Guru");
		System.out.println("employee name is: "+e2.name);
		
		Employee emp = new Employee("RadhaKrishna",32);
		System.out.println(emp.name+" "+emp.age);
		Employee emp1 = new Employee("Rama",25);
		System.out.println("The employee is: "+emp1.name+" "+emp1.age);
		Employee emp2 = new Employee("Janu",29,2.50000,true,'F');
		System.out.println("Full details of new employee is : "+ emp2.name +" "+emp2.age+" "+emp2.price+" "+emp2.status+" "+emp2.gender);
		
		
	}
}
