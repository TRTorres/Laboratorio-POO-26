package Heredados;

import Modelo.Comida;
import Modelo.Estado;

public final class Heladera extends MuebleDeCocina{
	private Comida agarre;
	
	public Heladera(int temperatura, boolean estaCocinado,  String nombre, int posicionX, int posicionY, int posicion, int cantidadPersonas, boolean estaLimpio, Estado esta) {
		super(temperatura, estaCocinado, nombre, temperatura, temperatura, temperatura, temperatura, estaCocinado, esta);
		// TODO Auto-generated constructor stub
	}
	
	public Comida agarrarComida(Comida agarre) {
		return agarre;
	}
	public Estado rompersePorMuyPocaTemperatura() {
		setEsta(Estado.ROTO);
		return getEsta();
	}

	public Comida getAgarre() {
		return agarre;
	}

	public void setAgarre(Comida agarre) {
		this.agarre = agarre;
	}
}
