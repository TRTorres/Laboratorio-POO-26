package Modelo;

import javax.swing.JFrame;

import Ventana.PersonajePantalla;

public class appVentana {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 1300, 750);
		frame.setContentPane(new PersonajePantalla(frame));
		frame.validate();
	}

}
