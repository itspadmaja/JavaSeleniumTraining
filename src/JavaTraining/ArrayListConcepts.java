package JavaTraining;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcepts {

	public static void main(String[] args) {
		
		//1.Write a Java program to create a new array list, add some colors (string) and print out the collection
		
		ArrayList<String> color = new ArrayList<String>();
		color.add("Purple");
		color.add("Blue");
		color.add("Yellow");
		color.add("Green");
		color.add("Lavender");
		for(int s = 0;s<color.size();s++) {
			System.out.println(color.get(s));
			
		}
		System.out.println("----------------------------");
		//2.Write a Java program to insert an element into the array list at the first and last positions.
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		ar.add(400);//3
		ar.add(500);//4
		ar.set(0, 600);
		ar.set(4, 700);
		System.out.println(ar.get(0));
		System.out.println(ar.get(4));
		for(int h = 0;h<ar.size();h++) {
			System.out.println(ar.get(h));
		}
		System.out.println("--------------------------");
		//3.Write a Java program to retrieve an element (at a specified index) from a given array list.
		
		ArrayList<Integer> ab = new ArrayList<Integer>();
		ab.add(10);
		ab.add(20);
		ab.add(30);
		ab.add(40);
		System.out.println(ab.get(3));
		System.out.println(".....................");
		
		//9. Write a Java program of swap two elements in an array list.
		ArrayList<Integer> cd = new ArrayList<Integer>();
		cd.add(100);
		cd.add(200);
		System.out.println("before swapping "+ cd.get(0));
		System.out.println("before swapping "+cd.get(1));
		Collections.swap(cd, 0, 1);
		System.out.println("after swapping");
		for(Integer mn : cd) {
			System.out.println(mn);
		}
		System.out.println("---------------------------");
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rama");
		al.add("Seeta");
		al.add("Krishna");
		al.add("Radha");
		System.out.println("arraylist before swap");
		for (String temp : al) {
			System.out.println(temp);
		}
		System.out.println("arraylist after swap");
		Collections.swap(al, 0, 3);
		for (String temp : al) {
			System.out.println(temp);
		}
		
		
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		

		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	
	}

}
