/*package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class PanelPersona extends JPanel {
	private JTextField textFieldSecretos;
	private JTextField textFieldLocura;
	private JTextField textFieldUbicacion;

	
	public Persona crearPersona() {
		int locura = Integer.parseInt(textFieldLocura.getText());
		int secretos = Integer.parseInt(textFieldSecretos.getText());
		Persona p1 = new Persona(locura,secretos);
		return p1;
	}
	
	public PanelPersona() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("locura");
		lblNewLabel.setBounds(10, 59, 107, 14);
		add(lblNewLabel);
		
		textFieldSecretos = new JTextField();
		textFieldSecretos.setBounds(133, 56, 86, 20);
		add(textFieldSecretos);
		textFieldSecretos.setColumns(10);
		
		textFieldLocura = new JTextField();
		textFieldLocura.setBounds(133, 87, 86, 20);
		add(textFieldLocura);
		textFieldLocura.setColumns(10);
		
		textFieldUbicacion = new JTextField();
		textFieldUbicacion.setBounds(133, 118, 86, 20);
		add(textFieldUbicacion);
		textFieldUbicacion.setColumns(10);
		
		JLabel lblSecretos = new JLabel("secretos");
		lblSecretos.setBounds(10, 93, 107, 14);
		add(lblSecretos);
		
	}
}
*/