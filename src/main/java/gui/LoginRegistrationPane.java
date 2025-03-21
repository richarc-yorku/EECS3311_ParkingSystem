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
	
	private static final String passwordPrompt = "Password";
	
	private static final LoginRegistrationPane pane = new LoginRegistrationPane();
	
	private JPasswordField passwordField;
	private JTextField userField;
	private JTextField newUserField;
	private JPasswordField newPasswordField;

	public static LoginRegistrationPane getPane() {
		return pane;
	}
	
	/**
	 * Create the panel.
	 */
	private LoginRegistrationPane() {
		setLayout(new CardLayout(0, 0));
		setBounds(0, 0, 1280, 720);
		
		JPanel loginPane = new JPanel();
		add(loginPane, "login");
		
		loginPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Dialog", Font.PLAIN, 16));
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
		passwordField.setBounds(505, 238, 205, 35);
		passwordField.setToolTipText("Password");
		passwordField.setColumns(1);
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		loginPane.add(passwordField);
		
		userField = new JTextField();
		userField.setFont(new Font("Dialog", Font.PLAIN, 16));
		userField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (userField.getText().equals("Email")) {
					userField.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if (userField.getText().equals("")) {
					userField.setText("Email");
				}
			}
		});
		userField.setBounds(505, 134, 205, 35);
		userField.setHorizontalAlignment(SwingConstants.CENTER);
		userField.setText("Email");
		userField.setColumns(10);
		loginPane.add(userField);
		
		
		JButton loginBtn = new JButton("Log in");
		loginBtn.setFont(new Font("Verdana", Font.PLAIN, 20));
		loginBtn.setBounds(526, 376, 150, 23);
		loginBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Add login authentication here

				
				((CardLayout)getParent().getLayout()).show(getParent(), "mainPage");
			}
		});
		loginPane.add(loginBtn);
		
		JLabel signInLbl = new JLabel("Sign in");
		signInLbl.setBounds(545, 11, 116, 35);
		signInLbl.setHorizontalAlignment(SwingConstants.CENTER);
		signInLbl.setFont(new Font("Verdana", Font.BOLD, 24));
		loginPane.add(signInLbl);
		
		JButton switchRegisterBtn = new JButton("Register");
		switchRegisterBtn.setFont(new Font("Verdana", Font.PLAIN, 20));
		switchRegisterBtn.setBounds(526, 440, 150, 23);
		switchRegisterBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Add registration pane change logic here
				((CardLayout)getLayout()).show(getPane(), "register");
			}
		});
		loginPane.add(switchRegisterBtn);
		
		// Registration Pane Construction
		JPanel registrationPane = new JPanel();
		add(registrationPane, "register");
		
		registrationPane.setLayout(null);
		
		JLabel registerLbl = new JLabel("Registration");
		registerLbl.setHorizontalAlignment(SwingConstants.CENTER);
		registerLbl.setFont(new Font("Verdana", Font.BOLD, 24));
		registerLbl.setBounds(526, 11, 165, 35);
		registrationPane.add(registerLbl);
		
		newUserField = new JTextField();
		newUserField.setFont(new Font("Dialog", Font.PLAIN, 16));
		newUserField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (newUserField.getText().equals("Email")) {
					newUserField.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if (newUserField.getText().equals("")) {
					newUserField.setText("Email");
				}
			}
		});
		newUserField.setBounds(505, 134, 205, 35);
		newUserField.setHorizontalAlignment(SwingConstants.CENTER);
		newUserField.setText("Email");
		newUserField.setColumns(10);
		registrationPane.add(newUserField);
		
		JButton registerBtn = new JButton("Register");
		registerBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Add registration authentication logic here
				// Also check if password is strong enough
			}
		});
		registerBtn.setFont(new Font("Verdana", Font.PLAIN, 20));
		registerBtn.setBounds(526, 376, 150, 23);
		registrationPane.add(registerBtn);
		
		newPasswordField = new JPasswordField();
		newPasswordField.setFont(new Font("Dialog", Font.PLAIN, 16));
		newPasswordField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (Arrays.equals(newPasswordField.getPassword(), passwordPrompt.toCharArray())){
					newPasswordField.setText("");
					newPasswordField.setEchoChar('*');
				}
			}
			public void focusLost(FocusEvent e) {
				if (newPasswordField.getPassword().length == 0){							
					newPasswordField.setText(passwordPrompt);
					newPasswordField.setEchoChar((char)0);
				}
			}
		});
		newPasswordField.setText(passwordPrompt);
		newPasswordField.setBounds(505, 238, 205, 35);
		newPasswordField.setToolTipText("Password");
		newPasswordField.setColumns(1);
		newPasswordField.setHorizontalAlignment(SwingConstants.LEFT);
		registrationPane.add(newPasswordField);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.setFont(new Font("Verdana", Font.PLAIN, 20));
		cancelBtn.setBounds(526, 440, 150, 23);
		cancelBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((CardLayout)getLayout()).show(getPane(), "login");
			}
		});
		registrationPane.add(cancelBtn);
	}
}
