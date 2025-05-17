package controlStatements;

public class TwoLargestNumbersWithTernary {

	public static void main(String[] args) {
		
		int a=10, b=20, c=30;
		
		int largest = (a >=b && a>=c) ? a:(b >=a && b>=c) ? b:c;
		
		int secondLargest = (largest == a) ? (b>=c?b:c) : (largest == b) ? (a>=c?a:c) : (a>=b?a:b);
		
		System.out.println("Two LArgest Numbers: "+largest+ "and"+secondLargest);

	}

}

/*  Explanation:
		 
		Finding the largest:
		
		int largest = (a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c;
		
		Checks if a is the largest.
		
		If not, checks if b is the largest.
		
		Otherwise, c must be the largest.
		
		Finding the second largest:
		
		int secondLargest = (largest == a) ? (b >= c ? b : c) :
		                    (largest == b) ? (a >= c ? a : c) :
		                    (a >= b ? a : b);
		                    
		Based on who the largest is, compares the other two to find the second largest.
		
		Printing the result:
		
		
		System.out.println("Two largest numbers: " + largest + " and " + secondLargest);
		
		✅ Output for a = 10, b = 20, c = 30:
		

		Two largest numbers: 30 and 20
		
*/