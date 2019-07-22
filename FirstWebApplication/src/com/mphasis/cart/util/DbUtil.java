package com.mphasis.cart.util;
import java.sql.Connection ;
import java.sql.DriverManager;


public class DbUtil {
	private static Connection conn;
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","boomika","boomika");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
