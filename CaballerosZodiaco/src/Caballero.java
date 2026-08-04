import java.util.ArrayList;

public class Caballero {

	private String nombre; 
	private int edadInicio, nivelMaldad;  
	private Constelacion c;
	
	public Caballero (String nombre, Constelacion c, int edadInicio,int nivelMaldad) {
		this.nombre = nombre;
		this.c = c;
		this.edadInicio = edadInicio;
		this.nivelMaldad = nivelMaldad;
	}

	
	public boolean esPrecoz() {
		if (edadInicio <= 12) {
			return true;
		} else return false;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public Constelacion getConstelacion() {
		return c;
	}
	
	public int getEdadInicio() {
		return edadInicio;
	}
	
	public int getNivelMaldad() {
		return nivelMaldad;
	}
	
}
