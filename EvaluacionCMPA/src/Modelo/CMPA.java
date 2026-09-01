package Modelo;

import java.util.ArrayList;

import Heredados.AuroraAustral;
import Heredados.ChacraProfunda;
import Heredados.Pampa32;

public class CMPA {
	//Creacion de los vectores con su capacidad para luego agregarlos 
	//al Array de todos los satelites en el espacio
	Pampa32 losPampa[] = new Pampa32[15];
	AuroraAustral lasAurora[] = new AuroraAustral[17];
	ChacraProfunda losChacra[] = new ChacraProfunda[6];
	ArrayList<Satelite> losSatelites= new ArrayList<>();
	
	//Metodos para llenar el Array con la cantidad de satelites por cada modelo de ellos
	public void llenarArray() {
		for(AuroraAustral a : lasAurora) {
			losSatelites.add(a);
		}
		for(Pampa32 p : losPampa) {
			losSatelites.add(p);
		}
		for(ChacraProfunda c : losChacra) {
			losSatelites.add(c);
		}
	}
	//Thiago Torres 5°3
	//Metodos pedidos por el ejercicio
	public float acumulacionDeCarga() {
		float cargaTotal = 0;
		for(Satelite s: losSatelites) {
			cargaTotal = cargaTotal + s.getNivelCarga();
		}
		return cargaTotal;
	}
	
	public ArrayList<Satelite> losQueHibernan(){
		ArrayList<Satelite> losSatelitesQueHibernan = new ArrayList<>();
		for(Satelite s: losSatelites) {
			if(s.estaHibernando()) {
				losSatelitesQueHibernan.add(s);
			}
		}
		return losSatelitesQueHibernan;
	}
	
	public float cienciaAcumulada(){
		float cienciaAcumulada = 0;
		for(AuroraAustral a: lasAurora) {
			cienciaAcumulada = cienciaAcumulada + a.getMedidorDeCiencia();
		}
		return cienciaAcumulada;
	}
}
//Thiago Torres 5°3