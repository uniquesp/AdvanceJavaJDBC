package MultiThreading;

//syncronized block

class BookHallSeats1{
	int total_seats = 10;
	
	void BookSeat(int seats) {
		
		System.out.println("hiii " + Thread.currentThread().getName());
		System.out.println("hiii " + Thread.currentThread().getName());	
		System.out.println("hiii " + Thread.currentThread().getName());
		
		synchronized(this){
			if(total_seats>=seats) {
				System.out.println(seats + " SeatBooked Successfully!!!");
				total_seats-=seats;
				System.out.println("Total Seats left: "+ total_seats);
			}
			else {
				System.out.println("Seats can not be Booked :(  ");
				System.out.println("Seats left : "+total_seats);
			}
		}
		
		System.out.println("hiii " + Thread.currentThread().getName());
		System.out.println("hiii " + Thread.currentThread().getName());	
		System.out.println("hiii " + Thread.currentThread().getName());
		
	}
}


public class Synchronizationdemo extends Thread  {
	static BookHallSeats1 B;
	int seats;
	
	public void run() {
		B.BookSeat(seats);
	}
	
	public static void main(String[] args) {
		
		B = new BookHallSeats1();
		Synchronizationdemo sp = new Synchronizationdemo();
		sp.seats = 7;
		sp.start();
		
		Synchronizationdemo dp = new Synchronizationdemo();
		dp.seats = 8;
		dp.start();
	}
}

