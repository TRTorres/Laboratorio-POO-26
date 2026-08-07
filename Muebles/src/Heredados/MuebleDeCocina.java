package Heredados;

import Modelo.Estado;
import Modelo.Mueble;

public class MuebleDeCocina extends Mueble{
	private int temperatura;
	private boolean estaCocinado;
	
	public MuebleDeCocina(int temperatura, boolean estaCocinado) {
		super();
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
