
public class Persona {

	
		int estomagoCapacidad;
		int comida;
		
	
	
	public int comer() {
		if(comida >= estomagoCapacidad*(0.9f)) {
			System.out.println("No puede comer mas Juanito");
		}else {
			comida =+ 10;
		}
		return comida;
	}
	
	public void crecer(int capacidadEstomago) {
		capacidadEstomago++;
	}
	
	public void digerir() {
		comida = 0;
	}
	
	public boolean aprender() {
		if(estaLleno(comida)) {
			return true;
		}else return false;
	}
	
	public int getCapacidadEstomago() {
		return estomagoCapacidad;
	}
	
	public int getComida() {
		return comida;
	}
	
	public void setCapacidadEstomago(int estomagoCapacidad) {
		this.estomagoCapacidad = estomagoCapacidad;
	}
	
	public void setComida(int comida) {
		this.comida = comida;
	}
	
	public boolean estaLleno(int comida) {
		return (comida >= estomagoCapacidad*(0.9f));
	}
	

}
