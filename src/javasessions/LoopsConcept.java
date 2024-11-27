package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while(i<=10) {
			System.out.println(i);
			//i++;
			 i =i + 1 ;
			//++i
		}
		
//		while(false) {
//			System.out.println("Welcome to Hotel Taj");
//		}
		
		int k = 1;
		
		while(true) {
			System.out.println("Welcome to Hotel Taj");
			if(k==5) {
			break;
			}
			k++;
		}
		
		//for loop
		//for(initialization; condition; increment/decrement)
		int p;
		for(p=1; p<=5; p++) {
			System.out.println(p);
		}
		
//		//
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch + " = " + (byte)ch);
		}
		
		for(char cap='A'; cap<='Z'; cap++) {
			System.out.println(cap + " = " + (int)cap);
		}
		//WAP tp print "PARVEEN" 100 times
		
		int x;
		for(x=1; x<=100; x++) {
			System.out.println(x + "  :  PARVEEN");
		}
		//WAP to print even number between 1 to 100
		
		int y;
		for(y=1; y<=10; y++) {
			if(y%2==0) {
				System.out.println(y);
			}
		}
		
		int z;
		for(z=1; z<=10;) {
			if(z%2==0) {
				System.out.println(z);
			}
			z++;
			
		}
		//WAP to print odd number between 1 to 100
		for(int q=1;q<=100;) {
			System.out.println(q);
			q=q+2;
		}
		
		//dowhile
		
		int e =1;
		do {
			e++;
			System.out.println(e);
			//break;
			//e++;
		}
		while(e<=10);
		
	}

}
