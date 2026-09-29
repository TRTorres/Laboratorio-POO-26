
public class Personaje {
	private int locura, secretos, ubicacion;
	private String nombre;
	final int locuraMaxima = 20;
	
	public Personaje (int locura, int secretos, int ubicacion, String nombre) {
		this.locura = locura;
		this.secretos = secretos;
		this.ubicacion = ubicacion;
		this.nombre = nombre;
	}
	public Personaje () {
	}
	
	public void embellecer(int locura) {
		this.locura = locura;
		locura += locura;
		secretos -= 10;
	}
	
	public boolean estaEnMaravillas() {
		if (ubicacion < 0) {
			return true;
		}else return false;
	}
	
	public boolean esLindo () {
		if (locura >= locuraMaxima*0.75f & estaEnMaravillas()) {
			return true;
		}else return false;
	}
	
	public boolean esNormal() {
		if(locura < 10 & secretos >= 500) {
			return true;
		}else return false;
	}
	public int getLocura() {
		return locura;
	}
}
