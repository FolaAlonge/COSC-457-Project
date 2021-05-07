package towsonhousingdatabase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudentCancelHousingPage {
	static void generateHousingOptionPage(JFrame LandingPageFrame) {
		System.out.println("You made it to the Cancel Student Housing Page");
		
		JFrame studentCancelHousingFrame = new JFrame("Pick Housing Option");
		studentCancelHousingFrame.setSize(550, 330);
		studentCancelHousingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// center the jframe on screen
		studentCancelHousingFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		studentCancelHousingFrame.add(panel);
		
		
		setUpPage(LandingPageFrame, studentCancelHousingFrame, panel);
		studentCancelHousingFrame.setVisible(true);
	}
	
	public static void setUpPage(JFrame LandingPageFrame, JFrame studentCancelHousingFrame, JPanel panel) {
		panel.setLayout(null);

		// Creating JLabel
        JLabel userLabel = new JLabel("Student Cancel Housing");
        userLabel.setBounds(180,10,160,25);
        panel.add(userLabel);
        
        // Creating back button
        JButton backButton = new JButton("Back");
        backButton.setBounds(25, 10, 70, 25);
        panel.add(backButton);
        backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				studentCancelHousingFrame.setVisible(false);
				LandingPageFrame.setVisible(true);
			}
        });
        
        // Creating confirm information button
        JLabel ssnLabel = new JLabel("Enter SSN:");
        ssnLabel.setBounds(100, 100, 100, 30);
        panel.add(ssnLabel);
      
        // Creating the input for SSN
        JTextField ssnInput = new JTextField();
        ssnInput.setBounds(220, 100, 200, 30);
        panel.add(ssnInput);
        
        // Creating confirm information button
        JLabel idLabel = new JLabel("Enter Student ID:");
        idLabel.setBounds(100, 150, 100, 30);
        panel.add(idLabel);
      
        // Creating the input for SSN
        JTextField idInput = new JTextField();
        idInput.setBounds(220, 150, 200, 30);
        panel.add(idInput);
        
     // Creating confirm information button
        JButton confirmButton = new JButton("Confirm Cancel Housing");
        confirmButton.setBounds(160, 210, 200, 50);
        panel.add(confirmButton);
        confirmButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RemoveStudentDB.removeStudentFromDB(ssnInput.getText(), idInput.getText());
				studentCancelHousingFrame.setVisible(false);
				LandingPageFrame.setVisible(true);
			}
        });
	}
}
