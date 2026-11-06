package clasesPrincipales;

import enumeradores.TipoBarrio;

public class BarrioDeTrazadoFormal extends Barrio {
	private int cantidadEdificiosDePropiedadHorizontal;
	private int porcentajeDeAsfaltadoEnCalles;
	public BarrioDeTrazadoFormal(int idBarrio, String nombreBarrio, TipoBarrio barrio, int hectareas) {
		super(idBarrio, nombreBarrio, barrio, hectareas);
		
	}
	
	public int getCantidadEdificiosDePropiedadHorizontal() {
		return cantidadEdificiosDePropiedadHorizontal;
	}
	public void setCantidadEdificiosDePropiedadHorizontal(int cantidadEdificiosDePropiedadHorizontal) {
		this.cantidadEdificiosDePropiedadHorizontal = cantidadEdificiosDePropiedadHorizontal;
	}
	public int getPorcentajeDeAsfaltadoEnCalles() {
		return porcentajeDeAsfaltadoEnCalles;
	}
	public void setPorcentajeDeAsfaltadoEnCalles(int porcentajeDeAsfaltadoEnCalles) {
		this.porcentajeDeAsfaltadoEnCalles = porcentajeDeAsfaltadoEnCalles;
	}
}
