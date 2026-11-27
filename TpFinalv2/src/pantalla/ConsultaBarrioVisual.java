package pantalla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Consultas.ConsultasBarrio;
import clasesPrincipales.Barrio;
import clasesPrincipales.Comuna;
import clasesPrincipales.DeComplejoHabitacional;
import clasesPrincipales.DeTrazadoFormal;
import clasesPrincipales.DeUrbanizacionPlanificada;
import clasesPrincipales.Persona;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ConsultaBarrioVisual extends JPanel {

	private JTable table = new JTable();;
	ConsultasBarrio c = new ConsultasBarrio();
	DefaultTableModel modelo;
	Object[] columnas = new Object[] { "IdBarrio", "Nombre", "TipoDeBarrio", "Superficie", "Cantidad Edificios", "Porcentaje Asfaltado", "Numero De Ley","Cuenta con Conexion?", "Cantidad De Monoblocks", "Posee Consorcio?", "Numero Comuna"};
	/**
	 * Create the panel.
	 */
	public ConsultaBarrioVisual(JFrame marco) {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 749, 653);
		add(scrollPane);
		
		llenarTabla();
		
		scrollPane.setViewportView(table);
		
		table.setBounds(23, 63, 211, 148);
		
		llenarTabla();
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filaSeleccionada = table.getSelectedRow();
				Object a = modelo.getValueAt(filaSeleccionada, 0); 
			    int idBarrio = Integer.parseInt(a.toString());
				c.eliminarBarrio(idBarrio);
				llenarTabla();
			}
		});
		btnNewButton_2.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton_2.setBounds(557, 695, 179, 66);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Volver");
		btnNewButton_3.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new MenuPrincipal(marco));
				marco.validate();
			}
		});
		btnNewButton_3.setBounds(67, 695, 179, 66);
		add(btnNewButton_3);
		
		JButton btnNewButton_2_1 = new JButton("Modificar");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filaSeleccionada = table.getSelectedRow();
				Object a = modelo.getValueAt(filaSeleccionada, 0); 
			    int idBarrio = Integer.parseInt(a.toString());
			    marco.setContentPane(new ModificacionBarrioVisual(marco, idBarrio));
			    marco.validate();
			}
		});
		btnNewButton_2_1.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		btnNewButton_2_1.setBounds(314, 695, 179, 66);
		add(btnNewButton_2_1);
		marco.setBounds(100,100,800,800);
	
		
	}
	public void llenarTabla() {
		int i = 1;
		modelo = new DefaultTableModel(columnas, 0);
		table.setModel(modelo); 
		for (Barrio b : c.consultarBarrio()) { 
			Object cantidadEdificios = null;
			Object porcentajeAsfaltado = null;
			Object numeroDeLey = null;
			Object cuentaConConexion = null;
			Object cantidadDeMonoblocks = null;
			Object poseeConsorcio = null;
			String tipoBarrio = b.getTipoBarrio();
			switch (tipoBarrio) {
			case "DeComplejoHabitacional":
				cantidadDeMonoblocks = ((DeComplejoHabitacional) b).getCantidadDeMonoblocksConstruidos();
	            poseeConsorcio = ((DeComplejoHabitacional)b).getPoseeConsorcioDeAdministracionMacroActivo();
	            break;
			case "DeTrazadoFormal":
				cantidadEdificios = ((DeTrazadoFormal)b).getCantidadEdificiosDePropiedadHorizontal();
				porcentajeAsfaltado = ((DeTrazadoFormal)b).getPorcentajeDeAsfaltadoEnCalles();
	            break;
			case "DeUrbanizacionPlanificada":
				numeroDeLey = ((DeUrbanizacionPlanificada)b).getNumeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA();
	            cuentaConConexion = ((DeUrbanizacionPlanificada)b).getCuentaConConexiónFormalALaRedDeAguaPotable();
				break;
			}
			modelo.addRow(new Object[] {b.getIdBarrio(),b.getNombreBarrio(), b.getTipoBarrio(),b.getHectareas(), cantidadEdificios, porcentajeAsfaltado, numeroDeLey, cuentaConConexion, cantidadDeMonoblocks, poseeConsorcio,b.getNumero_comuna()});
		} 
	}
}

