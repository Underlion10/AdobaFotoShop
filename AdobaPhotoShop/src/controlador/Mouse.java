package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import modelo.Stuff;
import vista.Ventana;

public class Mouse implements MouseListener, MouseMotionListener, MouseWheelListener {

	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			Stuff.x = e.getX();
			Stuff.y = e.getY();
			Stuff.lienzo.repaint();
			Stuff.click = true;
		}
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseDragged(MouseEvent e) {
		Stuff.x = e.getX();
		Stuff.y = e.getY();
		Stuff.click = true;
		Stuff.lienzo.repaint();
	}

	public void mouseMoved(MouseEvent e) {

	}

	public void mouseWheelMoved(MouseWheelEvent e) {
		Stuff.width += e.getWheelRotation();

		if (Stuff.width < 1) {
			Stuff.width = 1;
		}
		Ventana.ancho.setText(Stuff.width + "");
	}
}
