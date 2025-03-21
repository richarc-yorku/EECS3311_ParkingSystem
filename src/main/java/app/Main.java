package app;

import java.awt.EventQueue;

import gui.*;

public class Main {

	public static void main(String[] args) {
		
		//To display window
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
