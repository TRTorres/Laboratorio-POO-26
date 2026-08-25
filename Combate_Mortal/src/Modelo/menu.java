package Modelo;

import java.util.Scanner;

public class menu {
	Scanner s = new Scanner(System.in);
	Personaje p1 = new Personaje(0, 0, 0, 0, 0, null, null, null);
	Personaje p2 = new Personaje(0, 0, 0, 0, 0, null, null, null);
	
	public void seleccionarPersonaje() {
		System.out.println("Seleccione su personaje: \n 1.Alacran \n 2.Kevin");
		String p = s.next();
		if(p.equals("1")) {
			
		}else {
			
		}
	}
	
	public void Menu() {
		String a = "";
		do{
			System.out.println("1.Moverse \n 2.Golpear \n 3 Carga energia");
			
			switch(a) {
			case "1":
				p1.moverse();
			break;
			case"2":
				System.out.println("");
			}
		}
		while(p1.getVida() > 0 || p2.getVida() > 0);
	}
}
