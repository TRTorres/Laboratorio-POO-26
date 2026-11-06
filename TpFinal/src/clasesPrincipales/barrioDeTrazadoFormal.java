package clasesPrincipales;

import enumeradores.tipoBarrio;

public class barrioDeTrazadoFormal extends barrio {
	private int cantidadEdificiosDePropiedadHorizontal;
	private int porcentajeDeAsfaltadoEnCalles;
	public barrioDeTrazadoFormal(int idBarrio, String nombreBarrio, tipoBarrio barrio, int hectareas) {
		super(idBarrio, nombreBarrio, barrio, hectareas);
		
	}
}
