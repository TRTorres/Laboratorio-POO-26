package clasesPrincipales;

import java.util.ArrayList;

public class Comuna {
	private String nombreComuna;
	private ArrayList<Barrio> losBarrios = new ArrayList<>();
	private int cantidadBarrios;
	public Comuna( String nombreComuna, int cantidadBarrios) {
		this.nombreComuna = nombreComuna;
		this.cantidadBarrios = cantidadBarrios();
	}
	public int cantidadBarrios() {
		return losBarrios.size();
	}
	public String getNombreComuna() {
		return nombreComuna;
	}
	public void setNombreComuna(String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}
}
