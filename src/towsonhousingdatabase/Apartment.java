package towsonhousingdatabase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Apartment {
	static void generateApartmentPage(JFrame housingOptionFrame, Student student) {
System.out.println("You made it to the option page");
		
		JFrame apartmentFrame = new JFrame("Resident Hall");
		apartmentFrame.setSize(550, 450);
		apartmentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// center the jframe on screen
		apartmentFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		apartmentFrame.add(panel);
		
		
		setUpPage(apartmentFrame, housingOptionFrame, panel, student);
		apartmentFrame.setVisible(true);
	}
	public static void setUpPage(JFrame apartmentFrame, JFrame housingOptionFrame, JPanel panel, Student student) {
		panel.setLayout(null);

		
		// Creating Label for Resident Hall
        JLabel label = new JLabel("Apartment");
        label.setBounds(200,10,125,25);
        panel.add(label);
        
     // Creating Label for Hall options
        JLabel apartmentOptionLabel = new JLabel("Apartment Options");
        apartmentOptionLabel.setBounds(120,100,125,25);
        panel.add(apartmentOptionLabel);
        
        String apartments[] = {"Carroll Hall", "Marshall Hall", "Towson Run"};
        
        JComboBox apartmentDropdown = new JComboBox(apartments);
        apartmentDropdown.setBounds(250,100,175,25);
        panel.add(apartmentDropdown);

		
		// Creating Label for Hall options
        JLabel roomTypeLabel = new JLabel("Room Type");
        roomTypeLabel.setBounds(120,150,125,25);
        panel.add(roomTypeLabel);
        
        // Creating the input for Hall options
        String roomType[] = {"2 Bed", "4 Bed"};
        
        JComboBox roomTypeDropdown = new JComboBox(roomType);
        roomTypeDropdown.setBounds(250,150,175,25);
        panel.add(roomTypeDropdown);
               
     // Creating Label for parking
        JLabel parkingLabel = new JLabel("Parking:");
        parkingLabel.setBounds(140,200,100,25);
        panel.add(parkingLabel);
        
     // Creating the input for parking
        String parking[] = {"Yes", "No"};
        
        JComboBox parkingDropdown = new JComboBox(parking);
        parkingDropdown.setBounds(250,200,175,25);
        panel.add(parkingDropdown);
        
     // Creating Label for meal plan
        JLabel mealPlanLabel = new JLabel("Meal Plan:");
        mealPlanLabel.setBounds(140,250,100,25);
        panel.add(mealPlanLabel);
        
     // Creating the input for meal plan
        String mealPlan[] = {"None", "10 meals per Week", "14 meals per Week", "19 meals per Week", "21 meals per Week", "Unlimited meals per Week"};
        
        JComboBox mealPlanDropdown = new JComboBox(mealPlan);
        mealPlanDropdown.setBounds(250,250,175,25);
        panel.add(mealPlanDropdown);
	
		// Creating back button
	    JButton backButton = new JButton("Back");
	    backButton.setBounds(25, 10, 70, 25);
	    panel.add(backButton);
	    backButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				apartmentFrame.setVisible(false);
				housingOptionFrame.setVisible(true);
			}
	    });
	    
	    
	 // Creating confirm information button
	    JButton confirmHousingPageButton = new JButton("Continue to Confirmation Page");
	    confirmHousingPageButton.setBounds(100, 300, 300, 50);
	    panel.add(confirmHousingPageButton);
	    confirmHousingPageButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				student.setApartmentOption(apartmentDropdown.getSelectedItem());
				student.setRoomType(roomTypeDropdown.getSelectedItem());
				student.setParking(parkingDropdown.getSelectedItem());
				student.setMealPlan(mealPlanDropdown.getSelectedItem());
				apartmentFrame.setVisible(false);
				ConfirmHousingPage.generateConfirmHousingPage(apartmentFrame, student);
			}
	    });
	}
}
