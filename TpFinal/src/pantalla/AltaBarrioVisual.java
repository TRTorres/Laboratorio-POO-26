package pantalla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Consultas.Alta;
import clasesPrincipales.Barrio;
import clasesPrincipales.DeUbanizacionPlanificada;
import clasesPrincipales.Persona;
import enumeradores.SituacionLaboral;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

public class AltaBarrioVisual extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombreBarrio;
	private JTextField txtSuperficie;
	private JTextField txtNumeroLey;
	private JTextField txtCuentaConConexion;
	private JTextField txtNumeroComuna;
	private JTextField textFieldNombre;
	private JTextField textFieldSuperficie;
	private JTextField textFieldLey;
	private JTextField textFieldNumeroComuna;
	private JCheckBox checkBox = new JCheckBox("");
	/**
	 * Create the panel.
	 */
	public AltaBarrioVisual(JFrame marco) {
		setLayout(null);
		
		txtNombreBarrio = new JTextField();
		txtNombreBarrio.setText("Nombre Barrio");
		txtNombreBarrio.setBounds(10, 27, 121, 20);
		add(txtNombreBarrio);
		txtNombreBarrio.setColumns(10);
		
		txtSuperficie = new JTextField();
		txtSuperficie.setText("Superficie");
		txtSuperficie.setBounds(10, 71, 121, 20);
		add(txtSuperficie);
		txtSuperficie.setColumns(10);
		
		txtNumeroLey = new JTextField();
		txtNumeroLey.setText("Numero Ley");
		txtNumeroLey.setBounds(10, 116, 121, 20);
		add(txtNumeroLey);
		txtNumeroLey.setColumns(10);
		
		txtCuentaConConexion = new JTextField();
		txtCuentaConConexion.setText("Cuenta con Conexion?");
		txtCuentaConConexion.setBounds(10, 159, 121, 20);
		add(txtCuentaConConexion);
		txtCuentaConConexion.setColumns(10);
		
		txtNumeroComuna = new JTextField();
		txtNumeroComuna.setText("Numero Comuna");
		txtNumeroComuna.setBounds(10, 206, 121, 20);
		add(txtNumeroComuna);
		txtNumeroComuna.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(312, 27, 86, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldSuperficie = new JTextField();
		textFieldSuperficie.setBounds(312, 71, 86, 20);
		add(textFieldSuperficie);
		textFieldSuperficie.setColumns(10);
		
		textFieldLey = new JTextField();
		textFieldLey.setBounds(312, 116, 86, 20);
		add(textFieldLey);
		textFieldLey.setColumns(10);
		
		textFieldNumeroComuna = new JTextField();
		textFieldNumeroComuna.setBounds(312, 206, 86, 20);
		add(textFieldNumeroComuna);
		textFieldNumeroComuna.setColumns(10);
		
		checkBox.setSelected(true);
		checkBox.setBounds(312, 159, 97, 23);
		add(checkBox);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Barrio b = capturarDatos();
				Alta a = new Alta();
				a.agregarBarrioDeUrbanizacionPlanificada(b, (DeUbanizacionPlanificada)b);
			}
		});
		btnNewButton.setBounds(182, 229, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new MenuPrincipal(marco));
				marco.validate();
			}
		});
		btnNewButton_1.setBounds(182, 263, 89, 23);
		add(btnNewButton_1);
		marco.setBounds(100,100,800,800);
	}
	
	public Barrio capturarDatos() {
		String nombre = textFieldNombre.getText();
		int hectareas = Integer.valueOf(textFieldSuperficie.getText());
		int numero_comuna = Integer.valueOf(textFieldNumeroComuna.getText());
		boolean cuentaConConexion = checkBox.isSelected();
		int numeroLey = Integer.valueOf(textFieldLey.getText());
		DeUbanizacionPlanificada b = new DeUbanizacionPlanificada(nombre, hectareas, numero_comuna, numeroLey,cuentaConConexion);;
		return b;
	}
}
