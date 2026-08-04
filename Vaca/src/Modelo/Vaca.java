package Modelo;

public class Vaca {
	private int capacidadIntrinseca;
	private Razas raza;
	
	public int produccionTotalDeLeche() {
		int lecheProducida = 0;
		lecheProducida = capacidadIntrinseca*raza.multiplicador;
		return lecheProducida;
	}
	
	public void mugir() {
		System.out.println("MUUUUUUUUUUUUUUUU");
	}
}
