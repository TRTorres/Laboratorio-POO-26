package Modelo;

import java.util.Scanner;

import Heredados.Cocina;
import Heredados.Heladera;
import Heredados.Microondas;
import Heredados.Silla;
import Heredados.Sillon;

public class Casa {
	private boolean seLevanto;
	Scanner s1 = new Scanner(System.in);
	Heladera h1 = new Heladera(-10, false, null, 0, 0, 0, 0, false, Estado.USADO);
	Silla si1 = new Silla(6, 100, false, 80, null, 0, 0, 0, 0, false, Estado.USADO);
	Sillon sl1 = new Sillon(8, 250, true, 80, null, 0, 0, 0, 0, false, Estado.USADO);
	Microondas m1 = new Microondas(25, false, null, 0, 0, 0, 0, false, Estado.LEVESGOLPES);
	Cocina c1 = new Cocina(50, false, null, 0, 0, 0, 0, false, Estado.IMPECABLE);
	EstadoTelevision tele = EstadoTelevision.APAGADO;
	
	public String eleccion() {
		String ayu = null;
		ayu = s1.next();
		System.out.println("¿Vas a seguir haciendo cosas?" + "\n" + "1 para si" + "\n" + "2 para no");
		ayu = s1.next();
		return ayu;
	}
	
	public Tiempo tiempoDeCalentamiento() {
		String sis = s1.next();
		char a = sis.charAt(0);
		Tiempo tiempo= null;
		switch(a) {
		case 'p':
			tiempo = Tiempo.POCO;
			break;
		case 'm':
			tiempo = Tiempo.MUCHO;
			break;
		}
		return tiempo;
	}
	
	public void menu() {
		String ayu = null;
		ayu = s1.next();
		switch(ayu) {
		case "A":
			seLevanto = true;
			System.out.println("¿Que vas a hacer ahora?");
			ayu = s1.next();
		case "B":
			System.out.println("¿Que queres agarrar de la heladera?");
			System.out.println("1 para Yogurt" + "\n" + "2 para Agua" + "\n" + "3 para Milanesa" + "\n" + "4 para Fiambre");
			String ayuu = s1.next();
			switch(ayuu) {
				case "1":
					h1.agarrarComida(Comida.YOGURT);
					break;
				case "2":
					h1.agarrarComida(Comida.AGUA);
					break;
				case "3":
					h1.agarrarComida(Comida.MILANESA);
					break;
				case "4":
					h1.agarrarComida(Comida.FIAMBRE);
					break;
				}
			eleccion();
		case "C":
			if(si1.rompersePorSobrecarga(si1.getPesoCargando()) == Estado.ROTO) {
				System.out.println("Te sentaste a comer en la silla y se rompio por tu peso");
			}else {
				System.out.println("Te sentaste a comer en la silla y te acabste la comida");
				h1.setAgarre(null);
			}
			eleccion();
		case "D":
			if(sl1.rompersePorSobrecarga(sl1.getPesoCargando()) == Estado.ROTO) {
				System.out.println("Te sentaste en el sillon a ver la tele y se rompio el sillon por tu peso");
			}else {
				if(tele == EstadoTelevision.PRENDIDO) {
				System.out.println("Te sentaste en el sillon a ver la tele y te divertiste");
				}else {
					System.out.println("Te sentaste en el sillon a ver la tele, la prendiste y te divertiste");
				}
			}
			eleccion();
		case "E":
			System.out.println("¿Cuanto tiempo vas a dejar calentar la comida en el microondas?");
			m1.rompersePorMuchaTemperatura(tiempoDeCalentamiento());
			eleccion();
		case "F":
			System.out.println("¿Cuanto tiempo vas a dejar calentar la comida en el horno o hornalla?");
			c1.rompersePorMuchaTemperatura(tiempoDeCalentamiento());
		}
	}
}
