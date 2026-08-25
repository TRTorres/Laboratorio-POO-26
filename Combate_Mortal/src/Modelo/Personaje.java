package Modelo;

public class Personaje {
private int vida;
private int energia;
protected float dañoBase;
private int posicion;
protected float daño;
private probabilidadCargarEnergia cargaDeEnergia;
private probabilidadGolpe dañoGolpe;
private probabilidadMoverse moverse;


public float golpeNormal(){
	float a = Util.ingresarEntero(0,10);
	probabilidadGolpe golpe = probabilidadGolpe.NORMAL;
	if(a > 0 && a < 8) {
		daño = dañoBase * golpe.getMultiplicador();
	}else if(a >8 && a<9) {
		golpe = probabilidadGolpe.CRITICO;
		daño = dañoBase * golpe.getMultiplicador();
	}else if(a>9 && a<9.8f) {
		golpe = probabilidadGolpe.SUPERCRITICO;
		daño = dañoBase * golpe.getMultiplicador();
	}else {
		golpe = probabilidadGolpe.PIFIA;
		daño = dañoBase * golpe.getMultiplicador();
	}
	energia = energia - 2;
	return daño;
	}

public int moverse(){
	float a = Util.ingresarEntero(0,10);
	probabilidadMoverse mov = probabilidadMoverse.UNMTS;
	if(a > 0 && a < 8) {
		posicion = posicion + mov.moverse;
	}else if(a >8 && a<9) {
		mov = probabilidadMoverse.DOSMTS;
		posicion = posicion + mov.moverse;
	}else if(a>9 && a<9.8f) {
		mov = probabilidadMoverse.TRESMTS;
		posicion = posicion + mov.moverse;
	}else {
		mov = probabilidadMoverse.NOSEMUEVE;
		posicion = posicion + mov.moverse;
	}
	energia = energia - 1;
	return posicion;
	}

public int getVida() {
	return vida;
}

public void setVida(int vida) {
	this.vida = vida;
}

public int getEnergia() {
	return energia;
}

public void setEnergia(int energia) {
	this.energia = energia;
}

public float getDañoBase() {
	return dañoBase;
}

public void setDañoBase(float dañoBase) {
	this.dañoBase = dañoBase;
}

public int getPosicion() {
	return posicion;
}

public void setPosicion(int posicion) {
	this.posicion = posicion;
}

public float getDaño() {
	return daño;
}

public void setDaño(float daño) {
	this.daño = daño;
}

public probabilidadCargarEnergia getCargaDeEnergia() {
	return cargaDeEnergia;
}

public void setCargaDeEnergia(probabilidadCargarEnergia cargaDeEnergia) {
	this.cargaDeEnergia = cargaDeEnergia;
}

public probabilidadGolpe getDañoGolpe() {
	return dañoGolpe;
}

public void setDañoGolpe(probabilidadGolpe dañoGolpe) {
	this.dañoGolpe = dañoGolpe;
}

public probabilidadMoverse getMoverse() {
	return moverse;
}

public void setMoverse(probabilidadMoverse moverse) {
	this.moverse = moverse;
}

public int cargarEnergia(){
	float a = Util.ingresarEntero(0,10);
	probabilidadCargarEnergia mov = probabilidadCargarEnergia.MASTRES;
	if(a > 0 && a < 8) {
		energia = energia + mov.energia;
	}else if(a >8 && a<9) {
		mov = probabilidadCargarEnergia.MASCINCO;
		energia = energia + mov.energia;
	}else if(a>9 && a<9.8f) {
		mov = probabilidadCargarEnergia.MASSIETE;
		energia = energia + mov.energia;
	}else {
		mov = probabilidadCargarEnergia.MASCERO;
		energia = energia + mov.energia;
	} 
	energia = energia - 1;
	return energia;
	}
public float golpeADistancia(){
	float a = Util.ingresarEntero(0,10);
	probabilidadGolpeADistancia golpe = probabilidadGolpeADistancia.NORMAL;
	if(a > 0 && a < 3) {
		daño = dañoBase * golpe.getMultiplicador();
	}else if(a > 3 && a<3.2f) {
		golpe = probabilidadGolpeADistancia.CRITICO;
		daño = dañoBase * golpe.getMultiplicador();
	}else if(a > 3.2f && a<3.4f) {
		golpe = probabilidadGolpeADistancia.SUPERCRITICO;
		daño = dañoBase * golpe.getMultiplicador();
	}else {
		golpe = probabilidadGolpeADistancia.PIFIA;
		daño = dañoBase * golpe.getMultiplicador();
	}
	return daño;
	}

public Personaje(int vida, int energia, float dañoBase, int posicion, float daño,
		probabilidadCargarEnergia cargaDeEnergia, probabilidadGolpe dañoGolpe, probabilidadMoverse moverse) {
	super();
	this.vida = vida;
	this.energia = energia;
	this.dañoBase = dañoBase;
	this.posicion = posicion;
	this.daño = daño;
	this.cargaDeEnergia = cargaDeEnergia;
	this.dañoGolpe = dañoGolpe;
	this.moverse = moverse;
}


}



