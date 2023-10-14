
public class examplePrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		
		for(int i = 1; i < N; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
		
	//boolean method
	static boolean isPrime(int n) {
		
		//Return false if the number is zero or 1
		if(n==1 || n==0) {
			return false;
		}
		
		//Loop from 2 to n - 1 where n = 10
		for(int i = 2; i < n ; i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
			
	}
	
	
	
}
