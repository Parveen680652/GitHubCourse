package javasessions;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		
		
		System.out.println(ar.size());
		ar.add(300);
		ar.add(400);
		ar.add(500);   
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(4));
	//	System.out.println(ar.get(6));//IndexOutOfBoundsException
	//	System.out.println(ar.get(-1));//IndexOutOfBoundsException
	ar.add(600);
		System.out.println(ar.get(5));
		ar.add(12.33);
		ar.add(true);
		ar.add('m');
		ar.add("testing");
		ArrayList ar1 = new ArrayList();
		System.out.println(ar.get(9));
		  System.out.println(ar1.size());
	
	
	
	
	
	
	
	
	}

}
