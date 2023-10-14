package chapter6;

public class MyClass {
	
		// TODO Auto-generated method stub
		private int alpha; //private access
		public int beta; //public access
		int gamma; //default access
		
		/*
		 * Methods to access alpha. It is ok for a member of a class to
		 * access a private member of the same class
		 */
		
		void setAlpha (int a) {
			alpha = a;
		}
		
		int getAlpha () {
			
			return alpha;
		}
		
		

}
