package chapter11;

public class UseThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread starting");
		
		//first construct a MyThread object
		MyThread mt = new MyThread("child #1"); //create a runnable object
		
		//next, construct a thread from that object
		Thread newThrd = new Thread(mt);
		
		//finally, start the execution of the thread
		newThrd.start(); //start running the thread
		
		for(int i =0; i < 50; i++) {
			System.out.println(".");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException exc) {
				
				System.out.println("Main thread interrupted");
				
			}
		}
		
		System.out.println("main thread ending");
		
	}

}
