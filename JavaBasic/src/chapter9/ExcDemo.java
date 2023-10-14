package chapter9;

public class ExcDemo {
	
	public static void main (String [] Args) {
		
		int [] nums = new int [4];
		
		try {
			
			System.out.println("Before exception is generated");
			
			//Generate an index of out-of-bound exception
			nums[7] = 10;
			
			System.out.println(nums[1]);
			
		}
		catch (ArrayIndexOutOfBoundsException exc ){
			
			//catch the exception
			System.out.println("index is out of bounds");
			
		}
		
		System.out.println("AFter catch statement");
		
		
	}
	
}
