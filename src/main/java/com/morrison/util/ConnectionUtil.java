package com.morrison.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// TODO: Auto-generated Javadoc
/**
 * The Class ConnectionUtil.
 */
public class ConnectionUtil {
	
	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 * @throws SQLException the SQL exception
	 */
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "gtfx";
		String password = "p4ssw0rd";
		
		DriverManager.registerDriver(DriverManager.getDriver(url));
		return DriverManager.getConnection(url, username, password);
	}
}
