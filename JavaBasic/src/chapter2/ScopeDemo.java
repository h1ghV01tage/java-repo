package chapter2;

public class ScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		x = 10;
		if(x == 10) {
			
			int y = 20;
			
			System.out.println("y is in the scope " + y);
			
		}
		//System.out.println(y); //y is not known outside the scope
		System.out.println(x + " remains");
	}

}
