package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class scratchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Static Array
		//1. using new keyword
		
		int a[] = new int[4];
		a[0] = -1;
		a[1] = 20;
		a[2] = 30;
		a[3] =40;
	
		 System.out.println(a);//Garbage address
		 System.out.println(a.length);	//size or length of array
		
		 
		// to get all values from the array
		//1. using Arrays.toString(a) 
		 System.out.println(Arrays.toString(a));// to get all values from the array
		 //2. using for loop
		 for(int i = 0; i<=a.length-1;i++) {
		System.out.print(a[i] + " , ");
				 }
		 System.out.println();
		 //3. using for each loop
			for(int e :a) {
				System.out.println(e);
			}
		
		//2. Array Lateral
		int b[] = {10,20,30,40,1000,100,2000};
		
		 System.out.println(b);//Garbage address
		 System.out.println(b.length);	//size or length of array
		 System.out.println(Arrays.toString(b));// to get all values from the array
		 Arrays.sort(b);
		 System.out.println(Arrays.toString(b));
	
	//////////////////////////////////////////////
		 System.out.println("************To print number in reverse order*************");
		 
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]);
	}
	
	//////////////////////////////////////////////
	System.out.println("*************To print a-z************");
	
	for(char i = 'a';i<='z';i++) {
		System.out.println(i);
	}
	
	System.out.println("*************To print z-a ************");
	
	for(char i ='z';i>='a';i--) {
		System.out.println(i);
	}
	
	System.out.println("***************Print ASCII values of a -z *******************");
	for(char i ='a';i<='z';i++) {
		System.out.println("ASCII value of "+ i + " is " + (byte)i);
	}
	
	
	//////////////////////////////////
	//To store differnt datatype in an array we use Object array
	
	Object o[] = new Object[5];
	o[1] ="Parveen";
	o[0]='a';

System.out.println(Arrays.toString(o));	

///////////////////////////////////////////////////////////
/////////*****************ArrayList************/////////////////////////
System.out.println("^^^^^^^^^^^^^ArrayList^^^^^^^^^^^^^^^^^");
	
		ArrayList<Integer> ar =new ArrayList(2);
		ArrayList<String> ar1 = new ArrayList();
		
		ar.add(0);
		ar.add(10);
		System.out.println(ar);
		ar.add(2, 20);
		System.out.println(ar);
		ar.add(2, 100);
		System.out.println(ar);
		
		ar.remove(0);
		System.out.println(ar);
		System.out.println();
System.out.println(ar.get(1));
		System.out.println(ar.size());
		Collections.sort(ar);
		System.out.println("To arrange array values in ascending order " + ar);
		Collections.reverse(ar);
		System.out.println("To arrange array values in descending order " + ar);
		
		ar1.add("Parveen");
		ar1.add("Aziz");
		ar1.add("Zuha");
		ar1.add(3, "Zunairah");
		System.out.println(ar1);
		Collections.sort(ar1);
		System.out.println(ar1);
		Collections.reverse(ar1);
		System.out.println(ar1);
	//////////*********************************//////////////////////////	
		System.out.println("************Member List*******************");
	
		ArrayList<String> ab = new ArrayList<String>(Arrays.asList("Parveen","Zuha","Aziz","Zunairah"));
		Collections.sort(ab);
	System.out.println(ab);
	
	
	for(int i=0;i<=ab.size()-1;i++) {
		
		if(ab.get(i).equals("Parveen")) {
			System.out.println(ab.get(i) + " - Employee");
		}
		else if(ab.get(i).equals("Aziz")) {
			System.out.println(ab.get(i) + " - Spouse");
		}
		else if(ab.get(i).equals("Zuha")) {
			System.out.println(ab.get(i) + " - First Child");
		}
		else {
			System.out.println(ab.get(i) + " - Second Child");
		}
	}
	
	
	}

}
