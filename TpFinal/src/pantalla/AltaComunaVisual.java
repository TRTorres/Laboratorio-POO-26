package pantalla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Consultas.Alta;
import clasesPrincipales.Comuna;
import clasesPrincipales.Persona;
import enumeradores.SituacionLaboral;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

public class AltaComunaVisual extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldSedeComunal;
	private JTextField txtNombreSedeComunal;

	/**
	 * Create the panel.
	 */
	public AltaComunaVisual(JFrame marco) {
		setLayout(null);
		
		textFieldSedeComunal = new JTextField();
		textFieldSedeComunal.setBounds(299, 140, 86, 20);
		add(textFieldSedeComunal);
		textFieldSedeComunal.setColumns(10);
		
		txtNombreSedeComunal = new JTextField();
		txtNombreSedeComunal.setText("Nombre Sede Comunal");
		txtNombreSedeComunal.setBounds(43, 140, 137, 20);
		add(txtNombreSedeComunal);
		txtNombreSedeComunal.setColumns(10);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new MenuPrincipal(marco));
				marco.validate();
			}
		});
		btnNewButton.setBounds(32, 29, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alta Persona");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new AltaPersonaVisual(marco));
				marco.validate();
			}
		});
		btnNewButton_1.setBounds(174, 29, 108, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Alta Barrio");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new AltaBarrioVisual(marco));
				marco.validate();
			}
		});
		btnNewButton_2.setBounds(327, 29, 89, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Crear");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comuna c = capturarDatos();
				Alta a = new Alta();
				a.agregarComuna(c);
			}
		});
		btnNewButton_3.setBounds(188, 250, 89, 23);
		add(btnNewButton_3);

	}
	
	public Comuna capturarDatos() {
		String nombreSedeComunal = textFieldSedeComunal.getText();
		Comuna c = new Comuna(nombreSedeComunal, 1);
		return c;
	}

}
