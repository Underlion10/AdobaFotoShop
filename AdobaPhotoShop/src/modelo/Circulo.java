package modelo;

import java.awt.Color;
import java.awt.Graphics;


public class Circulo extends Dibujo {
	
	private int x;
	private int y;
	private Color color;
	
	
	public Circulo(int rad, int x, int y, Color color) {
		width = rad;
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void paintCirculo(Graphics g) {
		g.setColor(color);
		g.fillOval(x-(width/2), y-(width/2), width, width);
	}
}
