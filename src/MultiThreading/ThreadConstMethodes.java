package MultiThreading;
import java.lang.Thread;

public class ThreadConstMethodes extends Thread{
	
	public void run() {
		System.out.println("Task: "+ Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
//		System.out.println("Hello");
//		System.out.println("Thread Name : " + Thread.currentThread().getName());
		Thread.currentThread().setName("uniquesp");
		System.out.println("New Thread Name : " + Thread.currentThread().getName());
		System.out.println("main Thread priority : "+ Thread.currentThread().getPriority());
		
	
		ThreadConstMethodes obj = new ThreadConstMethodes();
		obj.setName("Pinu");
		obj.setPriority(MIN_PRIORITY);
		obj.start();
		System.out.println("Pinu isAlive : "+obj.isAlive());
		System.out.println("Pinu priority : "+obj.getPriority());
		
		ThreadConstMethodes obj1 = new ThreadConstMethodes();
		obj1.setPriority(MAX_PRIORITY);
		obj1.setName("Moku");
		obj1.start();
		System.out.println("Moku priority : " + obj1.getPriority());
		System.out.println("Pinu isAlive : "+obj.isAlive());
		System.out.println("Moku isAlive : "+obj1.isAlive());
		
			
	}
}
