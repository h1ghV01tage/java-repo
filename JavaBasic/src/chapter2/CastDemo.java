package chapter2;

public class CastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
		
		i = (int) (x / y); //cast double to integer
		System.out.println(i);
		
		i = 100;
		b = (byte) i ;
		System.out.println(b); //cast integer to byte...No loss of info because byte can hold 100
		
		i = 257;
		b = (byte) i ;
		System.out.println(b); //information loss because a byte can't hold 257
		
		b = 88;
		ch = (char) b ;
		System.out.println(ch); // cast between incompatible types but still prints x because 88 means x in char
		
		

	}

}
