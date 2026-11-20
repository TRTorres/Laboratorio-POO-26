package pantalla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Consultas.Alta;
import Consultas.Consultar;
import Consultas.Modificacion;
import clasesPrincipales.Persona;
import enumeradores.SituacionLaboral;

import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;

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
		textFieldDNI.setBounds(465, 65, 239, 59);
		add(textFieldDNI);
		textFieldDNI.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(465, 177, 239, 59);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldFechaNacimiento = new JTextField();
		textFieldFechaNacimiento.setBounds(465, 273, 239, 59);
		add(textFieldFechaNacimiento);
		textFieldFechaNacimiento.setColumns(10);
		
		comboBoxSituacionLaboral.setBounds(465, 376, 239, 60);
		add(comboBoxSituacionLaboral);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setFont(new Font("Yu Gothic", Font.PLAIN, 29));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persona p = capturarDatos();
				Consultar c = new Consultar();
				Modificacion m = new Modificacion();
				Alta a = new Alta();
				for(Persona pp : c.consultarPersona()) {
					if(pp.getDniPersona() == p.getDniPersona()) {
						m.modificarPersona(p);
					}else {
						a.agregarPersona(p);
					}
				}
			}
		});
		btnNewButton.setBounds(167, 619, 173, 82);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new MenuPrincipal(marco));
				marco.validate();
			}
		});
		btnNewButton_1.setBounds(465, 619, 147, 82);
		add(btnNewButton_1);
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtDni.setText("DNI");
		txtDni.setBounds(113, 65, 226, 59);
		add(txtDni);
		txtDni.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtNombre.setText("Nombre");
		txtNombre.setBounds(113, 177, 227, 59);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtFechaDeNacimiento = new JTextField();
		txtFechaDeNacimiento.setFont(new Font("Yu Gothic", Font.PLAIN, 13));
		txtFechaDeNacimiento.setText("Fecha de nacimiento (año-mes-dia)");
		txtFechaDeNacimiento.setBounds(113, 273, 226, 59);
		add(txtFechaDeNacimiento);
		txtFechaDeNacimiento.setColumns(10);
		
		txtEstadoLaboral = new JTextField();
		txtEstadoLaboral.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtEstadoLaboral.setText("Estado laboral");
		txtEstadoLaboral.setBounds(113, 377, 227, 59);
		add(txtEstadoLaboral);
		txtEstadoLaboral.setColumns(10);
		
		txtIdbarrio = new JTextField();
		txtIdbarrio.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtIdbarrio.setText("Id del barrio");
		txtIdbarrio.setBounds(113, 492, 226, 59);
		add(txtIdbarrio);
		txtIdbarrio.setColumns(10);
		
		textFieldIdBarrio = new JTextField();
		textFieldIdBarrio.setBounds(465, 492, 239, 59);
		add(textFieldIdBarrio);
		textFieldIdBarrio.setColumns(10);
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
