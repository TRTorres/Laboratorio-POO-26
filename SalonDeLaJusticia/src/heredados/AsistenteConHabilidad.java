package heredados;

import modelo.Asistente;

public class AsistenteConHabilidad extends Asistente{
	public AsistenteConHabilidad(float sueldo, boolean habilidadEspecial) {
		super(sueldo, habilidadEspecial);
		// TODO Auto-generated constructor stub
	}
	
	public float sueldoReal() {
		//@override
		float sueldo = getSueldo();
		if(setHabilidadEspecial()) {
			sueldo = sueldo + (sueldo* 0.2f);
		}
		return sueldo;
	}
}
