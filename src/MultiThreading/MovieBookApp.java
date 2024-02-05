package MultiThreading;


class BookHallSeats{
	int total_seats = 10;
	
	synchronized void BookSeat(int seats) {
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
}


public class MovieBookApp extends Thread {
	
	static BookHallSeats B;
	int seats;
	
	public void run() {
		B.BookSeat(seats);
	}
	
	public static void main(String[] args) {
		
		B = new BookHallSeats();
		MovieBookApp sp = new MovieBookApp();
		sp.seats = 7;
		sp.start();
		
		MovieBookApp dp = new MovieBookApp();
		dp.seats = 8;
		dp.start();
		
	}
}
