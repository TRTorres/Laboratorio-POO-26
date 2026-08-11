package Modelo;

import Heredados.Cama;
import Heredados.Cocina;
import Heredados.Heladera;
import Heredados.Microondas;
import Heredados.Silla;
import Heredados.Sillon;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cocina c1 = new Cocina(50, false, null, 0, 0, 0, 0, false, Estado.IMPECABLE);
		Heladera h1 = new Heladera(-10, false, null, 0, 0, 0, 0, false, Estado.USADO);
		Microondas mc1 = new Microondas(25, false, null, 0, 0, 0, 0, false, Estado.LEVESGOLPES);
		Silla s1 = new Silla(6, 100, false, 120, null, 0, 0, 0, 0, false, Estado.IMPECABLE);
		Sillon sl1 = new Sillon(8, 250, true, 300, null, 0, 0, 0, 0, false, Estado.USADO);
		Cama cm1 = new Cama(10, 120, true, 150, null, 0, 0, 0, 0, false, Estado.LEVESGOLPES);
		
		c1.rompersePorMuchaTemperatura(mc1.getTiempo());
		h1.rompersePorMuyPocaTemperatura();
		mc1.rompersePorMuchaTemperatura(mc1.getTiempo());
		s1.rompersePorSobrecarga(s1.getPesoCargando());
		sl1.rompersePorSobrecarga(sl1.getPesoCargando());
		cm1.rompersePorSobrecarga(cm1.getPesoCargando());
	    System.out.println(c1.getEstaCocinado());
	    System.out.println(c1.getEsta());
	    System.out.println(h1.getEsta());
	    System.out.println(mc1.getEsta());
	    System.out.println(s1.getEsta());
	    System.out.println(sl1.getEsta());
	    System.out.println(cm1.getEsta());
		}

}
