package Modelo;

public enum TipoPanel {
	DIODOSENANTIPARALELO(1),
	CELULASBIORESPONSIVAS(1.4f),
	REBOTEIONICOPORPSEUDOTRANSFERENCIA(1.8f),
	PROTOVELAMAGNETICATEJIDA(0.7f);
	
	public float getMultiplicador() {
		return multiplicador;
	}

	public void setMultiplicador(float multiplicador) {
		this.multiplicador = multiplicador;
	}

	float multiplicador;

	private TipoPanel(float multiplicador) {
		this.multiplicador = multiplicador;
	}
	
	
}
