package Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import View.MouseView;

public class MouseExampleListener implements MouseListener, MouseMotionListener{
	MouseView mouseView;
	public MouseExampleListener(MouseView mouseView)
	{
		this.mouseView = mouseView;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		this.mouseView.setMouseLocation(x, y);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.mouseView.addClick();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.mouseView.isEntered();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.mouseView.isExit();
	}

}
