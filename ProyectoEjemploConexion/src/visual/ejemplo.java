package visual;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejemplo extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ejemplo(JFrame marco) {
		setLayout(null);
		marco.setBounds(100,100,500,500);
		JButton btnAgregarPersona = new JButton("Agregar Persona");
		btnAgregarPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new AgregarPersona(marco));
				marco.setVisible(true);
				marco.validate();
			}
		});
		btnAgregarPersona.setBounds(96, 90, 236, 23);
		add(btnAgregarPersona);
		
		JButton btnConsultarPersona = new JButton("Consultar Persona");
		btnConsultarPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new ConsultarPersona(marco));
				marco.validate();
			}
		});
		btnConsultarPersona.setBounds(96, 167, 236, 23);
		add(btnConsultarPersona);

	}
}
