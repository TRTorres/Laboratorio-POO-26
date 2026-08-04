import java.util.ArrayList;

public class Vuelo {
	private int capacidadVuelo, consumoCombustible;
	Persona[] lasPersonas;
	public Vuelo(int capacidadVuelo, int consumoCombustible) {
		this.capacidadVuelo = capacidadVuelo; 
		this.consumoCombustible = consumoCombustible;
	}
	public boolean estaDemorado() {
		Persona p = null;
		while(p.esperoMasDeUnaHora()) {
			if(p.esperoMasDeUnaHora()) {
				return true;
			}
		}
		return false;
	}
	public boolean capacidadMenosCien() {
		return capacidadVuelo < 100;
	}
	public int recaudacionVuelo() { 
		int ayu = 0;
		for(Persona p: lasPersonas) {
			ayu = p.getPrecioPasaje();
		}
		return ayu;
	}
	public Persona personaMasEspera(){
		Persona personaMasEspera = null;
		for(Persona p: lasPersonas) {
			if (p.getMinutosEsperados() > personaMasEspera.getMinutosEsperados()){
				personaMasEspera = p;
			}
		}return personaMasEspera;
	}
}