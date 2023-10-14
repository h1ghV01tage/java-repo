package initialPackage;

public class GalToLitTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gallons;
		double liters;
		
		for(gallons = 1; gallons <= 100 ; gallons ++ ) {
			
			liters = gallons * 3.7854 ; 
			System.out.println(gallons + " gallon(s) is " + liters + " liter (s) " );
		}
		
		
	}

}
