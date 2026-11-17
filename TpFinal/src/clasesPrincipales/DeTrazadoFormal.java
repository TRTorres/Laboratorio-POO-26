package clasesPrincipales;

public class DeTrazadoFormal extends Barrio {
	private int cantidadEdificiosDePropiedadHorizontal;
	private int porcentajeDeAsfaltadoEnCalles;
	public DeTrazadoFormal(String nombreBarrio, int hectareas, int numero_comuna, int cantidadEdificiosDePropiedadHorizontal, int porcentajeDeAsfaltadoEnCalles) {
		super(nombreBarrio, hectareas, numero_comuna);
		this.cantidadEdificiosDePropiedadHorizontal = cantidadEdificiosDePropiedadHorizontal;
		this.porcentajeDeAsfaltadoEnCalles = porcentajeDeAsfaltadoEnCalles;
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
