 package javasessions;

public class JavaAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.		
//Write a java program to add two strings:
// String a = "Hello"
// String b ="Naveen K"
//Expected output: Hello Naveen K
		
		String a = "Hello";
		String b = "Naveen K";
		System.out.println(a + " " + b);

		
//2.
//print sum of 2 numbera
//74+36

	int x = 74;
	int y = 36;
	
	System.out.println((int)(x+y));
	
//3.
//division k=50/3
		
		int p = 50;
		int q =3;
	  System.out.println((float)p/q);
	  
	  
//4. concat "Hello Selenium" with a char 't'
	  
	  String s = "Hello Selenium";
	  char t = 't';
	  
	  System.out.println(s + " " + (byte)t);

//5. add 100.200,3400 and output= Your Total amount is 3700
	  
	  int e = 100;
	  int f = 200;
	  int g = 3400;
	  
	  System.out.println(("Your Total amount is ") + (e + f + g));
	  
//6. ASCII of char 'h'
	  
	  System.out.println((byte)'h');
	  
//7. add 3 with ASCII value of 'd' and print equivalent char
	  
	  char aa ='d';
	  int bb = aa;
	  int cc = 3 + bb;
	  String dd = new Character((char) cc).toString();
System.out.println(dd);
 ;

 //8. WAP to find square of 3.9
 
 double z = 3.9;
 
 System.out.println("Square of 3.9 is : " + z * z);
 System.out.println(Math.pow(z, 2));
 
 System.out.println("------------------------");
 
 int pa = 11;
 
 pa = pa++ + ++pa;
 
 System.out.println(pa);//24
 
 System.out.println("-------------------");
 
 int m = 11, n = 22, o;
 
 o = m + n + m++ +n++ + ++m + ++n;//11 + 22 +11 + 22 + 13 +24 =103
 
 System.out.println(o);
 
char l = 'A';
System.out.println("------------------------");
System.out.println(l++);
System.out.println(l);

//Greatest number: 25, 78, 87

System.out.println("-----------------");

int u = 25, v=78, w =87;

if(u>v && u>w) {
	System.out.println("u = 25 is greatest");
}
else if(v>w && v>u) {
	System.out.println("v = 78 is greatest");
}
else {
	System.out.println("w = 87 is greatest");
}

System.out.println("------------------------");

//Greatest number: 25, 78, 87, 97

int mm = 25, nn=78, oo=87, pp=97;

if(mm>nn && mm>oo && mm>pp) {
	System.out.println("mm = 25 is greatest");
}
else if(nn>oo && nn>pp && nn>mm) {
		System.out.println("nn = 78 is greatest");	
}
else if(oo>pp && oo>mm && oo>nn) {
	System.out.println("oo = 87 is greatest");
}
else {
	System.out.println("pp = 97 is greatest");
}

//WAP check number even or odd
System.out.println("------------------");
int ll = 11;

if(ll%2 ==0) {
	System.out.println(ll + "  Number is even");
}
else {
	System.out.println(ll + " number is odd");
}

System.out.println("---------------");

//consonant or vowel

char ch = 'u';

switch(ch) {

case 'a':
	System.out.println(" a is vowel");
	break;
case 'e':
	System.out.println("e is vowel");
	break;
case 'i':
	System.out.println("i is vowel");
	break;
case 'o':
	System.out.println("o is vowel");
	break;
case 'u':
	System.out.println("u is vowel");
	break;
	
default:
		System.out.println(ch + " is a consonant");

}

System.out.println("-------------");
//
String env = "DEV";

switch(env.toLowerCase().trim()) {

case "qa":
	System.out.println("Execute testcases in " + env);
	break;
case "stage":
	System.out.println("Execute testcases in " + env);
	break;
case "dev":
	System.out.println("Execute testcases in " + env);
	break;
case "uat":
	System.out.println("Execute testcases in " + env);
	break;
case "prod":
	System.out.println("Execute testcases in " + env);
	break;
	
default:
		System.out.println("Enter correct environment " + env);

}

System.out.println("----------------");


String carType = " SEDAN ";
switch(carType.toLowerCase().trim()) {

case "mini":
	System.out.println("Car type selected is " +carType);
	break;
case "sedan":
	System.out.println("Car type selected is " + carType);
	break;
case "suv":
	System.out.println("Car type selected is " + carType);
	break;
case "premium":
	System.out.println("Car type selected is " + carType);
	break;
	
default:
		System.out.println("Please select the right car type " + carType);
		break;

}

System.out.println("----------------------");

//browsers - switch

String browser = "chrome";

switch(browser.toLowerCase().trim()){
	
case "chrome":
	System.out.println("Launch browser " + browser);
	break;
case "firefox":
	System.out.println("Launch browser " + browser);
	break;
case "ie":
	System.out.println("Launch browser " + browser);
	break;
case "safari":
	System.out.println("Launch browser " + browser);
	break;
default:
	System.out.println("Please pass the right browser " + browser);
	break;	
}

//browser - ifelseif

if(browser.equals("chrome")) {
	System.out.println("Launch browser " + browser);
}
else if(browser.equals("firefox")) {
	System.out.println("Launch browser " + browser);
}
else if(browser.equals("ie")) {
	System.out.println("Launch browser " + browser);
}
else if(browser.equals("safari")) {
	System.out.println("Launch browser " + browser);
}
else {
	System.out.println("Please pass the right browser " + browser);
	}

System.out.println("---------------------");

//loan type

String loanType = "housing loan";
double salary = 36000;
double interest = 0.0;
switch(loanType.toLowerCase().trim()){

case "car loan":
	System.out.println("Interest rate for " + loanType + " is " + interest);
	break;
case "housing loan":
	if(salary < 35000) {
		System.out.println("NOT APPLICABLE FOR HOUSING LOAN");
	}
	else {
		System.out.println("APPLICABLE FOR HOUSING LOAN AS SALARY IS " + salary);
	}
	break;
case "personal loan":
	System.out.println("Interest rate for " + loanType + " is " + interest);
	break;
case "education loan":
	System.out.println("Interest rate for " + loanType + " is " + interest);
	break;
default:
	System.out.println("Please pass the right loan type " + loanType);
	break;	

}

	
	}
}
