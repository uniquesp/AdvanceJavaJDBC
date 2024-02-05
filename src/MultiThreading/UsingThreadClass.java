package MultiThreading;
import java.lang.Thread;


public class UsingThreadClass extends Thread{ //step 1
	
	public void run() { //step2
		for(int i=0;i<10;i++) {
			System.out.println("I am Happy :)");
		}
	}
	
	public static void main(String[] args) {
		
		UsingThreadClass obj = new UsingThreadClass(); // step 3
		obj.start(); // step 4
	}
}
