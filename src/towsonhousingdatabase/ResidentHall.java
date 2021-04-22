package towsonhousingdatabase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ResidentHall {
	static void generateResidentHallPage(JFrame housingOptionFrame, Student student) {
		System.out.println("You made it to the option page");
		
		JFrame residentHallFrame = new JFrame("Resident Hall");
		residentHallFrame.setSize(550, 450);
		residentHallFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// center the jframe on screen
		residentHallFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		residentHallFrame.add(panel);
		
		
		setUpPage(residentHallFrame, housingOptionFrame, panel, student);
		residentHallFrame.setVisible(true);
	}

	public static void setUpPage(JFrame residentHallFrame, JFrame housingOptionFrame, JPanel panel, Student student) {
		panel.setLayout(null);
		
		// Creating Label for Resident Hall
        JLabel label = new JLabel("Resident Hall");
        label.setBounds(200,10,125,25);
        panel.add(label);
        
     // Creating Label for price
        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setBounds(140,100,100,25);
        panel.add(priceLabel);
        
     // Creating Label for actual price
        JLabel actualPriceLabel = new JLabel("$3,816");
        actualPriceLabel.setBounds(250,100,125,25);
        panel.add(actualPriceLabel);

		
		// Creating Label for Hall options
        JLabel hallOptionLabel = new JLabel("Hall Options");
        hallOptionLabel.setBounds(120,150,125,25);
        panel.add(hallOptionLabel);
        
        // Creating the input for Hall options
        String halls[] = {"Glen Complex", "Newell Hall", "Richmond Hall"};
        
        JComboBox hallDropdown = new JComboBox(halls);
        hallDropdown.setBounds(250,150,175,25);
        panel.add(hallDropdown);
               
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
        String mealPlan[] = {"10 meals per Week", "14 meals per Week", "19 meals per Week", "21 meals per Week", "Unlimited meals per Week"};
        
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
				residentHallFrame.setVisible(false);
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
				
				student.setResidentHallOption(hallDropdown.getSelectedItem());
				student.setParking(parkingDropdown.getSelectedItem());
				student.setMealPlan(mealPlanDropdown.getSelectedItem());
				residentHallFrame.setVisible(false);
				ConfirmHousingPage.generateConfirmHousingPage(residentHallFrame, student);
			}
	    });
	}
}
