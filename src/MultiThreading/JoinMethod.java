package MultiThreading;
import java.lang.Thread;

public class JoinMethod extends Thread {
	
 public void run() {
	 try {
		 for(int i=0;i<5;i++) {
			 System.out.println("child thread: "+i);
			 Thread.sleep(i);
		 }
	 }catch(Exception e) {
		 System.out.println(e);
	 }
 }
 
	 public static void main(String[] args) throws InterruptedException {
		
		 JoinMethod obj = new JoinMethod();
		 obj.start();
		 obj.join(); // wait for another thread to complete
		 
		 for(int i=0;i<5;i++) {
			 System.out.println("Main thread: "+i);
		 }
	}
}
