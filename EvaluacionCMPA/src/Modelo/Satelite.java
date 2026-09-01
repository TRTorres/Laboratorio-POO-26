package Modelo;

public class Satelite {
	
//Creacion de las variables de clase
private int posicionX;
private int posicionY;
private int posicionZ;
private float capacidadCarga;
private int masaBase = 500;
private float nivelCarga;
private int cantidadAntenas;
private TipoPanel panelSolar;
private TipoPropulsion metodoDePropulsion;


//Constructor de la clase madre
public Satelite(int posicionX, int posicionY, int posicionZ, float capacidadCarga, int masaBase, float nivelCarga,
		TipoPanel panelSolar, TipoPropulsion metodoDePropulsion, int cantidadAntenas) {
	super();
	this.posicionX = posicionX;
	this.posicionY = posicionY;
	this.posicionZ = posicionZ;
	this.capacidadCarga = capacidadCarga;
	this.masaBase = masaBase;
	this.nivelCarga = nivelCarga;
	this.panelSolar = panelSolar;
	this.metodoDePropulsion = metodoDePropulsion;
	this.cantidadAntenas = cantidadAntenas;
}
//Thiago Torres 5°3
//Metodos 
public float masaTotal() {
	float pesoAntenas = 0;
	for(int i = 0; i < cantidadAntenas; i++) {
		pesoAntenas = pesoAntenas + 20;
	}
	return (masaBase + pesoAntenas + 600);
}

public int distanciaConElCentroDeLaTierra() {
	return (posicionZ + 6378);
}

public boolean estaHibernando() {
	return (nivelCarga < capacidadCarga*(0.1f));
}

//Getters y Setters
public int getCantidadAntenas() {
	return cantidadAntenas;
}

public void setCantidadAntenas(int cantidadAntenas) {
	this.cantidadAntenas = cantidadAntenas;
}

public int getPosicionX() {
	return posicionX;
}//Thiago Torres 5°3

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

public float getCapacidadCarga() {
	return capacidadCarga;
}

public void setCapacidadCarga(Float capacidadCarga) {
	this.capacidadCarga = capacidadCarga;
}

public int getMasaBase() {//Thiago Torres 5°3
	return masaBase;
}

public void setMasaBase(int masaBase) {
	this.masaBase = masaBase;
}

public float getNivelCarga() {
	return nivelCarga;
}

public void setNivelCarga(Float nivelCarga) {
	this.nivelCarga = nivelCarga;
}

public TipoPanel getPanelSolar() {
	return panelSolar;
}

public void setPanelSolar(TipoPanel panelSolar) {
	this.panelSolar = panelSolar;
}

public TipoPropulsion getMetodoDePropulsion() {
	return metodoDePropulsion;
}

public void setMetodoDePropulsion(TipoPropulsion metodoDePropulsion) {
	this.metodoDePropulsion = metodoDePropulsion;
}//Thiago Torres 5°3

}
