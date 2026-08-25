package Modelo;

public enum probabilidadGolpeADistancia {
	NORMAL(8.6f),
	CRITICO(12),
	SUPERCRITICO(16),
	PIFIA(0);
	
	private float multiplicador;

	private probabilidadGolpeADistancia(float multiplicador) {
		this.setMultiplicador(multiplicador);
	}

	public float getMultiplicador() {
		return multiplicador;
	}

	public void setMultiplicador(float multiplicador) {
		this.multiplicador = multiplicador;
	}
}
