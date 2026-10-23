package principal;
import java.util.ArrayList;

import javax.swing.JFrame;

import dao.DAO;
import modelo.Persona;
import visual.ejemplo;

public class App {

	public static void main(String[] args) {
		JFrame marco = new JFrame();
		//marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//marco.setVisible(true);
		//marco.setBounds(100,100,500,500);
		//marco.setContentPane(new ejemplo(marco));
		//marco.validate();
		DAO miPrimerDao = new DAO();
		//miPrimerDao.conectar();
		Persona p = new Persona(50, "Rubi", "Ruiz");
		//miPrimerDao.eliminar(p);
		ArrayList<Persona> resultado = miPrimerDao.consultar();
		for(Persona s: resultado) {
			System.out.println(s);
		}
	}

}
