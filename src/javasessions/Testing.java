package javasessions;

public class Testing {

	//static blockes are executed before main method
	// Static blocks can be used for pre conditions like login
	// Multiple static blocks allowed
	//It will execute in sequence
	//Now a days we are using new techniques like Testng
	//we can write n number of static blocks
	//static blocks cannot be inside main method
	
	static { 
	System.out.println("Hello Parveen");
	}
	static {
		System.out.println("Enter url");
	}

	
	//java execution will always start with main method but if it has static block then
	//it will execute static block first then main method
	
	public static void main(String [] a) {    System.out.println("Bye Parveen");	
		
	}
	
}
