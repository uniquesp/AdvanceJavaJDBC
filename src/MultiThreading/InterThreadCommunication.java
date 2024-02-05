package MultiThreading;



class totalEarnings extends Thread{
	int total = 0;
	
	public void run() {
		synchronized(this) {
			for(int i=0;i<=10;i++) {
				total+=100;
			}
			this.notify();
		}
		
	}
}

public class InterThreadCommunication {
	
	public static void main(String[] args) throws InterruptedException {
		totalEarnings obj = new totalEarnings();
		obj.start();
		
		synchronized(obj) {
			obj.wait();
			System.out.println("Total earnings : "+obj.total+ "Rs");
		}
		
	}
}
