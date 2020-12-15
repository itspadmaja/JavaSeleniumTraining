package JavaTraining;

public class AssignmentOne {

	public static void main(String[] args) {
		int i = 74;
		int k = 36;
		System.out.println("The sum is: "+ (i+k));
		int m = 50;
		int n = 3;
		System.out.println("The division is "+ (m/n));
		int a = 5;
		int b = 8;
		int c = 6;
		System.out.println(-a+b*c);
		int p = 55;
		int q = 9;
		System.out.println((p+q)%q);
		int r = 20;
		int s = -3;
		int x = 15;
		int y = 2;
		System.out.println(r+s*a/b);
		System.out.println(a+x/n*y-b%n);//5 + 15 / 3 * 2 - 8 % 3 
		char c1 ='t';
		System.out.println("Hello"+" "+"Selenium"+c1);
		int value = 100;
		int value1 = 200;
		int value2 = 3400;
		System.out.println("Your Total amount is: "+(value+value1+value2));
		byte b3 = 065;
		System.out.println(b3);
		/*Input the 1st number: 25 
Input the 2nd number: 78 
Input the 3rd number: 87
Expected Output :
The greatest: 87*/
		int num1=25;
		int num2=78;
		int num3=87;
		if(num1>num2 && num1>num3) {
			System.out.println("num1 is the greatest");
		}
		if (num2>num3) {
			System.out.println("num2 is the greatest");
		}
		else {
			System.out.println("The greatest is: "+num3);
		}

		
	}
	

}
