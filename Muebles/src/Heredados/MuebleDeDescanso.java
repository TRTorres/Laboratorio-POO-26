package Heredados;

import Modelo.Estado;
import Modelo.Mueble;

public class MuebleDeDescanso extends Mueble {
	private int nivelDeComodidad;
	private int cargaMaxima;
	private boolean esAbrigado;
	private int pesoCargando;
	
	public MuebleDeDescanso(int nivelDeComodidad, int cargaMaxima, boolean esAbrigado, int pesoCargando) {
		super();
		this.nivelDeComodidad = nivelDeComodidad;
		this.cargaMaxima = cargaMaxima;
		this.esAbrigado = esAbrigado;
		this.pesoCargando = pesoCargando;
	}

	public Estado rompersePorSobrecarga(){
		Estado rotosido = Estado.IMPECABLE;
		if(cargaMaxima < pesoCargando) {
			rotosido = Estado.ROTO;
		}
		return rotosido;
	}
}
