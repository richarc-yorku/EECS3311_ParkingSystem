package app;

import java.awt.*;

import gui.*;

public class Main {

	public static void main(String[] args) {
		
		//To display window
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
