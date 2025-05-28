package loopingORIterativeStatements;

public class ContinueStatement1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			if(i==3 || i==4 || i==5)
			{
				continue;
				
			}
			System.out.println(i);
		}

	}

}
