package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import modelo.Stuff;

public class Shape implements ActionListener{

	private String nombre;
	
	public Shape(JButton boton) {
		nombre = boton.getText();
	}
	public void actionPerformed(ActionEvent arg0) {
		if(nombre.equals("Círculo")) {
			Stuff.shapes = "circulo";
		} else if(nombre.equals("Cuadrado")) {
			Stuff.shapes = "cuadrado";
		}
		System.out.println(Stuff.shapes);
	}

}
