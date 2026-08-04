package modelo;

public class Asistente {
	private float sueldo;
	private boolean habilidadEspecial;
	
	
	public float sueldoReal() {
		return sueldo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public boolean setHabilidadEspecial() {
		return habilidadEspecial;
	}

	public void setHabilidadEspecial(boolean habilidadEspecial) {
		this.habilidadEspecial = habilidadEspecial;
	}

	public Asistente(float sueldo, boolean habilidadEspecial) {
		this.sueldo = sueldo;
		this.habilidadEspecial = habilidadEspecial;
	}
	
}
