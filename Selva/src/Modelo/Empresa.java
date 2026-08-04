package Modelo;     

import java.util.ArrayList;

public class Empresa {
	private ArrayList <Sector> losSectores = new ArrayList<>();
	
	public Empresa(ArrayList losSectores) {	
		this.losSectores = losSectores;
	}
	
	public ArrayList<Sector> losSectoresVulnerables(){
		ArrayList <Sector> losSectoresVulnerables = new ArrayList<>();
		for (Sector s: losSectores) {
			if (s.esVulnerable()) {
				losSectoresVulnerables.add(s);
			}
		} return losSectoresVulnerables;
	}
	
	public Sector sectorConMasEspecies() {
		Sector masEspecies = this.losSectores.get(0);
		for(Sector s: losSectores) {
			if(s.cantidadEspecies() > masEspecies.cantidadEspecies()) {
				masEspecies = s;
			}
		} return masEspecies;
	}
	
	public int valorDeTodosSectores() {
		int valorTotal= 0;
		for (Sector s: losSectores) {
			valorTotal += s.valorDeSector();
		} return valorTotal;
	} 
}
