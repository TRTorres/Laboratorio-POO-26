package Heredados;

import Modelo.TipoPanel;
import Modelo.TipoPropulsion;

public final class ChacraProfunda extends SateliteDeComunicaciones{
	//Todo lo que hereda de la clase madre y de SateliteDeCiencia
	public ChacraProfunda(int posicionX, int posicionY, int posicionZ, float capacidadCarga, int masaBase,
			float nivelCarga, TipoPanel panelSolar, TipoPropulsion metodoDePropulsion, int cantidadAntenas, boolean seComunica) {
		super(posicionX, posicionY, posicionZ, capacidadCarga, masaBase, nivelCarga, panelSolar, metodoDePropulsion,
				cantidadAntenas, seComunica);
		// TODO Auto-generated constructor stub
	}
	
	//Metodo para establecer el valor de las variables de la clase
	public void establecerVariables() {
		setMetodoDePropulsion(TipoPropulsion.CICLOOTTOESPACIAL);
		setCantidadAntenas(9);
		setPosicionX(1080);
		setPosicionY(1068);
		setPosicionZ(500);
		setCapacidadCarga(2147483649f);
		setPanelSolar(TipoPanel.PROTOVELAMAGNETICATEJIDA);
	}

}
//Thiago Torres 5°3