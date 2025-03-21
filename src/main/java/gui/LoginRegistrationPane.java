package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class LoginRegistrationPane extends JPanel {

	private static final long serialVersionUID = 1L;
	private static String usernamePrompt = "Username";
	private static String passwordPrompt = "Password";
	
	private JPasswordField passwordField;
	private JTextField txtUsername;
	private JTextField usernameField;
	private JTextField emailField;

	/**
	 * Create the panel.
	 */
	public LoginRegistrationPane() {
		setLayout(new CardLayout(0, 0));
		setBounds(0, 0, 450, 300);
		
		JPanel loginPane = new JPanel();
		add(loginPane, "name_10093064574100");
		
		loginPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (Arrays.equals(passwordField.getPassword(), passwordPrompt.toCharArray())){
					passwordField.setText("");
					passwordField.setEchoChar('*');
				}
			}
			public void focusLost(FocusEvent e) {
				if (passwordField.getPassword().length == 0){							
					passwordField.setText(passwordPrompt);
					passwordField.setEchoChar((char)0);
				}
			}
		});
		passwordField.setText(passwordPrompt);
		passwordField.setBounds(132, 129, 205, 35);
		passwordField.setToolTipText("Password");
		passwordField.setColumns(1);
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		loginPane.add(passwordField);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (txtUsername.getText().equals(usernamePrompt)) {
					txtUsername.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if (txtUsername.getText().equals("")) {
					txtUsername.setText(usernamePrompt);
				}
			}
		});
		txtUsername.setBounds(132, 83, 205, 35);
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername.setText("Username");
		loginPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton loginBtn = new JButton("Log in");
		loginBtn.setBounds(182, 225, 89, 23);
		loginBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Add login authentication here
				// Check if password is strong enough
			}
		});
		loginPane.add(loginBtn);
		
		JLabel signInLabel = new JLabel("Sign in");
		signInLabel.setBounds(182, 11, 89, 35);
		signInLabel.setHorizontalAlignment(SwingConstants.CENTER);
		signInLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		loginPane.add(signInLabel);
		
		JButton registrationPaneChangeBtn = new JButton("Register");
		registrationPaneChangeBtn.setBounds(182, 259, 89, 23);
		registrationPaneChangeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Add registration pane change logic here
			}
		});
		loginPane.add(registrationPaneChangeBtn);
		
		// Registration Pane Construction
		JPanel registrationPane = new JPanel();
		add(registrationPane, "name_10093083458200");
		
		registrationPane.setLayout(null);
		
		JLabel lblRegistration = new JLabel("Registration");
		lblRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistration.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRegistration.setBounds(163, 11, 119, 35);
		registrationPane.add(lblRegistration);
		
		usernameField = new JTextField();
		usernameField.setText("Username");
		usernameField.setHorizontalAlignment(SwingConstants.LEFT);
		usernameField.setColumns(10);
		usernameField.setBounds(121, 73, 205, 35);
		registrationPane.add(usernameField);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Password");
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setColumns(1);
		passwordField.setBounds(121, 165, 205, 35);
		registrationPane.add(passwordField);
		
		emailField = new JTextField();
		emailField.setText("Email");
		emailField.setHorizontalAlignment(SwingConstants.LEFT);
		emailField.setColumns(10);
		emailField.setBounds(121, 119, 205, 35);
		registrationPane.add(emailField);
		
		JButton registerationBtn = new JButton("Register");
		registerationBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Add registration authentication logic here
				// Also check if password is strong enough
			}
		});
		registerationBtn.setBounds(179, 247, 89, 23);
		registrationPane.add(registerationBtn);

	}

}
