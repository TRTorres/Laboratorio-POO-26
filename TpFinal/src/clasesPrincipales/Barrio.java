package clasesPrincipales;


public class Barrio {
	private String nombreBarrio;
	private int hectareas;
	private int numero_comuna;
	
	public Barrio(String nombreBarrio, int hectareas, int numero_comuna) {
		this.nombreBarrio = nombreBarrio;
		this.hectareas = hectareas;
		this.numero_comuna = numero_comuna;
		}

	public String getNombreBarrio() {
		return nombreBarrio;
	}

	public void setNombreBarrio(String nombreBarrio) {
		this.nombreBarrio = nombreBarrio;
	}

	public int getHectareas() {
		return hectareas;
	}

	public void setHectareas(int hectareas) {
		this.hectareas = hectareas;
	}
	
}
