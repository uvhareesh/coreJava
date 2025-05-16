package controlStatements;

public class IfCondition3 {

	public static void main(String[] args) {
		
		int a=10, b=200, c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is Largest number:"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest number:"+b);
		}
		else
		{
			System.out.println("c is largest number:"+c);
		}
		
	}

}
