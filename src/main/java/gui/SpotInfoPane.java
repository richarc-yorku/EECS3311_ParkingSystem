package gui;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

public class SpotInfoPane extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private static final SpotInfoPane pane = new SpotInfoPane();
	
	public static SpotInfoPane getPane() {
		return pane;
	}
	
	/**
	 * Create the panel.
	 */
	private SpotInfoPane() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel titlePane = new JPanel();
		titlePane.setBackground(new Color(255, 255, 255));
		add(titlePane, BorderLayout.NORTH);
		titlePane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel spotLbl = new JLabel("PARKING SPOT XX");
		spotLbl.setFont(new Font("Verdana", Font.BOLD, 40));
		titlePane.add(spotLbl);
		
		JPanel bookPane = new JPanel();
		bookPane.setBackground(new Color(255, 255, 255));
		add(bookPane, BorderLayout.SOUTH);
		bookPane.setLayout(new BorderLayout(0, 0));
		
		JButton bookBtn = new JButton("BOOK NOW");
		bookBtn.setBackground(new Color(255, 255, 255));
		bookBtn.setFont(new Font("Dialog", Font.PLAIN, 32));
		bookBtn.setForeground(new Color(0, 0, 0));
		bookPane.add(bookBtn, BorderLayout.EAST);
		
		JButton deleteBtn = new JButton("DELETE BOOKING");
		deleteBtn.setFont(new Font("Dialog", Font.PLAIN, 32));
		deleteBtn.setBackground(Color.WHITE);
		bookPane.add(deleteBtn, BorderLayout.WEST);
		
		JPanel infoPane = new JPanel();
		infoPane.setBackground(new Color(255, 255, 255));
		add(infoPane, BorderLayout.CENTER);
  
		
		JEditorPane infoEditor = new JEditorPane();
		infoEditor.setFont(new Font("Dialog", Font.PLAIN, 20));
		infoEditor.setBackground(Color.WHITE);
		infoEditor.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		infoEditor.setContentType("text/plain");
		infoPane.setLayout(new GridLayout(0, 1, 0, 0));
		infoEditor.setEditable(false);
		infoEditor.setText("ID: "
						+ "\n\nBooking Status: "
						+ "\n\nLocation: ");
		
		JScrollPane infoScrollPane = new JScrollPane(infoEditor);
		infoScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		infoScrollPane.getViewport().setBackground(Color.WHITE);
		infoScrollPane.getVerticalScrollBar().setBackground(Color.WHITE);
		infoScrollPane.getVerticalScrollBar().setUnitIncrement(20);
		infoPane.add(infoScrollPane);
		
		JPanel picPane = new JPanel();
		picPane.setBackground(new Color(255, 255, 255));
		add(picPane, BorderLayout.WEST);
		picPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		ImageIcon image = new ImageIcon("city-street-parking-area-landscape-illustration-vector.jpg");
		
		JLabel imgLbl = new JLabel(image);
		picPane.add(imgLbl);
	}
}
