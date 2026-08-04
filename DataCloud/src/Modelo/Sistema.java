package Modelo;
import java.util.ArrayList;

public class Sistema {
	//Variable
	private ArrayList<Nodo> losNodos = new ArrayList<>();
	
	//Constructor con Array para usarlo en el test
	public Sistema(ArrayList<Nodo> losNodos) {
		this.losNodos = losNodos;
	}
	
	//Metodos pedidos por el ejercicio
	public ArrayList<Nodo> losNodosCriticos(){
		ArrayList<Nodo> losNodosCriticos = new ArrayList<>();
		for(Nodo n : losNodos) {
			if(n.esCritico()) {
				losNodosCriticos.add(n);
			}
		}
		return losNodosCriticos;
	}
	
	public Nodo elNodoMasRapido() {
		Nodo elMasRapido = losNodos.get(0);
		for(Nodo n : losNodos) {
			if(n.tasaDeTransferencia() > elMasRapido.tasaDeTransferencia()) {
				elMasRapido = n;
			}
		}
		return elMasRapido;
	}
	
	public float consumoTotalSistema() {
		float consumoTotal = 0;
		for(Nodo n : losNodos) {
			consumoTotal = consumoTotal + n.consumoTotalNodo();
		}
		return consumoTotal;
	}
}
