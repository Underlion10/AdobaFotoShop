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

public class Lienzo extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -257640443263265082L;
	
	private int x;
	private int y;
	
	//ArrayList<Cuadrado> cuadrados = new ArrayList<Cuadrado>();
	ArrayList<Dibujo> dibujos = new ArrayList<Dibujo>();
	//ArrayList<Circulo> circulos = new ArrayList<Circulo>();
	
	public Lienzo() {
		setBorder(BorderFactory.createLineBorder(new Color(70,140,210), 2, true));
	}
	
	
	public Dimension getPreferredSize() {
		return new Dimension(400,400);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(Stuff.click) {
			if(Stuff.shapes.equals("cuadrado")) {
				Cuadrado cuadrado = new Cuadrado(Stuff.x, Stuff.y, Stuff.colorActual, 32);
				dibujos.add(cuadrado);
				System.out.println(x+" "+y);
			} else if(Stuff.shapes.equals("circulo")) {
				Circulo circulo = new Circulo(50, Stuff.x, Stuff.y, Stuff.colorActual);
				dibujos.add(circulo);
				System.out.println(x+" "+y);
				System.out.println(dibujos.size());
			}
			
			if(!dibujos.isEmpty()) {
				for(Dibujo dibujo: dibujos) {
					dibujo.dibujar(g);
				}
			}
//			
//			if(!circulos.isEmpty()) {
//				for(Circulo circle: circulos) {
//					circle.paintCirculo(g);
//				}
//			}
		}
		g.dispose();
	}


	
	
}
