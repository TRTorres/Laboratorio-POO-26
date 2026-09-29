import java.util.ArrayList;

public class app {

	public static void main(String[] args) {
		Personaje alicia = new Personaje(10, 200, -10, "Alicia");
		Personaje nacho = new Personaje(20, 0, -50, "Nacho");
		Personaje pancho = new Personaje(5, 700, 5, "Pancho");
		ArrayList<Personaje> losPersonajes = new ArrayList<Personaje>();
		losPersonajes.add(alicia);
		losPersonajes.add(nacho);
		losPersonajes.add(pancho);
	}

}
