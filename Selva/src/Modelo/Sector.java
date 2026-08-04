package Modelo;

public class Sector {
	private int superficie;
	private Fauna f;
	
	public Sector(Fauna f) {
		this.f = f;
	}
	
	public int valorDeSector() {
		return ((superficie * 300) + f.getValorFauna());
	}
	
	public boolean esVulnerable() {
		return f.estaEnPeligro();
	}
	
	public int cantidadEspecies() {
		return f.getCantidadEspecies();
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
}
