package gui;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class LoginPane extends JPanel {

	private static final long serialVersionUID = 1L;
	private static String usernamePrompt = "Username";
	private static String passwordPrompt = "Password";
	
	private JPasswordField passwordField;
	private JTextField txtUsername;

	/**
	 * Create the panel.
	 */
	public LoginPane() {
		setLayout(null);
		
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
		add(passwordField);
		
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
		add(txtUsername);
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
		add(loginBtn);
		
		JLabel signInLabel = new JLabel("Sign in");
		signInLabel.setBounds(182, 11, 89, 35);
		signInLabel.setHorizontalAlignment(SwingConstants.CENTER);
		signInLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(signInLabel);
		
		JButton registrationPaneChangeBtn = new JButton("Register");
		registrationPaneChangeBtn.setBounds(182, 259, 89, 23);
		registrationPaneChangeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Add registration pane change logic here
			}
		});
		add(registrationPaneChangeBtn);

	}
}
