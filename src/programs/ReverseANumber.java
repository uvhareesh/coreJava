package programs;

public class ReverseANumber {

	public static void main(String[] args) {

		int num=98765;
		int rev=0;
		
		while(num!=0)
		{
			
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("Reverse number is:"+ rev);
	}

}
