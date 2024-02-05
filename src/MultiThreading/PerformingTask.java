package MultiThreading;

import java.lang.Thread;


// Performing single tasks from multiple threads
public class PerformingTask extends Thread {
	
	public void run() { //step2
		for(int i=0;i<5;i++) {
			System.out.println("I am Happy :)     " + Thread.currentThread().getName());
		}
	}
	
	
	public static void main(String[] args) {
		PerformingTask obj1 = new PerformingTask();
		PerformingTask obj2 = new PerformingTask();
		obj1.setName("Sakshi");
		obj1.start();
		obj2.setName("uniquesp");
		obj2.start();
		
	}
}
