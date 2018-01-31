package modelo;

import java.awt.Graphics;


public class Circulo extends Dibujo {
	
	private int x;
	
	
	public Circulo(int rad) {
		width = rad;
	}
	
	public void paintCirculo(Graphics g) {
		x = Stuff.x;
		y = Stuff.y;
		g.setColor(Stuff.colorActual);
		g.fillOval(x-(width/2), y-(width/2), width, width);
	}
}
