package pantalla;

import javax.swing.JPanel;

import enumeradores.SituacionLaboral;
import enumeradores.TiposDeAltas;
import enumeradores.TiposDeConsultas;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class MenuPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public MenuPrincipal(JFrame marco) {
		setLayout(null);
		
		JComboBox<TiposDeAltas> comboBoxAlta = new JComboBox<>(TiposDeAltas.values());
		comboBoxAlta.setBounds(252, 295, 266, 22);
		add(comboBoxAlta);
		
		JComboBox<TiposDeConsultas> comboBoxConsulta = new JComboBox<>(TiposDeConsultas.values());
		comboBoxConsulta.setBounds(252, 447, 266, 22);
		add(comboBoxConsulta);
		
		JButton btnNewButton = new JButton("Alta y Modificacion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TiposDeAltas b = (TiposDeAltas) comboBoxAlta.getSelectedItem();
				switch(b) {
				case ALTAPERSONA:
					marco.setContentPane(new AltaPersonaVisual(marco));
					marco.validate();
					break;
				case ALTACOMUNA:
					marco.setContentPane(new AltaComunaVisual(marco));
					marco.validate();
					break;
				case ALTABARRIODECOMPLEJOHABITACIONAL:
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
				TiposDeConsultas a = (TiposDeConsultas) comboBoxConsulta.getSelectedItem();
				switch(a) {
				case CONSULTAPERSONA:
					marco.setContentPane(new ConsultaPersonaVisual(marco));
					marco.validate();
					break;
				case CONSULTACOMUNA:
					marco.setContentPane(new ConsultaComunaVisual(marco));
					marco.validate();
					break;
				case CONSULTABARRIO:
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
