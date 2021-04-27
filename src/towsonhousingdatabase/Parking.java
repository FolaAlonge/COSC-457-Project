package towsonhousingdatabase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Parking {
	static void generateParkingPage(JFrame housingFrame, Student student) {
		System.out.println("You made it to the option page");
		
		JFrame parkingFrame = new JFrame("Parking");
		parkingFrame.setSize(550, 400);
		parkingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// center the jframe on screen
		parkingFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		parkingFrame.add(panel);
		
		
		setUpPage(parkingFrame, housingFrame, panel, student);
		parkingFrame.setVisible(true);
	}
	public static void setUpPage(JFrame parkingFrame, JFrame housingFrame, JPanel panel, Student student) {
		panel.setLayout(null);
		
		// Creating Label for Resident Hall
        JLabel label = new JLabel("Parking");
        label.setBounds(200,10,125,25);
        panel.add(label);
        
     // Creating Label for parking
        JLabel parkingLabel = new JLabel("Parking Option:");
        parkingLabel.setBounds(140,100,100,25);
        panel.add(parkingLabel);
        
     // Creating the input for parking
        String parking[] = {"No", "Yes"};
        
        JComboBox parkingDropdown = new JComboBox(parking);
        parkingDropdown.setBounds(250,100,125,25);
        panel.add(parkingDropdown);
        
     // Creating Label for first name
        JLabel vehicleMakeLabel = new JLabel("Vehicle Make");
        vehicleMakeLabel.setBounds(75,150,125,25);
        panel.add(vehicleMakeLabel);
        
     // Creating the input for first name
        JTextField vehicleMake = new JTextField();
        vehicleMake.setBounds(200,150,200,25);
        panel.add(vehicleMake);
        
        
        // Creating Label for first name
        JLabel vehicleModelLabel = new JLabel("Vehicle Model");
        vehicleModelLabel.setBounds(75,200,125,25);
        panel.add(vehicleModelLabel);
        
     // Creating the input for first name
        JTextField vehicleModel = new JTextField();
        vehicleModel.setBounds(200,200,200,25);
        panel.add(vehicleModel);
        
        
     // Creating Label for first name
        JLabel vehicleColorLabel = new JLabel("Vehicle Color");
        vehicleColorLabel.setBounds(75,250,125,25);
        panel.add(vehicleColorLabel);
        
     // Creating the input for first name
        JTextField vehicleColor = new JTextField();
        vehicleColor.setBounds(200,250,200,25);
        panel.add(vehicleColor);
        
     // Creating Label for first name
        JLabel plateNumberLabel = new JLabel("Plate Number");
        plateNumberLabel.setBounds(75,300,125,25);
        panel.add(plateNumberLabel);
        
     // Creating the input for first name
        JTextField plateNumber = new JTextField();
        plateNumber.setBounds(200, 300,200,25);
        panel.add(plateNumber);
    
		// Creating back button
	    JButton backButton = new JButton("Back");
	    backButton.setBounds(25, 10, 70, 25);
	    panel.add(backButton);
	    backButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				parkingFrame.setVisible(false);
				housingFrame.setVisible(true);
			}
	    });
	    
	    
	 // Creating confirm information button
	    JButton confirmHousingPageButton = new JButton("Continue to Confirmation Page");
	    confirmHousingPageButton.setBounds(100, 350, 300, 50);
	    panel.add(confirmHousingPageButton);
	    confirmHousingPageButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				parkingFrame.setVisible(false);
				student.setParking(parkingDropdown.getSelectedItem());
				student.setVehicleInfo(vehicleMake.getText(), vehicleModel.getText(), vehicleColor.getText(), plateNumber.getText());
				ConfirmHousingPage.generateConfirmHousingPage(parkingFrame, student);
			}
	    });
	}
}
