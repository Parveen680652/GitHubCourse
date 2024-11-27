package javasessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//++ and --

//***************post increment***********************//		

int a=1;
int b=a++;// in post increment value will be given first to the variable the increment

System.out.println(a);//2
System.out.println(b);//1 

int l=3;
int m=l++;//give the original value of l to m then increment l
System.out.println(l);
System.out.println(m);
		
int p =-98;
int q= p++;
System.out.println(p);//-97
System.out.println(q);//-98

//**************Pre increment*************************//

int u=1;
int y=++u;
System.out.println(u);
System.out.println(y);

int x =5;
int z =++x;

System.out.println(x);
System.out.println(z);

int v=-99;
int vv=++v;

System.out.println(v);//-98
System.out.println(vv);//-98


int pop=2;

System.out.println(pop++);//2
System.out.println(pop);//3

int loop=2;

System.out.println(++loop);//3
System.out.println(loop);//3

int amount=10;
int finalAmount= amount + 4;

System.out.println(amount);//10
System.out.println(finalAmount);//14

//******************post decrement***********************//
int tt=2;
int pp=tt--;

System.out.println(tt);//1
System.out.println(pp);//2

int rest =-99;
System.out.println(rest);//-99
int api=rest--;
System.out.println(rest);//-100
System.out.println(api);//-99

//*********************pre decrement******************************
 int aa = 2;
 int bb = --aa;
 System.out.println(aa);//1
 System.out.println(bb);//1

 int s1=-1000;
 int s2=--s1;
 System.out.println(s1);//-1001
 System.out.println(s2);//-1001
 
 int s3 = 40;
 System.out.println(s3--);//40
 System.out.println(s3);//39
 
 int s4 = 30;
 System.out.println(--s4);//29
 System.out.println(s4);//29
 
 System.out.println(s4+1);//30
 
 //***********Examples**********************
 int na =1;
 int test = na++ + na++ + na++ + na++;
 System.out.println(test);
 System.out.println(na);//5

		
		
		
		
		
		
	}

}
