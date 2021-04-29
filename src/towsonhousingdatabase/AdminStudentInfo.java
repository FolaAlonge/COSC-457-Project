package towsonhousingdatabase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdminStudentInfo {
	static void generateAdminStudentInfoPage(JFrame adminSpecificHousingFrame, AdminStudent student, JFrame adminHousingFrame) {
		System.out.println("You make it to the admin student info");
		
		JFrame adminStudentInfoFrame = new JFrame("Student Information");
		adminStudentInfoFrame.setSize(550, 1000);
		adminStudentInfoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// center the jframe on screen
		adminStudentInfoFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		adminStudentInfoFrame.add(panel);
		
		
		setUpPage(adminSpecificHousingFrame, adminStudentInfoFrame, panel, student, adminHousingFrame);
		adminStudentInfoFrame.setVisible(true);
	}
	public static void setUpPage(JFrame adminSpecificHousingFrame, JFrame adminStudentInfoFrame, JPanel panel, AdminStudent student, JFrame adminHousingFrame) {
		panel.setLayout(null);
		
		// Creating JLabel
        JLabel userLabel = new JLabel("Student Information");
        userLabel.setBounds(180,10,160,25);
        panel.add(userLabel);
        
        // Creating Label for first name
        JLabel fNameLabel = new JLabel("First Name");
        fNameLabel.setBounds(75,75,125,25);
        panel.add(fNameLabel);
        
        // Creating the input for first name
        JLabel fName = new JLabel(student.firstName);
        fName.setBounds(200,75,200,25);
        panel.add(fName);

        // Creating Label for last name
        JLabel lNameLabel = new JLabel("Last Name");
        lNameLabel.setBounds(75,125,125,25);
        panel.add(lNameLabel);
        
        // Creating the input for last name
        JLabel lName = new JLabel(student.lastName);
        lName.setBounds(200,125,200,25);
        panel.add(lName);
        
     // Creating Label for # of credits
        JLabel numClassesLabel = new JLabel("Number of Classes");
        numClassesLabel.setBounds(75,175,125,25);
        panel.add(numClassesLabel);
        
        // Creating the input for # of credits
        JLabel numClasses = new JLabel(String.valueOf(student.numClasses));
        numClasses.setBounds(200,175,200,25);
        panel.add(numClasses);
        
        
        // Creating Label for # of credits
        JLabel numCreditsLabel = new JLabel("Number of Credits");
        numCreditsLabel.setBounds(75,225,125,25);
        panel.add(numCreditsLabel);
        
        // Creating the input for # of credits
        JLabel numCredits = new JLabel(String.valueOf(student.credits));
        numCredits.setBounds(200,225,200,25);
        panel.add(numCredits);
        
        // Creating Label for Student ID
        JLabel studentIDLabel = new JLabel("Student ID");
        studentIDLabel.setBounds(75,275,125,25);
        panel.add(studentIDLabel);
        
        // Creating the input for Student ID
        JLabel studentID = new JLabel(student.studentId);
        studentID.setBounds(200,275,200,25);
        panel.add(studentID);
        
        // Creating Label for email
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(75,325,125,25);
        panel.add(emailLabel);
        
        // Creating the input for email
        JLabel email = new JLabel(student.email);
        email.setBounds(200,325,275,25);
        panel.add(email);
        
     // Creating Label for email
        JLabel tuStatusLabel = new JLabel("TU Status");
        tuStatusLabel.setBounds(75,375,125,25);
        panel.add(tuStatusLabel);
        
        // Creating the input for email
        JLabel tuStatus = new JLabel(student.tuStatus);
        tuStatus.setBounds(200,375,275,25);
        panel.add(tuStatus);
        
        // Creating Label for phone #
        JLabel phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(75,425,125,25);
        panel.add(phoneLabel);
        
        // Creating the input for phone #
        JLabel phone = new JLabel(student.phone);
        phone.setBounds(200,425,200,25);
        panel.add(phone);
        
        // Creating Label for street
        JLabel streetLabel = new JLabel("Street");
        streetLabel.setBounds(75,475,125,25);
        panel.add(streetLabel);
        
        // Creating the input for street
        JLabel street = new JLabel(student.street);
        street.setBounds(200,475,200,25);
        panel.add(street);
        
        // Creating Label for city
        JLabel cityLabel = new JLabel("City");
        cityLabel.setBounds(75,525,125,25);
        panel.add(cityLabel);
        
        // Creating the input for city
        JLabel city = new JLabel(student.city);
        city.setBounds(200,525,200,25);
        panel.add(city);
        
        // Creating Label for state
        JLabel stateLabel = new JLabel("State");
        stateLabel.setBounds(75,575,125,25);
        panel.add(stateLabel);
        
        // Creating the input for state
        JLabel state = new JLabel(student.state);
        state.setBounds(200,575,200,25);
        panel.add(state);
        
        // Creating Label for zip
        JLabel zipLabel = new JLabel("Zip");
        zipLabel.setBounds(75,625,125,25);
        panel.add(zipLabel);
        
        // Creating the input for zip
        JLabel zip = new JLabel(student.zip);
        zip.setBounds(200,625,200,25);
        panel.add(zip);
        
        // Creating Label for zip
        JLabel housingBuildingLabel = new JLabel("Housing Building");
        housingBuildingLabel.setBounds(75,675,125,25);
        panel.add(housingBuildingLabel);
        
        // Creating the input for zip
        JLabel housingBuilding = new JLabel(student.houseBuilding);
        housingBuilding.setBounds(200,675,200,25);
        panel.add(housingBuilding);
        
     // Creating Label for zip
        JLabel bedIdLabel = new JLabel("Bed ID");
        bedIdLabel.setBounds(75,725,125,25);
        panel.add(bedIdLabel);
        
        // Creating the input for zip
        JLabel bedId = new JLabel(student.bed);
        bedId.setBounds(200,725,200,25);
        panel.add(bedId);
        
     // Creating Label for zip
        JLabel mealPlanLabel = new JLabel("Meal Plan");
        mealPlanLabel.setBounds(75,775,125,25);
        panel.add(mealPlanLabel);
        
        // Creating the input for zip
        JLabel mealPlan = new JLabel(student.mealName);
        mealPlan.setBounds(200,775,200,25);
        panel.add(mealPlan);
        
     // Creating Label for zip
        JLabel parkingLabel = new JLabel("Has Parking");
        parkingLabel.setBounds(75,825,125,25);
        panel.add(parkingLabel);
        
        // Creating the input for zip
        JLabel parking = new JLabel(student.parking);
        parking.setBounds(200,825,200,25);
        panel.add(parking);
        
        
        // Creating back button
        JButton studentButton = new JButton("Back");
        studentButton.setBounds(100, 900, 130, 50);
        panel.add(studentButton);
        studentButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				adminStudentInfoFrame.setVisible(false);
				adminSpecificHousingFrame.setVisible(true);
			}
        });
        
     // Creating confirm information button
        JButton confirmButton = new JButton("Remove Student");
        confirmButton.setBounds(300, 900, 130, 50);
        panel.add(confirmButton);
        confirmButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DeleteStudent.deleteStudentFromDB(student);
				AdminSpecificHousingDB houseInfo = AdminHousingDB.getResidentHallInfoAndStudentsFromDB(student.houseBuilding);
				AdminSpecificHousing.generateAdminSpecificHousingPage(adminHousingFrame, houseInfo);
				adminStudentInfoFrame.setVisible(false);
			}
        });
	}
}
