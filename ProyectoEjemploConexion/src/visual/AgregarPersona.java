package visual;

import javax.swing.JPanel;
import javax.swing.JTextField;

import dao.DAO;
import modelo.Persona;

import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarPersona extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtId;
	private JTextField textFieldId;
	private JButton btnVolverAlMenu;
	
	/**
	 * Create the panel.
	 */
	public AgregarPersona(JFrame marco) {
		setLayout(null);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(268, 91, 86, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(268, 134, 86, 20);
		add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(96, 91, 86, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setText("Apellido");
		txtApellido.setBounds(96, 134, 86, 20);
		add(txtApellido);
		txtApellido.setColumns(10);
		
		txtId = new JTextField();
		txtId.setText("ID");
		txtId.setBounds(96, 180, 86, 20);
		add(txtId);
		txtId.setColumns(10);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persona p1 = capturarDatos();
				DAO d = new DAO();
				d.agregarPersonaPorParametro(p1);
				System.out.println("Se agrego bien");
			}
		});
		btnNewButton.setBounds(182, 235, 89, 23);
		add(btnNewButton);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(268, 180, 86, 20);
		add(textFieldId);
		textFieldId.setColumns(10);
		
		btnVolverAlMenu = new JButton("Volver al Inicio");
		btnVolverAlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new ejemplo(marco));
				marco.setVisible(true);
				marco.validate();
			}
		});
		btnVolverAlMenu.setBounds(10, 11, 123, 23);
		add(btnVolverAlMenu);

	}
	
	public Persona capturarDatos() {
		String nombre = textFieldNombre.getText();
		String apellido = textFieldApellido.getText();
		float id = Float.valueOf(textFieldId.getText());
		Persona p = new Persona(id, nombre, apellido);
		return p;
	}
}
