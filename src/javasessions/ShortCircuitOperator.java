package javasessions;

public class ShortCircuitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 900;
		int b = 600;
		int c = 1200;
		
		if (a>b && a>c) {
			System.out.println("a is greatest");
		}
		else if(b>c) {
			System.out.println("b is greatest");
		}
		else {
			System.out.println("c is greatest");
		}
	}

}
