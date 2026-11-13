package clasesPrincipales;

import enumeradores.TipoBarrio;

public class Barrio {
	private String nombreBarrio;
	private TipoBarrio barrio;
	private int hectareas;
	private int numero_comuna;
	
	public Barrio(int idBarrio, String nombreBarrio, TipoBarrio barrio, int hectareas, int numero_comuna) {
		this.nombreBarrio = nombreBarrio;
		this.barrio = barrio;
		this.hectareas = hectareas;
		this.numero_comuna = numero_comuna;
		}

	public String getNombreBarrio() {
		return nombreBarrio;
	}

	public void setNombreBarrio(String nombreBarrio) {
		this.nombreBarrio = nombreBarrio;
	}

	public TipoBarrio getBarrio() {
		return barrio;
	}

	public void setBarrio(TipoBarrio barrio) {
		this.barrio = barrio;
	}

	public int getHectareas() {
		return hectareas;
	}

	public void setHectareas(int hectareas) {
		this.hectareas = hectareas;
	}
	
}
