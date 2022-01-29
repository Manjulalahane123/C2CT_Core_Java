package Multi_THreading;
// Thread creation by extending the Thread class i.e Parent class
class demo_Thread extends Thread{
	void m1() {
		System.out.println("Method 1");
	}
	
	void m2() {
		System.out.println("Method 2");
	}
	public void run() {
		for(int i=0; i<=5; i++) {
			
			System.out.println("Demo_thread class thread is runinng: "+i);
		}
	}
}
public class Thread_extend_demo {

	public static void main(String[] args) {
		demo_Thread obj = new demo_Thread();
		// Starting demo_Thread class thread
		obj.start();
		
		for(int j=0; j<5; j++) {
			 System.out.println("Main class thread is "
			 		+ "runinng: "+j);
		 }
	}

}
