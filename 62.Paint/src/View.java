import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class View extends JFrame {
	public View()
	{
		this.setTitle("My draw!");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanelDraw jPanelDraw = new JPanelDraw();
		jPanelDraw.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new BorderLayout());
		this.add(jPanelDraw, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new View();
	}
}
