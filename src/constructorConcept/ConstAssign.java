package constructorConcept;

import java.util.ArrayList;

public class ConstAssign {
	
	/*
	 * Design a University class template with the following features: variables:
	 * name country stablishedDate List of course provided in Array List<String>
	 * 
	 * --Design the constructor of this class with different parameters and all
	 * parameters.
	 * 
	 * --Write the get method of each variable with return keyword.
	 * 
	 */
	private String name;
	private String country;
	private String estdate;
	private ArrayList<String> CourseList;
	
	public ConstAssign(String name , String country) {
		this.name = name;
		this.country = country;
		
	}
	public String  getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public ConstAssign(String estdate) {
		this.estdate = estdate;
		
	}
	public String getEstDate() {
		return estdate;
	}
	
	
	public ConstAssign(String name, String country, String estdate, ArrayList<String> courseList) {
		
		this.name = name;
		this.country = country;
		this.estdate = estdate;
		this.CourseList = courseList;
	}
	public ArrayList<String> getCourseList() {
		return CourseList;
	}
	
	public void getUniversityData() {
		System.out.println("University Name is "+this.getName());
		System.out.println("Country is "+this.getCountry());
		System.out.println("Established Country is "+this.getEstDate());
		System.out.println("List of Courses is "+this.getCourseList());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
