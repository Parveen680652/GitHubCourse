package javasessions;

public class SwitchCaseExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  s = 10;
		
		switch (s) {
		case 10:
			System.out.println("10");
			break;

		default:
			break;
		}
		
	//
	//0 to 100
		String stName = "Mahesh";
		int marks = 0;
		
		switch (stName) {
		case "Tom":
			System.out.println("tom passed");
			marks = 100 - 20;
			break;
		case "Peter":
			System.out.println("Peter passed");
			marks = 100;
			break;
		case "Naveen":
			System.out.println("Naveen passed");
			marks = 100;
			break;
		default:
			System.out.println("student is not found  " + stName);
			marks = -1;
			break;
		}
		System.out.println(marks);
		if(marks >=0) {
			System.out.println("print the mark sheet");
		}

	}

}
