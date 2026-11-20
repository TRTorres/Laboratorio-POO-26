package pantalla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Consultas.Baja;
import Consultas.Consultar;
import Consultas.Modificacion;
import clasesPrincipales.Persona;
import dao.dao;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ConsultaPersonaVisual extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	Consultar consultar = new Consultar();
	DefaultTableModel modelo;
	Object[] columnas = new Object[] { "DNI", "Nombre", "FechaNac", "SituacionLab", "IdBarrio" };
	/**
	 * Create the panel.
	 */
	public ConsultaPersonaVisual(JFrame marco) {
		setLayout(null);
		
		table = new JTable();
		table.setBounds(26, 34, 708, 647);
		add(table);
		
		llenarTabla();
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baja b = new Baja();
				int filaSeleccionada = table.getSelectedRow();
				Object a = modelo.getValueAt(filaSeleccionada, 0); 
			    int dni = Integer.parseInt(a.toString());
				b.eliminarPersona(dni);
				llenarTabla();
			}
		});
		btnEliminar.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnEliminar.setBounds(551, 708, 183, 70);
		add(btnEliminar);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new MenuPrincipal(marco));
				marco.validate();
			}
		});
		btnNewButton.setBounds(26, 708, 183, 70);
		add(btnNewButton);
		marco.setBounds(100,100,800,800);
		
	}
	
	public void llenarTabla() {
		
		modelo = new DefaultTableModel(columnas, 0);
		table.setModel(modelo); 
		for (Persona p : consultar.consultarPersona()) { 
		modelo.addRow(new Object[] {p.getDniPersona(),p.getNombrePersona(), p.getFechaDeNacimiento(), p.getEstadoLaboral(), p.getIdBarrio()});
		} 

	}
}
