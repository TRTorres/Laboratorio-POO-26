package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Disco;
import Modelo.Nodo;

class TestNodo {

	@Test
	void esCritico_test() {
		Disco d1 = new Disco(7,10, "SATA_SSD");
		Nodo n1 = new Nodo(10, d1);
		assertEquals(true, n1.esCritico());
	}

	@Test
	void tasaDeTransferencia_test() {
		Disco d1 = new Disco(7, 10, "SATA_SSD");
		Nodo n1 = new Nodo(10, d1);
		assertEquals(40, n1.tasaDeTransferencia());
	}
	
	@Test
	void consumoTotalNodo_test() {
		Disco d1 = new Disco(7, 10, "SATA_SSD");
		Nodo n1 = new Nodo(10, d1);
		assertEquals(55, n1.consumoTotalNodo());
	}
}
