package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Modelo.Mundo;
import Modelo.Personaje;

public class MundoTest {
	@Test
	void cuantosPersonajesLindosTest_True() {
		ArrayList<Personaje> losPersonajes = new ArrayList<>();
		Personaje p1 = new Personaje(10, 200, -10, "Alicia");
		Personaje p2 = new Personaje(20, 0, -50, "Nacho");
		Personaje p3 = new Personaje(5, 700, 5, "Pancho");
		losPersonajes.add(p1);
		losPersonajes.add(p2);
		losPersonajes.add(p3);
		Mundo mundito = new Mundo(losPersonajes);
		assertEquals(0, mundito.personajesLindos());
	}
	@Test
	void personajesNormalesTest_True() {
		ArrayList<Personaje> losPersonajes = new ArrayList<>();
		Personaje p1 = new Personaje(10, 200, -10, "Alicia");
		Personaje p2 = new Personaje(20, 0, -50, "Nacho");
		Personaje p3 = new Personaje(5, 700, 5, "Pancho");
		losPersonajes.add(p1);
		losPersonajes.add(p2);
		losPersonajes.add(p3);
		Mundo mundito = new Mundo(losPersonajes);
		assertEquals(losPersonajes, mundito.losPersonajesNormales());
	}
	
}
