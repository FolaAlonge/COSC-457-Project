package towsonhousingdatabase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class StudentInfo {
	static void generateStudentInfoPage(JFrame landingFrame) {
		System.out.println("You make it to the other class");
		landingFrame.setVisible(false);
		
		JFrame studentInfoFrame = new JFrame("Student Information");
		studentInfoFrame.setSize(550, 750);
		studentInfoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// center the jframe on screen
		studentInfoFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		studentInfoFrame.add(panel);
		
		
		setUpPage(landingFrame, studentInfoFrame, panel);
		studentInfoFrame.setVisible(true);
	}
	
	public static void setUpPage(JFrame landingFrame, JFrame studentInfoFrame, JPanel panel) {
		panel.setLayout(null);
		
		// Creating JLabel
        JLabel userLabel = new JLabel("Student Information Form");
        userLabel.setBounds(180,10,160,25);
        panel.add(userLabel);
        
        // Creating Label for first name
        JLabel fNameLabel = new JLabel("First Name");
        fNameLabel.setBounds(75,75,125,25);
        panel.add(fNameLabel);
        
        // Creating the input for first name
        JTextField fNameInput = new JTextField();
        fNameInput.setBounds(200,75,200,25);
        panel.add(fNameInput);
        
        
        // Creating Label for last name
        JLabel lNameLabel = new JLabel("Last Name");
        lNameLabel.setBounds(75,125,125,25);
        panel.add(lNameLabel);
        
        // Creating the input for last name
        JTextField lNameInput = new JTextField();
        lNameInput.setBounds(200,125,200,25);
        panel.add(lNameInput);
        
        // Creating Label for SSN
        JLabel ssnLabel = new JLabel("SSN");
        ssnLabel.setBounds(75,175,125,25);
        panel.add(ssnLabel);
        
        // Creating the input for SSN
        JTextField ssnInput = new JTextField();
        ssnInput.setBounds(200,175,200,25);
        panel.add(ssnInput);
        
        // Creating Label for # of credits
        JLabel creditsLabel = new JLabel("Number of Credits");
        creditsLabel.setBounds(75,225,125,25);
        panel.add(creditsLabel);
        
        // Creating the input for # of credits
        JTextField creditsInput = new JTextField();
        creditsInput.setBounds(200,225,200,25);
        panel.add(creditsInput);
        
        // Creating Label for Student ID
        JLabel studentIDLabel = new JLabel("Student ID");
        studentIDLabel.setBounds(75,275,125,25);
        panel.add(studentIDLabel);
        
        // Creating the input for Student ID
        JTextField studentIDInput = new JTextField();
        studentIDInput.setBounds(200,275,200,25);
        panel.add(studentIDInput);
        
        // Creating Label for email
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(75,325,125,25);
        panel.add(emailLabel);
        
        // Creating the input for email
        JTextField emailInput = new JTextField();
        emailInput.setBounds(200,325,200,25);
        panel.add(emailInput);
        
        // Creating Label for phone #
        JLabel phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(75,375,125,25);
        panel.add(phoneLabel);
        
        // Creating the input for phone #
        JTextField phoneInput = new JTextField();
        phoneInput.setBounds(200,375,200,25);
        panel.add(phoneInput);
        
        // Creating Label for street
        JLabel streetLabel = new JLabel("Street");
        streetLabel.setBounds(75,425,125,25);
        panel.add(streetLabel);
        
        // Creating the input for street
        JTextField streetInput = new JTextField();
        streetInput.setBounds(200,425,200,25);
        panel.add(streetInput);
        
        // Creating Label for city
        JLabel cityLabel = new JLabel("City");
        cityLabel.setBounds(75,475,125,25);
        panel.add(cityLabel);
        
        // Creating the input for city
        JTextField cityInput = new JTextField();
        cityInput.setBounds(200,475,200,25);
        panel.add(cityInput);
        
        // Creating Label for state
        JLabel stateLabel = new JLabel("State");
        stateLabel.setBounds(75,525,125,25);
        panel.add(stateLabel);
        
        // Creating the input for state
        JTextField stateInput = new JTextField();
        stateInput.setBounds(200,525,200,25);
        panel.add(stateInput);
        
        // Creating Label for zip
        JLabel zipLabel = new JLabel("Zip");
        zipLabel.setBounds(75,575,125,25);
        panel.add(zipLabel);
        
        // Creating the input for zip
        JTextField zipInput = new JTextField();
        zipInput.setBounds(200,575,200,25);
        panel.add(zipInput);
        
        
        // Creating back button
        JButton studentButton = new JButton("Back");
        studentButton.setBounds(100, 650, 100, 50);
        panel.add(studentButton);
        studentButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				studentInfoFrame.setVisible(false);
				landingFrame.setVisible(true);
			}
        });
        
     // Creating confirm information button
        JButton confirmButton = new JButton("Confirm");
        confirmButton.setBounds(300, 650, 100, 50);
        panel.add(confirmButton);
        confirmButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				studentInfoFrame.setVisible(false);
				PickHousingOption.generateHousingOptionPage(studentInfoFrame);
			}
        });
	}
}
