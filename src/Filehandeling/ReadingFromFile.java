package Filehandeling;
import java.io.*;

public class ReadingFromFile {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("../notes.txt")){
			int letters = fr.read();
			while(fr.ready())
			{
				System.out.print((char)letters);
				letters = fr.read();
			}
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
	