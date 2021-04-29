package towsonhousingdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DeleteStudent {
	public static void deleteStudentFromDB(AdminStudent student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tuhousing", "root", "2013Orioles");
			System.out.println("Database connection successful");
			Statement stmt = con.createStatement();
			
			if (student.parking == "Yes") {
				String query4 = "DELETE FROM parking WHERE Student_id='"+ student.studentId +"'";
				stmt.addBatch(query4);
			}
			
			String query2 = "DELETE FROM student WHERE Student_id='"+ student.studentId +"'";
			stmt.addBatch(query2);
			
			String query3 = "DELETE FROM lease WHERE Lease_num=" + student.lease_num;
			stmt.addBatch(query3);
			
			String quer1 = "DELETE FROM tuh_user WHERE Ssn='"+ student.ssn +"'";
			stmt.addBatch(quer1);
			
			stmt.executeBatch();
			
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}
}
