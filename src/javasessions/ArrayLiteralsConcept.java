package javasessions;

import java.util.Arrays;

public class ArrayLiteralsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2. Array Literals
		int a[] = {1,3,4,5,11,55,101};
//int ar[] = new int[4];
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));

		double d[] = {1.1, 2.2, 3.3, 4.4, 5.5};
		char vowels[] = {'a','e','i','o','u'};  
		String browser[] = {"chrome","safari","IE","Edge","Firefox"};
		
		System.out.println("------------------------");
		for(int k=0;k<browser.length;k++) {
			//System.out.println(browser[k]);
			switch(browser[k]) {
			case "chrome":
				System.out.println("Chrome : Google");
				break;
			
			case "safari":
				System.out.println("Safari : Mozilla");
				break;
			
			case "IE":
				System.out.println("IE : Microsoft - This is deprecated");
				break;
			
				
			}
			}
		}
				
	
	
	
	
	
	}


