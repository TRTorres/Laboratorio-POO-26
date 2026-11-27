package pantalla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Consultas.ConsultasBarrio;
import Consultas.ConsultasComuna;
import clasesPrincipales.Comuna;
import clasesPrincipales.Persona;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.ScrollPane;
import java.awt.Font;

public class ConsultaComunaVisual extends JPanel {

	private JTable table = new JTable();;
	ConsultasComuna cc = new ConsultasComuna();
	ConsultasBarrio cb = new ConsultasBarrio();
	DefaultTableModel modelo;
	Comuna c;
	Object[] columnas = new Object[] {"Numero", "Nombre", "Cantidad Barrios"};
	
	/**
	 * Create the panel.
	 */
	public ConsultaComunaVisual(JFrame marco) {
		setBorder(null);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 754, 676);
		add(scrollPane);
		
		llenarTabla();
		
		scrollPane.setViewportView(table);
		
		table.setBounds(163, 137, 1, 1);
		marco.setBounds(100,100,800,800);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setToolTipText("");
		btnNewButton_1.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filaSeleccionada = table.getSelectedRow();
				Object valorComuna = modelo.getValueAt(filaSeleccionada, 0); 
			    int numeroComuna = Integer.parseInt(valorComuna.toString());
				cc.eliminarComuna(numeroComuna);
				llenarTabla();
			}
		});
		btnNewButton_1.setBounds(182, 698, 190, 70);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ver Detalle");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filaSeleccionada = table.getSelectedRow();
				Object a = modelo.getValueAt(filaSeleccionada, 0); 
			    int numeroComuna = Integer.parseInt(a.toString());
			    cb.consultarBarriosDeUnaComuna(numeroComuna);
			    marco.setContentPane(new ConsultaBarrioDeUnaComunaVisual(marco, numeroComuna));
			    marco.validate();
			}
		});
		btnNewButton_2.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton_2.setBounds(574, 698, 190, 70);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Volver");
		btnNewButton_3.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new MenuPrincipal(marco));
				marco.validate();
			}
		});
		btnNewButton_3.setBounds(10, 698, 145, 70);
		add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("Modificar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filaSeleccionada = table.getSelectedRow();
				Object valorComuna = modelo.getValueAt(filaSeleccionada, 0); 
			    int numeroComuna = Integer.parseInt(valorComuna.toString());
				marco.setContentPane(new ModificacionComunaVisual(marco, numeroComuna));
				marco.validate();
			}
		});
		btnNewButton_1_1.setToolTipText("");
		btnNewButton_1_1.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton_1_1.setBounds(392, 698, 164, 70);
		add(btnNewButton_1_1);
		

	}

	public void llenarTabla() {
		modelo = new DefaultTableModel(columnas, 0);
		table.setModel(modelo);
		for (Comuna c : cc.consultarComuna()) { 
		modelo.addRow(new Object[] {c.getNumeroComuna(),c.getNombreComuna(), c.getCantidadBarrios()});
		} 
	}
}
