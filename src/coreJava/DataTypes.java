package coreJava;

public class DataTypes {

	public static void main(String[] args) {
		// Numeric Data Types
		
				int a=100, b=200;
				System.out.println("The vlaue of a is :"+a);
				System.out.println("The vlaue of b is :"+b);
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
				//python is dynamically typed programming language
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
