package visual;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class PantallaPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PantallaPrincipal(JFrame pantalla) {
		setBackground(new Color(82, 0, 164));
		setLayout(null);
		
		JButton btnPersonaVisual = new JButton("Consultar Personas");
		btnPersonaVisual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPersonaVisual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setContentPane(new PersonaVisual(pantalla));
				pantalla.setVisible(true);
				pantalla.validate();
			}
		});
		btnPersonaVisual.setBounds(340, 258, 176, 37);
		add(btnPersonaVisual);
		
		JButton btn = new JButton("Agregar Persona");
		btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setContentPane(new AgregarPersonaVisual(pantalla));
				pantalla.setVisible(true);
				pantalla.validate();
			}
		});
		btn.setBounds(340, 342, 176, 37);
		add(btn);
		pantalla.setBounds(100,100,900,700);
		
	}
}
