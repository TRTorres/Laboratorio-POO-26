package Heredados;

import Modelo.Estado;

public class Heladera extends MuebleDeCocina{

	public Heladera(int temperatura, boolean estaCocinado) {
		super(temperatura, estaCocinado);
		// TODO Auto-generated constructor stub
	}
	public Estado rompersePorMuyPocaTemperatura() {
		return Estado.ROTO;
	}
}
