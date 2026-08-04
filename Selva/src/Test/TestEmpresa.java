package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Modelo.Fauna;
import Modelo.Sector;
import Modelo.Empresa;

class TestEmpresa {

	@Test
	void losSectoresVulnerables_test() {
		ArrayList <Sector> losSectores = new ArrayList<>();
		Fauna f1 = new Fauna();
		Fauna f2 = new Fauna();
		f1.setValorFauna(3000000);
		f1.setCantidadEspecies(2);
		Sector s1 = new Sector(f1);
		Sector s2 = new Sector(f1);
		losSectores.add(s1);
		losSectores.add(s2);
		Empresa e = new Empresa(losSectores);
		assertEquals(losSectores,e.losSectoresVulnerables()); 
	}
	
	@Test
	void sectorConMasEspecies_test() {
		ArrayList <Sector> losSectores = new ArrayList<>();
		Fauna f1 = new Fauna();
		Fauna f2 = new Fauna();
		f1.setCantidadEspecies(0);
		f2.setCantidadEspecies(5);
		Sector s1 = new Sector(f1);
		Sector s2 = new Sector(f2);
		losSectores.add(s1);
		losSectores.add(s2);
		Empresa e = new Empresa(losSectores);
		assertEquals(s2,e.sectorConMasEspecies()); 
	}
	
	@Test
	void valorTodasLosSectores_test() {
		ArrayList <Sector> losSectores = new ArrayList<>();
		Fauna f1 = new Fauna();
		Fauna f2 = new Fauna();
		f1.setValorFauna(1);
		Sector s1 = new Sector(f1);
		Sector s2 = new Sector(f1);
		s1.setSuperficie(0);
		s2.setSuperficie(0);
		losSectores.add(s1);
		losSectores.add(s2);
		Empresa e = new Empresa(losSectores);
		assertEquals(2, e.valorDeTodosSectores());
	}
}
