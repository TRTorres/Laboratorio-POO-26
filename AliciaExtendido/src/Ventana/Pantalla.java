package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Mundo;
import Modelo.Personaje;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Pantalla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
					PersonajePantalla framee = new PersonajePantalla();
					framee.setVisible(true);
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
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 185, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ArrayList<Personaje> losPersonajes = new ArrayList<>();
		Mundo m = new Mundo(losPersonajes);
		Personaje alicia = new Personaje();
		Personaje nacho = new Personaje();
		Personaje pancho = new Personaje();
		pancho.setNombre("Pancho");
		losPersonajes.add(alicia);
		losPersonajes.add(nacho);
		losPersonajes.add(pancho);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Hola");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(316, 118, 715, 47);
		
		JButton btnNewButton = new JButton("¿Hay personaje normal?");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(m.hayPersonajeNormal()) {
					lblNewLabel.setText("Existe al menos un personaje normal");	
				}else {
					lblNewLabel.setText("No existen personajes normales");
				}
			}
		});
		btnNewButton.setBounds(480, 360, 385, 29);
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("¿Cuales personajes lindos hay?");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(Personaje pp : losPersonajes) {
					if(m.personajesLindos().contains(pp)) {
						lblNewLabel.setText(pp.getNombre());
					}
				}
			}
		});
		btnNewButton_1.setBounds(480, 440, 385, 29);
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("¿Cual es el mas loco?");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setText(m.encontrarMasLoco().getNombre());
			}
		});
		btnNewButton_3.setBounds(480, 480, 385, 29);
		btnNewButton_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("¿Hay mas lindos o normales?");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setText("En el pais de las Maravillas " + m.masLindosONormales());
			}
		});
		btnNewButton_5.setBounds(480, 320, 385, 29);
		btnNewButton_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("¿Cuales son normales?");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(Personaje pp : losPersonajes) {
					if(m.losPersonajesNormales().contains(pp)) {
						lblNewLabel.setText(pp.getNombre());
					}
				}
			}
		});
		btnNewButton_4.setBounds(480, 400, 385, 29);
		btnNewButton_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("¿Cuantos personajes hay en el pais de las Maravillas?");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setText("En el pais de las Maravillas hay " + m.cuantosEnMaravilla() + " personas");
			}
		});
		btnNewButton_2.setBounds(480, 280, 385, 29);
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(btnNewButton_2);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\estudiante\\Downloads\\OIP (1).webp "));
			}
		});
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\estudiante\\Downloads\\9e64cead6918c083e5ab1718640d3f27.jpg"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\estudiante\\Downloads\\giphy.gif"));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\estudiante\\Downloads\\cf524671c3e78e36bbbb7ebb4b9aee74.jpg"));
			}
		});
		btnNewButton_6.setForeground(new Color(255, 128, 192));
		btnNewButton_6.setBackground(new Color(255, 128, 192));
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\estudiante\\Downloads\\perro.jpg"));
		btnNewButton_6.setBounds(10, 27, 460, 647);
		contentPane.add(btnNewButton_6);
	}
}
