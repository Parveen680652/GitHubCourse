package javasessions;

public class MethodsInJava {
	int age;
	
	// 1. no input, no return:
	//void -- no return -- function cannot return anything
	public void test() {
		System.out.println("test method");
	}
	
	//2. no input, but some return:
	// return type is int
	
	public int totalAmount() {
		System.out.println("total amount...");
		int i = 10;
		int tax = 5;
		int finalPayment = i + tax;
		return finalPayment;
	}
	
	public String trainerName() {
		System.out.println("Triner name : ");
		String name = "Parveen";
		return name;
	}
	
	public char getGender() {
		System.out.println("Get gender");
		char c = 'a';
		return c;
	}
	//3. some input,some output
	public int add(int a, int b) {//method parameters
		System.out.println("Adding two numbers...");
		int sum = a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		
		int val = obj.totalAmount();
		System.out.println(val);
		
		String tr = obj.trainerName();
		System.out.println(tr);
		
		if(tr.equals("Parveen")) {
			System.out.println("Naveen Automation Labs");
		}
		 char p = obj.getGender();
		System.out.println((byte)p);
		
		int s1 = obj.add(10, 20);
		System.out.println(s1);
		
		int s2 = obj.add(30, 40);//we are passing arguments
		System.out.println(s2 -5);
		
		
	
	}

} 
