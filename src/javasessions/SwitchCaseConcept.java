package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser = "IE";
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			if(10 > 5) {
				System.out.println("10 is greater than 5");
			}
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		default:
			System.out.println("please pass the right browser...");
			break;
		}
		
	}

}
