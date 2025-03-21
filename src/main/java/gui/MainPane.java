package gui;

import javax.swing.JPanel;
import java.awt.CardLayout;

public class MainPane extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public MainPane() {
		setLayout(null);
		
		JPanel borderPane = new JPanel();
		borderPane.setBounds(0, 0, 450, 300);
		add(borderPane);
		borderPane.setLayout(new CardLayout(0, 0));
		
		JPanel loginPane = new LoginPane();
		borderPane.add(loginPane, "name_10093064574100");
		
		JPanel registrationPane = new RegistrationPane();
		borderPane.add(registrationPane, "name_10093083458200");
		
		// Introduce pane switching logic here

	}

}
