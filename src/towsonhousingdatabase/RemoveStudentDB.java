package towsonhousingdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RemoveStudentDB {
	public static void removeStudentFromDB(String ssn, String id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://cosc457housingdb.mysql.database.azure.com/tuhousing", "cosc457Admin@cosc457housingdb", "cosc457Project");
			System.out.println("Database connection successful");
			Statement stmt = con.createStatement();
			
			String query = "SELECT * FROM student, tuh_user WHERE Student_id='"+ id +"' AND tuh_user.Ssn='"+ ssn + "'";
			
			ResultSet rs1 = stmt.executeQuery(query);
			int leaseNum = 0;
			int parking = 0;
			
			while (rs1.next()) {
				leaseNum = rs1.getInt("Lease_num");
				parking = rs1.getInt("Want_parking");
				System.out.print(rs1.getString("Fname") + " ");
				System.out.println(rs1.getString("Lname"));
				System.out.println("Lease Num " + leaseNum);
				System.out.println("Want Parking " + parking);
			}
			
			if (parking == 1) {
				String query4 = "DELETE FROM parking WHERE Student_id='"+ id +"'";
				stmt.addBatch(query4);
			}
			
			String query2 = "DELETE FROM student WHERE Student_id='"+ id +"'";
			stmt.addBatch(query2);
			
			String query3 = "DELETE FROM lease WHERE Lease_num=" + leaseNum;
			stmt.addBatch(query3);
			
			String quer1 = "DELETE FROM tuh_user WHERE Ssn='"+ ssn +"'";
			stmt.addBatch(quer1);
			
			stmt.executeBatch();
			
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}
}
