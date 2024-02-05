package Filehandeling;


import java.io.*;

public class WritingFromFile {
	public static void main(String[] args) {
		
		
		try(InputStreamReader isr = new InputStreamReader(System.in)){
			System.out.println("Enter Some Letters: ");
			int letters = isr.read();
			while(isr.ready())
			{
				System.out.println((char)letters);
				letters = isr.read();
			}
			isr.close();
			System.out.println();
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
