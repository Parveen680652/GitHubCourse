package javasessions;

public class User {
 String name;
 int age;
 String city;
 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u1 = new User();
		u1.name = "Riya";
		u1.age = 30;
		u1.city = "Pune";
		
		User u2 = new User();
		u2.name = "Abhi";
		u2.age = 35;
		u2.city = "LA";
		
		User u3 = new User();
		u3.name = "Geeta";
		u3.age = 25;
		u3.city = "Bangalore";
		

		System.out.println("--------------------");
		

		User u4 = new User();
		u4.name = "Parveen";
		u4.age = 32;
		u4.city = "Raichur";
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		System.out.println("--------------------");
		
		u1 = u2;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		System.out.println("---------------------------");
		u2 = u3;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		System.out.println("---------------------------");
		
		u3 = u4;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		System.out.println("---------------------------");
		
		u4 = u1;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		
	}

}
