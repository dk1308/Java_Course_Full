import java.awt.Color;
import java.awt.Graphics;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.JPanel;

public class JPanelDraw extends JPanel{
	@Override
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawLine(0, 0, 50, 50);
		
		g.setColor(Color.CYAN);
		g.drawOval(100, 100, 50, 50);
		
		g.setColor(Color.CYAN);
		g.drawRect(100, 100, 50, 50);
		
		g.setColor(Color.DARK_GRAY);
		g.fillOval(200, 200, 50, 50);
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(300, 200, 50, 70);
		
		g.setColor(Color.PINK);
		g.drawString("Anh yeu chut", 400, 200);
		
	}
}
