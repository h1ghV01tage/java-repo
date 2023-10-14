package chapter2;

//Demonstrate the short-circuit operators
public class SCOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,d,q;
		
		n = 10;
		d = 2;
		
		//Short circuit operator is used in these two cases
		if(d != 0 && (n % d) == 0) System.out.println(d + " is a factor of " + n);
		else System.out.println(d + " is not a factor of " + n);
		
		d = 0;
		
		if(d != 0 && (n % d) == 0) System.out.println(d + " is a factor of " + n);
		
		//short circuit operator is not used in this one below
		
		if(d != 0 && (n % d) == 0) System.out.println(d + " is a factor of " + n);
		else System.out.println(d + " is not a factor of " + n);
		
		
	}

}
