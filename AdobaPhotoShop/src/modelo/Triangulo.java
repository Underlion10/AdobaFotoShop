package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Triangulo extends Dibujo {
	private Color color;
	private int[] xPoints = new int[3];
	private int[] yPoints = new int[3];
	private Polygon triangulo;
	
	public Triangulo(int width, int x, int y, Color color) {
		this.color = color;
		xPoints[0] = x;
		xPoints[1] = x-width;
		xPoints[2] = x+width;
		yPoints[0] = y-width;
		yPoints[1] = y+width;
		yPoints[2] = y+width;
		triangulo = new Polygon(xPoints, yPoints, 3);
	}

	public void dibujar(Graphics g) {
		g.setColor(color);
		g.fillPolygon(triangulo);
	}

}
