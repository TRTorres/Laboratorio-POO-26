package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Personaje;

class PersonajeTest {

	@Test
	void estaEnMaravillaTest_True() {
		Personaje p1 = new Personaje();
		p1.setUbicacion(-9);
		assertEquals(true, p1.estaEnMaravillas());
	}
	@Test
	void ubicacionTest() {
		Personaje p1 = new Personaje();
		p1.setUbicacion(-9);
		assertEquals(-9, p1.getUbicacion());
		
	}
	@Test
	void embellecerTest() {
		Personaje p1 = new Personaje();
		
		p1.setLocura(50);
		p1.setSecretos(100);
		
		p1.embellecer(10);
		assertEquals(60, p1.getLocura());
		assertEquals(90, p1.getSecretos());
	}
	@Test
	void esLindoTest_True() {
		Personaje p1 = new Personaje();
		p1.setLocura(16);
		p1.setUbicacion(-20);
		
		boolean valorEsperado = true;
		boolean valorObtenido = p1.esLindo();
		assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	void esNormalTest_True() {
		Personaje p1 = new Personaje();
		p1.setLocura(2);
		p1.setSecretos(700);
		assertEquals(true, p1.esNormal());
	}
}
