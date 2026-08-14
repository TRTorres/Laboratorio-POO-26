package ModeloCasa;

public class Jugador {
	private Felicidad feliz;
	private int energia = 100;
	private Hambre hambruna;
	private boolean estaVivo = true;
	
	public Jugador(Felicidad feliz, int energia, Hambre hambruna, boolean estaVivo) {
		super();
		this.feliz = feliz;
		this.energia = energia;
		this.hambruna = hambruna;
		this.estaVivo = estaVivo;
	}
	public boolean getEstaVivo() {
		return estaVivo;
	}
	public void setEstaVivo(boolean estaVivo) {
		this.estaVivo = estaVivo;
	}
	public Felicidad getFeliz() {
		return feliz;
	}
	public void setFeliz(Felicidad feliz) {
		this.feliz = feliz;
	}
	public int getEnergy() {
		return energia;
	}
	public void setEnergy(int energia) {
		this.energia = energia;
	}
	public Hambre getHambruna() {
		return hambruna;
	}
	public void setHambruna(Hambre hambruna) {
		this.hambruna = hambruna;
	}
}
