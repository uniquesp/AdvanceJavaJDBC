package Filehandeling;

import java.io.*;

public class CreateFile {

		public static void main(String[] args) throws IOException {
			
			//create file 
//			try {
//				File fo = new File("sp.txt");
//				 if (fo.createNewFile()) {
//		            System.out.println("File created successfully: " + fo.getAbsolutePath());
//	            } else {
//	                System.out.println("File already exists or cannot be created.");
//	            }
//			}catch(IOException ex) {
//				System.out.println(ex.getMessage());
//			}
//			
//			
//			//Writing in the file
//			try {
//				FileWriter fw = new FileWriter("sp.txt");
//				fw.write(" नित्य कर्म करने वाले की श्रेष्ठता।\n"
//						+ "यज्ञादि कर्मों की आवश्यकता।\n"
//						+ "अज्ञानी और ज्ञानी के लक्षण।\n"
//						+ "काम के निरोध का विषय।");
//				fw.close();
//			}catch(IOException ex) {
//				System.out.println(ex.getMessage());
//			}
//			
//			
//			//Reading from file
//			try(BufferedReader br = new BufferedReader(new FileReader("sp.txt"))){
//				while(br.ready()) {
//					System.out.println(br.readLine());
//				}
//			}catch(IOException e) {
//				System.out.println(e.getMessage());
//			}
//			
			
//			//delete file
//			File fo = new File("notes.txt");
//			if(fo.delete()) {
//				System.out.println(fo.getName());
//			}else {
//				System.out.println("No File is deleted");
//			}
			
			
		}
}
