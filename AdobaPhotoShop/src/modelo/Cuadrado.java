package modelo;

import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado extends Dibujo{
	
	private int x;
	private int y;
	private Color color;
	
	public Cuadrado(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	
	public void paintCuadrado(Graphics g) {
		g.setColor(color);
		g.fillRect(x-16, y-16, width, width);
		System.out.println(x + " " + y);
	}

}
