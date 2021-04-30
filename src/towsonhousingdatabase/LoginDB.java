package towsonhousingdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDB {
	public static boolean checkAuthentication(String username, char[] pass) {
		boolean correct = false;
		String password = String.valueOf(pass);
		System.out.println(username);
		System.out.println(pass);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://cosc457housingdb.mysql.database.azure.com/tuhousing", "cosc457Admin@cosc457housingdb", "cosc457Project");
			System.out.println("Database connection successful");
			Statement stmt = con.createStatement();
			
			String query = "SELECT * FROM tu_admin WHERE Username='" + username + "' AND Passw='" + password + "'";
		
		
			ResultSet rs = stmt.executeQuery(query);
			
			if (rs.next()) {
				correct = true;
			}
			
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return correct;
	}
}
