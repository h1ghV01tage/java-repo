package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		FileInputStream fin;
		
		//First make sure that a file has been specified
		if(args.length != 1) {
			System.out.println("usage: showfile file");
			return;
		}
		
		try {
			
			fin = new FileInputStream(args[0]);
			
		}
		
		catch(FileNotFoundException exc){
			
			System.out.println("File not found");
			return;
			
		}
		
		try {
			
			//read bytes until EOF is encountered
			do {
				i = fin.read(); //read from the file
				if( i!= -1) {
					System.out.println((char) i);
				}
			}
			while(i != -1); //when i equals -1, the end of the file has been reached
		}
		
		catch (IOException exc){
			
			System.out.println("Error reading the file");
			
		}
		
		try {
			
			fin.close();
			
		}
		catch (IOException exc){
			
			System.out.println("Error closing the file");
			
		}
		
	}

}
