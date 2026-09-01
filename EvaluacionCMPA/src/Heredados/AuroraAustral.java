package Heredados;

import Modelo.TipoPanel;
import Modelo.TipoPropulsion;

public final class AuroraAustral extends SateliteDeCiencia{
	//Todo lo que hereda de la clase madre y de SateliteDeCiencia
	public AuroraAustral(int posicionX, int posicionY, int posicionZ, float capacidadCarga, int masaBase,
			float nivelCarga, TipoPanel panelSolar, TipoPropulsion metodoDePropulsion, int cantidadAntenas) {
		super(posicionX, posicionY, posicionZ, capacidadCarga, masaBase, nivelCarga, panelSolar, metodoDePropulsion, cantidadAntenas, nivelCarga);
		// TODO Auto-generated constructor stub
	}
	
	//Metodo para establecer el valor de las variables de la clase
	public void establecerVariables() {
		setMetodoDePropulsion(TipoPropulsion.TURBINASIONICAS);
		setCantidadAntenas(4);
		setPosicionX(4000);
		setPosicionY(3400);
		setPosicionZ(700);
		setCapacidadCarga(5781464416f);
		setPanelSolar(TipoPanel.REBOTEIONICOPORPSEUDOTRANSFERENCIA);
	}
	
	
}
//Thiago Torres 5°3