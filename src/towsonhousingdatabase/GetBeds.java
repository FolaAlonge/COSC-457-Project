package towsonhousingdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class GetBeds {
	public static String[] getBedsForResidentHallFromDB(Object building, int floor) {
		ArrayList<String> beds = new ArrayList<String>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tuhousing", "root", "2013Orioles");
			System.out.println("Database connection successful");
			Statement stmt = con.createStatement();
			
			String query = "SELECT Bed_id, Resident_hall_name, Hall_floor FROM hall_bed, resident_hall WHERE NOT EXISTS (SELECT hall_bed.Bed_id FROM lease where hall_bed.Bed_id=lease.Bed_id) AND resident_hall.Hall_num=hall_bed.Hall_num AND resident_hall.Resident_hall_name='" + (String) building +"' AND hall_bed.Hall_floor=" + floor;
		
		
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				System.out.println(rs.getString("Bed_id"));
				beds.add(rs.getString("Bed_id"));
			}
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] array = beds.toArray(new String[beds.size()]);
		return array;
	}
	
	public static String[] getBedsForStartingResidentHallFromDB() {
		ArrayList<String> beds = new ArrayList<String>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tuhousing", "root", "2013Orioles");
			System.out.println("Database connection successful");
			Statement stmt = con.createStatement();
			
			String query = "SELECT Bed_id, Resident_hall_name, Hall_floor FROM hall_bed, resident_hall WHERE NOT EXISTS (SELECT hall_bed.Bed_id FROM lease where hall_bed.Bed_id=lease.Bed_id) AND resident_hall.Hall_num=hall_bed.Hall_num AND resident_hall.Resident_hall_name='Glen Complex' AND hall_bed.Hall_floor=1";
		
		
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				System.out.println(rs.getString("Bed_id"));
				beds.add(rs.getString("Bed_id"));
			}
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] array = beds.toArray(new String[beds.size()]);
		return array;
	}
	
	public static String[] getBedsForApartmentFromDB(Object building, int floor) {
		ArrayList<String> beds = new ArrayList<String>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tuhousing", "root", "2013Orioles");
			System.out.println("Database connection successful");
			Statement stmt = con.createStatement();
		
			String query = "SELECT Bed_id, Apartment_name, Apart_floor FROM apart_bed, apartment WHERE NOT EXISTS (SELECT apart_bed.Bed_id FROM lease where apart_bed.Bed_id=lease.Bed_id) AND apartment.Apart_num=apart_bed.Apart_num AND apartment.Apartment_name='" + (String) building +"' AND apart_bed.Apart_floor=" + floor;
		
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				System.out.println(rs.getString("Bed_id"));
				beds.add(rs.getString("Bed_id"));
			}
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] array = beds.toArray(new String[beds.size()]);
		return array;
	}
	
	public static String[] getBedsForStartingApartmentFromDB() {
		ArrayList<String> beds = new ArrayList<String>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tuhousing", "root", "2013Orioles");
			System.out.println("Database connection successful");
			Statement stmt = con.createStatement();
		
			String query = "SELECT Bed_id, Apartment_name, Apart_floor FROM apart_bed, apartment WHERE NOT EXISTS (SELECT apart_bed.Bed_id FROM lease where apart_bed.Bed_id=lease.Bed_id) AND apartment.Apart_num=apart_bed.Apart_num AND apartment.Apartment_name='Carroll Hall' AND apart_bed.Apart_floor=1";
					
		
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				System.out.println(rs.getString("Bed_id"));
				beds.add(rs.getString("Bed_id"));
			}
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] array = beds.toArray(new String[beds.size()]);
		return array;
	}
}
