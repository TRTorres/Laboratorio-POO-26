import java.util.ArrayList;

public class Mundo {

	private ArrayList<Personaje> losPersonajes = new ArrayList<>();
	
	public boolean hayPersonajeNormal() {
		for (Personaje p: losPersonajes) {
			if (p.esNormal()) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Personaje> personajesLindos(){
		ArrayList<Personaje> losPersonajesLindos = new ArrayList<>();
		for (Personaje p: losPersonajes) {
			if(p.esLindo()) {
				losPersonajesLindos.add(p);
			}
		}
		return losPersonajesLindos;
	}
	
	public int cuantosEnMaravilla() {
		int ayu = 0;
		for(Personaje p: losPersonajes) {
			if(p.estaEnMaravillas()) {
				ayu += 1;
			}
		}
		return ayu;
	}
	
	public Personaje encontrarMasLoco() {
		Personaje masLoco = this.losPersonajes.get(0);
		for(Personaje p: losPersonajes) {
			if (p.getLocura() > masLoco.getLocura()){
				masLoco = p;
			}
		}return masLoco;
	}
	
	public ArrayList<Personaje> losPersonajesNormales(){
		ArrayList<Personaje> losPersonajesNormales = new ArrayList<>();
		for (Personaje p: losPersonajes) {
			if(p.esLindo()) {
				losPersonajesNormales.add(p);
			}
		}
		return losPersonajesNormales;
	}
	
	public int masLindosONormales() {
		for(Personaje p: losPersonajes) {
			if(p.esNormal()) {
				losPersonajesNormales().add(p);
			}
		}
		if(losPersonajesNormales().size() < personajesLindos().size()){
			return personajesLindos().size();
		}else if(losPersonajesNormales().size() > personajesLindos().size()){
			return losPersonajesNormales().size();
		}else return 0;
	}
}