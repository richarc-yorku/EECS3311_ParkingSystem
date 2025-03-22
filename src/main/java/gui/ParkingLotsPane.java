package gui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

public class ParkingLotsPane extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private static final ParkingLotsPane pane = new ParkingLotsPane();
	
	public static ParkingLotsPane getPane() {
		return pane;
	}

	/**
	 * Create the panel.
	 */
	private ParkingLotsPane() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel listPane = new JPanel();
		listPane.setBackground(new Color(255, 255, 255));
		add(listPane, BorderLayout.CENTER);
		listPane.setLayout(new BoxLayout(listPane, BoxLayout.X_AXIS));
		
		Box lotsBox = new Box(1);
		lotsBox.setBackground(new Color(255, 255, 255));
		
		JLabel listLabel = new JLabel("PARKING LOTS");
		listLabel.setFont(new Font("Verdana", Font.BOLD, 50));
		
		lotsBox.add(listLabel);
		
		for(int i = 0; i < 7; i++) {
			lotsBox.add(Box.createRigidArea(new Dimension(0, 24)));
			JLabel lbl = new JLabel("Parking Lot "+(char)(65+i));
			lbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
            lbl.setForeground(Color.BLACK);
            lbl.setFont(new Font("Dialog", Font.PLAIN, 32));
            lotsBox.add(lbl);
		
		}
		
		JScrollPane listScrollPane = new JScrollPane(lotsBox);
		listScrollPane.getViewport().setBackground(Color.WHITE);
		listScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		listScrollPane.getVerticalScrollBar().setUnitIncrement(20);
		listPane.add(listScrollPane);
	}

}
