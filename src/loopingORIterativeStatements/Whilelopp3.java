package loopingORIterativeStatements;

public class Whilelopp3 {

	public static void main(String[] args) {
		/* odd ..even..odd..even..odd */
		
		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i + "Even");
			}
			else
			{
				System.out.println(i + "Odd");
			}
			i++;
		}
		

	}

}
