package Heredados;

import Modelo.Personaje;
import Modelo.Util;
import Modelo.probabilidadCargarEnergia;
import Modelo.probabilidadGolpe;
import Modelo.probabilidadMoverse;

public class Alacran extends Personaje{

	
	
	public Alacran(int vida, int energia, float dañoBase, int posicion, float daño,
			probabilidadCargarEnergia cargaDeEnergia, probabilidadGolpe dañoGolpe, probabilidadMoverse moverse) {
		super(vida, energia, dañoBase, posicion, daño, cargaDeEnergia, dañoGolpe, moverse);
		// TODO Auto-generated constructor stub
	}

	public void establecerEstadisticas() {
		setVida(500);
		setEnergia(75);
		setDañoBase(7);
	}
	
	public float golpeIgneo(){
		float a = Util.ingresarEntero(0,10);
		probabilidadGolpe golpe = probabilidadGolpe.NORMAL;
		if(a > 0 && a < 7) {
			golpe.setMultiplicador(5);
			daño = dañoBase * golpe.getMultiplicador();
		}else if(a > 7 && a < 8.5f) {
			golpe = probabilidadGolpe.CRITICO;
			golpe.setMultiplicador(7);
			daño = dañoBase * golpe.getMultiplicador();
		}else if(a > 8.5f && a < 9) {
			golpe = probabilidadGolpe.SUPERCRITICO;
			golpe.setMultiplicador(11);
			daño = dañoBase * golpe.getMultiplicador();
		}else {
			golpe = probabilidadGolpe.PIFIA;
			daño = dañoBase * golpe.getMultiplicador();
		}
		setEnergia(getEnergia()-5);
		return daño;
		}

	public float ataqueAguijon(){
		float a = Util.ingresarEntero(0,10);
		probabilidadGolpe golpe = probabilidadGolpe.NORMAL;
		if(a > 0 && a < 6.8f) {
			golpe.setMultiplicador(8.2f);
			daño = dañoBase * golpe.getMultiplicador();
		}else if(a >6.8f && a <7.8f) {
			golpe = probabilidadGolpe.CRITICO;
			golpe.setMultiplicador(12);
			daño = dañoBase * golpe.getMultiplicador();
		}else if(a>7.8f && a<8) {
			golpe = probabilidadGolpe.SUPERCRITICO;
			golpe.setMultiplicador(16);
			daño = dañoBase * golpe.getMultiplicador();
		}else {
			golpe = probabilidadGolpe.PIFIA;
			daño = dañoBase * golpe.getMultiplicador();
		}
		setEnergia(getEnergia()-9);
		return daño;
		}

}

