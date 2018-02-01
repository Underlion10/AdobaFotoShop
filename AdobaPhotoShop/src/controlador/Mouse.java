package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.Stuff;

public class Mouse implements MouseListener{
	
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
