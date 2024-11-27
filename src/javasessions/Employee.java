package javasessions;

public class Employee {

	//Class variable or Class data member or Global variable
	String name ;
	int age;
	String city;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Local variable	
//	String name = "Naveen";	
	//Class --template/blueprint of the object/category of the object
		//objects --is a physical entity
		
		//object of the class: new keyword
		Employee obj = new Employee();
		
		obj.name = "Tom";
		obj.age = 20;
		obj.city = "LA";
		
		System.out.println(obj.name + " " + obj.age+ " "  + obj.city);

		
		//
		Employee obj1 = new Employee();
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.city);
		System.out.println(obj.age);
		
		obj1.name = "Naveen";
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.city);
		
		//
		
		new Employee().name = "Peter";
		new Employee().age = 30;
		new Employee().city = "Pune";
		
		
		
		
		
		
		
		
		
		
		
	}

}
