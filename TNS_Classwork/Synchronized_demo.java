package Multi_THreading;

// In this code we have demostrated the use of Synchrozined keyword.
// Synchronized is used to prevent data inconsistency. 
// It prevents deadlock condition.

class Demo_sync{
	
	// Decalareing a instance method with synchronized keyword  
	public synchronized void met(String str) {
			for(int i=0; i<=2; i++) {
			 if(i==0)System.out.println(str+ " is running task: ");
			 System.out.println(str+ " opeartion:"+i);
		         try
		            {
		                  Thread.sleep(1000);
			    }catch (Exception e){
		                   System.out.println("Thread  interrupted.");
		           }
			}
		
	}
}

class Demo_thread implements Runnable{
    String name;
    // Instances variable of class Demo_sync
    Demo_sync obj;
    
    Demo_thread(String name, Demo_sync obj){
    	this.name = name;
    	this.obj = obj;
    }
    
 
	public void run() {
	        obj.met(name);
	}
	
}


public class Synchronized_demo {

	public static void main(String[] args) {
		
		// Creating the object of Demo_sync class
		Demo_sync obj = new Demo_sync();
		
		// Initializing the Thread class obj with Demo_thread class
		// Inside the Demo_thread class we are initializing the Name and Demo_sync object.
		Thread obj1 = new Thread(new Demo_thread("Thread 1", obj));
		Thread obj2 = new Thread(new Demo_thread("Thread 2", obj));
		
		// Starting the threads.
		obj1.start();
		obj2.start();
		
	

	}

}
