package pantalla;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import Consultas.ConsultasBarrio;
import clasesPrincipales.DeComplejoHabitacional;
import clasesPrincipales.DeTrazadoFormal;
import clasesPrincipales.DeUrbanizacionPlanificada;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JComboBox;

public class AltaBarrioVisual extends JPanel {

	private JTextField textFieldNombre;
	private JTextField textFieldSuperficie;
	private JTextField textFieldCantMonoblocks;
	private JTextField textFieldNumeroComuna;
	private JCheckBox chckbxNewCheckBox = new JCheckBox("");
	JCheckBox chckbxNewCheckBoxCuentaConConexion = new JCheckBox("");
	private String[] tipoBarrios = {"DeComplejoHabitacional", "DeTrazadoFormal", "DeUrbanizacionPlanificada"};
	JComboBox<String> comboBox = new JComboBox<>(tipoBarrios);
	private JTextField textFieldCantEdificios;
	private JTextField textFieldPorcentajeAsfaltado;
	private JTextField textFieldNumeroDeLey;
	/**
	 * Create the panel.
	 */
	public AltaBarrioVisual(JFrame marco) {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new MenuPrincipal(marco));
				marco.validate();
			}
		});
		
		comboBox.setBounds(460, 191, 240, 60);
		add(comboBox);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultasBarrio c = new ConsultasBarrio();
				String l = (String) comboBox.getSelectedItem();
				switch(l) {
					case "DeComplejoHabitacional":
						DeComplejoHabitacional b = capturarDatosC();
						c.agregarBarrioDeComplejoHabitacional(b);
						break;
					case "DeTrazadoFormal":
						DeTrazadoFormal t = capturarDatosT();
						c.agregarBarrioDeTrazadoFormal(t);
						break;
					case "DeUrbanizacionPlanificada":
						DeUrbanizacionPlanificada u = capturarDatosU();
						c.agregarBarrioDeUrbanizacionPlanificada(u);
						break;	
				}
			}
		});
		btnCrear.setBounds(208, 695, 166, 76);
		add(btnCrear);
		
		JTextPane txtpnNombreDelBarrio = new JTextPane();
		txtpnNombreDelBarrio.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtpnNombreDelBarrio.setText("Nombre del barrio");
		txtpnNombreDelBarrio.setBounds(125, 11, 249, 60);
		add(txtpnNombreDelBarrio);
		
		JTextPane txtpnSuperficie = new JTextPane();
		txtpnSuperficie.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtpnSuperficie.setText("Superficie");
		txtpnSuperficie.setBounds(125, 101, 249, 60);
		add(txtpnSuperficie);
		
		JTextPane txtpnCantidadDeMonoblocks = new JTextPane();
		txtpnCantidadDeMonoblocks.setEnabled(false);
		txtpnCantidadDeMonoblocks.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtpnCantidadDeMonoblocks.setText("Cantidad de monoblocks");
		txtpnCantidadDeMonoblocks.setBounds(125, 299, 249, 60);
		add(txtpnCantidadDeMonoblocks);
		
		JTextPane txtpnposeeConsorcio = new JTextPane();
		txtpnposeeConsorcio.setEnabled(false);
		txtpnposeeConsorcio.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtpnposeeConsorcio.setText("¿Posee consorcio?");
		txtpnposeeConsorcio.setBounds(122, 406, 252, 60);
		add(txtpnposeeConsorcio);
		
		JTextPane txtpnNumeroDeComuna = new JTextPane();
		txtpnNumeroDeComuna.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtpnNumeroDeComuna.setText("Numero de comuna");
		txtpnNumeroDeComuna.setBounds(125, 514, 249, 60);
		add(txtpnNumeroDeComuna);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(460, 11, 240, 60);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldSuperficie = new JTextField();
		textFieldSuperficie.setColumns(10);
		textFieldSuperficie.setBounds(460, 101, 240, 60);
		add(textFieldSuperficie);
		
		textFieldCantMonoblocks = new JTextField();
		textFieldCantMonoblocks.setEnabled(false);
		textFieldCantMonoblocks.setColumns(10);
		textFieldCantMonoblocks.setBounds(460, 299, 240, 60);
		add(textFieldCantMonoblocks);
		
		textFieldNumeroComuna = new JTextField();
		textFieldNumeroComuna.setColumns(10);
		textFieldNumeroComuna.setBounds(460, 514, 240, 60);
		add(textFieldNumeroComuna);
		chckbxNewCheckBox.setEnabled(false);
		
		chckbxNewCheckBox.setBounds(460, 395, 223, 61);
		add(chckbxNewCheckBox);
		
		JTextPane txtpnTipoDeBarrio = new JTextPane();
		txtpnTipoDeBarrio.setText("Tipo de barrio");
		txtpnTipoDeBarrio.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtpnTipoDeBarrio.setBounds(125, 191, 249, 60);
		add(txtpnTipoDeBarrio);

		btnNewButton.setBounds(460, 695, 166, 76);
		add(btnNewButton);
		
		JTextPane txtpnCantidadDeEdificios = new JTextPane();
		txtpnCantidadDeEdificios.setEnabled(false);
		txtpnCantidadDeEdificios.setText("Cantidad de edificios");
		txtpnCantidadDeEdificios.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtpnCantidadDeEdificios.setBounds(125, 299, 249, 60);
		add(txtpnCantidadDeEdificios);
		
		textFieldCantEdificios = new JTextField();
		textFieldCantEdificios.setEnabled(false);
		textFieldCantEdificios.setColumns(10);
		textFieldCantEdificios.setBounds(460, 299, 240, 60);
		add(textFieldCantEdificios);
		
		JTextPane txtpnPorcentajeDeAsfaltado = new JTextPane();
		txtpnPorcentajeDeAsfaltado.setEnabled(false);
		txtpnPorcentajeDeAsfaltado.setText("Porcentaje de asfaltado");
		txtpnPorcentajeDeAsfaltado.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtpnPorcentajeDeAsfaltado.setBounds(125, 406, 249, 60);
		add(txtpnPorcentajeDeAsfaltado);
		
		textFieldPorcentajeAsfaltado = new JTextField();
		textFieldPorcentajeAsfaltado.setEnabled(false);
		textFieldPorcentajeAsfaltado.setColumns(10);
		textFieldPorcentajeAsfaltado.setBounds(460, 396, 240, 60);
		add(textFieldPorcentajeAsfaltado);
		
		JTextPane txtpnNumeroDeLey = new JTextPane();
		txtpnNumeroDeLey.setEnabled(false);
		txtpnNumeroDeLey.setText("Numero de ley");
		txtpnNumeroDeLey.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtpnNumeroDeLey.setBounds(125, 299, 249, 60);
		add(txtpnNumeroDeLey);
		
		textFieldNumeroDeLey = new JTextField();
		textFieldNumeroDeLey.setEnabled(false);
		textFieldNumeroDeLey.setColumns(10);
		textFieldNumeroDeLey.setBounds(460, 299, 240, 60);
		add(textFieldNumeroDeLey);
		
		JTextPane txtpncuentaConConexion = new JTextPane();
		txtpncuentaConConexion.setEnabled(false);
		txtpncuentaConConexion.setText("¿Cuenta con conexion?");
		txtpncuentaConConexion.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		txtpncuentaConConexion.setBounds(125, 406, 249, 60);
		add(txtpncuentaConConexion);
		

		chckbxNewCheckBoxCuentaConConexion.setEnabled(false);
		chckbxNewCheckBoxCuentaConConexion.setBounds(460, 406, 240, 50);
		add(chckbxNewCheckBoxCuentaConConexion);
		txtpnCantidadDeEdificios.setVisible(false);
		textFieldCantEdificios.setVisible(false);
		txtpnPorcentajeDeAsfaltado.setVisible(false);
		textFieldPorcentajeAsfaltado.setVisible(false);
		txtpnNumeroDeLey.setVisible(false);
		textFieldNumeroDeLey.setVisible(false);
		txtpncuentaConConexion.setVisible(false);
		chckbxNewCheckBoxCuentaConConexion.setVisible(false);
		txtpnposeeConsorcio.setVisible(false);
		txtpnCantidadDeMonoblocks.setVisible(false);
		textFieldCantMonoblocks.setVisible(false);
		chckbxNewCheckBox.setVisible(false);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = (String) comboBox.getSelectedItem();
				switch(a) {
				case "DeComplejoHabitacional":
					txtpnNumeroDeLey.setEnabled(false);
					textFieldNumeroDeLey.setEnabled(false);
					txtpncuentaConConexion.setEnabled(false);
					chckbxNewCheckBoxCuentaConConexion.setEnabled(false);
					txtpnNumeroDeLey.setVisible(false);
					textFieldNumeroDeLey.setVisible(false);
					txtpncuentaConConexion.setVisible(false);
					chckbxNewCheckBoxCuentaConConexion.setVisible(false);
					txtpnCantidadDeEdificios.setVisible(false);
					textFieldCantEdificios.setVisible(false);
					txtpnPorcentajeDeAsfaltado.setVisible(false);
					textFieldPorcentajeAsfaltado.setVisible(false);
					txtpnCantidadDeEdificios.setEnabled(false);
					textFieldCantEdificios.setEnabled(false);
					txtpnPorcentajeDeAsfaltado.setEnabled(false);
					textFieldPorcentajeAsfaltado.setEnabled(false);
					txtpnposeeConsorcio.setVisible(true);
					txtpnposeeConsorcio.setEnabled(true);
					txtpnCantidadDeMonoblocks.setVisible(true);
					txtpnCantidadDeMonoblocks.setEnabled(true);
					textFieldCantMonoblocks.setVisible(true);
					textFieldCantMonoblocks.setEnabled(true);
					chckbxNewCheckBox.setVisible(true);
					chckbxNewCheckBox.setEnabled(true);
					break;
				case "DeTrazadoFormal":
					txtpnNumeroDeLey.setEnabled(false);
					textFieldNumeroDeLey.setEnabled(false);
					txtpncuentaConConexion.setEnabled(false);
					chckbxNewCheckBoxCuentaConConexion.setEnabled(false);
					txtpnNumeroDeLey.setVisible(false);
					textFieldNumeroDeLey.setVisible(false);
					txtpncuentaConConexion.setVisible(false);
					chckbxNewCheckBoxCuentaConConexion.setVisible(false);
					txtpnposeeConsorcio.setVisible(false);
					txtpnposeeConsorcio.setEnabled(false);
					txtpnCantidadDeMonoblocks.setVisible(false);
					txtpnCantidadDeMonoblocks.setEnabled(false);
					textFieldCantMonoblocks.setVisible(false);
					textFieldCantMonoblocks.setEnabled(false);
					chckbxNewCheckBox.setVisible(false);
					chckbxNewCheckBox.setEnabled(false);
					txtpnCantidadDeEdificios.setEnabled(true);
					textFieldCantEdificios.setEnabled(true);
					txtpnPorcentajeDeAsfaltado.setEnabled(true);
					textFieldPorcentajeAsfaltado.setEnabled(true);
					txtpnCantidadDeEdificios.setVisible(true);
					textFieldCantEdificios.setVisible(true);
					txtpnPorcentajeDeAsfaltado.setVisible(true);
					textFieldPorcentajeAsfaltado.setVisible(true);
					break;
				case "DeUrbanizacionPlanificada":
					txtpnposeeConsorcio.setVisible(false);
					txtpnposeeConsorcio.setEnabled(false);
					txtpnCantidadDeMonoblocks.setVisible(false);
					txtpnCantidadDeMonoblocks.setEnabled(false);
					textFieldCantMonoblocks.setVisible(false);
					textFieldCantMonoblocks.setEnabled(false);
					chckbxNewCheckBox.setVisible(false);
					chckbxNewCheckBox.setEnabled(false);
					txtpnCantidadDeEdificios.setEnabled(false);
					textFieldCantEdificios.setEnabled(false);
					txtpnPorcentajeDeAsfaltado.setEnabled(false);
					textFieldPorcentajeAsfaltado.setEnabled(false);
					txtpnCantidadDeEdificios.setVisible(false);
					textFieldCantEdificios.setVisible(false);
					txtpnPorcentajeDeAsfaltado.setVisible(false);
					textFieldPorcentajeAsfaltado.setVisible(false);
					txtpnNumeroDeLey.setEnabled(true);
					textFieldNumeroDeLey.setEnabled(true);
					txtpncuentaConConexion.setEnabled(true);
					chckbxNewCheckBoxCuentaConConexion.setEnabled(true);
					txtpnNumeroDeLey.setVisible(true);
					textFieldNumeroDeLey.setVisible(true);
					txtpncuentaConConexion.setVisible(true);
					chckbxNewCheckBoxCuentaConConexion.setVisible(true);
					break;
				}
			}
		});
		
	}
	
	public DeComplejoHabitacional capturarDatosC(){
		String nombre = textFieldNombre.getText();
		int superficie = Integer.valueOf(textFieldSuperficie.getText());
		String tipoBarrio = (String) comboBox.getSelectedItem();
		int cantidadMonoblocks = Integer.valueOf(textFieldCantMonoblocks.getText());
		boolean poseeConsorcio = chckbxNewCheckBox.isSelected();
		int numeroComuna = Integer.valueOf(textFieldNumeroComuna.getText());
		DeComplejoHabitacional b = new DeComplejoHabitacional(nombre, superficie, numeroComuna, tipoBarrio , cantidadMonoblocks, poseeConsorcio);
		return b;
	}
	
	public DeTrazadoFormal capturarDatosT(){
		String nombre = textFieldNombre.getText();
		int superficie = Integer.valueOf(textFieldSuperficie.getText());
		String tipoBarrio = (String) comboBox.getSelectedItem();
		int cantidadEdificios = Integer.valueOf(textFieldCantEdificios.getText());
		int porcentajeAsafaltado = Integer.valueOf(textFieldPorcentajeAsfaltado.getText());
		int numeroComuna = Integer.valueOf(textFieldNumeroComuna.getText());
		DeTrazadoFormal b = new DeTrazadoFormal(nombre, superficie, numeroComuna, tipoBarrio , cantidadEdificios, porcentajeAsafaltado);
		return b;
	}
	
	public DeUrbanizacionPlanificada capturarDatosU(){
		String nombre = textFieldNombre.getText();
		int superficie = Integer.valueOf(textFieldSuperficie.getText());
		String tipoBarrio = (String) comboBox.getSelectedItem();
		int numeroLey = Integer.valueOf(textFieldNumeroDeLey.getText());
		boolean cuentaConConexion = chckbxNewCheckBoxCuentaConConexion.isSelected();
		int numeroComuna = Integer.valueOf(textFieldNumeroComuna.getText());
		DeUrbanizacionPlanificada b = new DeUrbanizacionPlanificada(nombre, superficie, numeroComuna, tipoBarrio , numeroLey, cuentaConConexion);
		return b;
	}
}