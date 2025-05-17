package controlStatements;


public class IfCondition5 {

	public static void main(String[] args) {
		//Two Largest Numbers
		
		 int a = 10, b = 20, c = 30;

	        if (a >= b && a >= c) {
	            if (b >= c) {
	                System.out.println("Two largest numbers: " + a + " and " + b);
	            } else {
	                System.out.println("Two largest numbers: " + a + " and " + c);
	            }
	        } else if (b >= a && b >= c) {
	            if (a >= c) {
	                System.out.println("Two largest numbers: " + b + " and " + a);
	            } else {
	                System.out.println("Two largest numbers: " + b + " and " + c);
	            }
	        } else {
	            if (a >= b) {
	                System.out.println("Two largest numbers: " + c + " and " + a);
	            } else {
	                System.out.println("Two largest numbers: " + c + " and " + b);
	            }
	        }
	}

}
