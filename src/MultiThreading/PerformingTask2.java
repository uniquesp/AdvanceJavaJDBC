package MultiThreading;
import java.lang.Runnable;

// Performing multiple task from multiple thread

class Task1 implements Runnable{
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("I am Happy : Thread1 "+" -  " + i);
		}
	}
	
}

 class Task2 implements Runnable{
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("I am Sad : Thread2 "+" - " + i);
		}
	}
	
}


public class PerformingTask2{	
	public static void main(String[] args) {
		Task1 obj1 = new Task1();
		Task2 obj2 = new Task2();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t2.start();
		t1.start();
		
		
	}

	
}
