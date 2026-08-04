package Testeo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Clases;
import Modelo.Equipaje;
import Modelo.Jugador;

class TestJugador {
	
	@Test
	void esVeterano_True() {
		Equipaje e1 = new Equipaje();
		Jugador j1 = new Jugador(e1);
		j1.setAnoEXP(5);
		j1.setNivel(90);
		assertEquals(true, j1.esVeterano());
	}


	@Test
	void esPaytoWin_True() {
		Equipaje e1 = new Equipaje();
		Jugador j1 = new Jugador(e1);
		j1.setAnoEXP(2);
		e1.setRareza(10);
		e1.setPrecio(5000001);
		assertEquals(true, j1.esPayToWin());
	}
	
	@Test
	void esTanque_True() {
		Equipaje e1 = new Equipaje();
		Jugador j1 = new Jugador(e1);
		e1.setMedidorDefensa(1001);
		e1.setRareza(10);
		e1.setPrecio(5000001);
		assertEquals(true, j1.esTanque());
	}
	
	@Test
	void esNovato_True() {
		Equipaje e1 = new Equipaje();
		Jugador j1 = new Jugador(e1);
		j1.setAnoEXP(1);
		j1.setNivel(14);
		assertEquals(true, j1.esNovato());
	}
	
	@Test
	void estaPreparado_True() {
		Equipaje e1 = new Equipaje();
		Jugador j1 = new Jugador(e1);
		j1.setNivel(121);
		e1.setRareza(10);
		e1.setPrecio(5000001);
		assertEquals(true, j1.estaPreparado());
	}
	
	@Test
	void estaComplicado_True() {
		Equipaje e1 = new Equipaje();
		Jugador j1 = new Jugador(e1);
		j1.setBalanceEconomico(1);
		e1.setRareza(1);
		e1.setDurabilidad(0);
		assertEquals(true, j1.estaComplicado());
	}
	
	@Test
	void esGlassCanon_True() {
		Equipaje e1 = new Equipaje();
		Jugador j1 = new Jugador(e1);
		e1.setMedidorDefensa(1);
		assertEquals(true, j1.esGlassCanon());
	}
	
	@Test
	void esAsesino_True() {
		Equipaje e1 = new Equipaje();
		Jugador j1 = new Jugador(e1);
		j1.setNivel(121);
		e1.setRareza(10);
		e1.setPrecio(5000001);
		j1.setClasee(Clases.STRIKER);
		assertEquals(true, j1.esAsesino());
	}
}
