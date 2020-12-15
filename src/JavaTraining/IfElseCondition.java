package JavaTraining;

public class IfElseCondition {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if (a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		if(true) {
			System.out.println("hello");
		}
		else {//dead code
			System.out.println("bye");
		}
		String s = "Hello";
		String s1 = "hello";
			if (s.equalsIgnoreCase(s1)){
				System.out.println("both are equal");
				
			}
			else {
				System.out.println("both are not equal");
			}
			int total = 100;// ( = is memory allocated, assignement operator
			int fees = 100;
			if (total==fees) {//variable to variable
				System.out.println("total is equal to fees");
			}
			float f1 = 12.33f;
			float f2 = 22.33f;
			if (f1==f2) {
				System.out.println("f1 is equal to f2");
			}
			else {
				System.out.println("f1 is not equal to f2");
			}
			if (100==100) {//value to value
				System.out.println("both are equal");
			}
             if(12.22==12) {//condition not satisfied
            	 System.out.println("both are equal");
             }
             //> < >= <= !=
             int c = 2000;
             int d = 2000;
             if(c>=d) {
            	 System.out.println("PASS");
             }
             int balance = 101;
             if(balance!=100) {
            	 System.out.println("balance is not equal");
             }
             int marks = 80;
             if (marks>=90) {
            	 
            	 if(marks<=100){
            	 System.out.println("pass");
             }
             
             else {
            	 System.out.println("wrong marks");
             }
             }
            	 else {
            		 System.out.println("fail");
            	 }
             //WAPto find out the highest number where three different numbers given
             int p = 5000;
             int q = 6000;
             int r = 3000;
             // && AND operator Short Circuit operator
             if (p>q && p>r) {//false && false is false true && true is true false && true is false
            	 System.out.println("p is the highest number");
             }
             else if (q>r) {
            	 System.out.println("q is the highest number");
             }
             else {
            	 System.out.println("r is the highest number");
             }
	}

}

