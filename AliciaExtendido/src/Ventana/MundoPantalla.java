package Ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Modelo.Mundo;
import Modelo.Personaje;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MundoPantalla extends JPanel {
	ArrayList<Personaje> losPersonajes = new ArrayList<>();
	/**
	 * Create the panel.
	 */
	public MundoPantalla(JFrame frame) {
		setBounds(0, 45, 1300, 750);
		setBackground(new Color(255, 185, 220));
		setBorder(new EmptyBorder(5, 5, 5, 5));
		PersonajePantalla pp = new PersonajePantalla(frame);
		losPersonajes.addAll(pp.getLosPersonajes());
		Mundo m = new Mundo(losPersonajes);
		JLabel lblNewLabel = new JLabel("Hola");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(294, 121, 715, 47);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("¿Hay personaje normal?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(m.hayPersonajeNormal()) {
					lblNewLabel.setText("Existe al menos un personaje normal");	
				}else {
					lblNewLabel.setText("No existen personajes normales");
				}
			}
		});
		
		setLayout(null);
		btnNewButton.setBounds(434, 305, 421, 29);
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("¿Cuales personajes lindos hay?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Personaje pp : losPersonajes) {
					if(m.personajesLindos().contains(pp)) {
						lblNewLabel.setText(pp.getNombre());
					}
				}
			}
		});
		
		btnNewButton_1.setBounds(434, 345, 421, 29);
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("¿Cual es el mas loco?");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(m.encontrarMasLoco().getNombre());
			}
		});
		btnNewButton_3.setBounds(434, 385, 421, 29);
		btnNewButton_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("¿Hay mas lindos o normales?");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("En el pais de las Maravillas " + m.masLindosONormales());
			}
		});
		btnNewButton_5.setBounds(434, 425, 421, 29);
		btnNewButton_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("¿Cuales son normales?");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Personaje pp : losPersonajes) {
					if(m.losPersonajesNormales().contains(pp)) {
						lblNewLabel.setText(pp.getNombre());
						System.out.println(pp.getNombre());
					}
				}
			}
		});
		
		btnNewButton_4.setBounds(434, 505, 421, 29);
		btnNewButton_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("¿Cuantos personajes hay en el pais de las Maravillas?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("En el pais de las Maravillas hay " + m.cuantosEnMaravilla() + " personas");
			}
		});
		btnNewButton_2.setBounds(436, 465, 419, 29);
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		add(btnNewButton_2);
		
		JButton BtnDeCambioDePantalla = new JButton("Cambiar a creacion de personaje");
		BtnDeCambioDePantalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setContentPane(new PersonajePantalla(frame));
				frame.validate();
			}
		});
		BtnDeCambioDePantalla.setBounds(10, 11, 200, 23);
		add(BtnDeCambioDePantalla);
	}
	}


