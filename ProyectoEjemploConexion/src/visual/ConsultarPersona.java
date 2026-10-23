package visual;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dao.DAO;
import modelo.Persona;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ConsultarPersona extends JPanel {

	private static final long serialVersionUID = 1L;
	DAO miPrimerDao = new DAO();
	private JButton btnVolver;
	private JTable table;
	DAO d = new DAO();
	JScrollPane scrollPane;
	Object [] columnas = new Object[]{"Id", "Nombre", "Apellido"};
	DefaultTableModel modelo;
	/**
	 * Create the panel.
	 */
	public ConsultarPersona(JFrame marco) {
		setLayout(null);
		llenarTabla();
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//consultar();
				llenarTabla();
			}
		});
		btnConsultar.setBounds(167, 266, 89, 23);
		add(btnConsultar);
		
		btnVolver = new JButton("Volver al Inicio");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new ejemplo(marco));
				marco.setVisible(true);
				marco.validate();
			}
		});
		btnVolver.setBounds(10, 11, 153, 23);
		add(btnVolver);
		
		
		scrollPane.setBounds(77, 61, 256, 177);
		add(scrollPane);
		
	}
	
	public void llenarTabla() {
		table = new JTable();
		scrollPane = new JScrollPane();
		modelo = new DefaultTableModel(columnas, 0);
		table.setModel(modelo);
		scrollPane.setViewportView(table);
		DAO d = new DAO();
		for(Persona p: d.consultar()) {
			modelo.addRow(new Object[] {p.getId(), p.getNombre(), p.getApellido()});
		}
	}
	
	public void vaciarTabla() {
		modelo.setRowCount(0);
	}
	
	/*public Persona capturarId() {
		String nombre = textFieldNombre.getText();
		float id = Float.valueOf(textFieldId.getText());
		Persona p = new Persona(id, nombre, null);
		return p;
	}*/
	
	/*public Persona consultar() {
		miPrimerDao.conectar();
		Persona p = capturarId();
		ArrayList<Persona> resultado = miPrimerDao.consultar();
		for(Persona pp: resultado) {
			System.out.println(pp);
			//textFieldConsulta.setText(pp);
		}
		return p;
	}*/
	
}
