package programs;

public class ReverseNumberWithStringBuffer {

	public static void main(String[] args) {
		
		int num=1234;
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse Number is:"+rev);

	}

}
