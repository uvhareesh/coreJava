	package coreJava;
	
	public class DataTypes {
	
		public static void main(String[] args) {
		
		//variables
	
	//int s; //declaration
	//s=100; //assignment
	
	int s=100; 	// declaration+assignment
	System.out.println(s);
	
	s=200;
	System.out.println(s);
	
	/*	
	// approach1  // if all the variables belongs to different data types
		int p=1;
		int o=2;
		int i=3;
	*/
	
	/* approach2 // only if all the variable are belongs to same data type
	 	int p,o,i;
	 	p=1;
	 	o=2;
	 	i=3;
	 */
	
	// approach3 //only if all the variable are belongs to same data type
	int p=1,o=2,i=3;
	
	//for meaningful message in print statement we can use concatenation method		
	System.out.println("The Value of p is :"+p);
	System.out.println("The Value of o is :"+o);
	System.out.println("The Value of i is :"+i); 
	 
	// in single line we printed all variable values
	System.out.println(p+""+o+""+i+"");
	
	// in print statement we used join method for each value with ""	
	 
		
	//--------------------------------------------------------------------------	
	// Data types
	
	// Numeric Data Types
	
	int a=100, b=200;
	System.out.println("The Value of a is :"+a);
	System.out.println("The Value of b is :"+b);
	System.out.println(a+b);
	System.out.println("The sum of an and b is : "+(a+b));
	
	byte by=125;
	System.out.println(by);
	
	short sh=32767;
	System.out.println(sh);
	
	long l=21212121234443534L; // literal is needed
	// L should add, it can be lower or uppercase
	System.out.println(l);
	
	// Decimal numbers - float, double
	
	float item_price=15.5f; // literal is needed
	//f should add, it can be lower or uppercase
	System.out.println(item_price);
	
	double dbl=1234.4343412;
	System.out.println(dbl);
	
	// characters
	
	char grade='A'; // single character in single quotes - ''
	System.out.println(grade);
	
	String name="Harish"; // String is non-premitive type and multiple characters with double quotes - ""
	System.out.println(name);
	
	//char ch='abc'; //invalid
	//Stirng ch='abc';//invalid
	//String ch='A';//invalid
	String ch="A"; //valid
	System.out.println(ch);
	
	boolean bl=true; //allows only true or false
	System.out.println(bl);
	
	boolean bl1=false;//allows only true or false
	System.out.println(bl1);
	
	//boolean bl="true";//invalid
	//boolean bl="false";//invalid
	
	//String bl=true;//invalid
	 String bl2="true";//valid
	 
//----------------------------------------------------------------------	
		 
 //difference between variable and const/final
	int x=100;
	System.out.println(x);
	x=200;
	System.out.println(x);
	
	final int y=300;
	System.out.println(y);
	// y=400;// not allowed
	//System.out.println(y);
	
	// variables declaration without final keyword we can change the values but wiht final keyword we cnat chaneg the value. in javascript instea dof final, const keyword is used.
	
	//java is statistically typed programming language
	// python is dynamically typed programming language
	//javascript is dynamically typed scripting language
	
	//Example :
	
	int q=100;
	//x="welcome";//it is not allowed in java but in javascript and python it is allowed
	//in python or javascript we no need to specify the data types explicitly.
	
	/* 
	 r=100;
	 r="welcome";
	 */ 
	//it is allowed in dynamically typed programming language - javascript / python

	}

}
