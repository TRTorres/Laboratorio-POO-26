package modelo;

import java.util.ArrayList;

public class SalonDeLaJusticia {
	ArrayList<Superheroe> losSuperheroes = new ArrayList<>();
	public ArrayList<Superheroe> superheroesConMuchosAsistentes(){
		ArrayList<Superheroe> losSuperheroesConMuchosAsistentes = new ArrayList<>();
		for (Superheroe s: losSuperheroes) {
			if (s.cantidadDeAsistentes() > 3) {
				losSuperheroesConMuchosAsistentes.add(s);
			}
		}
		return losSuperheroesConMuchosAsistentes;
	}
	
	public ArrayList<Superheroe> losQueNoLlegan(){
		ArrayList<Superheroe> losSuperheroesQueNoLlegan = new ArrayList<>();
		for(Superheroe s: losSuperheroes) {
			if(s.llegaAFinDeMes()) {
				losSuperheroesQueNoLlegan.add(s);
			}
		}
		return losSuperheroesQueNoLlegan;
	}
	
	public float presupuestoTotal() {
		float total = 0;
		for (Superheroe s: losSuperheroes) {
			total = total + s.plataParaLaVaquita();
		}
		return total;
	}
	
	public int cantidadDeAsistentesCaros() {
		int cont = 0;
		for(Superheroe s: losSuperheroes) {
			cont = cont + s.cantidadDeAsistentesCaros();
		}
		return cont;
	}
}
