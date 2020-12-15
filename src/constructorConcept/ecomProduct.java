package constructorConcept;

import java.util.ArrayList;

public class ecomProduct {
	
	String name;
	String color;
	double price;
	ArrayList<String> sellerlist;
	


public ecomProduct(String name,String color,double price) {
	this.name = name;
	this.color = color;
	this.price = price;
	
	
}



public ecomProduct(String name, String color, double price, ArrayList<String> sellerlist) {
	
	this.name = name;
	this.color = color;
	this.price = price;
	this.sellerlist = sellerlist;
}














}
