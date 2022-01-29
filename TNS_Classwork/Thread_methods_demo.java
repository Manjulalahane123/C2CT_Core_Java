package Multi_THreading;

// In this code we have implemented the thread methods.

// Creating a Thread running tasks in class Thread_Met_1 by implementing Runnable Interface.
class Thread_Met_1 implements Runnable{
	static String str;
	
	// Constructor to initialize the values
	Thread_Met_1(String s){
		str = s;
	}
	
    // Runnable interface method
	public void run() {
		System.out.println(str+ " is running the tasks");
		try {
			Thread.sleep(500); // sleep method will make thread to go into block state
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str+ " is running the tasks");
		System.out.println(str+ " is running the tasks");
		System.out.println(str+ " is running the tasks");
		
	}
}

public class Thread_methods_demo {

	public static void main(String[] args) {
		System.out.println("Main is running the task");
		
		// Declaring the thread object and passing Thread_Met_1 object 
		Thread obj = new Thread(new Thread_Met_1("Thread 1"));
		
		//start method will make Thread_Met_1 thread into Running state.
		obj.start();
		
		// getState() method we return the current state of thread
		System.out.println("State of Thread 1: "+obj.getState());
		System.out.println("Main is running the task");
		
		// yeild() will pass the chance of execution to other thread
		obj.yield(); 
		
		System.out.println("Main is running the task");
		System.out.println("State of Thread 1: "+obj.getState());
		
		System.out.println("Making main thread wait with the help of join method");
    	        try {
    		// join() method will make main thread to wait until Thread_Met_1 finish his job
			obj.join(); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	System.out.println("State of Thread 1: "+obj.getState());
		System.out.println("Main is running the task");

	}

}
