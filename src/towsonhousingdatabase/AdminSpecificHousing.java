package towsonhousingdatabase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminSpecificHousing {
	static void generateAdminSpecificHousingPage(JFrame adminHousingFrame, AdminSpecificHousingDB houseInfo) {
		System.out.println("You make it to the admin housing locations");
		
		JFrame adminSpecificHousingFrame = new JFrame("Housing");
		adminSpecificHousingFrame.setSize(750, 400);
		adminSpecificHousingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// center the jframe on screen
		adminSpecificHousingFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		adminSpecificHousingFrame.add(panel);
		
		
		setUpPage(adminHousingFrame, adminSpecificHousingFrame, panel, houseInfo);
		adminSpecificHousingFrame.setVisible(true);
	}
	public static void setUpPage(JFrame adminHousingFrame, JFrame adminSpecificHousingFrame, JPanel panel, AdminSpecificHousingDB houseInfo) {
		panel.setLayout(null);
		
		// Creating JLabel
        JLabel housingLocationLabel = new JLabel(houseInfo.buildingName);
        housingLocationLabel.setBounds(250, 10,160,25);
        panel.add(housingLocationLabel);
        
        // Creating back button
        JButton backButton = new JButton("Back");
        backButton.setBounds(50, 10, 70, 25);
        panel.add(backButton);
        backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				adminSpecificHousingFrame.setVisible(false);
				adminHousingFrame.setVisible(true);
			}
        });
        
        // Creating Label for price
        JLabel numberBedLabel = new JLabel("Number of Beds:");
        numberBedLabel.setBounds(180,50,150,25);
        panel.add(numberBedLabel);
        
        // Creating Label for actual price
        JLabel numberBeds = new JLabel(String.valueOf(houseInfo.numOfBeds));
        numberBeds.setBounds(340,50,125,25);
        panel.add(numberBeds);
        
        // Creating Label for price
        JLabel numberBedsLeftLabel = new JLabel("Number of Beds Left:");
        numberBedsLeftLabel.setBounds(180,75,150,25);
        panel.add(numberBedsLeftLabel);
        
        // Creating Label for actual price
        JLabel numberBedsLeft = new JLabel(String.valueOf(houseInfo.numOfBedsLeft));
        numberBedsLeft.setBounds(340,75,125,25);
        panel.add(numberBedsLeft);
        
        // Creating Label for 
        JLabel location = new JLabel("Students In Housing Location");
        location.setBounds(220,120,200,25);
        panel.add(location);
        
        String[] names = houseInfo.students;
        int row = 0;
        int id = 0;
        
        for (int i = 0; i < names.length; i++) {
        	
        	
        	if (i % 3 == 0) {
        		++row;
        		id++;
        		// Creating back button
        		JButton studentButton = new JButton("Student: " + names[i]);
        		
        		studentButton.setBounds(30, 125 + (row * 50), 200, 25);
        		panel.add(studentButton);
        		String ids = houseInfo.studentIDs[i];
        		studentButton.addActionListener(new ActionListener() {
        			
        			@Override
        			public void actionPerformed(ActionEvent e) {
        				AdminStudent student;
        				if (houseInfo.hall) {
        					student = AdminHousingDB.getResidentHallStudentFromDB(ids);
        				} else {
        					student = null;
        				}
        				
        				adminSpecificHousingFrame.setVisible(false);
        				AdminStudentInfo.generateAdminStudentInfoPage(adminSpecificHousingFrame, student, adminHousingFrame);
        			}
        		});
        	} else if (i % 3 == 1) {
        		id++;
        		// Creating back button
        		JButton studentButton = new JButton("Student: " + names[i]);
        		studentButton.setBounds(250, 125 + (row * 50), 200, 25);
        		panel.add(studentButton);
        		String ids = houseInfo.studentIDs[i];
        		studentButton.addActionListener(new ActionListener() {
        			
        			@Override
        			public void actionPerformed(ActionEvent e) {
        				AdminStudent student;
        				if (houseInfo.hall) {
        					student = AdminHousingDB.getResidentHallStudentFromDB(ids);
        				} else {
        					student = null;
        				}
        				adminSpecificHousingFrame.setVisible(false);
        				AdminStudentInfo.generateAdminStudentInfoPage(adminSpecificHousingFrame, student, adminHousingFrame);
        			}
        		});
        	} else if (i % 3 == 2) {
        		id++;
        		// Creating back button
        		JButton studentButton = new JButton("Student: " + names[i]);
        		studentButton.setBounds(470, 125 + (row * 50), 200, 25);
        		panel.add(studentButton);
        		String ids = houseInfo.studentIDs[i];
        		studentButton.addActionListener(new ActionListener() {
        			
        			@Override
        			public void actionPerformed(ActionEvent e) {
        				AdminStudent student;
        				if (houseInfo.hall) {
        					student = AdminHousingDB.getResidentHallStudentFromDB(ids);
        				} else {
        					student = null;
        				}
        				adminSpecificHousingFrame.setVisible(false);
        				AdminStudentInfo.generateAdminStudentInfoPage(adminSpecificHousingFrame, student, adminHousingFrame);
        			}
        		});
        	}
        }
	}
}
