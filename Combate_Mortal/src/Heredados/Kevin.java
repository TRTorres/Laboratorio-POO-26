package Heredados;

import Modelo.Personaje;
import Modelo.Util;
import Modelo.probabilidadCargarEnergia;
import Modelo.probabilidadGolpe;
import Modelo.probabilidadMoverse;

public class Kevin extends Personaje{

	public Kevin(int vida, int energia, float dañoBase, int posicion, float daño,
			probabilidadCargarEnergia cargaDeEnergia, probabilidadGolpe dañoGolpe, probabilidadMoverse moverse) {
		super(vida, energia, dañoBase, posicion, daño, cargaDeEnergia, dañoGolpe, moverse);
		// TODO Auto-generated constructor stub
	}

	public void establecerEstadisticas() {
		setVida(450);
		setEnergia(70);
		setDañoBase(9);
	}
	
	public float golpeGelido(){
		float a = Util.ingresarEntero(0,10);
		probabilidadGolpe golpe = probabilidadGolpe.NORMAL;
		if(a > 0 && a < 7.7f) {
			golpe.setMultiplicador(6);
			daño = dañoBase * golpe.getMultiplicador();
		}else if(a > 7.7f && a < 8.7f) {
			golpe = probabilidadGolpe.CRITICO;
			golpe.setMultiplicador(9);
			daño = dañoBase * golpe.getMultiplicador();
		}else if(a > 8.7f && a < 9.3f) {
			golpe = probabilidadGolpe.SUPERCRITICO;
			golpe.setMultiplicador(11);
			daño = dañoBase * golpe.getMultiplicador();
		}else {
			golpe = probabilidadGolpe.PIFIA;
			daño = dañoBase * golpe.getMultiplicador();
		}
		setEnergia(getEnergia()-3);
		return daño;
		}
	
	public float yurikenDeHielo(){
		float a = Util.ingresarEntero(0,10);
		probabilidadGolpe golpe = probabilidadGolpe.NORMAL;
		if(a > 0 && a < 6) {
			golpe.setMultiplicador(8.6f);
			daño = dañoBase * golpe.getMultiplicador();
		}else if(a > 6 && a < 6.6f) {
			golpe = probabilidadGolpe.CRITICO;
			golpe.setMultiplicador(11);
			daño = dañoBase * golpe.getMultiplicador();
		}else if(a > 6.6f && a < 7) {
			golpe = probabilidadGolpe.SUPERCRITICO;
			golpe.setMultiplicador(16);
			daño = dañoBase * golpe.getMultiplicador();
		}else {
			golpe = probabilidadGolpe.PIFIA;
			daño = dañoBase * golpe.getMultiplicador();
		}
		setEnergia(getEnergia()-12);
		return daño;
		}
}
