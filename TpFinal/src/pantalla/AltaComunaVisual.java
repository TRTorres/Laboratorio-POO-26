package pantalla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Consultas.Alta;
import Consultas.Consultar;
import Consultas.Modificacion;
import clasesPrincipales.Comuna;
import clasesPrincipales.Persona;
import enumeradores.SituacionLaboral;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AltaComunaVisual extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldSedeComunal;
	private JTextField txtNombreSedeComunal;
	private JTextField txtNumeroComuna;
	private JTextField textFieldNumero;

	/**
	 * Create the panel.
	 */
	public AltaComunaVisual(JFrame marco) {
		setLayout(null);
		
		textFieldSedeComunal = new JTextField();
		textFieldSedeComunal.setBounds(427, 396, 245, 76);
		add(textFieldSedeComunal);
		textFieldSedeComunal.setColumns(10);
		
		txtNombreSedeComunal = new JTextField();
		txtNombreSedeComunal.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtNombreSedeComunal.setText("Nombre Sede Comunal");
		txtNombreSedeComunal.setBounds(104, 396, 245, 76);
		add(txtNombreSedeComunal);
		txtNombreSedeComunal.setColumns(10);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new MenuPrincipal(marco));
				marco.validate();
			}
		});
		btnNewButton.setBounds(427, 688, 157, 83);
		add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Crear");
		btnNewButton_3.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comuna c = capturarDatos();
				Consultar cc = new Consultar();
				Modificacion m = new Modificacion();
				Alta a = new Alta();
				for (Comuna co : cc.consultarComuna()) {
					if(c.getNumeroComuna() == co.getNumeroComuna()) {
						m.modificarComuna(c);
					}
					else {
						a.agregarComuna(c);
					}
				}
			}
		});
		btnNewButton_3.setBounds(200, 688, 149, 83);
		add(btnNewButton_3);
		
		txtNumeroComuna = new JTextField();
		txtNumeroComuna.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtNumeroComuna.setText("Numero Comuna");
		txtNumeroComuna.setBounds(104, 181, 245, 71);
		add(txtNumeroComuna);
		txtNumeroComuna.setColumns(10);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setBounds(427, 181, 245, 71);
		add(textFieldNumero);
		textFieldNumero.setColumns(10);

	}
	
	public Comuna capturarDatos() {
		int numeroComuna = Integer.valueOf(textFieldNumero.getText());
		String nombreSedeComunal = textFieldSedeComunal.getText(); 
		Comuna c = new Comuna(numeroComuna,nombreSedeComunal,0);
		return c;
	}
}