package MultiThreading;
import java.lang.Thread;

public class YieldMethod extends Thread{
	
	static Thread mainthread;
	
 public void run() {
	 try {
		 mainthread.yield();
		 for(int i=0;i<5;i++) {
			 System.out.println("child thread: "+i);
			 Thread.sleep(i);
		 }
	 }catch(Exception e) {
		 System.out.println(e);
	 }
 }
 
	 public static void main(String[] args) throws InterruptedException {
		 
		 mainthread = Thread.currentThread();
		
		 JoinMethod obj = new JoinMethod();
		 obj.start();
//		 obj.yield(); // gives time to implement high priority methodes
		 
		 for(int i=0;i<5;i++) {
			 System.out.println("Main thread: "+i);
		 }
	}
}
