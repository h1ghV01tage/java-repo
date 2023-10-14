package chapter3;

import java.io.IOException;

//Read a character from the keyboard

public class KeyboardInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;
		
		System.out.print("Press a key followed by enter");
		ch = (char) System.in.read();
		
		System.out.println("Your key is " + ch);
		
	}

}
