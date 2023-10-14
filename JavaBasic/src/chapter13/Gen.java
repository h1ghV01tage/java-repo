package chapter13;

//A simple gen class
//here T is a type parameter that will be replaced by a real type
//when an object of type is generated

public class Gen<T> {
	
	T ob; //declare an object of type T
	
	//Pass the constructor a reference to
	//an object of type T
	Gen (T o){
		ob = o;
	}
	
	//return ob
	T getOb() {
		return ob;
	}
	
	//show type of T
	void showType() {
		System.out.println("The type of T is " + ob.getClass().getName());
	}
	
	
	
}
