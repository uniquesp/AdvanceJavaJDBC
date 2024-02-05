package CJ;
import java.util.*;

public class RandomNoProject {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int myNumber = (int)(Math.random()*100);
		int userNo = 0;
		
		do {
			System.out.println("Guess My No (1-100) : ");
			userNo = s.nextInt();
			
			if(userNo==myNumber) {
				System.out.println("Wow !!! You Found it :)");
				break;
			}
			else if(userNo > myNumber) {
				System.out.println(" Your No is too Large, Try Again...");
			}
			else{
				System.out.println("Your No is too Small, Try Again...");
			}
		}while(userNo>=0);
		
		System.out.println("Sorryy... You LOST :(");
		System.out.print("My Number is : ");
		System.out.println(myNumber);
		
		
	}
}
