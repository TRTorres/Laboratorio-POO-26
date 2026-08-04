package Modelo;

public class Nodo {
	//Variables
	private int consumoBase;
	private Disco d;
	
	//Constructor para Test
	public Nodo(int consumoBase, Disco d) {
		this.consumoBase = consumoBase;
		this.d = d;
	}
	
	//Metodos para delegaciones
	public boolean esCritico() {
	 return d.estaEnRiesgo();
	}
 
	public int tasaDeTransferencia() {
	 return d.tazaDeTransferencia();
	}
 
	public float consumoTotalNodo() {
	 float consumo = 0;
	 consumo = consumoBase*1.5f + tasaDeTransferencia();
	 return consumo;
	}
}
