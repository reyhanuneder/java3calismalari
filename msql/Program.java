package msql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://10.1.8.20:3306/sakila?useUnicode=true&useLegacyDatetimecode=false&serverTimezone=Turkey",
					"ogrenci", "1234");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * from sakila.actor");
			while (rs.next()) {
				int actor_id = rs.getInt(1);
				String first_name = rs.getString(2);
				String last_name = rs.getString("last_name");
				Date last_update = rs.getDate("last_update");

				System.out.println(first_name);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
