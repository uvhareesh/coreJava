package coreJava;

public class TernaryOperator {

	public static void main(String[] args) {

		//Syntax:  var=exp ? result1 : result2;
		
		//ex1:
		int a=200, b=100;
		int x=(a>b)? a:b;
		System.out.println(x);
		
		//ex2:
		int y=(1==1)?100:200;
		System.out.println(y);
		
		//ex3:
		int z=(1==2)?100:200;
		System.out.println(z);
		
		//ex4:
		int person_age=30;
		String res=(person_age>=18)?"Eligible":"Not Eligible";
		System.out.println(res);
	}

}
