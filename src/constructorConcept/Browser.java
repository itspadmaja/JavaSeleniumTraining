package constructorConcept;

import java.util.ArrayList;

public class Browser {
	
	/*
	 * Design a browser class template with the following features: variables:
	 * browserName vendorName currentVersion List of plugins supported by Browser in
	 * Array List<String>
	 * 
	 * --Design the constructor of this class with different parameters and all
	 * parameters.
	 * 
	 * --Write the get method of each variable with return keyword.
	 */
	
	private String browserName;
	private String vendorName;
	private double currentVersion;
	private ArrayList<String> pluginsList;
	
	
	public String getBrowserName() {
		return browserName;
	}


	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}


	public String getVendorName() {
		return vendorName;
	}


	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}


	public double getCurrentVersion() {
		return currentVersion;
	}


	public void setCurrentVersion(double currentVersion) {
		this.currentVersion = currentVersion;
	}


	public ArrayList<String> getPluginsList() {
		return pluginsList;
	}


	public void setPluginsList(ArrayList<String> pluginsList) {
		this.pluginsList = pluginsList;
	}
	public Browser(String browserName , String vendorName) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		
		
	}
	public Browser(double currentVersion) {
		this.currentVersion = currentVersion;
	}


	public Browser(String browserName, String vendorName, double currentVersion, ArrayList<String> pluginsList) {
		
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.pluginsList = pluginsList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
