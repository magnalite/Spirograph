import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Spirograph extends JFrame{
	private double R, r, O;
	
	public Spirograph(double R, double r, double O) {
		this.R = R;
		this.r = r;
		this.O = O;
		
		this.setSize(800, 640);
		this.setTitle("Spirograph");
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		for (double t = 0; t < 6.28 * 20; t += 0.01) {
			int x = (int) ((R+r)*Math.cos(t) - (r+O)*Math.cos(((R+r)/r)*t));
			int y = (int) ((R+r)*Math.sin(t) - (r+O)*Math.sin(((R+r)/r)*t));
			
			g.setColor(new 
					Color(
							(int) Math.abs(Math.cos(t)*255),
							(int) Math.abs(Math.sin(t)*255),
							(int) Math.abs(Math.cos(t*2)*255)));
			g.drawOval(x+400, y+320, 3, 3);
		}
		
		R += 0.02;
		r += 0.02;
		O += 0.02;
	}

}
