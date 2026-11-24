package clasesPrincipales;


public class Barrio {
	private int idBarrio;
	private String nombreBarrio;
	private int hectareas;
	private int numero_comuna;
	private String tipoBarrio;
	
	public Barrio(String nombreBarrio, int hectareas, int numero_comuna, String tipoBarrio) {
		this.nombreBarrio = nombreBarrio;
		this.hectareas = hectareas;
		this.numero_comuna = numero_comuna;
		this.tipoBarrio = tipoBarrio;
		}
	
	public void densidadPoblacional() {
	}

	public int getIdBarrio() {
		return idBarrio;
	}

	public void setIdBarrio(int idBarrio) {
		this.idBarrio = idBarrio;
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

	public int getNumero_comuna() {
		return numero_comuna;
	}

	public void setNumero_comuna(int numero_comuna) {
		this.numero_comuna = numero_comuna;
	}

	public String getTipoBarrio() {
		return tipoBarrio;
	}

	public void setTipoBarrio(String tipoBarrio) {
		this.tipoBarrio = tipoBarrio;
	}
	
	
}
