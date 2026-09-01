package Heredados;

import Modelo.Satelite;
import Modelo.TipoPanel;
import Modelo.TipoPropulsion;

public class SateliteDeComunicaciones extends Satelite{
	//Variable de clase
	private boolean seComunica;
	//Constructor para que se hereden las variables que ya hereda y la variable de esta clase
	public SateliteDeComunicaciones(int posicionX, int posicionY, int posicionZ, float capacidadCarga, int masaBase,
			float nivelCarga, TipoPanel panelSolar, TipoPropulsion metodoDePropulsion, int cantidadAntenas,
			boolean seComunica) {
		super(posicionX, posicionY, posicionZ, capacidadCarga, masaBase, nivelCarga, panelSolar, metodoDePropulsion,
				cantidadAntenas);
		this.seComunica = seComunica;
	}
	
	//Metodos
	public void calcularCarga() {
		float carga = 0f;
		float num = 1000000000F;
		carga = num * getPanelSolar().getMultiplicador();
		setNivelCarga(carga);
	}
	

	public boolean enrutarComunicaciones() {
		float num = 10000000000f;
		float num1 = 0f;//Thiago Torres 5°3
		num1 = getNivelCarga()/num;
		setNivelCarga(num1);
		if(num1 >= 1) {
			seComunica = true;
		}else seComunica = false;
		return seComunica;
	}

	//Get y Set
	public boolean getSeComunica() {
		return seComunica;
	}

	public void setSeComunica(boolean seComunica) {
		this.seComunica = seComunica;
	}
}
//Thiago Torres 5°3