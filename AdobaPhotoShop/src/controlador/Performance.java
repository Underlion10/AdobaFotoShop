package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import modelo.Stuff;

public class Performance implements ActionListener{
	
	private JTextField rojo;
	private JTextField verde;
	private JTextField azul;
	
	
	public Performance(JTextField rojo, JTextField verde, JTextField azul) {
		this.rojo = rojo;
		this.azul = azul;
		this.verde = verde;
	}

	
	public void actionPerformed(ActionEvent arg0) {
		String rojoColor = rojo.getText();
		String verdeColor = verde.getText();
		String azulColor = azul.getText();
		
		try{
			int RED = Integer.parseInt(rojoColor);
			int GREEN = Integer.parseInt(verdeColor);
			int BLUE = Integer.parseInt(azulColor);
			
			if((RED > 255 || RED < 0) || (GREEN < 0 || GREEN > 255) || (BLUE < 0 || BLUE > 255)) {
				Stuff.error = true;
			} else {
				Stuff.colorActual = new Color(RED,GREEN,BLUE);
			}
		} catch(NumberFormatException e) {
			Stuff.error = true;
		}
		
		System.out.println(Stuff.error);
	}

}
