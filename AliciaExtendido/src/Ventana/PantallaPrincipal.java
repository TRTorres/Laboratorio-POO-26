package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal frame = new PantallaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		MundoPantalla mp = new MundoPantalla();
		PersonajePantalla pp = new PersonajePantalla();
		CardLayout cl = new CardLayout();
		getContentPane().setLayout(cl);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(mp, "Mundoo");
		contentPane.add(pp, "Agrega Personaje");
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 12, 1250, 35);
		contentPane.add(toolBar);
		/* 
		*Botones superiores 
		*/
		JButton btnNewButton = new JButton("Mundo");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl.show(getContentPane(), "Mundoo");
			}
		});
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Personaje");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		toolBar.add(btnNewButton_1);
		JButton btnNewButton_2 = new JButton("Agregar Personaje");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(getContentPane(), "Agrega Personaje");                    q
			}
		});
		toolBar.add(btnNewButton_2);
	}
}
