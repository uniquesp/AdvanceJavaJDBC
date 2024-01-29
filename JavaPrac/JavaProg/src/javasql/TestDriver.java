package javasql;
import java.util.*;
import java.sql.*;

public class TestDriver {
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(ClassNotFoundException cnf) {
				cnf.printStackTrace();
			}
			
			Enumeration e = DriverManager.getDrivers();
			while(e.hasMoreElements()) {
					Driver d = (Driver) e.nextElement();
					System.out.println(d.getClass().getName());
			}
			
		}
}
