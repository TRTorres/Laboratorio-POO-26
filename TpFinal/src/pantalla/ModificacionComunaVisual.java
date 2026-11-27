package pantalla;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Consultas.ConsultasComuna;
import clasesPrincipales.Comuna;

public class ModificacionComunaVisual extends JPanel {

	private JTextField textFieldSedeComunal;
	private JTextField txtNombreSedeComunal;
	private JTextField txtNumeroComuna;
	private JTextField textFieldNumero;

	public ModificacionComunaVisual(JFrame marco, int numeroComuna) {
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
		btnNewButton.setBounds(427, 688, 216, 83);
		add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Modificar");
		btnNewButton_3.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comuna c = capturarDatos();
				ConsultasComuna cc = new ConsultasComuna(); 
				cc.modificarComuna(c,numeroComuna);
			}
		});
		btnNewButton_3.setBounds(138, 688, 211, 83);
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
