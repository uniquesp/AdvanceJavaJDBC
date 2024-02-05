package ExceptionHandeling;
import java.io.*;
import java.util.*;

public class TryWithResource {
	
	
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			System.out.print(n);
		}
		
//		catch(Exception e) {
//			System.out.println("Error: " + e);
//		}
	}
}
