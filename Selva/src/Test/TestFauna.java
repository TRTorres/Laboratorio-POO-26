package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Fauna;

class TestFauna {

	@Test
	void estaEnPeligro_test() {
		Fauna f1 = new Fauna();
		f1.setValorFauna(3000000);
		f1.setCantidadEspecies(2);
		assertEquals(true, f1.estaEnPeligro());
	}
}
