package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Fauna;
import Modelo.Sector;

class TestSector {


	@Test
	void esVulnerable_test() {
		Fauna f1 = new Fauna();
		Sector s1 = new Sector(f1);
		f1.setValorFauna(3000000);
		f1.setCantidadEspecies(2);
		assertEquals(true, s1.esVulnerable());
	}
	
	@Test
	void valorDeSector_test() {
		Fauna f1 = new Fauna();
		Sector s1 = new Sector(f1);
		f1.setValorFauna(0);
		s1.setSuperficie(1);
		assertEquals(300, s1.valorDeSector());
	}
	
	@Test
	void cantidadEspecies_test() {
		Fauna f1 = new Fauna();
		Sector s1 = new Sector(f1);
		f1.setCantidadEspecies(0);
		assertEquals(0, s1.cantidadEspecies());
	}
}
