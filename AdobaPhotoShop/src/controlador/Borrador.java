package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Stuff;

public class Borrador implements ActionListener {

	public void actionPerformed(ActionEvent arg0) {
		
		Stuff.borrar = true;
		Stuff.lienzo.repaint();
	}

}
