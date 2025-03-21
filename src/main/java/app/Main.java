package app;

import java.awt.*;
import javax.swing.*;

import gui.*;

public class Main {

	public static void main(String[] args) {
		
		//To display window
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame mainFrame = MainWindow.getWindow();
					mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
