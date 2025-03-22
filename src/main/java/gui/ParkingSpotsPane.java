package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

public class ParkingSpotsPane extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private static final ParkingSpotsPane pane = new ParkingSpotsPane();
	
	public static ParkingSpotsPane getPane() {
		return pane;
	}

	/**
	 * Create the panel.
	 */
	private ParkingSpotsPane() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel listPane = new JPanel();
		listPane.setBackground(new Color(255, 255, 255));
		add(listPane, BorderLayout.CENTER);
		listPane.setLayout(new BoxLayout(listPane, BoxLayout.X_AXIS));
		
		Box spotsBox = new Box(1);
		spotsBox.setBackground(new Color(255, 255, 255));
		
		JLabel listLbl = new JLabel("PARKING SPOT X");
		listLbl.setFont(new Font("Verdana", Font.BOLD, 50));
		
		spotsBox.add(listLbl);
		
		for(int i = 0; i < 30; i++) {
			spotsBox.add(Box.createRigidArea(new Dimension(0, 24)));
			JLabel lbl = new JLabel("X"+(i+1));
			lbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
            lbl.setForeground(Color.BLACK);
            lbl.setFont(new Font("Dialog", Font.PLAIN, 32));
            lbl.addMouseListener(new MouseAdapter() {
    			public void mouseClicked(MouseEvent e) {
					((CardLayout) getParent().getLayout()).show(getParent(), "spotInfo");
    			}
    		});
            
            spotsBox.add(lbl);
		}
		
		JScrollPane listScrollPane = new JScrollPane(spotsBox);
		listScrollPane.getViewport().setBackground(Color.WHITE);
		listScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		listScrollPane.getVerticalScrollBar().setUnitIncrement(20);
		listScrollPane.getVerticalScrollBar().setBackground(Color.WHITE);
		listPane.add(listScrollPane);
	}

}
