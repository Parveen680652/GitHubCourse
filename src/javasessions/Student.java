package javasessions;

public class Student {

	//WAF
	//create a method -- getStudentMarks
	//pass a parameter: studentName(String)
	//return the student marks-->int
	
	public int getStudentMarks(String studentName) {
		System.out.println("Getting marks for :" + studentName);
		
		int marks = -1;
		if(studentName.equalsIgnoreCase("Riya")) {
			marks = 90;
		}
		else if(studentName.equalsIgnoreCase("Vikash")){
			marks = 100;
		}
		else if(studentName.equalsIgnoreCase("Neetu")) {
			marks = 80;
		}
		else if(studentName.equals("Naveen")) {
			marks = 10;
		}
		
		else {
			System.out.println("No student found..pls pass right student name....." + studentName);
		}
		
		return marks;
	}
	
	public int getStudentMarksSwitch(String studentName1) {
		
		int marks1 = -1;
		
		switch(studentName1.toLowerCase()) {
		
		case("riya"): {
			marks1 = 90;
			break;
			}
		case("vikash"): {
			marks1 = 100;
			break;
			}
		case("neetu"): {
			marks1 = 80;
			break;
			}
		case("naveen"): {
			marks1 = 10;
			break;
			}
		default: {
			System.out.println("No student found..pls pass right student name....." + studentName1);
			break;
		}
		
		}
		
		return marks1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		int m1 = s1.getStudentMarksSwitch("Riya");
		System.out.println(m1);
		
		int m2 = s1.getStudentMarksSwitch("Naveen");
		System.out.println(m2 );
		if(m2>=0) {
			 System.out.println("Print the Mark sheet");
		 }
		
		
		 int m3 = s1.getStudentMarksSwitch("Tom");
		 System.out.println(m3);
		 
		 if(m3>=0) {
			 System.out.println("Print the Mark sheet");
		 }
		 
		 int m4 = s1.getStudentMarksSwitch("Peter");
		 System.out.println(m4); 
	}

}
