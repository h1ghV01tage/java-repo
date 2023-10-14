package chapter2;

public class SideEffects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		/*
		 * Here, i is still incremented even though the if statement fails
		 */
		if(false & (++i < 100)) System.out.println("the statement fails" + i);
		System.out.println(i);
		
		/*
		 * here, i is not incremented because short circuit prevents that from happening
		 */
		if(false && (++i < 100)) System.out.println("this won't get executed" + i);
		System.out.println(i);
		

	}

}
