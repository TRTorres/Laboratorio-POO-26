package principal;
import java.util.ArrayList;

import dao.DAO;
import modelo.Persona;

public class App {

	public static void main(String[] args) {
		DAO miPrimerDao = new DAO();
		miPrimerDao.conectar();
		Persona p = new Persona(1, "Rubi", "Ruiz");
		miPrimerDao.actualizar(p);
		//ArrayList<String> resultado = miPrimerDao.consultar(p);
		//for(String s: resultado) {
		//	System.out.println(s);
		//}
	}

}
