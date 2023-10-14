package chapter2;

public class ShortCircuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//&& operation
		
		//First operand is false 
		//and operator is &&
		//evaluations stops
		//false is returned
		//FTT and TTT || TFF and FFF
		
		if(false && true && true) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		/*
		 * No short circuit because whole expression gets evaluated
		 */
		
		if(true && true && true) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		/*
		 * OR Operation ||
		 */
		
		if(true || false || false) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		if(false || false || true) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		

}
}