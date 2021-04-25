package towsonhousingdatabase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConfirmHousingPage {
	static void generateConfirmHousingPage(JFrame residentHallFrame, Student student) {
		System.out.println("You made it to the confirm housing page");
		
		JFrame confirmHousingFrame = new JFrame("Confirm Housing");
		confirmHousingFrame.setSize(550, 500);
		confirmHousingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// center the jframe on screen
		confirmHousingFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		confirmHousingFrame.add(panel);
		
		
		setUpPage(confirmHousingFrame, residentHallFrame, panel, student);
		confirmHousingFrame.setVisible(true);
	}
	
	public static void setUpPage(JFrame confirmHousingFrame, JFrame residentHallFrame, JPanel panel, Student student) {
		panel.setLayout(null);
		
		int addToRow = 0;
		if (student.residentHall) {
			addToRow -= 50;
		}
		
		// Creating Label for Resident Hall
        JLabel label = new JLabel("Confirm Housing Page");
        label.setBounds(200,10,200,25);
        panel.add(label);
        
     // Creating Label for price
        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setBounds(140,100,100,25);
        panel.add(nameLabel);
        
     // Creating Label for actual price
        JLabel name = new JLabel(student.firstName + " " + student.lastName);
        name.setBounds(250,100,125,25);
        panel.add(name);

		
		// Creating Label for housing type
        JLabel housingTypeLabel = new JLabel("Housing Type:");
        housingTypeLabel.setBounds(140,150,125,25);
        panel.add(housingTypeLabel);
        
        if (student.apartment) {
        	 JLabel housingType = new JLabel("Apartment");
             housingType.setBounds(250,150,175,25);
             panel.add(housingType);
             
             JLabel housingLocationLabel = new JLabel("Housing Location:");
             housingLocationLabel.setBounds(140,200,110,25);
             panel.add(housingLocationLabel);
             
             JLabel housingLocation = new JLabel(student.apartmentLocation);
             housingLocation.setBounds(250,200,175,25);
             panel.add(housingLocation);
                    
             // Creating Label for room type
             JLabel bedLabel = new JLabel("Bed Space:");
             bedLabel.setBounds(140,250,100,25);
             panel.add(bedLabel);
             
             // Creating room type
             JLabel bedSpace = new JLabel(student.bed);
             bedSpace.setBounds(250,250,175,25);
             panel.add(bedSpace);
        }
        
        if (student.residentHall) {
        	JLabel housingType = new JLabel("Resident Hall");
            housingType.setBounds(250,150,175,25);
            panel.add(housingType);
            
            JLabel housingLocationLabel = new JLabel("Housing Location:");
            housingLocationLabel.setBounds(140,200,110,25);
            panel.add(housingLocationLabel);
            
         // Creating Label for room type
            JLabel housingLocation = new JLabel(student.residentHallLocation);
            housingLocation.setBounds(250,200,175,25);
            panel.add(housingLocation);
        }
        
        
     // Creating Label for parking
        JLabel parkingLabel = new JLabel("Parking:");
        parkingLabel.setBounds(140,300 + addToRow,100,25);
        panel.add(parkingLabel);
        
     // Creating Label for parking
        JLabel parking = new JLabel(student.parking);
        parking.setBounds(250,300 + addToRow,175,25);
        panel.add(parking);
        
     // Creating Label for meal plan
        JLabel mealPlanLabel = new JLabel("Meal Plan:");
        mealPlanLabel.setBounds(140,350 + addToRow,100,25);
        panel.add(mealPlanLabel);
        
     // Creating meal plan
        JLabel mealPlan = new JLabel(student.mealPlan);
        mealPlan.setBounds(250,350 + addToRow,175,25);
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
	    confirmHousingLeaseButton.setBounds(100, 400 + addToRow, 300, 50);
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
