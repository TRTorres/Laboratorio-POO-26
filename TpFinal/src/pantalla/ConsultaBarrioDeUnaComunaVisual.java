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

import Consultas.Consultar;
import clasesPrincipales.Barrio;
import clasesPrincipales.DeComplejoHabitacional;
import clasesPrincipales.DeTrazadoFormal;
import clasesPrincipales.DeUrbanizacionPlanificada;

public class ConsultaBarrioDeUnaComunaVisual extends JPanel {

	private JTable table = new JTable();;
	Consultar consultar = new Consultar();
	DefaultTableModel modelo;
	Object[] columnas = new Object[] { "IdBarrio", "Nombre", "TipoDeBarrio", "Superficie", "Cantidad Edificios", "Porcentaje Asfaltado", "Numero De Ley","Cuenta con Conexion?", "Cantidad De Monoblocks", "Posee Consorcio?", "Numero Comuna"};
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
		for (Barrio b : consultar.consultarBarriosDeUnaComuna(numeroComuna)) { 
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
			modelo.addRow(new Object[] {b.getIdBarrio(),b.getNombreBarrio(), b.getTipoBarrio(),b.getHectareas(), cantidadEdificios, porcentajeAsfaltado, numeroDeLey, cuentaConConexion, cantidadDeMonoblocks, poseeConsorcio,numeroComuna});
		} 
	}
}
