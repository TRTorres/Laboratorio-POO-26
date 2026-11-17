package pantalla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Consultas.Alta;
import clasesPrincipales.Persona;
import enumeradores.SituacionLaboral;

import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class AltaPersonaVisual extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldDNI;
	private JTextField textFieldNombre;
	private JTextField textFieldFechaNacimiento;
	private JTextField txtDni;
	private JTextField txtNombre;
	private JTextField txtFechaDeNacimiento;
	private JTextField txtEstadoLaboral;
	JComboBox<SituacionLaboral> comboBoxSituacionLaboral = new JComboBox<>(SituacionLaboral.values());
	private JTextField txtIdbarrio;
	private JTextField textFieldIdBarrio;
	/**
	 * Create the panel.
	 */
	public AltaPersonaVisual(JFrame marco) {
		setLayout(null);
		SituacionLaboral situacion; 
		textFieldDNI = new JTextField();
		textFieldDNI.setBounds(255, 45, 86, 20);
		add(textFieldDNI);
		textFieldDNI.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(255, 91, 86, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldFechaNacimiento = new JTextField();
		textFieldFechaNacimiento.setBounds(255, 139, 86, 20);
		add(textFieldFechaNacimiento);
		textFieldFechaNacimiento.setColumns(10);
		
		comboBoxSituacionLaboral.setBounds(255, 187, 86, 22);
		add(comboBoxSituacionLaboral);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persona p = capturarDatos();
				Alta a = new Alta();
				a.agregarPersona(p);
			}
		});
		btnNewButton.setBounds(168, 266, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new MenuPrincipal(marco));
				marco.validate();
			}
		});
		btnNewButton_1.setBounds(46, 11, 89, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Alta Comuna");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new AltaComunaVisual(marco));
				marco.validate();
			}
		});
		btnNewButton_2.setBounds(158, 11, 99, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Alta Barrio");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new AltaBarrioVisual(marco));
				marco.validate();
			}
		});
		btnNewButton_3.setBounds(288, 11, 89, 23);
		add(btnNewButton_3);
		
		txtDni = new JTextField();
		txtDni.setText("DNI");
		txtDni.setBounds(46, 45, 124, 20);
		add(txtDni);
		txtDni.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(46, 91, 124, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtFechaDeNacimiento = new JTextField();
		txtFechaDeNacimiento.setText("Fecha de Nacimiento");
		txtFechaDeNacimiento.setBounds(46, 139, 124, 20);
		add(txtFechaDeNacimiento);
		txtFechaDeNacimiento.setColumns(10);
		
		txtEstadoLaboral = new JTextField();
		txtEstadoLaboral.setText("Estado Laboral");
		txtEstadoLaboral.setBounds(46, 188, 124, 20);
		add(txtEstadoLaboral);
		txtEstadoLaboral.setColumns(10);
		
		txtIdbarrio = new JTextField();
		txtIdbarrio.setText("IdBarrio");
		txtIdbarrio.setBounds(46, 219, 124, 20);
		add(txtIdbarrio);
		txtIdbarrio.setColumns(10);
		
		textFieldIdBarrio = new JTextField();
		textFieldIdBarrio.setBounds(255, 220, 86, 20);
		add(textFieldIdBarrio);
		textFieldIdBarrio.setColumns(10);
		
		JTextPane txtpnFormatoAomesdia = new JTextPane();
		txtpnFormatoAomesdia.setText("Formato año-mes-dia");
		txtpnFormatoAomesdia.setBounds(351, 124, 89, 44);
		add(txtpnFormatoAomesdia);
		marco.setBounds(100,100,800,800);
		
	}
	
	public Persona capturarDatos() {
		int dni = Integer.valueOf(textFieldDNI.getText());
		String nombre = textFieldNombre.getText();
		LocalDate fecha = LocalDate.parse(textFieldFechaNacimiento.getText());
		SituacionLaboral situacion = (SituacionLaboral) comboBoxSituacionLaboral.getSelectedItem();
		int idBarrio = Integer.valueOf(textFieldIdBarrio.getText());
		Persona p = new Persona(dni, nombre, fecha, situacion, idBarrio);
		return p;
	}
}
