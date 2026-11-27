package pantalla;

import javax.swing.JPanel;

import enumeradores.SituacionLaboral;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class MenuPrincipal extends JPanel {

	private String[] tipoAltas = {"Agregar Persona", "Agregar Barrio", "Agregar Comuna"};
	private String[] tipoConsultas = {"Consultar Persona", "Consultar Barrio", "Consultar Comuna"};
	JComboBox<String> comboBoxAlta = new JComboBox<>(tipoAltas);
	JComboBox<String> comboBoxConsulta = new JComboBox<>(tipoConsultas);
	
	public MenuPrincipal(JFrame marco) {
		setLayout(null);
		
		comboBoxAlta.setBounds(252, 295, 266, 22);
		add(comboBoxAlta);
		
		comboBoxConsulta.setBounds(252, 447, 266, 22);
		add(comboBoxConsulta);
		
		JButton btnNewButton = new JButton("Alta y Modificacion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b = (String)comboBoxAlta.getSelectedItem();
				switch(b) {
				case "Agregar Persona":
					marco.setContentPane(new AltaPersonaVisual(marco));
					marco.validate();
					break;
				case "Agregar Comuna":
					marco.setContentPane(new AltaComunaVisual(marco));
					marco.validate();
					break;
				case "Agregar Barrio":
					marco.setContentPane(new AltaBarrioVisual(marco));
					marco.validate();
					break;
				}
			}
		});
		btnNewButton.setBounds(252, 261, 266, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Consulta y Eliminar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = (String) comboBoxConsulta.getSelectedItem();
				switch(a) {
				case "Consultar Persona":
					marco.setContentPane(new ConsultaPersonaVisual(marco));
					marco.validate();
					break;
				case "Consultar Comuna":
					marco.setContentPane(new ConsultaComunaVisual(marco));
					marco.validate();
					break;
				case "Consultar Barrio":
					marco.setContentPane(new ConsultaBarrioVisual(marco));
					marco.validate();
					break;
				}
			}
		});
		btnNewButton_1.setBounds(252, 413, 266, 23);
		add(btnNewButton_1);
		
		
		
	}
}
