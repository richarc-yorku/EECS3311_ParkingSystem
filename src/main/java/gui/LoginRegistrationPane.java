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
import java.awt.Color;

public class LoginRegistrationPane extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private static final String userPrompt = "Email";
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
		setBackground(new Color(226, 230, 226));
		setLayout(new CardLayout(0, 0));
		setBounds(0, 0, 1280, 720);
		
		JPanel loginPane = new JPanel();
		loginPane.setBackground(new Color(226, 230, 226));
		add(loginPane, "login");
		
		loginPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(44, 45, 44));
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
		passwordField.setEchoChar((char)0);
		passwordField.setBounds(505, 238, 205, 35);
		passwordField.setToolTipText("Password");
		passwordField.setColumns(1);
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		loginPane.add(passwordField);
		
		userField = new JTextField();
		userField.setForeground(new Color(44, 45, 44));
		userField.setFont(new Font("Dialog", Font.PLAIN, 16));
		userField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (userField.getText().equals(userPrompt)) {
					userField.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if (userField.getText().equals("")) {
					userField.setText(userPrompt);
				}
			}
		});
		userField.setBounds(505, 134, 205, 35);
		userField.setHorizontalAlignment(SwingConstants.LEFT);
		userField.setText(userPrompt);
		userField.setColumns(10);
		loginPane.add(userField);
		
		
		JButton loginBtn = new JButton("Log in");
		loginBtn.setForeground(new Color(44, 45, 44));
		loginBtn.setBackground(new Color(255, 255, 255));
		loginBtn.setFont(new Font("Verdana", Font.PLAIN, 20));
		loginBtn.setBounds(526, 376, 150, 35);
		loginBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Add login authentication here

				
				((CardLayout)getParent().getLayout()).show(getParent(), "mainPage");
			}
		});
		loginPane.add(loginBtn);
		
		JLabel signInLbl = new JLabel("Sign in");
		signInLbl.setForeground(new Color(0, 0, 0));
		signInLbl.setBounds(545, 11, 116, 35);
		signInLbl.setHorizontalAlignment(SwingConstants.CENTER);
		signInLbl.setFont(new Font("Verdana", Font.BOLD, 24));
		loginPane.add(signInLbl);
		
		JButton switchRegisterBtn = new JButton("Register");
		switchRegisterBtn.setForeground(new Color(44, 45, 44));
		switchRegisterBtn.setBackground(new Color(255, 255, 255));
		switchRegisterBtn.setFont(new Font("Verdana", Font.PLAIN, 20));
		switchRegisterBtn.setBounds(526, 440, 150, 35);
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
		registrationPane.setBackground(new Color(226, 230, 226));
		add(registrationPane, "register");
		
		registrationPane.setLayout(null);
		
		JLabel registerLbl = new JLabel("Registration");
		registerLbl.setForeground(new Color(0, 0, 0));
		registerLbl.setHorizontalAlignment(SwingConstants.CENTER);
		registerLbl.setFont(new Font("Verdana", Font.BOLD, 24));
		registerLbl.setBounds(526, 11, 165, 35);
		registrationPane.add(registerLbl);
		
		newUserField = new JTextField();
		newUserField.setForeground(new Color(44, 45, 44));
		newUserField.setFont(new Font("Dialog", Font.PLAIN, 16));
		newUserField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (newUserField.getText().equals(userPrompt)) {
					newUserField.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if (newUserField.getText().equals("")) {
					newUserField.setText(userPrompt);
				}
			}
		});
		newUserField.setBounds(505, 134, 205, 35);
		newUserField.setHorizontalAlignment(SwingConstants.LEFT);
		newUserField.setText(userPrompt);
		newUserField.setColumns(10);
		registrationPane.add(newUserField);
		
		JButton registerBtn = new JButton("Register");
		registerBtn.setBackground(new Color(255, 255, 255));
		registerBtn.setForeground(new Color(44, 45, 44));
		registerBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Add registration authentication logic here
				// Also check if password is strong enough
			}
		});
		registerBtn.setFont(new Font("Verdana", Font.PLAIN, 20));
		registerBtn.setBounds(526, 376, 150, 35);
		registrationPane.add(registerBtn);
		
		newPasswordField = new JPasswordField();
		newPasswordField.setForeground(new Color(44, 45, 44));
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
		newPasswordField.setEchoChar((char)0);
		newPasswordField.setBounds(505, 238, 205, 35);
		newPasswordField.setToolTipText("Password");
		newPasswordField.setColumns(1);
		newPasswordField.setHorizontalAlignment(SwingConstants.LEFT);
		registrationPane.add(newPasswordField);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.setBackground(new Color(255, 255, 255));
		cancelBtn.setForeground(new Color(44, 45, 44));
		cancelBtn.setFont(new Font("Verdana", Font.PLAIN, 20));
		cancelBtn.setBounds(526, 440, 150, 35);
		cancelBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((CardLayout)getLayout()).show(getPane(), "login");
			}
		});
		registrationPane.add(cancelBtn);
	}
}
