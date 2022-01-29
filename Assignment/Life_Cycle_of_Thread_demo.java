package Multi_THreading;


class Thread_1 extends Thread{
	String Thread_name;
	Thread_1(String Thread_name){
		this.Thread_name = Thread_name;
	}

	public void run() {
		System.out.println("Thread name: "+Thread_name);
		try {
			System.out.println("");
			Thread.sleep(1000);
			System.out.println("State of "+Thread_name+": "+Thread.currentThread().getState());
			System.out.println(" ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(
	            "State of Thread_1 class thread -"
	            + Life_Cycle_of_Thread_demo.obj2.getState());
		System.out.println(" ");
		 

	}
}

class Thread_2 extends Thread{
	String Thread_name;
	Thread_2(String Thread_name){
		this.Thread_name = Thread_name;
	}
	
	public void run() {
		System.out.println("Thread name: "+Thread_name);
		try {
			System.out.println(" ");
			System.out.println("Thread_2 entering in waiting state");
			Thread.sleep(1000);
			System.out.println("State of "+Thread_name+": "+Thread.currentThread().getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(
		            "State of Thread_2 class thread -"
		            + Life_Cycle_of_Thread_demo.obj2.getState());
		 System.out.println(" ");
		

	}

}

public class Life_Cycle_of_Thread_demo {
	public static Thread_1 obj1;
	public static Thread_2 obj2;
	public static void main(String[] args) {
		
		// Initializing the string to identity the thread
		obj1 = new Thread_1("Thread_1 class thread");
		obj2 = new Thread_2("Thread_2 class thread");
		System.out.println(" ");
		
		
		// getState() we can return the state of thread
		System.out.println("State of Thread_1: " +obj1.getState()+"\n");
		System.out.println("State of Thread_2: " +obj2.getState()+"\n");
		System.out.println(" ");
		System.out.println("State of "+Thread.currentThread().getName()+" "+Thread.currentThread().getState()+"\n");
		
		// start() method will make enter the thread into runnable state.
		obj1.start();
		obj2.start();
		
		 // join() method will make Thread_1 class thread to wait to finish Thread_2 class to finish its job
		try {
			obj2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 System.out.println(
		            "State of Thread_1 class thread -"
		            + Life_Cycle_of_Thread_demo.obj1.getState());
		 System.out.println(" ");
		 System.out.println( "State of Thread_2 class thread  -"
		            + Life_Cycle_of_Thread_demo.obj2.getState());
		
	}

}

