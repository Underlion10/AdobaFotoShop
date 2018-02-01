package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.Stuff;

public class Lienzo extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -257640443263265082L;
	
	private int x;
	private int y;
	
	ArrayList<Cuadrado> cuadrados = new ArrayList<Cuadrado>();
	ArrayList<Circulo> circulos = new ArrayList<Circulo>();
	
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
				Cuadrado cuadrado = new Cuadrado(Stuff.x, Stuff.y, Stuff.colorActual);
				cuadrados.add(cuadrado);
				System.out.println(x+" "+y);
			} else if(Stuff.shapes.equals("circulo")) {
				Circulo circulo = new Circulo(50, Stuff.x, Stuff.y, Stuff.colorActual);
				circulos.add(circulo);
				System.out.println(x+" "+y);
				System.out.println(circulos.size());
			}
		}
		
		if(!cuadrados.isEmpty()) {
			for(Cuadrado cuadrado: cuadrados) {
				cuadrado.paintCuadrado(g);
			}
		}
		
		if(!circulos.isEmpty()) {
			for(Circulo circulo: circulos) {
				circulo.paintCirculo(g);
			}
		}
		g.dispose();
	}


	
	
}
