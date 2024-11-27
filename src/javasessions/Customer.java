package javasessions;

public class Customer {
	String name;
	int age;
	double salary;
	char gender;
	boolean isActive;
	String dob;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.salary);
		System.out.println(c1.gender);//  - unicode value - nothing will be  printed on console i.e., blank but default value is '\u0000'
		System.out.println(c1.isActive);
		System.out.println(c1.dob);  
		
		
		    
		
	}

}
 