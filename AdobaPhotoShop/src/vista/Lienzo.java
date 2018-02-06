package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.Dibujo;
import modelo.Stuff;
import modelo.Triangulo;

public class Lienzo extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -257640443263265082L;
	
	private int x;
	private int y;
	
	public static ArrayList<Dibujo> dibujos = new ArrayList<Dibujo>();
	
	public Lienzo() {
		setBorder(BorderFactory.createLineBorder(new Color(70,140,210), 2, true));
		setBackground(new Color(255, 255, 255));
	}
	
	
	public Dimension getPreferredSize() {
		return new Dimension(500,500);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if(Stuff.borrar) {
			Stuff.borrar = false;
			dibujos.clear();
			return;
		}
		
		if(Stuff.click) {
			if(Stuff.shapes.equals("cuadrado")) {
				Cuadrado cuadrado = new Cuadrado(Stuff.x, Stuff.y, Stuff.colorActual, Stuff.width);
				dibujos.add(cuadrado);
				System.out.println(x+" "+y);
			} else if(Stuff.shapes.equals("circulo")) {
				Circulo circulo = new Circulo(Stuff.width, Stuff.x, Stuff.y, Stuff.colorActual);
				dibujos.add(circulo);
				System.out.println(x+" "+y);
				System.out.println(dibujos.size());
			} else if(Stuff.shapes.equals("Triangulo")) {
				Triangulo triangulo = new Triangulo(Stuff.width, Stuff.x, Stuff.y, Stuff.colorActual);
				dibujos.add(triangulo);
			} else if(Stuff.shapes.equals("Goma")) {
				Circulo goma = new Circulo(Stuff.width, Stuff.x, Stuff.y, new Color(255, 255, 255));
				dibujos.add(goma);
			}
			
			if(!dibujos.isEmpty()) {
				for(Dibujo dibujo: dibujos) {
					dibujo.dibujar(g);
				}
			}
		}
	}


	
	
}
