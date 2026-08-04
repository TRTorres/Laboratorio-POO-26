import java.util.ArrayList;

public class Persona {
	private int minutosEsperados, precioPasaje;
	private boolean compromisoImportante;
	
	public Persona(int minutosEsperados, int precioPasaje, boolean compromisoImportante) { 
		this.minutosEsperados = minutosEsperados;
		this.precioPasaje = precioPasaje; 
		this.compromisoImportante = compromisoImportante; 
	}
	
	public boolean esperoMasDeUnaHora() {
		return minutosEsperados > 60;
	}
	
	public int getPrecioPasaje() {
		return precioPasaje;
	}
	
	public int getMinutosEsperados() {
		return minutosEsperados;
	}
	
	public boolean getCompromisoImportate() {
		return compromisoImportante;
	}
	
}
