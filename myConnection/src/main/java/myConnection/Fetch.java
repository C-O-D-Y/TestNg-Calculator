package myConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Fetch {
	public boolean fetchData() throws SQLException {
		ResultSet rs = null;
		try {
			Scanner scanner = new Scanner(System.in);
			Connection con = new LoadDriver().loadingDriver();
			Statement stmt = con.createStatement();
			System.out.println("Please enter the Id of the Actor");
			int id = scanner.nextInt();
			rs = stmt.executeQuery("select * from actor where actor_id=" + id);
			while (rs.next())
				System.out.println(
						rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));

		} catch (Exception e) {
			System.out.println("Sorry! wrong Input");
		}
		return rs.first();
	}
}
