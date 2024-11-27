package javasessions;

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		x = 20;
		x = 30;
		x = 40;
		System.out.println(x);//40
		
		final int DAYS = 7;//final variable cannot be changed
		int salary = DAYS * 100;
		System.out.println(salary);//700
		
		final int DEFAULT_TIME_OUT = 10;//final variable name should be in caps with _ is a good practice
		
		final String LOGIN_PAGE_TITLE = "Amazon login";
		
		final char GENDER = 'f';
		
		
		
		
		
	}

}
