package clasesPrincipales;

import Consultas.ConsultasPersona;

public class DeTrazadoFormal extends Barrio {
	private int cantidadEdificiosDePropiedadHorizontal;
	private int porcentajeDeAsfaltadoEnCalles;
	public DeTrazadoFormal(String nombreBarrio, int hectareas, int numero_comuna,String tipoBarrio, int cantidadEdificiosDePropiedadHorizontal, int porcentajeDeAsfaltadoEnCalles) {
		super(nombreBarrio, hectareas, numero_comuna, tipoBarrio = "DeTrazadoFormal");
		this.cantidadEdificiosDePropiedadHorizontal = cantidadEdificiosDePropiedadHorizontal;
		this.porcentajeDeAsfaltadoEnCalles = porcentajeDeAsfaltadoEnCalles;
	}
	/*public void densidadPoblacional() {
		ConsultasPersona c = new ConsultasPersona();
		int i = 0;
		float densidad;
		for(Persona p : c.consultarPersona()) {
			if(p.getIdBarrio() == idBarrio) {
				i++;
			}
		}
		densidad = i / cantidadEdificiosDePropiedadHorizontal;
		System.out.println(densidad);
	}*/
	
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
