package Testeo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Clan;
import Modelo.Clases;
import Modelo.Equipaje;
import Modelo.Jugador;

class TestClan {

	@Test
	void cantidadNovatos_test() {
		Equipaje e1 = new Equipaje();
		ArrayList<Jugador> losJugadores = new ArrayList<>();
		Jugador j1 = new Jugador(e1);
		Jugador j2 = new Jugador(e1);
		Jugador j3 = new Jugador(e1);
		j1.setAnoEXP(1);
		j1.setNivel(14);
		j2.setAnoEXP(1);
		j2.setNivel(14);
		j3.setAnoEXP(1);
		j3.setNivel(14);
		losJugadores.add(j1);
		losJugadores.add(j2);
		losJugadores.add(j3);
		Clan c = new Clan(losJugadores);
		assertEquals(3, c.cantidadNovatos());
	}
	
	@Test
	void hayGlassCanon_test() {
		Equipaje e1 = new Equipaje();
		Equipaje e2 = new Equipaje();
		Equipaje e3 = new Equipaje();
		ArrayList<Jugador> losJugadores = new ArrayList<>();
		e1.setMedidorDefensa(1);
		e2.setMedidorDefensa(1000);
		e3.setMedidorDefensa(1);
		Jugador j1 = new Jugador(e1);
		Jugador j2 = new Jugador(e2);
		Jugador j3 = new Jugador(e3);
		losJugadores.add(j1);
		losJugadores.add(j2);
		losJugadores.add(j3);
		Clan c = new Clan(losJugadores);
		assertEquals(true, c.hayGlassCanon(j1));
		assertEquals(false, c.hayGlassCanon(j2));
		assertEquals(true, c.hayGlassCanon(j3));
	}
	
	@Test
	void losVeteranos_test() {
		Equipaje e1 = new Equipaje();
		ArrayList<Jugador> losJugadores = new ArrayList<>();
		Jugador j1 = new Jugador(e1);
		Jugador j2 = new Jugador(e1);
		Jugador j3 = new Jugador(e1);
		j1.setAnoEXP(5);
		j1.setNivel(90);
		j2.setAnoEXP(5);
		j2.setNivel(90);
		j3.setAnoEXP(5);
		j3.setNivel(90);
		losJugadores.add(j1);
		losJugadores.add(j2);
		losJugadores.add(j3);
		Clan c = new Clan(losJugadores);
		assertEquals(losJugadores, c.losVeteranos());
	}
	
	@Test
	void losTanques_test() {
		Equipaje e1 = new Equipaje();
		ArrayList<Jugador> losJugadores = new ArrayList<>();
		Jugador j1 = new Jugador(e1);
		Jugador j2 = new Jugador(e1);
		Jugador j3 = new Jugador(e1);
		e1.setMedidorDefensa(1001);
		e1.setRareza(10);
		e1.setPrecio(5000001);
		losJugadores.add(j1);
		losJugadores.add(j2);
		losJugadores.add(j3);
		Clan c = new Clan(losJugadores);
		assertEquals(losJugadores, c.losTanques());
	}
	
	@Test
	void losAsesinos_test() {
		Equipaje e1 = new Equipaje();
		ArrayList<Jugador> losJugadores = new ArrayList<>();
		Jugador j1 = new Jugador(e1);
		Jugador j2 = new Jugador(e1);
		Jugador j3 = new Jugador(e1);
		j1.setNivel(121);
		e1.setRareza(10);
		e1.setPrecio(5000001);
		j1.setClasee(Clases.STRIKER);
		j2.setNivel(121);
		j2.setClasee(Clases.STRIKER);
		j3.setNivel(121);
		j3.setClasee(Clases.STRIKER);
		losJugadores.add(j1);
		losJugadores.add(j2);
		losJugadores.add(j3);
		Clan c = new Clan(losJugadores);
		assertEquals(losJugadores, c.losAsesinos());
	}
	
	@Test
	void muchaPlata_test() {
		Equipaje e1 = new Equipaje();
		ArrayList<Jugador> losJugadores = new ArrayList<>();
		Jugador j1 = new Jugador(e1);
		Jugador j2 = new Jugador(e1);
		Jugador j3 = new Jugador(e1);
		j1.setAnoEXP(2);
		e1.setRareza(10);
		e1.setPrecio(5000001);
		j2.setAnoEXP(2);
		j3.setAnoEXP(2);
		losJugadores.add(j1);
		losJugadores.add(j2);
		losJugadores.add(j3);
		Clan c = new Clan(losJugadores);
		assertEquals(losJugadores, c.muchaPlata());
	}
	

}
