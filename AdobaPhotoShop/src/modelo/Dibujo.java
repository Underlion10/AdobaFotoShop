package modelo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Dibujo implements MouseListener{
	
	protected int width = 32;
	protected int x;
	protected int y;
	
	public void mouseClicked(MouseEvent e) {
		Stuff.x = e.getX();
		Stuff.y = e.getY();
		Stuff.lienzo.repaint();
		Stuff.click = true;
	}


	public void mouseEntered(MouseEvent e) {

		
	}



	public void mouseExited(MouseEvent e) {

		
	}



	public void mousePressed(MouseEvent e) {
		
	}


	
	public void mouseReleased(MouseEvent e) {
	
		
	}

}
