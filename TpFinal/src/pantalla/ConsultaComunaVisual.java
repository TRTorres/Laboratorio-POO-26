package pantalla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Consultas.Baja;
import Consultas.Consultar;
import clasesPrincipales.Comuna;
import clasesPrincipales.Persona;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.ScrollPane;

public class ConsultaComunaVisual extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	Consultar consultar = new Consultar();
	DefaultTableModel modelo;
	Object[] columnas = new Object[] { "Numero", "Nombre", "Cantidad Barrios"};
	
	/**
	 * Create the panel.
	 */
	public ConsultaComunaVisual(JFrame marco) {
		setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 62, 239, 167);
		add(table);
		
		llenarTabla();
		JButton btnNewButton = new JButton("Ver Persona");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new ConsultaPersonaVisual(marco));
				marco.validate();
			}
		});
		btnNewButton.setBounds(296, 58, 103, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baja b = new Baja();
				b.eliminarBarrio(ABORT);
			}
		});
		btnNewButton_1.setBounds(296, 206, 103, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ver Detalle");
		btnNewButton_2.setBounds(296, 133, 103, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Volver");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new MenuPrincipal(marco));
				marco.validate();
			}
		});
		btnNewButton_3.setBounds(185, 266, 89, 23);
		add(btnNewButton_3);
		marco.setBounds(100,100,800,800);
		
	}

	public void llenarTabla() {
		modelo = new DefaultTableModel(columnas, 0);
		table.setModel(modelo); 
		for (Comuna c : consultar.consultarComuna()) { 
		modelo.addRow(new Object[] {c.getNombreComuna()});
		} 
	}
}
