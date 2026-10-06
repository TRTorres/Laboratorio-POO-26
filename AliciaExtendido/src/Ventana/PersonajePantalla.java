package Ventana;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import Modelo.Mundo;
import Modelo.Personaje;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class PersonajePantalla extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public PersonajePantalla(JFrame frame) {
		MundoPantalla m = new MundoPantalla(frame);
		setBackground(new Color(255, 174, 215));
		setBounds(0, 45, 1300, 750);
		setLayout(null);
		Personaje p = new Personaje();
		
		JLabel lblNewLabel = new JLabel("Ingrese secretos");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel.setBounds(499, 251, 150, 21);
		add(lblNewLabel);
		
		JLabel lblIngreseLocura = new JLabel("Ingrese locura");
		lblIngreseLocura.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblIngreseLocura.setBounds(499, 320, 120, 21);
		add(lblIngreseLocura);
		
		JLabel lblIngresarUbicacion = new JLabel("Ingresar ubicacion");
		lblIngresarUbicacion.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblIngresarUbicacion.setBounds(499, 391, 120, 21);
		add(lblIngresarUbicacion);
		
		JButton btnNewButton = new JButton("Crear personaje");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearPersonaje(p, m.losPersonajes);
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnNewButton.setBounds(499, 172, 273, 37);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnNewButton_1.setBounds(499, 441, 273, 37);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cambiar a Mundo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setContentPane(new MundoPantalla(frame));
				frame.validate();
			}
		});
		btnNewButton_2.setBounds(10, 11, 142, 23);
		add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(670, 253, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(670, 322, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(670, 393, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
	}
	public void crearPersonaje(Personaje p, ArrayList<Personaje> losPersonajes) {
		int secretos = Integer.parseInt(textField.getText());
		int ubicacion = Integer.parseInt(textField_2.getText());
		int locura = Integer.parseInt(textField_1.getText());
		p.setLocura(locura);
		p.setSecretos(secretos);
		p.setUbicacion(ubicacion);
		losPersonajes.add(p);
	}
}
