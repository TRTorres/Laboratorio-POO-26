package Heredados;

import ModeloCasa.Estado;
import ModeloCasa.Mueble;

public abstract class MuebleDeDescanso extends Mueble {
	private int nivelDeComodidad;
	private int cargaMaxima;
	private boolean esAbrigado;
	private int pesoCargando;
	
	public MuebleDeDescanso(int nivelDeComodidad, int cargaMaxima, boolean esAbrigado, int pesoCargando,  String nombre, int posicionX, int posicionY, int posicion, int cantidadPersonas, boolean estaLimpio, Estado esta) {
		super(nombre, pesoCargando, pesoCargando, pesoCargando, pesoCargando, esAbrigado, esta);
		this.nivelDeComodidad = nivelDeComodidad;
		this.cargaMaxima = cargaMaxima;
		this.esAbrigado = esAbrigado;
		this.pesoCargando = pesoCargando;
	}

	public Estado rompersePorSobrecarga(int pesoCargando){
		int peso = pesoCargando;
		if(cargaMaxima < peso) {
			setEsta(Estado.ROTO);
		}
		return getEsta();
	}

	public int getPesoCargando() {
		return pesoCargando;
	}

	public void setPesoCargando(int pesoCargando) {
		this.pesoCargando = pesoCargando;
	}
}
