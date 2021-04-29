package towsonhousingdatabase;

public class AdminStudent {
	public String firstName = "";
	public String lastName = "";
	public int numClasses = 0;
	public int credits = 0;
	public String tuStatus = "";
	public String studentId = "";
	public String ssn = "";
	public int lease_num = 0;
	public String email = "";
	public String phone = "";
	public String street = "";
	public String city = "";
	public String state = "";
	public String zip = "";
	public String bed = "";
	public String houseBuilding = "";
	public String mealName = "";
	public String parking = "No";
	
	public AdminStudent(String fname, String lname, String ssn, int lease_num, int numClass, int credits, String tuStatus, String id, String email, String phone, String street, String city, String state, String zip, String bed, String housingBuilding, String meal, String parking) {
		this.firstName = fname;
		this.lastName = lname;
		this.numClasses = numClass;
		this.credits = credits;
		this.tuStatus = tuStatus;
		this.studentId = id;
		this.email = email;
		this.phone = phone;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.bed = bed;
		this.houseBuilding = housingBuilding;
		this.mealName = meal;
		this.parking = parking;
		this.ssn = ssn;
		this.lease_num = lease_num;
	}
}
