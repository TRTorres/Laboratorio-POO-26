package clasesPrincipales;

import enumeradores.tipoBarrio;

public class barrioDeComplejoHabitacional extends barrio{
	public barrioDeComplejoHabitacional(int idBarrio, String nombreBarrio, tipoBarrio barrio, int hectareas) {
		super(idBarrio, nombreBarrio, barrio, hectareas);
		
	}
	private int cantidadDeMonoblocksConstruidos;
	private boolean poseeConsorcioDeAdministracionMacroActivo;
}
