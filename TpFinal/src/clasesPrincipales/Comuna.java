package clasesPrincipales;

public class Comuna {
	private int numeroComuna;
	private String nombreComuna;
	private String juntaComunal;
	public Comuna(int numeroComuna, String nombreComuna, String juntaComunal) {
		this.numeroComuna = numeroComuna;
		this.nombreComuna = nombreComuna;
		this.juntaComunal = juntaComunal;
	}
	public int getNumeroComuna() {
		return numeroComuna;
	}
	public void setNumeroComuna(int numeroComuna) {
		this.numeroComuna = numeroComuna;
	}
	public String getNombreComuna() {
		return nombreComuna;
	}
	public void setNombreComuna(String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}
	public String getJuntaComunal() {
		return juntaComunal;
	}
	public void setJuntaComunal(String juntaComunal) {
		this.juntaComunal = juntaComunal;
	}
}
