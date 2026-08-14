package Heredados;

import ModeloCasa.Estado;
import ModeloCasa.Tiempo;

public final class Cocina extends MuebleDeCocina{

	public Cocina(int temperatura, boolean estaCocinado, String nombre, int posicionX, int posicionY, int posicion, int cantidadPersonas, boolean estaLimpio, Estado esta) {
		super(temperatura, estaCocinado, nombre, temperatura, temperatura, temperatura, temperatura, estaCocinado, esta);
		// TODO Auto-generated constructor stub
	}
	public Estado rompersePorMuchaTemperatura(Tiempo tiempo) {
		if(tiempo == Tiempo.MUCHO) {
			System.out.println("La cocina exploto y te quedaste sin comida");
			setEsta(Estado.ROTO);
			return getEsta();
		}else {
			setEstaCocinado(true);
			System.out.println("Disfrutaste de comida calentita");
		}
		return getEsta();
	}
}
