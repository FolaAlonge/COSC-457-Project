package towsonhousingdatabase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdminStudentInfo {
	static void generateAdminStudentInfoPage(JFrame adminSpecificHousingFrame) {
		System.out.println("You make it to the admin student info");
		
		JFrame adminStudentInfoFrame = new JFrame("Student Information");
		adminStudentInfoFrame.setSize(550, 750);
		adminStudentInfoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// center the jframe on screen
		adminStudentInfoFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		adminStudentInfoFrame.add(panel);
		
		
		setUpPage(adminSpecificHousingFrame, adminStudentInfoFrame, panel);
		adminStudentInfoFrame.setVisible(true);
	}
	public static void setUpPage(JFrame adminSpecificHousingFrame, JFrame adminStudentInfoFrame, JPanel panel) {
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
        JLabel fName = new JLabel("Bill");
        fName.setBounds(200,75,200,25);
        panel.add(fName);
        
        
        // Creating Label for last name
        JLabel lNameLabel = new JLabel("Last Name");
        lNameLabel.setBounds(75,125,125,25);
        panel.add(lNameLabel);
        
        // Creating the input for last name
        JLabel lName = new JLabel("Smith");
        lName.setBounds(200,125,200,25);
        panel.add(lName);
        
        
        // Creating Label for # of credits
        JLabel creditsLabel = new JLabel("Number of Credits");
        creditsLabel.setBounds(75,175,125,25);
        panel.add(creditsLabel);
        
        // Creating the input for # of credits
        JLabel credits = new JLabel("15");
        credits.setBounds(200,175,200,25);
        panel.add(credits);
        
        // Creating Label for Student ID
        JLabel studentIDLabel = new JLabel("Student ID");
        studentIDLabel.setBounds(75,225,125,25);
        panel.add(studentIDLabel);
        
        // Creating the input for Student ID
        JLabel studentID = new JLabel("238289");
        studentID.setBounds(200,225,200,25);
        panel.add(studentID);
        
        // Creating Label for email
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(75,275,125,25);
        panel.add(emailLabel);
        
        // Creating the input for email
        JLabel email = new JLabel("bsmith2@students.towson.edu");
        email.setBounds(200,275,275,25);
        panel.add(email);
        
        // Creating Label for phone #
        JLabel phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(75,325,125,25);
        panel.add(phoneLabel);
        
        // Creating the input for phone #
        JLabel phone = new JLabel("123-456-7890");
        phone.setBounds(200,325,200,25);
        panel.add(phone);
        
        // Creating Label for street
        JLabel streetLabel = new JLabel("Street");
        streetLabel.setBounds(75,375,125,25);
        panel.add(streetLabel);
        
        // Creating the input for street
        JLabel street = new JLabel("12345 Space Drive");
        street.setBounds(200,375,200,25);
        panel.add(street);
        
        // Creating Label for city
        JLabel cityLabel = new JLabel("City");
        cityLabel.setBounds(75,425,125,25);
        panel.add(cityLabel);
        
        // Creating the input for city
        JLabel city = new JLabel("Baltimore");
        city.setBounds(200,425,200,25);
        panel.add(city);
        
        // Creating Label for state
        JLabel stateLabel = new JLabel("State");
        stateLabel.setBounds(75,475,125,25);
        panel.add(stateLabel);
        
        // Creating the input for state
        JLabel state = new JLabel("Maryland");
        state.setBounds(200,475,200,25);
        panel.add(state);
        
        // Creating Label for zip
        JLabel zipLabel = new JLabel("Zip");
        zipLabel.setBounds(75,525,125,25);
        panel.add(zipLabel);
        
        // Creating the input for zip
        JLabel zip = new JLabel("21433");
        zip.setBounds(200,525,200,25);
        panel.add(zip);
        
        
        // Creating back button
        JButton studentButton = new JButton("Back");
        studentButton.setBounds(100, 600, 130, 50);
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
        confirmButton.setBounds(300, 600, 130, 50);
        panel.add(confirmButton);
        confirmButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				adminStudentInfoFrame.setVisible(false);
				adminSpecificHousingFrame.setVisible(true);
			}
        });
	}
}
