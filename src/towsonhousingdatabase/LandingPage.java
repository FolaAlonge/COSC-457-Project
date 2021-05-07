package towsonhousingdatabase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField; 

public class LandingPage {
	  
    public static void main(String[] args) {
    	placeComponents();
        
    }

    public static void placeComponents() {
    	
    	// Creating instance of JFrame
        JFrame frame = new JFrame("Towson Housing");
        // Setting the width and height of frame
        frame.setSize(550, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
     // center the jframe on screen
        frame.setLocationRelativeTo(null);

        /* Creating panel. This is same as a div tag in HTML
         * We can create several panels and add them to specific 
         * positions in a JFrame. Inside panels we can add text 
         * fields, buttons and other components.
         */
        JPanel panel = new JPanel();    
        // adding panel to frame
        frame.add(panel);

        // Setting the frame visibility to true
        frame.setVisible(true);

        /* We will discuss about layouts in the later sections
         * of this tutorial. For now we are setting the layout 
         * to null
         */
        panel.setLayout(null);

        // Creating JLabel
        JLabel userLabel = new JLabel("Towson Housing");
        userLabel.setBounds(220,20,120,25);
        panel.add(userLabel);

        
        // Creating student housing button 
        JButton studentButton = new JButton("Sign up for Student Housing");
        studentButton.setBounds(50, 100, 200, 50);
        panel.add(studentButton);
        studentButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				StudentInfo.generateStudentInfoPage(frame);
			}
        });
        
     // Creating student housing button 
        JButton studentCancelHousingButton = new JButton("Student Cancel Housing");
        studentCancelHousingButton.setBounds(50, 175, 200, 50);
        panel.add(studentCancelHousingButton);
        studentCancelHousingButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				StudentCancelHousingPage.generateHousingOptionPage(frame);
			}
        });
        
        // Creating admin button
        JButton adminButton = new JButton("Admin");
        adminButton.setBounds(300, 100, 200, 50);
        panel.add(adminButton);
        adminButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AdminLogin.generateAdminLoginPage(frame);
			}
        });
    }
}
