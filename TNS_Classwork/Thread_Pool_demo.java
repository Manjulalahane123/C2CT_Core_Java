package Multi_THreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// ThreadPool reuses previously created threads to execute current tasks without using Thread mechanism. 

class demo_1 implements Runnable{
	String name;
	demo_1(String s){
		name = s;
	}
	public void run(){
		for(int i=0;i<4;i++) {
			if(i==0) {
				System.out.println(name+" is now starting to execute the task: "+Thread.currentThread().getId());
			}
			System.out.println(name+" is executing the task: "+Thread.currentThread().getId()+"\n");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}System.out.println(name+" complete"+"\n");
	}
}

public class Thread_Pool_demo {

	public static void main(String[] args) {
		Runnable obj1 = new demo_1("Thread_1");
		Runnable obj2 = new demo_1("Thread_2");
		Runnable obj3 = new demo_1("Thread_3");
		Runnable obj4 = new demo_1("Thread_4");
		
		// Initializing the size of Thread pool i.e 2
        ExecutorService pool = Executors.newFixedThreadPool(2);
        
        // Running all threads through ExecutorService and executor
        pool.execute(obj1);
        pool.execute(obj2);
        pool.execute(obj3);
        pool.execute(obj4);
        
        pool.shutdown(); // To stop the Thread pool threads. 

	}

}
