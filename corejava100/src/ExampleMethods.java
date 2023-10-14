
public class ExampleMethods {
	
	public static void main(String[] args) {
		//prepareCoffee();
		//prepareTea(5);
		int x = prepareIcecream(12);
		System.out.println(x);
	}
	
	//Does not return a value
	static void prepareCoffee() {
		
		System.out.println("Coffee is prepared");
		
	}
	
	static void prepareTea(int quantity) {
		
		System.out.println(quantity + " cups are prepared");
	}
	
	//value returning method
	static int prepareIcecream(int money) {
		
		System.out.println("money received=" + money);
		
		return 1;
		
	}
	
}
