package javasessions;

public class LoopsWithFoeEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//for each loop: (advance for loop)
		
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] =40;
		
		for(int e:a) {
			System.out.println(e);
		}
		System.out.println(a[2]);
		
		String emp[] = new String[5];
		emp[0] = "Pooja";
		emp[1] = "Ravi";
		emp[2] = "Robin";
		emp[3] = "Vikash";
		emp[4] = "Akhil";
		
		for(String parveen: emp) {
			System.out.println(parveen);
			if(parveen.equals("Vikash")) {
				System.out.println("He is a developer");
			}
		}

		//
		Object employee[] = new Object[5];
		
		employee[0] = "Tom";
		employee[1] = 30;
		employee[2] = 23.33;
		employee[3] = 'm';
		employee[4] = true;
		
		for(Object e : employee) {
			System.out.println(e);
		}
	//
		System.out.println("----------------");
		int ar[] = new int[4];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] =40;
		
		for(int i = ar.length-1;i>=0; i--) {
			System.out.println(ar[i]);
			
		}
		
	//
		
		System.out.println("----------------");
		int pr[] = new int[4];
		pr[0] = 1000;
		pr[1] = 20;
		pr[2] = 30;
		pr[3] =40;	
		System.out.println(pr[0]);
		
		
		//Arryas are kind of data storage
		//collections
		//index based/order bases arrays 0-1-2-3-4-n
		
		//
		System.out.println("-----------------------");
		int test[] = {10,20,30,40,50,60,70,80,90};
		
		System.out.println(test.length);
		 
		
	}

}
