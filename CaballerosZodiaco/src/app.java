import java.util.ArrayList;

public class app {

	public static void main(String[] args) {
		
		Constelacion Pegaso = new Constelacion(1000, true);
		Constelacion Fenix = new Constelacion(3500, false);
		Constelacion Andromeda = new Constelacion(2750, true);
		Constelacion Geminis = new Constelacion(3250, true);
		
		ArrayList<Constelacion> LasConstelaciones = new ArrayList<>();
		
		Caballero Ikki = new Caballero("Ikki",Fenix,15,0);
		Caballero Seiya = new Caballero ("Seiya",Pegaso,14,2);
		Caballero Shun = new Caballero ("Shun",Andromeda,15,4);
		Caballero Saga = new Caballero ("Saga",Geminis,13,6);

		ArrayList<Caballero> LosCaballeros = new ArrayList<>();
		
	}

}
