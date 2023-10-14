package chapter16;

public class TraditionalSwitch {

	enum ShipMethod {STANDARD, TRUCK, AIR, OVERNIGHT}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShipMethod shipBy;
		
		int productID = 5099;
		
		//here a traditional switch is used to obtain shipping method
		//notice that the case stacking is used
		
		switch(productID) {
			
		case 1774:
		case 8708:
		case 6709:
			shipBy = ShipMethod.TRUCK;
			break;
		
		case 4657:
		case 2195:
		case 3621:
		case 1887:
			shipBy = ShipMethod.AIR;
			break;
		
		case 2907:
		case 5099:
			shipBy = ShipMethod.OVERNIGHT;
			break;
		
		default:
			shipBy = ShipMethod.STANDARD;
		
		}
		
		System.out.println("Shipping method for product number " + productID +  " is " + shipBy);
		
		
		
	}

}
