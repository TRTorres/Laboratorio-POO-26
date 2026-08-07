package Modelo;

public class Mueble {
	private String nombre;
	private int posicionX; 
	private int posicionY; 
	private int posicionZ;
	private int cantidadPersonas;
	private boolean estaLimpio;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public int getPosicionZ() {
		return posicionZ;
	}

	public void setPosicionZ(int posicionZ) {
		this.posicionZ = posicionZ;
	}

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public boolean isEstaLimpio() {
		return estaLimpio;
	}

	public void setEstaLimpio(boolean estaLimpio) {
		this.estaLimpio = estaLimpio;
	}

	public Estado usar() {
		return Estado.USADO;
	}
	
	public void mover(int posicionX, int posicionY, int posicionZ) {
		int ayu = 0;
		posicionX = posicionX + ayu;
		posicionY = posicionY + ayu;
		posicionZ = posicionZ + ayu;
	}
	
	public boolean ensuciarse() {
		estaLimpio = false;
		return estaLimpio;
	}
	
	public boolean limpiarse() {
		estaLimpio = true;
		return estaLimpio;
	}
	
	public Estado romperse() {
		return Estado.ROTO;
	}
}
