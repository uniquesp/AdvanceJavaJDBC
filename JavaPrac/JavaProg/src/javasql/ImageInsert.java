package javasql;

import java.io.FileInputStream;
import java.sql.*;


public class ImageInsert {
	public static void main(String[] args) {
		
		 try {
	            // Load driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Creating connection
	            String url = "jdbc:mysql://localhost:3306/imageinsert";
	            String uname = "root";
	            String pass = "Kaldin1234!";

	            Connection con = DriverManager.getConnection(url, uname, pass);
//	            if (con.isClosed()) {
//	                System.out.println("Connection is closed");
//	            } else {
//	                System.out.println("Connection created");
//	            }
			 
			 String q = "Insert into images(pic) values(?)";
			 PreparedStatement ps = con.prepareStatement(q);
			 
			 //for converting images into bytes
			 FileInputStream fStream = new FileInputStream("book.jpeg");
			 ps.setBinaryStream(1, fStream,fStream.available());
			 ps.executeUpdate();
			 System.out.println("Done.....");
			 
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
