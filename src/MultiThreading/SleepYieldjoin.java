package MultiThreading;
import java.lang.Thread;

public class SleepYieldjoin extends Thread{
	
	public void run() {
		String importantInfo[] = {
	            "Mares eat oats",
	            "Does eat oats",
	            "Little lambs eat ivy",
	            "A kid will eat ivy too"
	        };

	        for (int i = 0;i < importantInfo.length; i++) {
	            Thread.currentThread();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            System.out.println(importantInfo[i]);
	        }
	}
	
	

	public static void main(String args[]) throws InterruptedException {
	        
		 SleepYieldjoin obj = new SleepYieldjoin();
//		 obj.start(); // simultenous print
		 obj.run(); // print one by one
		 SleepYieldjoin obj2 = new SleepYieldjoin();
//		 obj2.start();
		 obj2.run(); // 
			
	    }
}
