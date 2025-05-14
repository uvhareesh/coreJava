package coreJava;

public class AssignmentOperators {

	public static void main(String[] args) {
	//5. Assignment = += -+ *= /= %=
		
	int a=10;
	int b=10;
	a+=5;       //a=a+5;
	b=b-5;		//b=b-5;
	System.out.println(a);
	System.out.println(b);	
	
	int c=10;
	a*=2;		//c=c*2;
	System.out.println(c);
	
	int d=10;
	d/=2;			//d=d/2;
	System.out.println(d);
	
	int e=10;
	e%=2;			//e=e%2;
	System.out.println(e);
	
	/* difference b/w == = ? 
	 * == is relational operators it compares the value 
	 * = is assignment operator , it assigns the value
	 */	

	}

}
