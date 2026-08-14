package ModeloCasa;

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
	Jugador j1 = new Jugador(Felicidad.MUCHA,100,Hambre.NIMUCHONIPOCO,true);
	EstadoTelevision tele = EstadoTelevision.APAGADO;
	
	public String eleccion() {
		String ayu;
		ayu = s1.next();
		System.out.println("¿Vas a seguir haciendo cosas?" + "\n" + "1 para si" + "\n" + "2 para no");
		ayu = s1.next();
		if(ayu == "2") {
			return "Z";
		}
		return ayu.toUpperCase();
	}
	
	public String manu() {
		String ayu;
		System.out.println("Bienvenido a este grandioso juego" + "\n" + "¿Va a despertarse?");
		ayu = s1.next().toUpperCase();
		switch(ayu) {
		case "SI":
			return "A";
		}
		return "Z";
	}
	
	public void menuDeCosasParaHacer() {
		System.out.println("B para agarrar comida de la heladera" + "\n" + "D para ir al sillon a ver la tele" + "\n" + "Z para irte a dormir");
	}
	
	public void comer() {
		Hambre hambre = j1.getHambruna();
		switch(hambre) {
		case MUCHA:
			j1.setHambruna(Hambre.NIMUCHONIPOCO);
			break;
		case NIMUCHONIPOCO:
			j1.setHambruna(Hambre.POCA);
			break;
		}
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
	
	public void serMasFeliz() {
		Felicidad estadoJugador = j1.getFeliz();
		switch(estadoJugador) {
		case MUYMALA:
			j1.setFeliz(Felicidad.MALA);
			break;
		case MALA:
			j1.setFeliz(Felicidad.INTERMEDIO);
			break;
		case INTERMEDIO:
			j1.setFeliz(Felicidad.BUENA);
			break;
		case BUENA:
			j1.setFeliz(Felicidad.MUCHA);
			break;
		}
	}
	
	public void serMenosFeliz() {
		Felicidad estadoJugador = j1.getFeliz();
		switch(estadoJugador) {
		case MALA:
			j1.setFeliz(Felicidad.MUYMALA);
			break;
		case INTERMEDIO:
			j1.setFeliz(Felicidad.MALA);
			break;
		case BUENA:
			j1.setFeliz(Felicidad.INTERMEDIO);
			break;
		case MUCHA:
			j1.setFeliz(Felicidad.BUENA);
			break;
		}
	}
	
	public void bajaDeEnergia() {
		int energy = j1.getEnergy();
		energy = energy - 5;
		j1.setEnergy(energy);
	}
	
	public void bajaDeEnergiaPorExplosion() {
		int energy = j1.getEnergy();
		energy = energy - 20;
		j1.setEnergy(energy);
	}
	
	public void estaVivo() {
		boolean estaVivito = j1.getEstaVivo();
		if(j1.getEnergy() < 0) {
			System.out.println("Te moriste por no tener energia");
			j1.setEstaVivo(false);
		}
	}
	
	public void menu() {
		String ayu = null;
		ayu = manu();
		switch(ayu) {
		case "A":
			seLevanto = true;
			bajaDeEnergia();
			System.out.println("¿Que vas a hacer ahora?");
			menuDeCosasParaHacer();
			ayu = s1.next().toUpperCase();
			estaVivo();
		case "B":
			System.out.println("¿Que queres agarrar de la heladera?" + "\n" + "1 para Yogurt" + "\n" + "2 para Agua" + "\n" + "3 para Milanesa" + "\n" + "4 para Fiambre");
			String ayuu = s1.next().toUpperCase();
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
			serMasFeliz();
			System.out.println("Te pusiste mas feliz con solo agarrar comida");
			bajaDeEnergia();
			System.out.println("1 para comer tu comida asi" + "\n" + "2 para calentarla");
			estaVivo();
			ayuu = s1.next();
			if(ayuu == "1") {
				ayu = "C";
			}else {
				ayu = "E";
			}
		case "C":
			if(si1.rompersePorSobrecarga(si1.getPesoCargando()) == Estado.ROTO) {
				System.out.println("Te sentaste a comer en la silla y se rompio por tu peso");
				 serMenosFeliz();
			}else {
				System.out.println("Te sentaste a comer en la silla y te acabste la comida");
				serMasFeliz();
				comer();
				h1.setAgarre(null);
			}
			bajaDeEnergia();
			estaVivo();
			menuDeCosasParaHacer();
			ayu = eleccion();
		case "D":
			if(sl1.rompersePorSobrecarga(sl1.getPesoCargando()) == Estado.ROTO) {
				System.out.println("Te sentaste en el sillon a ver la tele y se rompio el sillon por tu peso");
				serMenosFeliz();
			}else {
				if(tele == EstadoTelevision.PRENDIDO) {
				System.out.println("Te sentaste en el sillon a ver la tele y te divertiste");
				serMasFeliz();
				}else {
					System.out.println("Te sentaste en el sillon a ver la tele, la prendiste y te divertiste");
					serMasFeliz();
				}
			}
			bajaDeEnergia();
			estaVivo();
			menuDeCosasParaHacer();
			ayu = eleccion();
		case "E":
			System.out.println("¿Cuanto tiempo vas a dejar calentar la comida en el microondas?");
			m1.rompersePorMuchaTemperatura(tiempoDeCalentamiento());
			if(m1.rompersePorMuchaTemperatura(tiempoDeCalentamiento()) == Estado.ROTO) {
				bajaDeEnergiaPorExplosion();
				serMenosFeliz();
			}else bajaDeEnergia();
			estaVivo();
			ayu = "C";
		case "F":
			System.out.println("¿Cuanto tiempo vas a dejar cocinar la comida en el horno?");
			c1.rompersePorMuchaTemperatura(tiempoDeCalentamiento());
			if(c1.rompersePorMuchaTemperatura(tiempoDeCalentamiento()) == Estado.ROTO) {
				bajaDeEnergiaPorExplosion();
				serMenosFeliz();
			}else bajaDeEnergia();
			estaVivo();
			ayu = "C";
		case "Z":
			System.out.println("Te acostaste a dormir y te olvidaste que exploto tu microondas y que podrias estar muerto en este momento" + "\n" + "¿Vas a seguir el siguente dia?");
			ayu = s1.next().toUpperCase();
			if(ayu == "NO") {
				System.out.println("Gracias por jugar");
			}else {
				System.out.println("Intenta no morir el siguente dia");
				j1.setEnergy(100);
			}  
			menuDeCosasParaHacer();
			ayu = eleccion();
		}
	}
}
