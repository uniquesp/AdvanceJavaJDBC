package javasql;
import java.sql.*;
import java.util.*;

public class JdbcTestStatement {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","Kaldin1234!");
			Statement st = con.createStatement();
			String ddlcreate = "create table student(id int,name varchar(22))";
			st.execute(ddlcreate);
			System.out.println("Table Created Successfully !!");
			
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		
		
		
		
	}
}
