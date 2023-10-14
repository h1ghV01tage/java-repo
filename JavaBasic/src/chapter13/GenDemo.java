package chapter13;

//demonstrate the generic class
public class GenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//create a gen reference for integers
	Gen<Integer> iOb;
	
	//create a gen <integer> object and assign reference to iOb.
	/*
	 * notice the use of autoboxing
	 * to encapsulate the value 88 within an integer object
	 */
	
	//instantiate an object of type gen<integer>
	iOb = new Gen<Integer>(88);
	
	//show the type of data used by iOb
	iOb.showType();
	
	//get the value in iOb.notice that no cast is needed
	int v = iOb.getOb();
	System.out.println("value is " + v);
	System.out.println();
	
	//create a Gen object for Strings
	Gen<String> strOb = new Gen<String>("Generics test");
	
	//show the type of data used by strOb
	strOb.showType();
	
	//get the value of strOb. Again, no cast is needed
	String str = strOb.getOb();
	
	System.out.println("value is " + str);
	
		
		
	}

}
