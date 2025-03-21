package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel basePane;

	
	
	
	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setTitle("Parking System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		basePane = new JPanel();
		basePane.setBackground(new Color(226, 230, 226));
		basePane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(basePane);
		basePane.setLayout(new CardLayout(0, 0));
		
		JPanel borderPane = new JPanel();
		basePane.add(borderPane, "name_672470444800");
		borderPane.setLayout(new BorderLayout(0, 0));
		
		JPanel headerPane = new JPanel();
		headerPane.setBackground(new Color(44, 45, 44));
		borderPane.add(headerPane, BorderLayout.NORTH);
		headerPane.setLayout(new BorderLayout(0, 0));
		
		JPanel optionsPane = new JPanel();
		optionsPane.setBackground(new Color(44, 45, 44));
		headerPane.add(optionsPane, BorderLayout.WEST);
		
		JButton homeBtn = new JButton("Home");
		homeBtn.setBackground(new Color(44, 45, 44));
		homeBtn.setForeground(new Color(226, 230, 226));
		homeBtn.setFont(new Font("Verdana", Font.PLAIN, 24));
		optionsPane.add(homeBtn);
		
		JButton bookingsBtn = new JButton("My Bookings");
		bookingsBtn.setForeground(new Color(226, 230, 226));
		bookingsBtn.setBackground(new Color(44, 45, 44));
		bookingsBtn.setFont(new Font("Verdana", Font.PLAIN, 24));
		optionsPane.add(bookingsBtn);
		
		JPanel extraOptPane = new JPanel();
		extraOptPane.setBackground(new Color(44, 45, 44));
		headerPane.add(extraOptPane, BorderLayout.EAST);
		
		JButton managerFt1Btn = new JButton("Manager Ft 1");
		managerFt1Btn.setForeground(new Color(226, 230, 226));
		managerFt1Btn.setBackground(new Color(44, 45, 44));
		managerFt1Btn.setFont(new Font("Verdana", Font.PLAIN, 24));
		extraOptPane.add(managerFt1Btn);
		
		JButton managerFt2Btn = new JButton("Manager Ft 2");
		managerFt2Btn.setForeground(new Color(226, 230, 226));
		managerFt2Btn.setBackground(new Color(44, 45, 44));
		managerFt2Btn.setFont(new Font("Verdana", Font.PLAIN, 24));
		extraOptPane.add(managerFt2Btn);
		
		JButton managerFt3Btn = new JButton("Manager Ft 3");
		managerFt3Btn.setForeground(new Color(226, 230, 226));
		managerFt3Btn.setBackground(new Color(44, 45, 44));
		managerFt3Btn.setFont(new Font("Verdana", Font.PLAIN, 24));
		extraOptPane.add(managerFt3Btn);
		
		JButton logOutBtn = new JButton("Log Out");
		logOutBtn.setForeground(new Color(226, 230, 226));
		logOutBtn.setBackground(new Color(44, 45, 44));
		logOutBtn.setFont(new Font("Verdana", Font.PLAIN, 24));
		extraOptPane.add(logOutBtn);
		
		JPanel mainPane = new JPanel();
		mainPane.setBackground(new Color(255, 255, 255));
		borderPane.add(mainPane, BorderLayout.CENTER);
		mainPane.setLayout(new CardLayout(0, 0));
	}

}
