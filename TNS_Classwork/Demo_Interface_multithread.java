package Multi_THreading;

// Thread creation by implementing the Runnable Interface in Demo_thread_1
class A{}
class Demo_thread_1 extends A implements Runnable{
	
	// Override the abstract method i.e run of Runnable interface
	public void run() {
		// Demo_thread_1 class operation
		for(int i=0; i<=5; i++) {
			System.out.println("Demo_thread_1 class thread is runinng: "+i);
		}
	}
}




public class Demo_Interface_multithread  {

	public static void main(String[] args) {
		// Instantiate a Thread object with Demo_Thread_()
		 Thread obj = new Thread(new  Demo_thread_1());
		 obj.start();
		 
		 // Main Thread operation 
		 for(int j=0; j<5; j++) {
			 System.out.println("Main class thread is "
			 		+ "runinng: "+j);
		 }

	}

}
