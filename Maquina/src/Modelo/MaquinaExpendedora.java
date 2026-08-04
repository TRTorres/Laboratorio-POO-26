package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaExpendedora {
	Scanner algo= new Scanner(System.in);
	private ArrayList<Productos> losProductos = new ArrayList<>();
	public void agregarAlArray() {
		for(Productos p: losProductos) {
			p.agregar();
			losProductos.add(p);
		}
	}
	
	public void verSanguche() {
		System.out.println(TipoProducto.SANGUCHE);
	}
	public void verBebida() {
		System.out.println(TipoProducto.BEBIDA);
	}
	public void verGolosina() {
		System.out.println(TipoProducto.GOLOSINA);
	}
	public void verSaludable() {
		System.out.println(TipoProducto.SALUDABLE);
	}
	public void pagar() {
		algo.next();
		for(Productos p: losProductos) {
			if(p.id.equals(algo)) {
				System.out.println(p.precio + "\n" + "Desea pagar?" + "\n" + "1 para si" + "\n" + "2 para no");
				algo.next();
				if(algo.equals(1)) {
					p.cantidad -= 1;				
				}
			}
		}
	}
	public void verPaQueMeAlcanza() {
		String ayu = "1";
		System.out.println("Ingrese la cantidad de dinero que quiere gastar");
		algo.next();
		for(Productos p: losProductos) {
			if(p.precio.equals(algo)) {
				System.out.println(losProductos);
			}
		}
		System.out.println("Desea comprar alguno?" + "\n" + "1 para Si" + "\n" + "2 para volver al Menu");
		algo.next();
		if(ayu.equals(algo)) {
			System.out.println("Cual desea comprar?");
			algo.next();
			for(Productos p: losProductos) {
				if(p.id.equals(algo)) {
					p.cantidad -= 1;
				}
			}
		}
	}
	public void menu() {
		System.out.println("1 para ver sanguches" + "\n" + "2 para ver bebidas"  + "\n" + "3 para ver golosinas"  + "\n" + "4 para ver saludables"  + "\n" + "5 para comprar"  + "\n" + "6 para ver que te alcanza");
		algo.next();
		String ayu = "";
		switch(ayu.equals(algo)) {
		
		}
	}
}
