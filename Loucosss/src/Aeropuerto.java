import java.util.ArrayList;

public class Aeropuerto {
	private ArrayList<Vuelo> losVuelos = new ArrayList<>();
	
	public ArrayList<Vuelo> losLowCost(){
		ArrayList<Vuelo> losVuelosLowCost = new ArrayList<>();
		for(Vuelo v: losVuelos) {
			if(v.estaDemorado() && v.capacidadMenosCien()) {
				losVuelosLowCost.add(v);
			}
		}
		return losVuelosLowCost;
	}
	
	public void personaMasFuriosa() {
		Vuelo v = null;
		v.personaMasEspera();
	}
	
	public double recaudacionTotal() {
		Vuelo v = null;
		double ayu = 0.0;
		ayu = v.recaudacionVuelo() * 0.21f;
		return ayu;
	}
}
