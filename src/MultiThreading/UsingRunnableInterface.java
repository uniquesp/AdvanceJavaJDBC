package MultiThreading;
import java.lang.Runnable;

public class UsingRunnableInterface implements Runnable{ //1
	
	public void run() { //2
		
		int a = 10;
		for(int i=1;i<=5;i++) {
			a+=i;
			System.out.println(a);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		UsingRunnableInterface obj = new UsingRunnableInterface(); //3
		Thread t1 = new Thread(obj); //4
		t1.start(); //5
	}
}
