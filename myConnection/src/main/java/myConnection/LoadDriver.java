package myConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDriver {

	static String user = "root";
	static String passwd = "Infj@12345";

	public Connection loadingDriver() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sakila", user, passwd);
			System.out.println("Connection build successfully");
			return con;
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");

		} catch (SQLException e) {
			System.out.println("Sql query error");

		}
		return null;
	}
}