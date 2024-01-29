package javasql;


import java.sql.*;
import java.util.*;

public class TestDriver2 {
	public static void main(String[] args) {
		
		
		try {
			Driver d = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
		}catch(SQLException sql){
			sql.printStackTrace();
		}
		Enumeration e = DriverManager.getDrivers();
		while(e.hasMoreElements()) {
				Driver p = (Driver) e.nextElement();
				System.out.println(p.getClass().getName());
		}
		
	}
}
