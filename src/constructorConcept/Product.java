package constructorConcept;

import java.util.ArrayList;

public class Product {

	public static void main(String[] args) {
		
		ecomProduct prod1 = new ecomProduct("Apple","white",2.3);
		System.out.println("The product details: "+prod1.name+", "+prod1.color+", "+prod1.price);
		
		ArrayList<String> Apple_Sellerlist = new ArrayList<String>();
		Apple_Sellerlist.add("croma");
		Apple_Sellerlist.add("Royal");
		Apple_Sellerlist.add("EverFirst");
		
		ecomProduct prod2 = new ecomProduct("Apple iMac","Silver",2.5,Apple_Sellerlist);
		System.out.println("The Product full details is: "+prod2.name+","+prod2.color+","+"prod2.price"+prod2.sellerlist);
		for(String list : prod2.sellerlist) {
			System.out.println(list);
		}

	}

}
