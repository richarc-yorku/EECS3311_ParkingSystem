package gui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

public class MyBookingsPane extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private static final MyBookingsPane pane = new MyBookingsPane();
	
	public static MyBookingsPane getPane() {
		return pane;
	}

	/**
	 * Create the panel.
	 */
	private MyBookingsPane() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel listPane = new JPanel();
		listPane.setBackground(new Color(255, 255, 255));
		add(listPane, BorderLayout.CENTER);
		listPane.setLayout(new BoxLayout(listPane, BoxLayout.X_AXIS));
		
		Box bookingsBox = new Box(1);
		bookingsBox.setBackground(new Color(255, 255, 255));
		
		JLabel listLabel = new JLabel("MY BOOKINGS");
		listLabel.setFont(new Font("Verdana", Font.BOLD, 50));
		
		bookingsBox.add(listLabel);
		
	
		bookingsBox.add(Box.createRigidArea(new Dimension(0, 24)));
		JLabel lbl = new JLabel("Come back here when you have some.");
		lbl.setFont(new Font("Dialog", Font.PLAIN, 32));
		bookingsBox.add(lbl);
		
		JScrollPane listScrollPane = new JScrollPane(bookingsBox);
		listScrollPane.getViewport().setBackground(Color.WHITE);
		listScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		listScrollPane.getVerticalScrollBar().setUnitIncrement(20);
		listScrollPane.getVerticalScrollBar().setBackground(Color.WHITE);
		listPane.add(listScrollPane);
	}

}
