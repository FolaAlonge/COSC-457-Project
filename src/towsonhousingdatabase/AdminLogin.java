package towsonhousingdatabase;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogin {
	static void generateAdminLoginPage(JFrame landingFrame) {
		System.out.println("You make it to the other class");
		
		JFrame adminLoginFrame = new JFrame("Admin Login");
		adminLoginFrame.setSize(550, 350);
		adminLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// center the jframe on screen
		adminLoginFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		adminLoginFrame.add(panel);
		
		adminLoginFrame.setVisible(true);
		setUpPage(landingFrame, adminLoginFrame, panel);
	}
	public static void setUpPage(JFrame landingFrame, JFrame adminLoginFrame, JPanel panel) {
		panel.setLayout(null);
		
		// Creating JLabel
        JLabel userLabel = new JLabel("Admin Login");
        userLabel.setBounds(220,10,160,25);
        panel.add(userLabel);
        
        // Creating back button
        JButton backButton = new JButton("Back");
        backButton.setBounds(25, 10, 70, 25);
        panel.add(backButton);
        backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				adminLoginFrame.setVisible(false);
				landingFrame.setVisible(true);
			}
        });
        
        // Creating Label for username
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(170,100,125,25);
        panel.add(usernameLabel);
        
        // Creating the input for username
        JTextField usernameInput = new JTextField();
        usernameInput.setBounds(170,125,200,25);
        panel.add(usernameInput);
        
        // Creating Label for password
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(170,150,125,25);
        panel.add(passwordLabel);
        
        // Creating the input for password
        JPasswordField passwordInput = new JPasswordField();
        passwordInput.setBounds(170,175,200,25);
        panel.add(passwordInput);
        
        // Creating login button
	    JButton loginButton = new JButton("Login");
	    loginButton.setBounds(180, 250, 150, 50);
	    panel.add(loginButton);
	    loginButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean correct = LoginDB.checkAuthentication(usernameInput.getText(), passwordInput.getPassword());
				System.out.println(correct);
				if (correct) {
					adminLoginFrame.setVisible(false);
					AdminHousingPage.generateAdminHousingPage(adminLoginFrame);
				} else {
					// Creating JLabel
			        JLabel wrongLabel = new JLabel("Username or Password is Incorrect");
			        wrongLabel.setForeground(Color.RED);
			        wrongLabel.setBounds(160,45, 250,25);
			        panel.add(wrongLabel);
			        
				}
				landingFrame.repaint();
			}
	    });
	}
}
