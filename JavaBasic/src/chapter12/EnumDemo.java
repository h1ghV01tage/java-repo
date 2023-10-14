package chapter12;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare a transport reference
		Transport tp;
		
		//assign tp the constant airplane
		tp = Transport.AIRPLANE;
	
		//output an enum value
		System.out.println("value of tp " + tp );
		System.out.println();
		
		tp = Transport.TRAIN;
		
		//compare the two enum values
		if(tp == Transport.TRAIN) //compare two transport objects for equality
		System.out.println("tp contains the train. \n");
		
		//use an enum to control a switch statement
		switch(tp) {
		
		case CAR:
			System.out.println("A car carries people");
			break;
			
		case TRUCK:
			System.out.println("A truck carries frieght");
			break;
		
		case AIRPLANE:
			System.out.println("An airplane flies");
			break;
		
		case TRAIN:
			System.out.println("A train runs on rails");
			break;
		
		case BOAT:
			System.out.println("A boat sails on the water");
			break;
		
		
		}
		
		
		
	}
	
	

}
