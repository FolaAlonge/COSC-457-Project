package towsonhousingdatabase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConfirmHousingPage {
	static void generateConfirmHousingPage(JFrame residentHallFrame) {
		System.out.println("You made it to the confirm housing page");
		
		JFrame confirmHousingFrame = new JFrame("Confirm Housing");
		confirmHousingFrame.setSize(550, 450);
		confirmHousingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// center the jframe on screen
		confirmHousingFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		confirmHousingFrame.add(panel);
		
		
		setUpPage(confirmHousingFrame, residentHallFrame, panel);
		confirmHousingFrame.setVisible(true);
	}
	
	public static void setUpPage(JFrame confirmHousingFrame, JFrame residentHallFrame, JPanel panel) {
		panel.setLayout(null);
		
		// Creating Label for Resident Hall
        JLabel label = new JLabel("Confirm Housing Page");
        label.setBounds(200,10,200,25);
        panel.add(label);
        
     // Creating Label for price
        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setBounds(140,100,100,25);
        panel.add(nameLabel);
        
     // Creating Label for actual price
        JLabel name = new JLabel("Bill Smith");
        name.setBounds(250,100,125,25);
        panel.add(name);

		
		// Creating Label for housing type
        JLabel housingTypeLabel = new JLabel("Housing Type");
        housingTypeLabel.setBounds(120,150,125,25);
        panel.add(housingTypeLabel);
        
        JLabel housingType = new JLabel("Resident Hall");
        housingType.setBounds(250,150,175,25);
        panel.add(housingType);
               
     // Creating Label for room type
        JLabel roomTypeLabel = new JLabel("Room Type:");
        roomTypeLabel.setBounds(140,200,100,25);
        panel.add(roomTypeLabel);
        
     // Creating room type
        JLabel roomType = new JLabel("4 Bed");
        roomType.setBounds(250,200,175,25);
        panel.add(roomType);
        
        
     // Creating Label for parking
        JLabel parkingLabel = new JLabel("Parking:");
        parkingLabel.setBounds(140,250,100,25);
        panel.add(parkingLabel);
        
     // Creating Label for parking
        JLabel parking = new JLabel("Yes");
        parking.setBounds(250,250,175,25);
        panel.add(parking);
        
     // Creating Label for meal plan
        JLabel mealPlanLabel = new JLabel("Meal Plan:");
        mealPlanLabel.setBounds(140,300,100,25);
        panel.add(mealPlanLabel);
        
     // Creating meal plan
        JLabel mealPlan = new JLabel("14 meals per week");
        mealPlan.setBounds(250,300,175,25);
        panel.add(mealPlan);
	
		// Creating back button
	    JButton backButton = new JButton("Back");
	    backButton.setBounds(25, 10, 70, 25);
	    panel.add(backButton);
	    backButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				confirmHousingFrame.setVisible(false);
				residentHallFrame.setVisible(true);
			}
	    });
	    
	    
	    // Creating confirm information button
	    JButton confirmHousingLeaseButton = new JButton("Confirm Housing Lease");
	    confirmHousingLeaseButton.setBounds(100, 350, 300, 50);
	    panel.add(confirmHousingLeaseButton);
	    confirmHousingLeaseButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				confirmHousingFrame.setVisible(false);
				LandingPage.placeComponents();
			}
	    });
	}
}
