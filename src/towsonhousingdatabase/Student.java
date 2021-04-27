package towsonhousingdatabase;

public class Student {
	
	// Fields
	public String firstName = "";
	public String lastName = "";
	public String ssn = "";
	public int numClasses = 0;
	public int credits = 0;
	public String tuStatus = "";
	public String studentId = "";
	public String email = "";
	public String phone = "";
	public String street = "";
	public String city = "";
	public String state = "";
	public String zip = "";
	public int floor = 0;
	public String bed = "";
	public int houseId = 0;
	public String leaseLength = "";
	public String vehicleMake = "";
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
	public int planId = 0;
	public String mealPlan = "";
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String ssn, String numClasses, String credits, String tuStatus, String studentId, String email, String phone, String street, String city, String state, String zip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.numClasses = Integer.parseInt(numClasses);
		this.credits = Integer.parseInt(credits);
		this.tuStatus = tuStatus;
		this.studentId = studentId;
		this.email = email;
		this.phone = phone; 
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	// method used to set the the resident hall location
	public void setResidentHallOption(Object object, int id) {
		this.residentHall = true;
		this.apartment = false;
		this.residentHallLocation = (String) object;
		this.houseId = id;
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
	
	public void setMealPlan(int id, Object meal) {
		if (id == 0) {
			this.hasMealPlan = false;
			this.planId = 0;
			this.mealPlan = "None";
		} else {
			this.hasMealPlan = true;
			this.planId = id;
			this.mealPlan = (String) meal;
		}
	}
	
	public void setApartmentOption(Object object, int id) {
		this.residentHall = false;
		this.apartment = true;
		this.apartmentLocation = (String) object;
		this.houseId = id;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public void setBed(Object object) {
		this.bed = (String) object;
	}
	public void setVehicleInfo(String make, String model, String color, String number) {
		this.vehicleMake = (String) make;
		this.vehicleModel = (String) model;
		this.vehicleColor = (String) color;
		this.plateNumber = (String) number;
	}
	
	public void setLeaseLength(Object length) {
		this.leaseLength = (String) length;
	}
}
