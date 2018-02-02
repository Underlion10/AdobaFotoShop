package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import modelo.Stuff;

public class CreadorImagen implements ActionListener{

	public void actionPerformed(ActionEvent arg0) {
		String ruta = JOptionPane.showInputDialog(null, "Nombre de la imagen");
		BufferedImage img = new BufferedImage(Stuff.lienzo.getWidth(), Stuff.lienzo.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Stuff.lienzo.paint(img.getGraphics());
		try {
			ImageIO.write(img, "png", new File("src/modelo/guardadoImg/" + ruta + ".png"));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error");
		}
	
	}

}
