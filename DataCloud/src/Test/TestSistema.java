package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Disco;
import Modelo.Nodo;
import Modelo.Sistema;

class TestSistema {

	@Test
	void elNodoMasRapido_test() {
		ArrayList<Nodo> losNodos = new ArrayList<>();
		Disco d1 = new Disco(7, 10, "SATA_SSD");
		Disco d2 = new Disco(7, 100, "SATA_HDD");
		Disco d3 = new Disco(7,50, "M2");
		Nodo n1 = new Nodo(10, d1);
		Nodo n2 = new Nodo(10, d2);
		Nodo n3 = new Nodo(10, d3);
		losNodos.add(n1);
		losNodos.add(n2);
		losNodos.add(n3);
		Sistema s = new Sistema(losNodos);
		assertEquals(n3, s.elNodoMasRapido());
	}
	@Test
	void consumoTotalSistema_test() {
		ArrayList<Nodo> losNodos = new ArrayList<>();
		Disco d1 = new Disco(7, 10, "SATA_SSD");
		Nodo n1 = new Nodo(10, d1);
		Nodo n2 = new Nodo(10, d1);
		Nodo n3 = new Nodo(10, d1);
		losNodos.add(n1);
		losNodos.add(n2);
		losNodos.add(n3);
		Sistema s = new Sistema(losNodos);
		assertEquals(165, s.consumoTotalSistema());
	}
	@Test
	void losNodosCriticos_test() {
		ArrayList<Nodo> losNodos = new ArrayList<>();
		Disco d1 = new Disco(7, 10, "SATA_SSD");
		Nodo n1 = new Nodo(10, d1);
		Nodo n2 = new Nodo(10,d1);
		losNodos.add(n1);
		losNodos.add(n2);
		Sistema s = new Sistema(losNodos);
		assertEquals(losNodos, s.losNodosCriticos());
	}
}
