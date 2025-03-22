package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel basePane;

	private static final MainWindow main = new MainWindow();
	
	public static MainWindow getWindow() {
		return main;
	}
	
	/**
	 * Create the frame.
	 */
	private MainWindow() {
		setResizable(false);
		setTitle("Parking System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		setLocationRelativeTo(null);
		
		basePane = new JPanel();
		basePane.setBackground(new Color(229, 91, 28));
		basePane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(basePane);
		basePane.setLayout(new CardLayout(0, 0));
		
		JPanel mainPane = new JPanel();
		mainPane.setBackground(new Color(255, 255, 255));
		mainPane.setLayout(new CardLayout(0, 0));
		
		JPanel borderPane = new JPanel();
		basePane.add(borderPane, "mainPage");
		borderPane.setLayout(new BorderLayout(0, 0));
		
		JPanel headerPane = new JPanel();
		headerPane.setBackground(new Color(229, 91, 28));
		borderPane.add(headerPane, BorderLayout.NORTH);
		borderPane.add(mainPane, BorderLayout.CENTER);
		headerPane.setLayout(new BorderLayout(0, 0));
		
		JPanel optionsPane = new JPanel();
		optionsPane.setBackground(new Color(229, 91, 28));
		headerPane.add(optionsPane, BorderLayout.WEST);
		
		JButton homeBtn = new JButton("Home");
		homeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((CardLayout) mainPane.getLayout()).show(mainPane, "parkingLots");
			}
		});
		homeBtn.setBackground(new Color(255, 255, 255));
		homeBtn.setForeground(new Color(0, 0, 0));
		homeBtn.setFont(new Font("Verdana", Font.PLAIN, 24));
		optionsPane.add(homeBtn);
		
		JButton bookingsBtn = new JButton("My Bookings");
		bookingsBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((CardLayout) mainPane.getLayout()).show(mainPane, "bookings");
			}
		});
		bookingsBtn.setForeground(new Color(0, 0, 0));
		bookingsBtn.setBackground(new Color(255, 255, 255));
		bookingsBtn.setFont(new Font("Verdana", Font.PLAIN, 24));
		optionsPane.add(bookingsBtn);
		
		JPanel extraOptPane = new JPanel();
		extraOptPane.setBackground(new Color(229, 91, 28));
		headerPane.add(extraOptPane, BorderLayout.EAST);
		
		JButton managerFt1Btn = new JButton("Manager Ft 1");
		managerFt1Btn.setForeground(new Color(0, 0, 0));
		managerFt1Btn.setBackground(new Color(255, 255, 255));
		managerFt1Btn.setFont(new Font("Verdana", Font.PLAIN, 24));
		extraOptPane.add(managerFt1Btn);
		
		JButton managerFt2Btn = new JButton("Manager Ft 2");
		managerFt2Btn.setForeground(new Color(0, 0, 0));
		managerFt2Btn.setBackground(new Color(255, 255, 255));
		managerFt2Btn.setFont(new Font("Verdana", Font.PLAIN, 24));
		extraOptPane.add(managerFt2Btn);
		
		JButton searchBtn = new JButton("Search");
		searchBtn.setForeground(new Color(0, 0, 0));
		searchBtn.setBackground(new Color(255, 255, 255));
		searchBtn.setFont(new Font("Verdana", Font.PLAIN, 24));
		extraOptPane.add(searchBtn);
		
		JButton logOutBtn = new JButton("Log Out");
		logOutBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((CardLayout) basePane.getLayout()).show(basePane, "loginMenu");
				((CardLayout) mainPane.getLayout()).show(mainPane, "parkingLots");
			}
		});
		logOutBtn.setForeground(new Color(0, 0, 0));
		logOutBtn.setBackground(new Color(255, 255, 255));
		logOutBtn.setFont(new Font("Verdana", Font.PLAIN, 24));
		extraOptPane.add(logOutBtn);
		
		
		
		//Combining
		basePane.add(LoginRegistrationPane.getPane(), "loginMenu");
		mainPane.add(ParkingLotsPane.getPane(), "parkingLots");
		mainPane.add(ParkingSpotsPane.getPane(), "parkingSpots");
		mainPane.add(MyBookingsPane.getPane(), "bookings");
		
		((CardLayout) basePane.getLayout()).show(basePane, "loginMenu");
		((CardLayout) mainPane.getLayout()).show(mainPane, "parkingLots");
		
	}
}
