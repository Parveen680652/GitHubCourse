package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//1. with new keyword:
		
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] =40;
		
		System.out.println(a[0]);
		
		int len = a.length;
		System.out.println(len);
		System.out.println("------------------------");
		//To print all the values from array
		//for loop
		
		for(int i =0; i<len; i++) {
			System.out.println(a[i]);
		}
		
		//without using for loop
		System.out.println(a);//some garbage address
		
		System.out.println(Arrays.toString(a));// to get all values from the array
		
		//double array
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 34.44;
		System.out.println(d[0] + d[1]);
		System.out.println("--------------------------");
		//string array
		String emp[] = new String[3];
		emp[0] = "Pooja";
		emp[1] = "Ravi";
		emp[2] = "Robin";
		
		System.out.println("Total emp : " + emp.length);
		System.out.println(Arrays.toString(emp));
		System.out.println("--------------------------");
		for (int i=0;i<emp.length; i++) {
			System.out.println(emp[i]);
			if(emp[i].equals("Ravi")) {
				System.out.println("Ravi Salary is : " + 1000);
				break;
			}
			
		}
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
