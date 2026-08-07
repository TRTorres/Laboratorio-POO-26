package Heredados;

import Modelo.Estado;

public class Cocina extends MuebleDeCocina{

	public Cocina(int temperatura, boolean estaCocinado) {
		super(temperatura, estaCocinado);
		// TODO Auto-generated constructor stub
	}
	public Estado rompersePorMuchaTemperatura() {
		return Estado.ROTO;
	}
	public boolean cocinar() {
		setEstaCocinado(true);
		boolean ayu = getEstaCocinado();
		return ayu;
	}
}
