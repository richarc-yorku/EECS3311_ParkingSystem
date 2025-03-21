package gui;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class LoginPane extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JTextField txtUsername;

	/**
	 * Create the panel.
	 */
	public LoginPane() {
		setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Password");
		passwordField.setBounds(132, 127, 205, 35);
		passwordField.setColumns(1);
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		add(passwordField);
		
		txtUsername = new JTextField();
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setText("Username");
		txtUsername.setBounds(132, 81, 205, 35);
		add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.setBounds(182, 198, 89, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Sign in");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(182, 11, 89, 35);
		add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setBounds(182, 232, 89, 23);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("I forgot my password");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(182, 289, 112, 14);
		add(lblNewLabel_1);

	}
}
