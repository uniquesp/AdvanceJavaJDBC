package MultiThreading;

public class isintruptMethod extends Thread{

	 public void run() 
	    { 
	        try { 
	        System.out.println(Thread.currentThread().isInterrupted());	
	            Thread.sleep(2000); 
	            System.out.println("Happy :) "); 
	        } 
	        catch (InterruptedException e) { 
	            throw new RuntimeException("Thread " + 
	                                    "interrupted"); 
	        } 
	    } 
	    public static void main(String args[]) 
	    { 
	    	isintruptMethod t1 = new isintruptMethod(); 
	        t1.start(); 
	        try { 
	          //  t1.interrupt(); 
	        } 
	        catch (Exception e) { 
	            System.out.println("Exception handled"); 
	        } 
	    } 
}
