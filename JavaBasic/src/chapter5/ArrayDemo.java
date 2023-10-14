package chapter5;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sample = new int [10];
		int i;
		
		for (i = 0; i < 10; i++) sample[i] = i;
		for (i = 0; i < 10; i++) System.out.println("This is a sample ["+ i +"] " + sample [i]);
		
	}

}
