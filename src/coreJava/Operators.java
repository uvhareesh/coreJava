package coreJava;

public class Operators {

	public static void main(String[] args) {
		
		//1. Arithmetic operators +-*/%
		// work on numeric type data only
		
		int a=20, b=10;
		
		int result=a+b;
		
		System.out.println("Sum of a and b:"+result);
		System.out.println("Sub of a and b:"+(a-b));
		System.out.println("Multiply of a and b:"+(a*b));
		System.out.println("Div of a and b:"+(a/b));
		System.out.println("Percentage of a and b:"+(a%b));
		
		//2. Relational/comparison operators > >= < <= != ==
		// return boolean value 
		//we can use all kinds data types
		
		System.out.println(a>b); 
		System.out.println(a<b); 
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		b=20;
		
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		System.out.println(a!=b);
		System.out.println(a==b);
		
		boolean res=a>b;
		System.out.println(res);
		
		//3.Logical operators  && || !
		//returns boolean value - true/false
		//works between 2 boolean values
		
		boolean x=true;
		boolean y=false;
		System.out.println(x && y);// false
		System.out.println(x || y); //true
		System.out.println(!x);//true
		System.out.println(!y);//false
		
		
		boolean b1=10>20;
		System.out.println(b1);//false
		
		boolean b2=20>10;
		System.out.println(b2);//true
		
		System.out.println(b1 && b2);//false
		System.out.println(b1 || b2);//true
		
		//combination of relational and logical operators
		
		System.out.println((10<20) && (20>10));//true
		
	}

}
