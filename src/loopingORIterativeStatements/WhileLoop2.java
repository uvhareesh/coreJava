package loopingORIterativeStatements;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		// print even numbers between 1...10
		
		//Approach1:
		
	/*	int i=2;
		while(i<=10)
		{
			System.out.println(i);
			i+=2; // i=i+2;
		} */
		
		//Approach2:
		
		int i=2;
		while(i<=10) // how many times we need to run the loop
		{
			if(i%2==0) // it is filter the while condition value
			{
				System.out.println(i);
			}
			i++;
		} 	
		
	
	}

}
