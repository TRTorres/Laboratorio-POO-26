package Testeo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Equipaje;

class TestEquipaje {


	@Test
	void esLegendario_True() {
		Equipaje e1 = new Equipaje();
		
		assertEquals(true, e1.esLegendario());
	}

	@Test
	void esBajaCalidad_True() {
		Equipaje e1 = new Equipaje();
		e1.setRareza(1);
		e1.setDurabilidad(0);
		assertEquals(true, e1.esBajaCalidad());
	}
	
	@Test
	void esDefensivo_True() {
		Equipaje e1 = new Equipaje();
		e1.setMedidorDefensa(1001);
		assertEquals(true, e1.esDefensivo());
	}
	
	@Test
	void esOfensivo_True() {
		Equipaje e1 = new Equipaje();
		e1.setMedidorDefensa(1);
		assertEquals(true, e1.esOfensivo());
		
	}

	
}
