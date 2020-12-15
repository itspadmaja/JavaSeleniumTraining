package JavaTraining;

public class functionsAssignment {

	public static void main(String[] args) {
		functionsAssignment obj = new functionsAssignment();
		//int sum1=obj.add();
		//System.out.println(sum1+5);
		obj.add();
		int pr = obj.multipy(21, 3);
		System.out.println(pr);
		System.out.println(Factorial(5));
		

	}
	
	//1.Write a program to print the sum of two numbers entered by user by defining your own method.
	
	public void add() {
		System.out.println("The sum of two numbers is: ");
		int a = 500;
		int b = 901;
		int sum = a+b;
		System.out.println(sum);
		
	}
	//2. Define a method that returns the product of two numbers entered by user.
	public int multipy(int x,int y) {
		System.out.println("the product of two numbers is: ");
		int product = x*y;
		return product;
		
	}
	//Write a program to print the factorial of a number by defining a method named 'Factorial'.
	//Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. 
	public static int Factorial(int n) {
		
		if(n==0)
			return 1;
		else 
			return (n*(Factorial(n-1)));
	
	}
	
	

}
