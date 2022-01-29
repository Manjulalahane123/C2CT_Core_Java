package Multi_THreading;


class Demo implements Runnable{
	
	public void run() {
		for(int i=0; i<=4; i++) {
			System.out.println("Thread1 opreation: "+i);
					}
	}
}
class Demo2 implements Runnable{
	
	public void run() {
		for(int i=0; i<=4; i++) {
			System.out.println("Thread2 opreation: "+i);
		}
	}
}


public class Priority_thread_demo {

	public static void main(String[] args) {
//		 By default main Thread priority is 5
		System.out.println("Main thread priority: "+ Thread.currentThread().getPriority());
		Thread obj2 = new Thread(new Demo());
		Thread obj3 = new Thread(new Demo2());
		
// Returning priority with getPriority()  assigned by thread scheduler 
// using priority algorithm 
		System.out.println("Priority of demo class thread"+obj2.getPriority());
		System.out.println("Priority of demo2 class thread"+obj3.getPriority());
		System.out.println(" ");
		
		
////		setting Demo class thread to 8 by .setPriority()
//		obj2.setPriority(8);
////		setting Demo2 class thread to 4 by .setPriority()
//		obj3.setPriority(4);
		obj2.start();
		obj3.start();

		
		
		
		

	}

}
