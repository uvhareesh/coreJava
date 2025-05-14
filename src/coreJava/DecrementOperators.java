package coreJava;

public class DecrementOperators {

	public static void main(String[] args) {
		//5.Decrement operators --
		
				//case1
				int a=10;
				System.out.println(a);
				
				// a=a-1;
				//instead of writing 2 times "a" we can use below code 
				a--;
				System.out.println(a);
				
				//case2 post decrement
				
				int b=10;
				int res=b--;
				System.out.println(res);
				
				//expected o/p is 11 but we received 10 because first 10 is assigned to res then value is decrement with a++
				//first assignment is happen then decrement will happen
				
				System.out.println(a);
				
				//case3 Pre increment
				
				int c=10;
				int res1=--c;
				System.out.println(res1);
				// first decrement the value then assignment is happen
				
				System.out.println(c);

	}

}
