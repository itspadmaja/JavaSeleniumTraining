package constructorConcept;

import java.util.ArrayList;

public class BrowserAssign {

	public static void main(String[] args) {
		
		Browser br = new Browser("Chrome","Google");
		System.out.println("Browser Name & Vendor Name : "+br.getBrowserName()+" & "+br.getVendorName());
		Browser br1 = new Browser(85.0);
		System.out.println("The Curent Version of Google Chrome is: "+br1.getCurrentVersion());
		
		ArrayList<String> List_of_Plugins = new ArrayList<String>();
		List_of_Plugins.add("Adobe");
		List_of_Plugins.add("Java Plugin");
		List_of_Plugins.add("Hangouts");
		List_of_Plugins.add("Google Translate");
		List_of_Plugins.add("Skype");
		
		Browser br2 = new Browser("Chrome","Google",85.0,List_of_Plugins);
		System.out.println("Browser Full Details : "+br2.getBrowserName()+","+br2.getVendorName()+","+br2.getCurrentVersion()+","+br2.getPluginsList());
		
		
		
		
		
		
	}

}
