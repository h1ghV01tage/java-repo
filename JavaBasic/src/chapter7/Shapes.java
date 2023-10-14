package chapter7;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		//All members of triangle are available to triangle objects
		//even though inherited from 2DShape
		t1.width = 4.0;
		t1.height = 4.0;
		t1.style = "filled";
		
		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "outlined";
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		
		System.out.println();
		
		System.out.println("Info for t1: ");
		t2.showStyle();
		t2.showDim();
		
		
		
		
		

	}

}
