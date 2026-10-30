package visual;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dao.DAO;
import enumm.NombreEstudio;
import modelo.Persona;

import java.awt.Checkbox;
import java.time.LocalDate;

import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AgregarPersonaVisual extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNombre;
	private JTextField textField_2;
	private JTextField textFieldDNI;
	private JTextField txtNombre;
	private JTextField txtCuandoNaciste;
	private JTextField txtDni;
	private JTextField txtNivelEstudios;
	private NombreEstudio estudio;
	JCheckBox chckbxNewCheckBox;
	DAO d = new DAO();
	
	public AgregarPersonaVisual(JFrame pantalla) {
		setBackground(new Color(82, 0, 164));
		setLayout(null);
		pantalla.setBounds(100,100,900,700);
		pantalla.validate();
		estudio = null;
		DAO d = new DAO();
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(522, 135, 162, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(522, 208, 162, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setBounds(522, 277, 162, 20);
		add(textFieldDNI);
		textFieldDNI.setColumns(10);
		
		chckbxNewCheckBox = new JCheckBox("Tiene hijos?");
		chckbxNewCheckBox.setBounds(372, 404, 97, 23);
		add(chckbxNewCheckBox);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(196, 135, 106, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCuandoNaciste = new JTextField();
		txtCuandoNaciste.setText("Cuando naciste?");
		txtCuandoNaciste.setBounds(196, 208, 106, 20);
		add(txtCuandoNaciste);
		txtCuandoNaciste.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setText("DNI");
		txtDni.setBounds(196, 277, 106, 20);
		add(txtDni);
		txtDni.setColumns(10);
		
		txtNivelEstudios = new JTextField();
		txtNivelEstudios.setText("Nivel Estudios");
		txtNivelEstudios.setBounds(196, 347, 106, 20);
		add(txtNivelEstudios);
		txtNivelEstudios.setColumns(10);
		
		JComboBox<NombreEstudio> comboBox = new JComboBox<>(NombreEstudio.values());
		comboBox.setEditable(true);
		comboBox.setBounds(522, 346, 162, 22);
		add(comboBox);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persona p = capturarDatos();
				d.agregarPersonaPorParametro(p);
			}
		});
		btnNewButton.setBounds(273, 477, 287, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setContentPane(new PantallaPrincipal(pantalla));
				pantalla.setVisible(true);
				pantalla.validate();
			}
		});
		btnNewButton_1.setBounds(372, 73, 97, 23);
		add(btnNewButton_1);

	}
	
	public Persona capturarDatos() {
		NombreEstudio estudio = NombreEstudio.valueOf(txtNivelEstudios.getText());
		int idEstudios = estudio.getIdEstudio();
		int dni= Integer.valueOf(txtDni.getText());
		String nombre = txtNombre.getText();
		LocalDate nacimiento= LocalDate.parse((CharSequence) txtCuandoNaciste);
		boolean tieneHijos= chckbxNewCheckBox.isSelected();
		Persona p = new Persona(nombre, nacimiento,tieneHijos,idEstudios,dni);
		return p;
	}
}
