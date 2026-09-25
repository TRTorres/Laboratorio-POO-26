import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JProgressBar;

public class Juanito extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juanito frame = new Juanito();
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
	public Juanito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Persona p = new Persona();
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("**********");
		lblNewLabel.setBounds(581, 550, 372, 68);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel.setVisible(false);
		
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(537, 72, 417, 65);
		JLabel lblNewLabel_1 = new JLabel("Barra de hambre");
		lblNewLabel_1.setBounds(259, 11, 984, 50);
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		JButton btnNewButton = new JButton("Comer");
		btnNewButton.setBounds(281, 304, 115, 66);
		btnNewButton.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				p.comer();
				p.setComida(p.getComida()+10);
				progressBar.setValue(p.getComida());
			}
		});
		
		JButton btnNewButton_1 = new JButton("¿Esta lleno?");
		btnNewButton_1.setBounds(470, 307, 133, 61);
		btnNewButton_1.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!p.estaLleno(p.getComida())) {
					lblNewLabel.setText("Si");
				}else {
					lblNewLabel.setText("No");
				}
				lblNewLabel.setVisible(true);
			}
		});
		
		JButton btnNewButton_2 = new JButton("Crecer");
		btnNewButton_2.setBounds(676, 304, 133, 66);
		btnNewButton_2.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				p.crecer(p.getCapacidadEstomago() + 1);
				progressBar.setValue(p.getComida());
				lblNewLabel.setText("El estomago de Juanito crecio");
				lblNewLabel.setVisible(true);
			}
		});
		

		JButton btnNewButton_3 = new JButton("Digerir");
		btnNewButton_3.setBounds(866, 304, 122, 66);
		btnNewButton_3.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				p.digerir();
				progressBar.setValue(p.getComida());
				lblNewLabel.setText("Juanito acaba de digerir la comida");
				lblNewLabel.setVisible(true);
			}
		});
		
		JButton btnNewButton_4 = new JButton("Aprender");
		btnNewButton_4.setBounds(1056, 307, 119, 61);
		btnNewButton_4.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!p.estaLleno(p.getComida())) {
					p.aprender();
					lblNewLabel.setText("Juanito acaba de aprender");
					lblNewLabel.setVisible(true);
				}else {
					lblNewLabel.setText("Juanito no puede aprender porque no esta lleno");
					lblNewLabel.setVisible(true);
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton_2);
		contentPane.add(btnNewButton_3);
		contentPane.add(btnNewButton_4);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(progressBar);
	}
}
