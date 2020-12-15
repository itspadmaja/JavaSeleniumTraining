package JavaTraining;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "This is my first i Java Project";
		System.out.println(str.length());
		System.out.println("Li: " + 0);
		System.out.println("Hi: "+( str.length()-1));
		System.out.println(str.charAt(25));
		System.out.println(str.charAt(5));
		//System.out.println(str.charAt(29));
		//System.out.println(str.charAt(-1));
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("j"));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("i",str.indexOf("i")+1));
		System.out.println("*******");
		//System.out.println(str.substring(str.indexOf("i")+5));
			
		System.out.println(str.indexOf("Java"));
		System.out.println(str.indexOf("Rama"));
		
		String msg = "Welcome Admin";
		
		if(msg.indexOf("Admin")>0) {
		System.out.println("correct message displayed");	
		}
		else {
			System.out.println("incorrect message displayed");
		}
		String s = "   Hello World    ";
		System.out.println(s.trim());
		System.out.println(s.trim().replace(" ",""));
		
		String browser = "Chrome";
		if(browser.contains("Chrome")) {
			System.out.println("This is a Chrome browser");
		}
		System.out.println(browser.equals("Chrome"));
		System.out.println(browser.equalsIgnoreCase("chrome"));
		String f1 = "Hello World";
		String f2 = "Hello World ";
		System.out.println(f1.equalsIgnoreCase(f2.trim()));
		System.out.println(f1.concat(f2));
		System.out.println(f1+f2);
		//split
		
		String lang ="Java;Python;JavaScript;Ruby";
		String []language = lang.split(";");
		System.out.println(language.length);
		System.out.println(language[0]);
		for(String element : language) {
			System.out.println(element);
		}
		System.out.println("--------");
		for(int i = 0;i<language.length;i++) {
			System.out.println(language[i]);
		}
		System.out.println("**************");
		String empdata = "Durga,25,London,UK,98000,IBM";
		String []empdetails = empdata.split(",");
		for(String st :empdetails) {
			System.out.println(st);
		}
		String str1 = "xXSeleniumxXTestingxXXCucumber";
		String[] test = str1.split("xX");
		System.out.println("0 index is: "+test[0]);
		System.out.println("1 index "+test[1]);
		System.out.println("2nd index "+test[2]);
		System.out.println("3rd index "+test[3]);
	}

}
