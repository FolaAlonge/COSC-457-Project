package towsonhousingdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AdminHousingDB {
	public static AdminSpecificHousingDB getResidentHallInfoAndStudentsFromDB(String building) {
		ArrayList<String> students = new ArrayList<String>();
		ArrayList<String> ids = new ArrayList<String>();
		AdminSpecificHousingDB house = new AdminSpecificHousingDB();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://cosc457housingdb.mysql.database.azure.com/tuhousing", "cosc457Admin@cosc457housingdb", "cosc457Project");
			System.out.println("Database connection successful");
			Statement stmt = con.createStatement();
			
			String quer1 = "SELECT * FROM resident_hall WHERE Resident_hall_name='" + building + "'";
			
			ResultSet rs1 = stmt.executeQuery(quer1);
			rs1.next();
			house.setNumOfBeds(rs1.getInt("Num_of_beds"));
			
			String query2 = "SELECT Fname, Lname, Student_id, Resident_hall_name, Num_of_beds FROM tuh_user, student, lease, housing, resident_hall where tuh_user.Ssn=student.Ssn AND lease.Lease_num=student.Lease_num AND housing.Housing_num=lease.Housing_num AND housing.Housing_num=resident_hall.Hall_num AND resident_hall.Resident_hall_name='" + building + "'";
			ResultSet rs2 = stmt.executeQuery(query2);
			
			while (rs2.next()) {
				house.setBuildingName(rs2.getString("Resident_hall_name"));
				String name = rs2.getString("Fname") + " " + rs2.getString("Lname");
				students.add(name);
				String id = rs2.getString("Student_id");
				ids.add(id);
			}
			String[] housingStudents = students.toArray(new String[students.size()]);
			String[] housingStudentsIds = ids.toArray(new String[ids.size()]);
			
			house.setType(true);
			house.setStudents(housingStudents);
			house.setStudentsIDs(housingStudentsIds);
			house.setNumOfBedsLeft();
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		return house;
	}
	
	public static AdminSpecificHousingDB getApartmentAndStudentsFromDB(String building) {
		ArrayList<String> students = new ArrayList<String>();
		AdminSpecificHousingDB house = new AdminSpecificHousingDB();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://cosc457housingdb.mysql.database.azure.com/tuhousing", "cosc457Admin@cosc457housingdb", "cosc457Project");
			System.out.println("Database connection successful");
			Statement stmt = con.createStatement();
			
			String quer1 = "SELECT * FROM apartment WHERE Apartment_name='" + building + "'";
			
			ResultSet rs1 = stmt.executeQuery(quer1);
			rs1.next();
			house.setNumOfBeds(rs1.getInt("Num_of_beds"));
			
			
			String query2 = "SELECT Fname, Lname, Student_id, Apartment_name, Num_of_beds FROM tuh_user, student, lease, housing, apartment where tuh_user.Ssn=student.Ssn AND lease.Lease_num=student.Lease_num AND housing.Housing_num=lease.Housing_num AND housing.Housing_num=apartment.Apart_num AND apartment.Apartment_name='" + building + "'";
					
		
			ResultSet rs = stmt.executeQuery(query2);
			
			while (rs.next()) {
				house.setBuildingName(rs.getString("Apartment_name"));
				String name = rs.getString("Fname") + rs.getString("Lname");
				students.add(name);
			}
			String[] array = students.toArray(new String[students.size()]);
			house.setType(false);
			house.setStudents(array);
			house.setNumOfBedsLeft();
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return house;
	}
	
	public static AdminStudent getResidentHallStudentFromDB(String id) {
		AdminStudent student = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://cosc457housingdb.mysql.database.azure.com/tuhousing", "cosc457Admin@cosc457housingdb", "cosc457Project");
			System.out.println("Database connection successful");
			Statement stmt = con.createStatement();
			
			String query = "SELECT Fname, Lname, tuh_user.Ssn, email, Student_id, tuh_user.Phone_num, tuh_user.Street_address, tuh_user.City, tuh_user.State, tuh_user.Zip, Num_of_courses, Credits, Tu_Status, lease.Lease_num, Resident_hall_name, lease.Bed_id, Want_parking, Meal_name FROM tuh_user, student, meal_plan, lease, resident_hall WHERE tuh_user.Ssn=student.Ssn AND student.Student_id='" + id + "' AND student.Plan_id=meal_plan.Plan_id AND student.Lease_num=lease.Lease_num AND lease.Housing_num=resident_hall.Hall_num;  ";
		
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				String first = rs.getString("Fname");
				String last = rs.getString("Lname");
				int numClass = rs.getInt("Num_of_courses");
				int credits = rs.getInt("Credits");
				int lease_num = rs.getInt("Lease_num");
				String ssn = rs.getString("Ssn");
				String tuStatus = rs.getString("Tu_Status");
				String ids = rs.getString("Student_id");
				String email = rs.getString("email");
				String phone = rs.getString("Phone_num");
				String street = rs.getString("Street_address");
				String city = rs.getString("City");
				String state = rs.getString("State");
				String zip = rs.getString("Zip");
				String bed = rs.getString("Bed_id");
				String housingBuilding = rs.getString("Resident_hall_name");
				String meal = rs.getString("Meal_name");
				if (meal == "") {
					meal = "None";
				}
				int parkingStatus = rs.getInt("Want_parking");
				String parking = "";
				if (parkingStatus == 1) {
					parking = "Yes";
				} else {
					parking = "No";
				}
				student = new AdminStudent(first, last, ssn, lease_num, numClass, credits, tuStatus, ids, email, phone, street, city, state, zip, bed, housingBuilding, meal, parking);
			}
			
			
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}
}
