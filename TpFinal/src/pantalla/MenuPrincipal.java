package pantalla;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public MenuPrincipal(JFrame marco) {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Alta y Modificacion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new AltaPersonaVisual(marco));
				marco.validate();
			}
		});
		btnNewButton.setBounds(143, 97, 150, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Consulta y Eliminar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marco.setContentPane(new ConsultaComunaVisual(marco));
				marco.validate();
			}
		});
		btnNewButton_1.setBounds(143, 162, 150, 23);
		add(btnNewButton_1);
		
	}
}
