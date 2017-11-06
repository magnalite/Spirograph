

import java.awt.Graphics;

import javax.swing.JFrame;

public class Main {
	private static JFrame frame;

	public static void main(String[] args) throws InterruptedException{
		frame = new Spirograph(-150, 30, 10);
		Graphics g = frame.getGraphics();
		
		for (int i = 0; i < 1000; ++i) {
			frame.paint(g);
			
			Thread.sleep(1);
		}
	}
	
}
