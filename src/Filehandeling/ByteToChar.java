package Filehandeling;
import java.io.*;

public class ByteToChar {

	public static void main(String[] args) {
		
		//convert byte to char stream
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			System.out.println("You Typed this: "+ br.readLine());
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		try(BufferedReader br = new BufferedReader(new FileReader("/home/kaldin/Documents/JavaPrac/CoreJava/notes.txt"))){
				while(br.ready()) {
					System.out.println("Helllooooooooo");
					System.out.println("You Typed this: "+ br.readLine());
				}
				
				
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		
		
	}
	
}
