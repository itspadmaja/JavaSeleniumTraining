package JavaTraining;

public class FunctionsInJava {

	public static void main(String[] args) {
		FunctionsInJava abc = new FunctionsInJava();
		abc.test();
		abc.printscreen();
		abc.add();
		int k =abc.total();
		System.out.println(k+900);
		 String l = abc.playernames();
		 System.out.println(l);
		 int s1=abc.getSum(60, 90);
		 System.out.println(s1+2500+100);
		int s2 =  abc.getSum(120, 150);
		System.out.println(s2);
		 String str = abc.getCapName("Germany");
		 System.out.println(str);
			int str1=abc.getMarks("Radha");
			System.out.println(str1);
		
		
		
	}
	//1. No input , no return
	public void test() {
		System.out.println("test method");
	}
	public void printscreen() {
		System.out.println("Printing Screen");
	}
	public void add() {
		System.out.println("adding method");
		int a = 100;
		int b = 200;
		int c = a+b;
		System.out.println(c);
	}
	//2. no input , some return
	public int total() {
		System.out.println("total method");
		int i = 10;
		int j = 20;
		int sum = i+j;
		return sum;
	}
	public String playernames() {
		System.out.println("get player names");
		String s = "Sachin";
		return s;
	}
	//3. some input,some return
	public int getSum(int a , int b) {
		System.out.println("getting sum of numbers");
		int sum=a+b;
		return sum;
	}
	//WAP to get the capital name of the country
		public String getCapName(String countryname) {
			System.out.println("The captial name is:  "+ countryname);
			if (countryname.equals("India")) {
				return "New Delhi";
				
			}
			else if(countryname.equals("USA")) {
				
				return "Washington DC";
			}
			else if(countryname.equals("UK")) {
				return "London";
				
			}
			else {
				System.out.println("Country name is not found "+ countryname);
				return null;
			}
		}
		
	
		//WAP where i'll be passing a student Name(String) and then function should return the marks(int) of that student.
		
		public int getMarks(String studentname){
			int marks = 0;
			System.out.println("getting student marks for "+studentname);
			if( studentname.equals("Rama")) {
				marks = 95;
				
			}
			else if (studentname.equals("Seetha")) {
				marks = 100;
			}
			else if (studentname.equals("Krishna")) {
				marks = 90;
			}
			else if (studentname.equals("Radha")) {
				marks = 50;
			}
			else {
				System.out.println("Student not found "+studentname);
				return -1;
				
			}
			return marks;
			
		
	

}
}
