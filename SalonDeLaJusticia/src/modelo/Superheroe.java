package modelo;

import java.util.ArrayList;

public class Superheroe {
	private String nombre;
	private int presupuesto;
	ArrayList<Asistente> losAsistentes = new ArrayList<>();
	
	public int cantidadDeAsistentes() {
		return losAsistentes.size();
	}
	
	public boolean llegaAFinDeMes() {
		float sueldosTotales = 0;
		for (Asistente a: losAsistentes) {
			sueldosTotales = sueldosTotales + a.sueldoReal();
		} 
		if(presupuesto < sueldosTotales) {
			return false;
		}else return true;
	}
	
	public int cantidadDeAsistentesCaros() {
		int cont = 0;
		for (Asistente a: losAsistentes){
			if (a.sueldoReal() >= 60000) {
				cont = cont + 1;
			}
		}
		return cont;
	}
	
	public float plataParaLaVaquita() {
		float resto = 0;
		float gasto = 0;
		for (Asistente a: losAsistentes) {
			gasto = gasto + a.sueldoReal();
		}
		resto = presupuesto - gasto;
		return resto;
	}
}
