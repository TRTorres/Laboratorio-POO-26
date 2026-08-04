import java.util.ArrayList;

public class Santuario {
	
	private ArrayList<Caballero> LosCaballeros = new ArrayList<>();
	private ArrayList<Constelacion> LasConstelaciones = new ArrayList<>();
	
	public boolean esDeOro() {
		for (Constelacion c: LasConstelaciones) {
			if (c.getBandaCeleste()) {
				return true;
			}
		} 
		return false;
	}
	
	public Caballero encontrarHades() {
		Caballero hades = this.LosCaballeros.get(0);
		for(Caballero c: LosCaballeros) {
			if (c.getNivelMaldad() < hades.getNivelMaldad()){
				hades = c;
			}
		} return hades;
	}
	
	public ArrayList<Caballero> LosCaballerosPoderosos(){
		
		ArrayList<Caballero> LosCaballerosPoderosos = new ArrayList<>();
		for(Caballero c: LosCaballeros) {
			if(c.esPrecoz() & esDeOro()) {
				LosCaballerosPoderosos.add(c);
			}
		}
		return LosCaballerosPoderosos;
	}
	
	public int porcentajePrecoz() {
		int ayu = 0;
		for(Caballero c: LosCaballeros) {
			if(c.esPrecoz()) {
				ayu += 1;
			}
		}
		ayu = ayu/LosCaballeros.size()*100;
		return ayu;
	}
	
	public boolean masCercaSol() {
		for(Constelacion cc: LasConstelaciones) {
			if(cc.getDistanciaSol() < 1000000000) {
				return true;
			} 
		} return false;
	}
}

