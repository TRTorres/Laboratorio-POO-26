package Heredados;

import Modelo.Estado;
import Modelo.Tiempo;

public final class Microondas extends MuebleDeCocina{

	Tiempo tiempo = null;
	public Microondas(int temperatura, boolean estaCocinado,  String nombre, int posicionX, int posicionY, int posicion, int cantidadPersonas, boolean estaLimpio, Estado esta) {
		super(temperatura, estaCocinado, nombre, temperatura, temperatura, temperatura, temperatura, estaCocinado, esta);
		// TODO Auto-generated constructor stub
	}
	public Estado rompersePorMuchaTemperatura(Tiempo tiempo) {
		if(tiempo == Tiempo.MUCHO) {
			System.out.println("El microondas exploto y te quedaste sin comida");
			setEsta(Estado.ROTO);
			return getEsta();
		}else {
			System.out.println("Disfrutaste de comida calentita");
		}
		return getEsta();
	}
	public Tiempo getTiempo() {
		return tiempo;
	}
}
