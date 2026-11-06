package clasesPrincipales;

import enumeradores.tipoBarrio;

public class barrio {
	private int idBarrio;
	private String nombreBarrio;
	private tipoBarrio barrio;
	private int hectareas;
	
	public barrio(int idBarrio, String nombreBarrio, tipoBarrio barrio, int hectareas) {
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

	public tipoBarrio getBarrio() {
		return barrio;
	}

	public void setBarrio(tipoBarrio barrio) {
		this.barrio = barrio;
	}

	public int getHectareas() {
		return hectareas;
	}

	public void setHectareas(int hectareas) {
		this.hectareas = hectareas;
	}
	
}
