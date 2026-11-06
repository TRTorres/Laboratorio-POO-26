package clasesPrincipales;

import enumeradores.tipoBarrio;

public class barrioDeUbanizacionPlanificada extends barrio{
	private int numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA;
	private boolean  cuentaConConexiónFormalALaRedDeAguaPotable;
	public barrioDeUbanizacionPlanificada(int idBarrio, String nombreBarrio, tipoBarrio barrio, int hectareas) {
		super(idBarrio, nombreBarrio, barrio, hectareas);
		
	}

}
