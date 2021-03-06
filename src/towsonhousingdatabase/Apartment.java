package towsonhousingdatabase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Apartment {
	static void generateApartmentPage(JFrame housingOptionFrame, Student student, String[] beds) {
System.out.println("You made it to the option page");
		
		JFrame apartmentFrame = new JFrame("Resident Hall");
		apartmentFrame.setSize(550, 450);
		apartmentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// center the jframe on screen
		apartmentFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		apartmentFrame.add(panel);
		
		
		setUpPage(apartmentFrame, housingOptionFrame, panel, student, beds);
		apartmentFrame.setVisible(true);
	}
	public static void setUpPage(JFrame apartmentFrame, JFrame housingOptionFrame, JPanel panel, Student student, String[] beds) {
		panel.setLayout(null);

		
		// Creating Label for Resident Hall
        JLabel label = new JLabel("Apartment");
        label.setBounds(200,10,125,25);
        panel.add(label);
        
     // Creating Label for Hall options
        JLabel lengthLabel = new JLabel("Lease Length");
        lengthLabel.setBounds(120,100,125,25);
        panel.add(lengthLabel);
        
        // Creating the input for Hall options
        String length[] = {"Academic Year", "Semester"};
        
        JComboBox leaseLengthDropdown = new JComboBox(length);
        leaseLengthDropdown.setBounds(250,100,175,25);
        panel.add(leaseLengthDropdown);
        
     // Creating Label for Hall options
        JLabel apartmentOptionLabel = new JLabel("Apartment Options");
        apartmentOptionLabel.setBounds(120,150,125,25);
        panel.add(apartmentOptionLabel);
        
        String apartments[] = {"Towson Run", "Carroll Hall", "Marshall Hall", "10 West"};
        
        JComboBox apartmentDropdown = new JComboBox(apartments);
        apartmentDropdown.setBounds(250,150,175,25);
        panel.add(apartmentDropdown);
        
     // Creating Label for meal plan
        JLabel floorLabel = new JLabel("Floor");
        floorLabel.setBounds(140,200,100,25);
        panel.add(floorLabel);
        
     // Creating the input for meal plan
        String floors[] = {"1", "2", "3", "4", "5"};
        
        JComboBox floorDropdown = new JComboBox(floors);
        floorDropdown.setBounds(250,200,175,25);
        panel.add(floorDropdown);
        
     // Creating Label for meal plan
        JLabel bedLabel = new JLabel("Bed Space:");
        bedLabel.setBounds(140,250,100,25);
        panel.add(bedLabel);
        
     // Creating the input for meal plan
        //String beds[] = {"CH-101A", "CH-101B", "CH-201A", "CH-201B", "CH-201C", "CH-201D"};
        
        JComboBox<String> bedDropdown = new JComboBox(beds);
        bedDropdown.setBounds(250,250,175,25);
        panel.add(bedDropdown);
        
        // Creating Label for meal plan
        JLabel mealPlanLabel = new JLabel("Meal Plan:");
        mealPlanLabel.setBounds(140,300,100,25);
        panel.add(mealPlanLabel);
        
     // Creating the input for meal plan
        String mealPlan[] = {"None", "10 meals per Week", "14 meals per Week", "19 meals per Week", "21 meals per Week", "Unlimited meals per Week"};
        
        JComboBox mealPlanDropdown = new JComboBox(mealPlan);
        mealPlanDropdown.setBounds(250,300,175,25);
        panel.add(mealPlanDropdown);
        student.setMealPlan(0, "None");
        
	
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
	    
	    
	    apartmentDropdown.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                	System.out.println("Changed the hall selected");
                	String[] beds = GetBeds.getBedsForApartmentFromDB(apartmentDropdown.getSelectedItem(), floorDropdown.getSelectedIndex() +1);
                	bedDropdown.removeAllItems();
                	System.out.println(beds.length);
                	for (int i = 0; i < beds.length; i++) {
                		bedDropdown.addItem(beds[i]);
                	}
                }
            }
        });
	    
	    floorDropdown.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                	System.out.println("Changed the floor selected");
                	String[] beds = GetBeds.getBedsForApartmentFromDB(apartmentDropdown.getSelectedItem(), floorDropdown.getSelectedIndex() +1);
                	bedDropdown.removeAllItems();
                	System.out.println(beds.length);
                	for (int i = 0; i < beds.length; i++) {
                		bedDropdown.addItem(beds[i]);
                	}
                }
            }
        });
	    
	    mealPlanDropdown.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                	student.setMealPlan(mealPlanDropdown.getSelectedIndex(), mealPlanDropdown.getSelectedItem());
                }
            }
        });
	    
	    
	 // Creating confirm information button
	    JButton continueToParkingButton = new JButton("Continue to Parking");
	    continueToParkingButton.setBounds(100, 350, 300, 50);
	    panel.add(continueToParkingButton);
	    continueToParkingButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				student.setApartmentOption(apartmentDropdown.getSelectedItem(), apartmentDropdown.getSelectedIndex() + 1);
				
				student.setBed(bedDropdown.getSelectedItem());
				student.setLeaseLength(leaseLengthDropdown.getSelectedItem());
				student.setFloor(floorDropdown.getSelectedIndex() + 1);
				apartmentFrame.setVisible(false);
				Parking.generateParkingPage(apartmentFrame, student);
			}
	    });
	}
}
