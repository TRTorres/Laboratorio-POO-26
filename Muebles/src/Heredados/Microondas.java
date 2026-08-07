package Heredados;

import Modelo.Estado;

public class Microondas extends MuebleDeCocina{

	public Microondas(int temperatura, boolean estaCocinado) {
		super(temperatura, estaCocinado);
		// TODO Auto-generated constructor stub
	}
	public Estado rompersePorMuchaTemperatura() {
		return Estado.ROTO;
	}
}
