package Heredados;

import ModeloCasa.Estado;
import ModeloCasa.Mueble;

public abstract class MuebleDeCocina extends Mueble{
	private int temperatura;
	private boolean estaCocinado;
	
	public MuebleDeCocina(int temperatura, boolean estaCocinado, String nombre, int posicionX, int posicionY, int posicion, int cantidadPersonas, boolean estaLimpio, Estado esta) {
		super(nombre, temperatura, temperatura, temperatura, temperatura, estaCocinado, esta);
		this.temperatura = temperatura;
		this.estaCocinado = estaCocinado;
	}

	public void setEstaCocinado(boolean estaCocinado) {
		this.estaCocinado = estaCocinado;
	}
	
	public boolean getEstaCocinado() {
		return estaCocinado;
	}
}
