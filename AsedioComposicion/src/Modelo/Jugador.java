package Modelo;

public class Jugador {
	private int nivel, anoEXP, balanceEconomico;
	private Equipaje e;
	private Clases clasee;
	
	public Jugador (int nivel, int anoEXP, int balanceEconomico, Clases clasee) {
		this.nivel = nivel;
		this.anoEXP = anoEXP;
		this.balanceEconomico = balanceEconomico;
		this.clasee = clasee;
	}
	public Jugador (Equipaje e) {
		this.e = e;
	}
	
	public boolean esVeterano(){
		return anoEXP >= 5 && nivel >= 90;
	}
	
	public boolean esPayToWin(){
		return (anoEXP <= 2 && e.esLegendario());
	}

	public boolean esTanque(){
		return (e.esLegendario() && e.esDefensivo());
	}

	public boolean esNovato(){
		return (anoEXP <= 1 && nivel <= 15);
	}
	
	public boolean estaPreparado() {
		return (e.esLegendario() && nivel >= 120);
	}
	
	public boolean esAsesino(){
		return (estaPreparado() && (clasee == Clases.NINJA || clasee == Clases.STRIKER));
	}
	
	public boolean estaComplicado(){
		return (e.esBajaCalidad() && balanceEconomico < 10000);
	}
	
	public boolean esGlassCanon() {
		return e.esOfensivo();
	}



	public int getNivel() {
		return nivel;
	}



	public void setNivel(int nivel) {
		this.nivel = nivel;
	}



	public int getAnoEXP() {
		return anoEXP;
	}



	public void setAnoEXP(int anoEXP) {
		this.anoEXP = anoEXP;
	}



	public int getBalanceEconomico() {
		return balanceEconomico;
	}



	public void setBalanceEconomico(int balanceEconomico) {
		this.balanceEconomico = balanceEconomico;
	}



	public Equipaje getE() {
		return e;
	}



	public void setE(Equipaje e) {
		this.e = e;
	}



	public Clases getClasee() {
		return clasee;
	}



	public void setClasee(Clases clasee) {
		this.clasee = clasee;
	}
	
	

}
