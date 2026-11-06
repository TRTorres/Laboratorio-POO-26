package clasesPrincipales;

import enumeradores.TipoBarrio;

public class Barrio {
	private int idBarrio;
	private String nombreBarrio;
	private TipoBarrio barrio;
	private int hectareas;
	
	public Barrio(int idBarrio, String nombreBarrio, TipoBarrio barrio, int hectareas) {
		this.idBarrio = idBarrio;
		this.nombreBarrio = nombreBarrio;
		this.barrio = barrio;
		this.hectareas = hectareas;
	}

	public int getIdBarrio() {
		return idBarrio;
	}

	public void setIdBarrio(int idBarrio) {
		this.idBarrio = idBarrio;
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
