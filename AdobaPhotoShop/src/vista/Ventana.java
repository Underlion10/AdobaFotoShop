package vista;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Performance;
import controlador.Shape;
import modelo.Dibujo;
import modelo.Stuff;

public class Ventana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4601737718372115147L;

	public Ventana() {
		super("Adoba FotoShop");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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
		boton.addActionListener(new Performance(textoRojo, textoVerde, textoAzul));
		//Seccion center del layout
		//Seccion este del layout
		JPanel panelEste = new JPanel();
		panelEste.setLayout(new GridLayout());
		panelEste.setBorder(BorderFactory.createLineBorder(Color.blue, 2, true));
		JButton botonCirculo = new JButton("Círculo");
		JButton botonCuadrado = new JButton("Cuadrado");
		botonCirculo.addActionListener(new Shape(botonCirculo));
		botonCuadrado.addActionListener(new Shape(botonCuadrado));
		Stuff.lienzo.addMouseListener(new Dibujo());
		panelEste.add(botonCuadrado);
		panelEste.add(botonCirculo);
		panelContainer.add(panel, BorderLayout.NORTH);
		panelContainer.add(Stuff.lienzo, BorderLayout.CENTER);
		panelContainer.add(panelEste, BorderLayout.WEST);
		cn.add(panelContainer);
		pack();
	}
}
