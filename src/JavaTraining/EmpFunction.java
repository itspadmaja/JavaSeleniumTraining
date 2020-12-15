package JavaTraining;

import java.util.ArrayList;

public class EmpFunction {

	public static void main(String[] args) {
		EmpFunction emp = new EmpFunction();
		
		 String[] asset_name =emp.getEmpAssets("Rama");
		 System.out.println("Total emp assets is: "+asset_name.length); 
		 for(String name: asset_name) { System.out.println(name); }
		 
		System.out.println("------------------------------");
		ArrayList<String> order_list = emp.getEmpOrders("tom");
		System.out.println("total order is: "+order_list.size());
		for(String employee_name : order_list) {
			System.out.println(employee_name);
		}
		
		
		
		
	}
	//WAM: where we have to pass the emp name and return the employee assets array
	
	  public String[] getEmpAssets(String empname) {
	  System.out.println("emp name is: "+empname);
	  String assets[] = new String[4];
	  if(empname.equals("Seetha")) {
		  assets[0]="Mac Pro";
		  assets[1]="Mouse";
	  assets[2]="Keyboard";
	  assets[3]="headphones";
	  
	  } else if (empname.equals("Rama")) {
		  assets[0]="Windows"; 
		  assets[1]="Mouse";
	  assets[2]="Keyboard"; 
	  assets[3]="Camera"; 
	  } else {
	  System.out.println("employee not found"+" "+empname); 
	  
	  }
	  return assets;
	 
	}
	//return ArrayList
	
	public ArrayList<String> getEmpOrders(String ename) {
		System.out.println("getting Employee Order List: "+" "+ename);
		ArrayList<String> orderlist = new ArrayList<String>();
		if(ename.equals("Trump")) {
			orderlist.add("i Phone");
			orderlist.add("T shirt");
			orderlist.add("Apple watch");
			orderlist.add("Blazer");
		}
		else if (ename.equals("Obama")) {
			orderlist.add("TV");
			orderlist.add("Remote");
		}
		else {
			System.out.println("employee order not found" + " "+ ename+" "+"Please pass correct employee order");
		}
		return orderlist;
	}
	
	
	
	
	
	
	
	

}
