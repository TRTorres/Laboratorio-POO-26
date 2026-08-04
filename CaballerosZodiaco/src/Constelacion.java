
public class Constelacion {
	private int distanciaSol;
	public boolean bandaCeleste;
	
	public Constelacion (int distanciaSol, boolean bandaCeleste) {
		this.distanciaSol = distanciaSol;
		this.bandaCeleste = bandaCeleste;
	}
	public int distanciaSol(int distanciaSol) {
		this.distanciaSol = distanciaSol;
		distanciaSol += distanciaSol;
		return distanciaSol;
	}
	
	public boolean getBandaCeleste() {
		return bandaCeleste;
	}
	
	public int getDistanciaSol() {
		return distanciaSol;
	}
}