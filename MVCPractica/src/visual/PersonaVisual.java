package visual;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.DAO;
import modelo.Persona;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PersonaVisual extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tablaPersona;
	private Object [] columnas = new Object[] {"Nombre", "Edad", "Nivel Estudios", "Hijos?", "DNI"};
	DefaultTableModel modelo;
	JScrollPane scrollPane;
	JButton btnNewButton;
	
	/**
	 * Create the panel.
	 */
	public PersonaVisual(JFrame pantalla) {
		setBackground(new Color(82, 0, 164));
		setLayout(null);
		tablaPersona = new JTable();
		pantalla.setBounds(100,100,900,700);
		btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setContentPane(new PantallaPrincipal(pantalla));
				pantalla.setVisible(true);
				pantalla.validate();
			}
		});
		llenarTabla();
	}
	
	public void llenarTabla() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(200, 195, 457, 357);
		add(scrollPane);
		modelo = new DefaultTableModel(columnas, 0);
		tablaPersona.setModel(modelo);
		scrollPane.setViewportView(tablaPersona);
		
		btnNewButton.setBounds(382, 87, 109, 23);
		add(btnNewButton);
		DAO d = new DAO();
		for(Persona p: d.consultar()) {
			p.getNacimiento().atStartOfDay();
			modelo.addRow(new Object[] {p.getNombre(), p.getNacimiento(), p.getTieneHijos(), p.getIdEstudio(), p.getDni()});
		}
		scrollPane.setVisible(true);
		scrollPane.validate();
	}
}