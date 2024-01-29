package javasql;
import java.sql.*;


public class JdbcDMLStatement {
public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","Kaldin1234!");
			Statement st = con.createStatement();
			con.setAutoCommit(false); //default it is true
			
			String ddlinsert = "insert into student values(1,'sakshi')";
			st.execute(ddlinsert);
			int rowsaffected = st.executeUpdate(ddlinsert);
			con.commit(); // require if setAutocommit is false
			System.out.println("Value Inserted Successfully !!");
			System.out.println("No of rows affected"+rowsaffected);
			
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		
	}
}
