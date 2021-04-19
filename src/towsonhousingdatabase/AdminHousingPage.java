package towsonhousingdatabase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminHousingPage {
	static void generateAdminHousingPage(JFrame adminLoginFrame) {
		System.out.println("You make it to the admin housing locations");
		
		JFrame adminHousingFrame = new JFrame("Student Information");
		adminHousingFrame.setSize(550, 400);
		adminHousingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// center the jframe on screen
		adminHousingFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		adminHousingFrame.add(panel);
		
		
		setUpPage(adminLoginFrame, adminHousingFrame, panel);
		adminHousingFrame.setVisible(true);
	}
	
	public static void setUpPage(JFrame adminLoginFrame, JFrame adminHousingFrame, JPanel panel) {
		panel.setLayout(null);
		
		// Creating JLabel
        JLabel housingLocationLabel = new JLabel("Housing Locations");
        housingLocationLabel.setBounds(220, 10,160,25);
        panel.add(housingLocationLabel);
        
        // Creating back button
        JButton backButton = new JButton("Log Out");
        backButton.setBounds(25, 10, 120, 25);
        panel.add(backButton);
        backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				adminHousingFrame.setVisible(false);
				adminLoginFrame.setVisible(true);
			}
        });
        
        JLabel residentHallsLabel = new JLabel("Resident Halls");
        residentHallsLabel.setBounds(100,50,160,25);
        panel.add(residentHallsLabel);
        
        JLabel apartmentsLabel = new JLabel("Apartment");
        apartmentsLabel.setBounds(350, 50, 160,25);
        panel.add(apartmentsLabel);
        
		// Creating glen complex button
	    JButton glenComplexButton = new JButton("Glen Complex");
	    glenComplexButton.setBounds(75, 100, 125, 50);
	    panel.add(glenComplexButton);
	    glenComplexButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				adminHousingFrame.setVisible(false);
				AdminSpecificHousing.generateAdminSpecificHousingPage(adminHousingFrame);
			}
	    });
	    
	    // Creating newell hall button
	    JButton newellHallButton = new JButton("Newell Hall");
	    newellHallButton.setBounds(75, 175, 125, 50);
	    panel.add(newellHallButton);
	    newellHallButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				adminHousingFrame.setVisible(false);
				AdminSpecificHousing.generateAdminSpecificHousingPage(adminHousingFrame);
			}
	    });
	    
	    // Creating richmond hall button
	    JButton richmondHallButton = new JButton("Richmond Hall");
	    richmondHallButton.setBounds(75, 250, 125, 50);
	    panel.add(richmondHallButton);
	    richmondHallButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				adminHousingFrame.setVisible(false);
				AdminSpecificHousing.generateAdminSpecificHousingPage(adminHousingFrame);
			}
	    });
	    
	    // Creating richmond hall button
	    JButton carrollHallButton = new JButton("Carroll Hall");
	    carrollHallButton.setBounds(325, 100, 125, 50);
	    panel.add(carrollHallButton);
	    carrollHallButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				adminHousingFrame.setVisible(false);
				AdminSpecificHousing.generateAdminSpecificHousingPage(adminHousingFrame);
			}
	    });
	    
	    // Creating richmond hall button
	    JButton marshallHallButton = new JButton("Marshall Hall");
	    marshallHallButton.setBounds(325, 175, 125, 50);
	    panel.add(marshallHallButton);
	    marshallHallButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				adminHousingFrame.setVisible(false);
				AdminSpecificHousing.generateAdminSpecificHousingPage(adminHousingFrame);
			}
	    });
	    
	 // Creating richmond hall button
	    JButton towsonRunButton = new JButton("Towson Run");
	    towsonRunButton.setBounds(325, 250, 125, 50);
	    panel.add(towsonRunButton);
	    towsonRunButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				adminHousingFrame.setVisible(false);
				AdminSpecificHousing.generateAdminSpecificHousingPage(adminHousingFrame);
			}
	    });
	}
}
