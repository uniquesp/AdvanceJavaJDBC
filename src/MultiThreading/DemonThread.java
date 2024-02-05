package MultiThreading;
import java.lang.Thread;

//Demon thread provides service to another thread and runs in background
public class DemonThread extends Thread {
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Demon Thread");
		}else {
			System.out.println("Normal Thread");
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("Main Thread"); // if this line commented gives no output
		DemonThread obj = new DemonThread();
		obj.setDaemon(true);
		obj.start();
	}
}
