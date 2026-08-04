package Modelo;

public class Equipaje {
	private int medidorDefensa,rareza,precio,durabilidad;
	
	public Equipaje (int medidorDefensa, int rareza, int precio, int durabilidad) {
		this.medidorDefensa = medidorDefensa; 
		this.rareza = rareza;
		this.precio = precio;
		this.durabilidad = durabilidad;
	}
	
	public Equipaje() {
	}
	
	public boolean esLegendario() {
		return (rareza == 10 && precio > 5000000);
	}
	

	public void setDurabilidad(int durabilidad) {
		this.durabilidad = durabilidad;
	}

	public boolean esBajaCalidad() {
		return (rareza < 3 && durabilidad == 0);
	}

	public boolean esDefensivo() {
		return medidorDefensa > 1000;
	}

	public boolean esOfensivo() {
		return medidorDefensa < 50;
	}
	
	public int getMedidorDefensa() {
		return medidorDefensa;
	}

	public void setMedidorDefensa(int medidorDefensa) {
		this.medidorDefensa = medidorDefensa;
	}

	public int getRareza() {
		return rareza;
	}

	public void setRareza(int rareza) {
		this.rareza = rareza;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getDurabilidad() {
		return durabilidad;
	}


}
