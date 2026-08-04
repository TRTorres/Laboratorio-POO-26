package Modelo;

public enum Razas {
DE_PROPAGANDA(1),
PASTOREO_LIGERO(2),
PURA_LECHE(5);
	int multiplicador;
	
	Razas(int multiplicador){
		this.multiplicador = multiplicador;
	}
}
