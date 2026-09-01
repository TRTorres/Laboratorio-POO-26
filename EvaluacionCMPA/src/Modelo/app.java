package Modelo;

import java.util.ArrayList;

import Heredados.AuroraAustral;
import Heredados.ChacraProfunda;
import Heredados.Pampa32;

public class app {

	public static void main(String[] args) {
		//Creacion de Array y vectores
		Pampa32 losPampa[] = new Pampa32[15];
		AuroraAustral lasAurora[] = new AuroraAustral[17];
		ChacraProfunda losChacra[] = new ChacraProfunda[6];
		ArrayList<Satelite> losSatelites= new ArrayList<>();
	}
	
	//Metodo para llenar el array con la cantidad de satelites especificada 
	public void llenarArray(Pampa32 losPampa[], AuroraAustral lasAurora[], ChacraProfunda losChacra[], ArrayList<Satelite> losSatelites) {
		for(AuroraAustral a : lasAurora) {
			losSatelites.add(a);
		}
		for(Pampa32 p : losPampa) {
			losSatelites.add(p);
		}
		for(ChacraProfunda c : losChacra) {
			losSatelites.add(c);
		}
	}//Thiago Torres 5°3
	
	//Metodos
	public float acumulacionDeCarga(ArrayList<Satelite> losSatelites) {
		float cargaTotal = 0;
		for(Satelite s: losSatelites) {
			cargaTotal = cargaTotal + s.getNivelCarga();
		}
		return cargaTotal;
	}
	
	public ArrayList<Satelite> losQueHibernan(ArrayList<Satelite> losSatelites){
		ArrayList<Satelite> losSatelitesQueHibernan = new ArrayList<>();
		for(Satelite s: losSatelites) {
			if(s.estaHibernando()) {
				losSatelitesQueHibernan.add(s);
			}
		}
		return losSatelitesQueHibernan;
	}

	public float cienciaAcumulada(AuroraAustral lasAurora[]){
		float cienciaAcumulada = 0;
		for(AuroraAustral a: lasAurora) {
			cienciaAcumulada = cienciaAcumulada + a.getMedidorDeCiencia();
		}
		return cienciaAcumulada;
	}
}
//Thiago Torres 5°3