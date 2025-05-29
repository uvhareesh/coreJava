package programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=121;
		int org_num=num;
		
		int rev=0;
		
		while(num!=0)
		{
			rev =rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev)
		{
			System.out.println(org_num+ "Palindrome Number");
		}
		else
		{
			System.out.println(org_num+ "Not a Palindrome Number");
		}

	}

}
