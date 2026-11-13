package clasesPrincipales;

import enumeradores.TipoBarrio;

public class BarrioDeComplejoHabitacional extends Barrio{
	public BarrioDeComplejoHabitacional(int idBarrio, String nombreBarrio, TipoBarrio barrio, int hectareas, int numero_comuna) {
		super(idBarrio, nombreBarrio, barrio.DeComplejoHabitacional, hectareas, numero_comuna);
		
	}
	private int cantidadDeMonoblocksConstruidos;
	private boolean poseeConsorcioDeAdministracionMacroActivo;
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
