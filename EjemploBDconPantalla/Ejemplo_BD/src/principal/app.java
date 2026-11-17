package principal;

import java.util.ArrayList;

import javax.swing.JFrame;

import dao.Conexion;
import modelo.Persona;
import vista.PanelPrincipal;

public class app {

	public static void main(String[] args) {
	
		JFrame marco = new JFrame();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setBounds(100,100,500,500);
		marco.setContentPane(new PanelPrincipal(marco));
		marco.validate();
		
		
		}
	}


