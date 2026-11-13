package clasesPrincipales;

import java.util.ArrayList;

public class Comuna {
	private int numeroComuna;
	private String nombreComuna;
	private ArrayList<Barrio> losBarrios = new ArrayList<>();
	private int cantidadBarrios;
	public Comuna(int numeroComuna, String nombreComuna, int cantidadBarrios) {
		this.numeroComuna = numeroComuna;
		this.nombreComuna = nombreComuna;
		this.cantidadBarrios = cantidadBarrios();
	}
	public int cantidadBarrios() {
		cantidadBarrios = losBarrios.size();
		return cantidadBarrios;
	}
	
	public int getNumeroComuna() {
		return numeroComuna;
	}
	public void setNumeroComuna(int numeroComuna) {
		this.numeroComuna = numeroComuna;
	}
	public String getNombreComuna() {
		return nombreComuna;
	}
	public void setNombreComuna(String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}
}
