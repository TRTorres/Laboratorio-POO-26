package Modelo;

import java.util.ArrayList;

	public class Clan {
	ArrayList<Jugador> losJugadores = new ArrayList<>();
	
	public Clan(ArrayList losJugadores) {
		this.losJugadores = losJugadores;
	}
	
	public ArrayList<Jugador> losVeteranos(){
		ArrayList<Jugador> losJugadoresVeteranos = new ArrayList<>();
			for(Jugador j: losJugadores) {
				if (j.esVeterano()) {
					losJugadoresVeteranos.add(j);
				}
			} return losJugadoresVeteranos;
	}
	
	public ArrayList<Jugador> losTanques(){
		ArrayList<Jugador> losJugadoresTanques = new ArrayList<>();
		for(Jugador j: losJugadores) {
			if (j.esTanque()) {
				losJugadoresTanques.add(j);
			}
		} return losJugadoresTanques;
	}

	public ArrayList<Jugador> losAsesinos(){
		ArrayList<Jugador> losJugadoresAsesinos = new ArrayList<>();
		for(Jugador j: losJugadores) {
			if (j.esAsesino()) {
				losJugadoresAsesinos.add(j);
			}
		} return losJugadoresAsesinos;
	}
	
	public ArrayList<Jugador> muchaPlata(){
		ArrayList<Jugador> losJugadoresPaytoWin = new ArrayList<>();
		for(Jugador j: losJugadores) {
			if (j.esPayToWin()) {
				losJugadoresPaytoWin.add(j);
			}
		} return losJugadoresPaytoWin;
		
	}
	public int cantidadNovatos(){
		int ayu = 0;
		for(Jugador j : losJugadores) {
			if(j.esNovato()) {
				ayu +=1;
			}
		}
		return ayu;
	}
	
	public boolean hayGlassCanon(Jugador j) {
		while(j.esGlassCanon()){
			return true;
		}return false;
	}

	public ArrayList<Jugador> getLosJugadores() {
		return losJugadores;
	}

	public void setLosJugadores(ArrayList<Jugador> losJugadores) {
		this.losJugadores = losJugadores;
	}
	
	
}
