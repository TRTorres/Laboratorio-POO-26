package Heredados;

import Modelo.Satelite;
import Modelo.TipoPanel;
import Modelo.TipoPropulsion;

public class SateliteDeCiencia extends Satelite {
	//Variable de clase
	private float medidorDeCiencia;
	
	//Constructor para el heredado que le sigue
	public SateliteDeCiencia(int posicionX, int posicionY, int posicionZ, float capacidadCarga, int masaBase,
			float nivelCarga, TipoPanel panelSolar, TipoPropulsion metodoDePropulsion, int cantidadAntenas,
			float medidorDeCiencia) {
		super(posicionX, posicionY, posicionZ, capacidadCarga, masaBase, nivelCarga, panelSolar, metodoDePropulsion,
				cantidadAntenas);
		this.medidorDeCiencia = medidorDeCiencia;
	}

	
	//Metodos
	public float generarCiencia() {
		float num= 3000000000F;
		medidorDeCiencia =(10*(getNivelCarga()/num));	
		return medidorDeCiencia;
	}
	
	public boolean estaExperimentando() {
		return ((medidorDeCiencia > 1000000000F) && !estaHibernando());
	}//Thiago Torres 5°3

	public void calcularCarga() {
		float carga = 0f;
		float num = 1000000000F;
		if(estaExperimentando()) {
			carga = (num * getPanelSolar().getMultiplicador()) * 0.4f;
		}else {
			carga = num * getPanelSolar().getMultiplicador();
		}
		setNivelCarga(carga);
	}
	
	//Getters y Setters
	public float getMedidorDeCiencia() {
		return medidorDeCiencia;
	}
	
	public void setMedidorDeCiencia(float medidorDeCiencia) {
		this.medidorDeCiencia = medidorDeCiencia;
	}
}
//Thiago Torres 5°3