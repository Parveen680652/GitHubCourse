package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar = new ArrayList(20);
		//VC = 20, pc = 0
		//Loadfactor = 10;
		
		//vc = 5, pc =0
		//LF = 5/2=2, pc =5
		
		ArrayList<Integer>	numList	= new ArrayList<Integer>();
		//vc=10,pc=0
		
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		System.out.println(numList.size());
		numList.remove(2);
		System.out.println(numList.size());
		System.out.println(numList.get(2));
		numList.remove(0);
		System.out.println(numList);
		
		
		//
		System.out.println("****************empList******************");
		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Tom","Peter","Robin","Ravi"));
		System.out.println(empList.size());
		System.out.println(empList);
		empList.add("Lisa");
		System.out.println(empList.size());
		System.out.println(empList);
		empList.add(0, "Ankit");
		System.out.println(empList);
		System.out.println(empList.size());//Size 6
	//	empList.add(8, "Vijay");//java.lang.IndexOutOfBoundsException: Index: 8, Size: 6
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		System.out.println(nums.size());
		
		ArrayList<Integer>	nList	= new ArrayList<Integer>();
		//vc=10,pc=0
		
		nList.add(100);
		nList.add(200);
		nList.add(300);
		nList.add(4000);
		nList.add(30);
		
		System.out.println(nList);//[100, 200, 300, 4000, 30]
		
		Collections.sort(nList);//to sort the data in order
		System.out.println(nList);//[30, 100, 200, 300, 4000]
		
		Collections.reverse(nList);
		System.out.println(nList);
		
		
		int test[] = {23,2,45,100,1,900};
		Arrays.sort(test);
		System.out.println(test);//Garbage value - [I@36aa7bc2
		System.out.println(Arrays.toString(test));
		
		
		ArrayList<String> myList = new ArrayList<String>(Collections.nCopies(5, "iPhone"));
		
		System.out.println(myList.size());
		System.out.println(myList);
		
		
		
		
		
		
		
		
		
		
		

	}

}
