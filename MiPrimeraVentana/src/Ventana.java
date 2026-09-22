import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JEditorPane;
import java.awt.Toolkit;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("Cartera");
		setFont(new Font("Dialog", Font.PLAIN, 5));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\estudiante\\Downloads\\D_NQ_NP_707068-MLA83071608748_032025-O.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 90, 1450, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Haz sonido de cartera... ");
		lblNewLabel.setBounds(-10008, -10031, 1424, 651);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 254));
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 50));
		contentPane.add(lblNewLabel);
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon("C:\\Users\\estudiante\\Downloads\\D_NQ_NP_707068-MLA83071608748_032025-O.jpg"));
		lblImagen.setBounds(496, 66, 500, 266);
		contentPane.add(lblImagen);
		lblImagen.setVisible(false);
		
		JButton btnApretame = new JButton("Haz sonido de cartera... ");
		btnApretame.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnApretame.setText("¡CARTERAAAAAA!");
				btnApretame.setFont(new Font("Times New Roman", Font.PLAIN, 90));
				lblImagen.setVisible(rootPaneCheckingEnabled);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnApretame.setFont(new Font("Arial Black", Font.PLAIN, 20));
				btnApretame.setText("Haz sonido de cartera...");
				lblImagen.setVisible(false);
			}
		});
		btnApretame.setBounds(311, 363, 849, 249);
		btnApretame.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnApretame.setForeground(new Color(0, 102, 0));
		contentPane.add(btnApretame);
		
		
	}

}
