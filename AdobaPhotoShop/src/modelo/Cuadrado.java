package modelo;

import java.awt.Graphics;

public class Cuadrado extends Dibujo{
	
	private int x;
	private int y;

	
	public void paintCuadrado(Graphics g) {
		x = Stuff.x;
		y = Stuff.y;
		g.setColor(Stuff.colorActual);
		g.fillRect(x-16, y-16, width, width);
		System.out.println(x + " " + y);
	}

}
