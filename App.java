package ModeloCasa;

import Heredados.Cama;
import Heredados.Cocina;
import Heredados.Heladera;
import Heredados.Microondas;
import Heredados.Silla;
import Heredados.Sillon;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cocina c1 = new Cocina(50, false, null, 0, 0, 0, 0, false, Estado.IMPECABLE);
		Heladera h1 = new Heladera(-10, false, null, 0, 0, 0, 0, false, Estado.USADO);
		Microondas mc1 = new Microondas(25, false, null, 0, 0, 0, 0, false, Estado.LEVESGOLPES);
		Silla s1 = new Silla(6, 100, false, 120, null, 0, 0, 0, 0, false, Estado.IMPECABLE);
		Sillon sl1 = new Sillon(8, 250, true, 300, null, 0, 0, 0, 0, false, Estado.USADO);
		Cama cm1 = new Cama(10, 120, true, 150, null, 0, 0, 0, 0, false, Estado.LEVESGOLPES);
		Casa cc = new Casa();
		
		cc.menu();
		}

}
