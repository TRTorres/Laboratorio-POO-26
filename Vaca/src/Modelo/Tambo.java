package Modelo;

public class Tambo {
	private int superficie;
	private int capacidad;
	private Vaca[] vacas;
	
	public Tambo(int superficie, int capacidad, Vaca[] vacas) {
		this.superficie = superficie;
		this.capacidad = (superficie/2);
		this.vacas = new Vaca[capacidad];
	} 
	
	public int getSuperficie(){
		return superficie;
	}
	
	public int produccionTotalTambo() {
		int produccion = 0;
		for(Vaca v: vacas) {
			produccion = produccion + v.produccionTotalDeLeche();
		}
		return produccion;
	}
	
	public int vacaMasProductora() {
		Vaca masProductora = vacas[0];
		for(Vaca v: vacas) {
			if(masProductora.produccionTotalDeLeche() < v.produccionTotalDeLeche()) {
				masProductora = v;
			}
		}
		return masProductora.produccionTotalDeLeche();
	}
	
	public Vaca vacaMasProductoraMuje() {
		Vaca masProductora = vacas[0];
		for(Vaca v: vacas) {
			if(masProductora.produccionTotalDeLeche() < v.produccionTotalDeLeche()) {
				masProductora = v;
			}
		}
		return masProductora;
	}
	
	
}
