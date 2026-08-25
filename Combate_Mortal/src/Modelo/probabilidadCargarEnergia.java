package Modelo;

public enum probabilidadCargarEnergia {
	MASTRES(3),
	MASCINCO(5),
	MASSIETE(7),
	MASCERO(0);
	
	int energia;

	private probabilidadCargarEnergia(int energia) {
		this.energia = energia;
	}
}
