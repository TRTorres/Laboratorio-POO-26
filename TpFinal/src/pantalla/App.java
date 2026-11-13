package pantalla;

import java.time.LocalDate;

import Consultas.Alta;
import clasesPrincipales.Persona;
import dao.dao;
import enumeradores.SituacionLaboral;

public class App {

	public static void main(String[] args) {
		dao daoo = new dao();
		LocalDate fecha = LocalDate.of(2008, 7, 18);
		Persona p = new Persona(48879153, "Thiago", fecha, SituacionLaboral.OCUPADO, 1);
		Alta a = new Alta();
		a.agregarPersona(p);
	}

}
