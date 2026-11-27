package pantalla;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Consultas.ConsultasBarrio;
import clasesPrincipales.Barrio;
import clasesPrincipales.DeComplejoHabitacional;
import clasesPrincipales.DeTrazadoFormal;
import clasesPrincipales.DeUrbanizacionPlanificada;

public class ConsultaBarrioDeUnaComunaVisual extends JPanel {

	private JTable table = new JTable();;
	ConsultasBarrio c = new ConsultasBarrio();
	DefaultTableModel modelo;
	Object[] columnas = new Object[] { "Numero Comuna", "Nombre Sede Comunal", "Nombre Barrio", "Tipo Barrio"};
	/**
	 * Create the panel.
	 */
	public ConsultaBarrioDeUnaComunaVisual(JFrame marco, int numeroComuna) {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 748, 652);
		add(scrollPane);
		
		llenarTabla(numeroComuna);
		
		scrollPane.setViewportView(table);
		
		table.setBounds(23, 63, 211, 148);
		
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton_2.setBounds(433, 695, 179, 66);
		add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filaSeleccionada = table.getSelectedRow();
				Object a = modelo.getValueAt(filaSeleccionada, 0); 
			    int idBarrio = Integer.parseInt(a.toString());
				c.eliminarBarrio(idBarrio);
				llenarTabla(numeroComuna);
			}
		});
		
		JButton btnNewButton_3 = new JButton("Volver");
		btnNewButton_3.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new MenuPrincipal(marco));
				marco.validate();
			}
		});
		btnNewButton_3.setBounds(168, 695, 179, 66);
		add(btnNewButton_3);
		marco.setBounds(100,100,800,800);
		
	}
	public void llenarTabla(int numeroComuna) {
		int i = 1;
		
		modelo = new DefaultTableModel(columnas, 0);
		table.setModel(modelo); 
		for (Barrio b : c.consultarBarriosDeUnaComuna(numeroComuna)) {
			modelo.addRow(new Object[] {numeroComuna,b.getNombreSedeComunal(),b.getNombreBarrio(), b.getTipoBarrio()});
		}
	}
}
