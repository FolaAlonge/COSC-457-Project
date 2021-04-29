package towsonhousingdatabase;

import java.util.ArrayList;

public class AdminSpecificHousingDB {
	public String buildingName = "";
	public int numOfBeds = 0;
	public int numOfBedsLeft = 0;
	public String[] students;
	public String[] studentIDs;
	public boolean hall = false;
	
	public AdminSpecificHousingDB() {
		
	}
	
	public void setBuildingName(String name) {
		this.buildingName = name;
	}
	
	public void setNumOfBeds(int beds) {
		this.numOfBeds = beds;
	}
	
	public void setNumOfBedsLeft() {
		this.numOfBedsLeft = numOfBeds - students.length;
	}
	
	public void setStudents(String[] student) {
		this.students = student;
	}
	
	public void setStudentsIDs(String[] id) {
		this.studentIDs = id;
	}
	
	
	public void setType(boolean type) {
		this.hall = type;
	}
}
