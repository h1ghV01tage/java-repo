package chapter4;

//This class declares an object of the type vehicle
public class VehicleDemo {

	public static void main(String[] args) {
		
		Vehicle minivan = new Vehicle();
		int range; 
		
		//Assign values to the field in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//Compute the range assuming a full tank of gas
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);
	
		}
}
