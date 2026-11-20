package clasesPrincipales;

public class DeComplejoHabitacional extends Barrio{
	private int cantidadDeMonoblocksConstruidos;
	private boolean poseeConsorcioDeAdministracionMacroActivo;
	public DeComplejoHabitacional(String nombreBarrio, int hectareas, int numero_comuna,String tipoBarrio, int cantidadDeMonoblocksConstruidos, boolean poseeConsorcioDeAdministracionMacroActivo) {
		super(nombreBarrio, hectareas, numero_comuna, tipoBarrio = "DeComplejoHabitacional");
		this.cantidadDeMonoblocksConstruidos = cantidadDeMonoblocksConstruidos;
		this.poseeConsorcioDeAdministracionMacroActivo = poseeConsorcioDeAdministracionMacroActivo;
	}
	public int getCantidadDeMonoblocksConstruidos() {
		return cantidadDeMonoblocksConstruidos;
	}
	public void setCantidadDeMonoblocksConstruidos(int cantidadDeMonoblocksConstruidos) {
		this.cantidadDeMonoblocksConstruidos = cantidadDeMonoblocksConstruidos;
	}
	public boolean getPoseeConsorcioDeAdministracionMacroActivo() {
		return poseeConsorcioDeAdministracionMacroActivo;
	}
	public void setPoseeConsorcioDeAdministracionMacroActivo(boolean poseeConsorcioDeAdministracionMacroActivo) {
		this.poseeConsorcioDeAdministracionMacroActivo = poseeConsorcioDeAdministracionMacroActivo;
	}
	
	
}
