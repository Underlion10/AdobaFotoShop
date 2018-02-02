package vista;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Borrador;
import controlador.CreadorImagen;
import controlador.Mouse;
import controlador.Performance;
import controlador.Shape;
import modelo.Stuff;

public class Ventana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4601737718372115147L;
	
	public static JLabel ancho = new JLabel(Stuff.width+"");
	
	Image imgCursor = new ImageIcon("src/modelo/recursos/Cursor.png").getImage();
	Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(imgCursor, new Point(0,0), "raton");
	
	public Ventana() {
		super("Adoba FotoShop");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setCursor(cursor);
		Container cn = getContentPane();
		cn.setLayout(new GridLayout());
		JPanel panelContainer = new JPanel();
		panelContainer.setLayout(new BorderLayout());
		// Seccion north del layout
		JButton boton = new JButton("Cambiar Color");
		boton.setToolTipText("Elige Rojo-Azul-Verde");
		boton.setPreferredSize(new Dimension(150, 25));
		JLabel labelRojo = new JLabel("Rojo");
		JTextField textoRojo = new JTextField(3);
		JLabel labelVerde = new JLabel("Verde");
		JTextField textoVerde = new JTextField(3);
		JLabel labelAzul = new JLabel("Azul");
		JTextField textoAzul = new JTextField(3);
		JButton guardadoImg = new JButton("Guardar Imagen");
		JButton borradoImg = new JButton("Borrar Imagen");
		JLabel anchoMed = new JLabel("Ancho Pincel: ");
		guardadoImg.setPreferredSize(new Dimension(175, 25));
		borradoImg.setPreferredSize(new Dimension(175, 25));
		guardadoImg.addActionListener(new CreadorImagen());
		borradoImg.addActionListener(new Borrador());
		JPanel panelSur = new JPanel();
		panelSur.setLayout(new FlowLayout());
		panelSur.add(guardadoImg);
		panelSur.add(borradoImg);
		panelSur.setBorder(BorderFactory.createLineBorder(new Color(150,150,150), 2, true));
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.green, 2, true));
		panel.setLayout(new FlowLayout());
		panel.add(labelRojo);
		panel.add(textoRojo);
		panel.add(labelVerde);
		panel.add(textoVerde);
		panel.add(labelAzul);
		panel.add(textoAzul);
		panel.add(boton);
		panel.add(anchoMed);
		panel.add(ancho);
		boton.addActionListener(new Performance(textoRojo, textoVerde, textoAzul));
		//Seccion center del layout
		//Seccion este del layout
		JPanel panelEste = new JPanel();
		panelEste.setLayout(new GridLayout(4,1));
		panelEste.setBorder(BorderFactory.createLineBorder(Color.blue, 2, true));
		JButton botonCirculo = new JButton("Círculo");
		JButton botonCuadrado = new JButton("Cuadrado");
		JButton botonTriangulo = new JButton("Triangulo");
		JButton botonGoma = new JButton("Goma");
		botonCirculo.addActionListener(new Shape(botonCirculo));
		botonCuadrado.addActionListener(new Shape(botonCuadrado));
		botonTriangulo.addActionListener(new Shape(botonTriangulo));
		botonGoma.addActionListener(new Shape(botonGoma));
		Stuff.lienzo.addMouseListener(new Mouse());
		Stuff.lienzo.addMouseMotionListener(new Mouse());
		Stuff.lienzo.addMouseWheelListener(new Mouse());
		panelEste.add(botonCuadrado);
		panelEste.add(botonCirculo);
		panelEste.add(botonTriangulo);
		panelEste.add(botonGoma);
		panelContainer.add(panel, BorderLayout.NORTH);
		panelContainer.add(Stuff.lienzo, BorderLayout.CENTER);
		panelContainer.add(panelEste, BorderLayout.WEST);
		panelContainer.add(panelSur, BorderLayout.SOUTH);
		cn.add(panelContainer);
		pack();
	}
}
