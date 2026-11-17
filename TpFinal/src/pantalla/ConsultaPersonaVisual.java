package pantalla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Consultas.Consultar;
import clasesPrincipales.Persona;
import dao.dao;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaPersonaVisual extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	Consultar consultar = new Consultar();
	DefaultTableModel modelo;
	Object[] columnas = new Object[] { "Nombre", "DNI", "FechaNac", "SituacionLab", "IdBarrio" };
	/**
	 * Create the panel.
	 */
	public ConsultaPersonaVisual(JFrame marco) {
		setLayout(null);
		
		table = new JTable();
		table.setBounds(26, 71, 230, 155);
		add(table);
		
		llenarTabla();
		JButton btnNewButtonBarrio = new JButton("Ver Barrios");
		btnNewButtonBarrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new ConsultaBarrioVisual(marco));
				marco.validate();
			}
		});
		btnNewButtonBarrio.setBounds(297, 67, 114, 23);
		add(btnNewButtonBarrio);
		
		JButton btnNewButtonComunas = new JButton("Ver Comunas");
		btnNewButtonComunas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new ConsultaComunaVisual(marco));
				marco.validate();
			}
		});
		btnNewButtonComunas.setBounds(297, 131, 114, 23);
		add(btnNewButtonComunas);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(297, 203, 114, 23);
		add(btnEliminar);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new MenuPrincipal(marco));
				marco.validate();
			}
		});
		btnNewButton.setBounds(199, 254, 89, 23);
		add(btnNewButton);
		marco.setBounds(100,100,800,800);
		
	}
	
	public void llenarTabla() {
		
		modelo = new DefaultTableModel(columnas, 0);
		table.setModel(modelo); 
		for (Persona p : consultar.consultarPersona()) { 
		modelo.addRow(new Object[] {p.getNombrePersona(), p.getDniPersona(), p.getFechaDeNacimiento(), p.getEstadoLaboral(), p.getIdBarrio()});
		} 

	}
}
