package constructorConcept;

import java.util.ArrayList;

public class University {

	public static void main(String[] args) {
		
		ConstAssign univ = new ConstAssign("SVU" , "India");
		System.out.println("The Country and Univeristy name is: "+ univ.getName() + " "+univ.getCountry());
		System.out.println(univ.getName()+","+univ.getCountry());
		
		
		ConstAssign univ1 = new ConstAssign("06/21/1957");
		System.out.println("Established date of University: "+univ1.getEstDate());
		System.out.println(univ1.getEstDate());
		
		ArrayList<String> listOfCourse = new ArrayList<String>();
		listOfCourse.add("Engineering");
		listOfCourse.add("Medical");
		listOfCourse.add("MBA");
		listOfCourse.add("MCA");
		
		
		ConstAssign univ2 = new ConstAssign("SRI VENKATESWARA UNIVERSITY", "INDIA", "06/21/1957" ,listOfCourse);
		//System.out.println("Details of the University: "+ univ2.getName() +","+univ2.getCountry()+","+univ2.getEstDate()+","+univ2.getCourseList());
		//System.out.println(univ2.getCourseList());
		
		univ2.getUniversityData();
		
		/*
		 * for(String U : univ2.CourseList) { System.out.println(U); }
		 */
		
	}

}
