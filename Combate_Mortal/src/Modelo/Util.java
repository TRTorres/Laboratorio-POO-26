package Modelo;

import java.util.Scanner;

public class Util {
	static Scanner s = new Scanner(System.in);
	
	public static float ingresarEntero(int i, int j) {
		String a = "";
		System.out.println("Ingrese un numero");
		a = s.next();
		float o = 0;
		o = Float.parseFloat(a);
		return o;
	}
}
