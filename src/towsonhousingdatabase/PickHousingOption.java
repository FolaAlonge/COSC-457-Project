package towsonhousingdatabase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PickHousingOption {
	static void generateHousingOptionPage(JFrame studentInfoFrame, Student student) {
		System.out.println("You made it to the option page");
		
		JFrame housingOptionFrame = new JFrame("Pick Housing Option");
		housingOptionFrame.setSize(550, 350);
		housingOptionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// center the jframe on screen
		housingOptionFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		housingOptionFrame.add(panel);
		
		
		setUpPage(studentInfoFrame, housingOptionFrame, panel, student);
		housingOptionFrame.setVisible(true);
	}
	
	public static void setUpPage(JFrame studentInfoFrame, JFrame housingOptionFrame, JPanel panel, Student student) {
		panel.setLayout(null);

		// Creating JLabel
        JLabel userLabel = new JLabel("Student Information Form");
        userLabel.setBounds(180,10,160,25);
        panel.add(userLabel);
        
        // Creating back button
        JButton backButton = new JButton("Back");
        backButton.setBounds(25, 10, 70, 25);
        panel.add(backButton);
        backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				housingOptionFrame.setVisible(false);
				studentInfoFrame.setVisible(true);
			}
        });
        
        // Creating confirm information button
        JButton residentHallButton = new JButton("Resident Hall");
        residentHallButton.setBounds(50, 100, 200, 50);
        panel.add(residentHallButton);
        residentHallButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				housingOptionFrame.setVisible(false);
				ResidentHall.generateResidentHallPage(housingOptionFrame, student);
			}
        });
        
     // Creating confirm information button
        JButton apartmentButton = new JButton("Apartment");
        apartmentButton.setBounds(300, 100, 200, 50);
        panel.add(apartmentButton);
        apartmentButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				housingOptionFrame.setVisible(false);
				Apartment.generateApartmentPage(housingOptionFrame, student);
			}
        });
	}
}
