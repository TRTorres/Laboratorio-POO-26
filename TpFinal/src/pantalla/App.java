package pantalla;

import java.time.LocalDate;

import clasesPrincipales.Persona;
import enumeradores.SituacionLaboral;

public class App {

	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(2008, 7, 18);
		Persona p = new Persona(48879153, "Thiago", fecha, SituacionLaboral.OCUPADO);

	}

}
