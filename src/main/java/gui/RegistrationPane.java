package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegistrationPane extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField emailField;

	/**
	 * Create the panel.
	 */
	public RegistrationPane() {
		setLayout(null);
		
		JLabel lblRegistration = new JLabel("Registration");
		lblRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistration.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRegistration.setBounds(163, 11, 119, 35);
		add(lblRegistration);
		
		usernameField = new JTextField();
		usernameField.setText("Username");
		usernameField.setHorizontalAlignment(SwingConstants.LEFT);
		usernameField.setColumns(10);
		usernameField.setBounds(121, 73, 205, 35);
		add(usernameField);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Password");
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setColumns(1);
		passwordField.setBounds(121, 165, 205, 35);
		add(passwordField);
		
		emailField = new JTextField();
		emailField.setText("Email");
		emailField.setHorizontalAlignment(SwingConstants.LEFT);
		emailField.setColumns(10);
		emailField.setBounds(121, 119, 205, 35);
		add(emailField);
		
		JButton registerationBtn = new JButton("Register");
		registerationBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Add registration athentication logic here
				// Also check if password is strong enough
			}
		});
		registerationBtn.setBounds(179, 247, 89, 23);
		add(registerationBtn);
	}
}
