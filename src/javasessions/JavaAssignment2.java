package javasessions;

public class JavaAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Print "I am Batman" 5 times
	
	for(int i=1;i<=5;i++) {
		System.out.println("I am Batman");
	}
	
	System.out.println("----------------");
//Print "I am Batman" 9 times
	for(int i=1;i<=9;i++) {
		System.out.println("I am Batman " +i);
	}
	
//Print 10 to 1
	//for loop
	for(int i=0;i<=9;i++) {
		System.out.println(10 - i);
	}
	//while
System.out.println("---------------");	
	int i = 0;
	while(true) {
		System.out.println(10 - i);
		i++;
		if(i==10) {
			break;
		}
		
	}
	//do while
	System.out.println("dowhile");
	int e = 0;
	do {
		System.out.println(10 - e);
		e++;
		}
	while(e<10);
	//
	
	
//Print "Hello World" 10 times using while loop
System.out.println("---------------");	
	int a = 1;
	
	while(true){
		System.out.println("Hello World " + a);
		if(a==5) {
			break;
		}
		a++;
	}
	System.out.println("--------------------");	
//multiplication of 5 from 1 to 100	
//for loop
	int m;
 for(m = 1;m<=20;m++) {
	 System.out.println(5 * m);
 }
//while
 int n =1;
  while(true) {
	  System.out.println(5 * n);
	  n++;
	  if(n>20) {
		  break;
	  }
	  

	  
  }
  
//do while
  System.out.println("do while---------------");
  int o = 1;
do {
System.out.println(5 * o);
  o++;
  
}
while(o<21);

/////////////////

//print odd and even between 1 to 100
System.out.println("------------odd and even -----------------");
int z ;
System.out.println("Even numbers : ");
for(z=1;z<=100;z++) {
	if(z%2 == 0) {
		System.out.println(z);
	}

}
System.out.println("Odd numbers : ");
for(z=1;z<=100;z++) {
	if(z%2 != 0) {
		System.out.println(z);
	}

}

////////////////
//print ASCII 
//for loop


for(char c='a';c<='z';c++) {
	System.out.println("ASCII value of " +c + " is " + (byte)c);
	}
for(char c='A';c<='Z';c++){
	System.out.println("ASCII value of " +c + " is " + (byte)c);
}
for(char c='0';c<='9';c++){
	System.out.println("ASCII value of " +c + " is " + (byte)c);
}

//while loop
 char ch = 'a';
 while(true) {
	 System.out.println("ASCII value of " +ch + " is " + (byte)ch);
	 ch ++;
	 if(ch>'z') {
		 break;
	 }
 }
 char ch1 = 'A';
 while(true) {
	 System.out.println("ASCII value of " +ch1 + " is " + (byte)ch1);
	 ch1 ++;
	 if(ch1>'Z') {
		 break;
	 }
 }
 
 char ch2 = '0';
 while(true) {
	 System.out.println("ASCII value of " +ch2 + " is " + (byte)ch2);
	 ch2 ++;
	 if(ch2>'9') {
		 break;
	 }
 }
 
 int p =1;
 while(p<=10) {
	 System.out.println(p);
	 if(p%7 == 0) {
		 System.out.println("Bye Bye see you tomorrow");
		 break;
	 }
	 p++;
 }
 
 
 
 
 
}    

}
