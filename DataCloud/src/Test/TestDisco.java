package Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Modelo.Disco;

class TestDisco {

	@Test
	void tazaDeTransferencia_test() {
		Disco d = new Disco(1, 10, "SATA_SSD");
		assertEquals(40,d.tazaDeTransferencia());
	}

	@Test
	void estaEnRiesgo_test() {
		Disco d = new Disco(7, 10, "SATA_SSD");
		assertEquals(true,d.estaEnRiesgo());
	}
}
