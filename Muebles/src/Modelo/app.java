package Modelo;

import Heredados.MuebleDeCocina;
import Heredados.MuebleDeDescanso;

public class app {
	MuebleDeDescanso Silla = new MuebleDeDescanso(6,80,false,60);
	MuebleDeDescanso Sillon = new MuebleDeDescanso(7,150,true,80);
	MuebleDeDescanso Cama = new MuebleDeDescanso(10,160,true,90);
	MuebleDeCocina Cocina = new MuebleDeCocina(80,true);
	MuebleDeCocina Microondas = new MuebleDeCocina(40,true);
	MuebleDeCocina Heladera = new MuebleDeCocina(0,false);
}
