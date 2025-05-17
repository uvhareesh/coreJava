package controlStatements;

public class IfCondition4 {

	public static void main(String[] args) {
		//Smallest of numbers
		
		 int a = 10, b = 20, c = 30;

	        if (a <= b && a <= c) {
	            System.out.println("Smallest number is: " + a);
	        } else if (b <= a && b <= c) {
	            System.out.println("Smallest number is: " + b);
	        } else {
	            System.out.println("Smallest number is: " + c);
	        }
	
	}

}
