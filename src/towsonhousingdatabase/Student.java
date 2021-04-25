package towsonhousingdatabase;

public class Student {
	
	// Fields
	public String firstName = "";
	public String lastName = "";
	public int ssn = 0;
	public int credits = 0;
	public int studentId = 0;
	public String email = "";
	public String phone = "";
	public String street = "";
	public String city = "";
	public String state = "";
	public int zip = 0;
	public String floor = "";
	public String bed = "";
	public String vehicleModel = "";
	public String vehicleColor = "";
	public String plateNumber = "";
	public boolean residentHall = false;
	public String residentHallLocation = "";
	public boolean apartment = false;
	public String apartmentLocation = "";
	public boolean hasParking = false;
	public String parking = "No";
	public boolean hasMealPlan = false;
	public String mealPlan = "";
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String ssn, String credits, String studentId, String email, String phone, String street, String city, String state, String zip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = Integer.parseInt(ssn);
		this.credits = Integer.parseInt(credits);
		this.studentId = Integer.parseInt(studentId);
		this.email = email;
		this.phone = phone; 
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = Integer.parseInt(zip);
	}
	
	// method used to set the the resident hall location
	public void setResidentHallOption(Object object) {
		this.residentHall = true;
		this.apartment = false;
		this.residentHallLocation = (String) object;
	}
	
	public void setParking(Object object) {
		if ((String) object == "Yes") {
			this.hasParking = true;
			this.parking = "Yes";
		}
		if ((String) object == "No") {
			this.hasParking = false;
			this.parking = "No";
		}	
	}
	
	public void setMealPlan(Object object) {
		if ((String) object == "None") {
			this.hasMealPlan = false;
			this.mealPlan = "None";
		} else {
			this.hasMealPlan = true;
			this.mealPlan = (String) object;
		}
	}
	
	public void setApartmentOption(Object object) {
		this.residentHall = false;
		this.apartment = true;
		this.apartmentLocation = (String) object;
	}
	public void setFloor(Object object) {
		this.floor = (String) object;
	}
	
	public void setBed(Object object) {
		this.bed = (String) object;
	}
	public void setVehicleInfo(String model, String color, String number) {
		this.vehicleModel = (String) model;
		this.vehicleColor = (String) color;
		this.plateNumber = (String) number;
	}
}
