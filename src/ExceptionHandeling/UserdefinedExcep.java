package ExceptionHandeling;
import java.util.*;




public class UserdefinedExcep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			int n = sc.nextInt();
			if(n<18) 
					throw new UnderAgeException("You have your age<18 so you are Rejected !!");
			else
				System.out.println("You are Selected for voting");
		}catch(UnderAgeException ex){
			System.out.println("Error : "+ ex.getMessage());
		}
		catch(Exception e){
			System.out.println("Error : "+ e);
		}
	}
}
