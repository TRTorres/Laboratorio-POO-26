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
		this.cantidadBarrios = cantidadBarrios;
	}
	/*public int cantidadBarrios() {
		for(Barrio b : losBarrios) {
			if(b.getNumero_comuna() == numeroComuna) {
				losBarrios.add(b);
			}
		}
		return losBarrios.size();
	}*/
	public String getNombreComuna() {
		return nombreComuna;
	}
	public void setNombreComuna(String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}
	public int getNumeroComuna() {
		return numeroComuna;
	}
	public void setNumeroComuna(int numeroComuna) {
		this.numeroComuna = numeroComuna;
	}
	public int getCantidadBarrios() {
		return cantidadBarrios;
	}
	public void setCantidadBarrios(int cantidadBarrios) {
		this.cantidadBarrios = cantidadBarrios;
	}
	
}
