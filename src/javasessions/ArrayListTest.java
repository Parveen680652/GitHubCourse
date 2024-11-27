package javasessions;

import java.util.ArrayList;//ctrl + shift + o to import

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> ar = new ArrayList<Object>();
	ar.add('e');
	ar.add("testing");
	ar.add(100);
	ar.add(true);
	
	for(Object e : ar) {
		System.out.println(e);
	}
//System.out.println(ar);
	}

}
