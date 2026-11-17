package pantalla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Consultas.Consultar;
import clasesPrincipales.Barrio;
import clasesPrincipales.Comuna;
import clasesPrincipales.DeComplejoHabitacional;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaBarrioVisual extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	Consultar consultar = new Consultar();
	DefaultTableModel modelo;
	Object[] columnas = new Object[] { "IdBarrio", "Nombre", "TipoDeBarrio", "Superficie", "Cantidad Edificios", "Porcentaje Asfaltado"};
	/**
	 * Create the panel.
	 */
	public ConsultaBarrioVisual(JFrame marco) {
		setLayout(null);
		
		table = new JTable();
		table.setBounds(23, 63, 211, 148);
		add(table);
		
		llenarTabla();
		JButton btnNewButton = new JButton("Ver Persona");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new ConsultaPersonaVisual(marco));
				marco.validate();
			}
		});
		btnNewButton.setBounds(284, 59, 120, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ver Comuna");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new ConsultaComunaVisual(marco));
				marco.validate();
			}
		});
		btnNewButton_1.setBounds(284, 125, 120, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setBounds(284, 188, 120, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Volver");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new MenuPrincipal(marco));
				marco.validate();
			}
		});
		btnNewButton_3.setBounds(189, 266, 89, 23);
		add(btnNewButton_3);
		marco.setBounds(100,100,800,800);
		
	}
	public void llenarTabla() {
		
		modelo = new DefaultTableModel(columnas, 0);
		table.setModel(modelo); 
		for (Barrio b : consultar.consultarBarrioDeComplejoHabitacional()) { 
		modelo.addRow(new Object[] {b.getNombreBarrio(), b.getHectareas()});
		} 
	}

}
