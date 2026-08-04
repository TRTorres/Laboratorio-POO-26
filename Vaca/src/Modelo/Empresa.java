package Modelo;

import java.util.ArrayList;

public class Empresa {
	ArrayList<Tambo> losTambos = new ArrayList<>();
	
	public Tambo mostrarAreaDeTamboConAreaMaxima() {
		Tambo masArea = losTambos.get(0);
		for(Tambo t:losTambos) {
			if(masArea.getSuperficie() < t.getSuperficie()) {
				masArea = t;
			}
		}
		return masArea;
	}
	
	public int conseguirProduccionRecaudada() {
		int recaudaccionTotal = 0;
		for(Tambo t : losTambos) {
			recaudaccionTotal = recaudaccionTotal + t.produccionTotalTambo();
		}
		return recaudaccionTotal;
	}
	
	public void hacerMujirAVacaMasProductora() {
		Tambo masProductora = losTambos.get(0);
		for(Tambo t : losTambos) {
			if(masProductora.vacaMasProductora() < t.vacaMasProductora()) {
				masProductora = t;
			} 
		}
		masProductora.vacaMasProductoraMuje().mugir();;
	}
}
