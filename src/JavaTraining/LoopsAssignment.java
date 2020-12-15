package JavaTraining;

public class LoopsAssignment {

	public static void main(String[] args) {
		//1. WAP to print following output:
		//I am Batman
		/*for( ; ; ) {
			System.out.println("I am Batman");
		}*/
		System.out.println("----------------------");
		//WAP to print I am Batman 1 to I am Batman 9
		for(int i =1; i<10; i++) {
			System.out.println("I am Batman "+(i));
		}
		System.out.println("----------------");
		//3. WAP to print 10 to 1 using for, while and do-while loop
		int k = 10;
		while(k>=1) {
			System.out.println(k);
			k--;
		}
		System.out.println("----------");
		//4. Write a program in Java to print "Hello World" ten times using while loop
		int h = 1;
		while(h<=10) {
			System.out.println("Hello World");
			h++;
		}
		/*for(String st1="I am Batman";st1.equals("I am Batman");){
			System.out.println(st1);
			
		}*/
		System.out.println("-----------------");
		//5.Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		int p = 1;
		while(p<=10) {
			System.out.println(p);
			p++;
			if(p%7==0) {
				break;
				
			}

	
		}
System.out.println("------------------");
		//6. for loop from 00 to 39

 //int m[] = new int[10];
// int t=m.length;
   for(int q=0;q<4;q++){
	   for(int s=0;s<10;s++) {
		   System.out.print(q+""+s+" ");
	   }
	   System.out.println();
     
		}
		System.out.println("-----------------------");
		/*Write a program to create a static Array, having following cricket data:
--name, age, team name, DOB, gender, Strike Rate
--kohli 32 RCB 3/10/1988 male 130.22
--Dhoni 36 CSK 5/21/1984 male 160.89
--Rohit Sharma 34 MI 4/12/1986 male 140.11
--Try to create multiple Object Arrays for different players 
--Try to print all the values of each player on the console*/
		Object ob[]=new Object[6];
		ob[0]="Kohli";
		ob[1]=32;
		ob[2]="RCB";
		ob[3]="3/10/1988";
		ob[4]='M';
		ob[5]=130.22;
		Object ob1[]=new Object[6];
		ob1[0]="Dhoni";
		ob1[1]=36;
		ob1[2]="CSK";
		ob1[3]="5/21/1984";
		ob1[4]='M';
		ob1[5]=160.89;
		Object ob2[]=new Object[6];
		ob2[0]="Rohit";
		ob2[1]=34;
		ob2[2]="MI";
		ob2[3]="5/21/1986";
		ob2[4]='M';
		ob2[5]=140.89;
		for(int a = 0;a<ob.length;a++) {
			System.out.print(ob[a]+ "     ");
			System.out.print(ob1[a]+ "     ");
			System.out.print(ob2[a]+"     ");
			System.out.println(" ");
		}
		System.out.println("---------------------");
		//n=4 n=3 n=2 n=1 n=0
		int c[]=new int[5];
		c[0]=4;
		c[1]=3;
		c[2]=2;
		c[3]=1;
		c[4]=0;
		
		for(int b=0;b<c.length;b++) {
			System.out.println("n = "+ c[b]);
		}
		
		
		




	}

}
