package Heredados;

import Modelo.TipoPanel;
import Modelo.TipoPropulsion;

public final class Pampa32 extends SateliteDeComunicaciones{
	//Todo lo que hereda de la clase madre y de SateliteDeCiencia
	public Pampa32(int posicionX, int posicionY, int posicionZ, float capacidadCarga, int masaBase, float nivelCarga,
			TipoPanel panelSolar, TipoPropulsion metodoDePropulsion, int cantidadAntenas, boolean seComunica) {
		super(posicionX, posicionY, posicionZ, capacidadCarga, masaBase, nivelCarga, panelSolar, metodoDePropulsion,
				cantidadAntenas, seComunica);
		// TODO Auto-generated constructor stub
	}
	
	//Metodo para establecer el valor de las variables de la clase
	public void establecerVariables() {
		setMetodoDePropulsion(TipoPropulsion.RETROPROPULSORPLASMATICO);
		setCantidadAntenas(7);
		setPosicionX(35);
		setPosicionY(56);
		setPosicionZ(200);
		setCapacidadCarga(4246861544f);
		setPanelSolar(TipoPanel.DIODOSENANTIPARALELO);
	}
}
//Thiago Torres 5°3