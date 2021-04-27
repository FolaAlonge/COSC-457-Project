package towsonhousingdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class InsertStudent {
	public static void InsertStudentIntoDB(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tuhousing", "root", "2013Orioles");
			System.out.println("Database connection successful");
			Statement stmt = con.createStatement();
			
			String insertUser = "INSERT INTO TUH_USER VALUES ('" +student.firstName + "', '" + student.lastName + "', '" + student.email + "', '" + student.phone + "', '" + student.ssn + "', '" + student.street +  "', '" +student.city + "', '" + student.zip + "', '" + student.state +"')";
			stmt.addBatch(insertUser);
			
			String insertLease = "INSERT INTO LEASE (Length, Lease_date, Housing_num, Bed_id) VALUES ('"+ student.leaseLength + "', '"  + LocalDate.now() + "', " + student.houseId + ", '" + student.bed + "')";
			stmt.addBatch(insertLease);
			
			String insertStudent = "INSERT INTO STUDENT (Num_of_courses, Credits, Student_id, Tu_Status, Ssn, Plan_id, Want_parking, Want_meal_plan) VALUES" + "("+ student.numClasses + ", " + student.credits + ", '"+ student.studentId + "', '" + student.tuStatus + "', '" + student.ssn + "', " + student.planId + ", " + student.hasParking + ", " +  student.hasMealPlan +")";
			stmt.addBatch(insertStudent);
			
			
			
			if (student.hasParking) {
				String insertCar = "INSERT INTO PARKING (Car_make, Car_model, Car_color, Plate_num, Student_id) VALUES ('"+ student.vehicleMake + "', '"+ student.vehicleModel + "', '" + student.vehicleColor + "', '" + student.plateNumber + "', '" + student.studentId +"')";
			
			
			
			
				stmt.addBatch(insertCar);
			}
			stmt.executeBatch();
			con.close();
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println(ex);
		}
	}
}
