package Ventana;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class PersonajePantalla extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PersonajePantalla() {
		setBackground(new Color(255, 174, 215));
		setBounds(0, 45, 1300, 750);
		setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(467, 301, 102, 53);
		add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(467, 232, 102, 53);
		add(spinner_1);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setBounds(467, 377, 102, 53);
		add(spinner_1_1);
		
		JLabel lblNewLabel = new JLabel("Ingrese secretos");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel.setBounds(307, 251, 150, 21);
		add(lblNewLabel);
		
		JLabel lblIngreseLocura = new JLabel("Ingrese locura");
		lblIngreseLocura.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblIngreseLocura.setBounds(307, 320, 120, 21);
		add(lblIngreseLocura);
		
		JLabel lblIngresarUbicacion = new JLabel("Ingresar ubicacion");
		lblIngresarUbicacion.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblIngresarUbicacion.setBounds(307, 391, 120, 21);
		add(lblIngresarUbicacion);
		
		JButton btnNewButton = new JButton("Crear personaje");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnNewButton.setBounds(307, 172, 273, 37);
		add(btnNewButton);
	}

}
