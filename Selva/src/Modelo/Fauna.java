package Modelo;

public class Fauna { 
	private int cantidadEspecies,valorAnimal,valorFauna;
	
	public Fauna() {	
	}
	
	public boolean estaEnPeligro() {
		return (valorFauna >= 3000000 && cantidadEspecies <= 2);
	}
	
	public int getCantidadEspecies() {
		return cantidadEspecies;
	}

	public void setCantidadEspecies(int cantidadEspecies) {
		this.cantidadEspecies = cantidadEspecies;
	}

	public int getValorAnimal() {
		return valorAnimal;
	}

	public void setValorAnimal(int valorAnimal) {
		this.valorAnimal = valorAnimal;
	}

	public int getValorFauna() {
		return valorFauna;
	}

	public void setValorFauna(int valorFauna) {
		this.valorFauna = valorFauna;
	}

}
