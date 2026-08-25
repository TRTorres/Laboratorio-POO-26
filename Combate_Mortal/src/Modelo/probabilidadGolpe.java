package Modelo;

public enum probabilidadGolpe {
	NORMAL(3),
	CRITICO(4.5f),
	SUPERCRITICO(7),
	PIFIA(0);
	
	private float multiplicador;

	private probabilidadGolpe(float multiplicador) {
		this.setMultiplicador(multiplicador);
	}

	public float getMultiplicador() {
		return multiplicador;
	}

	public void setMultiplicador(float multiplicador) {
		this.multiplicador = multiplicador;
	}
}
