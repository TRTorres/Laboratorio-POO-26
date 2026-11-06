package clasesPrincipales;

import enumeradores.TipoBarrio;

public class BarrioDeUbanizacionPlanificada extends Barrio{
	private int numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA;
	private boolean  cuentaConConexiónFormalALaRedDeAguaPotable;
	public BarrioDeUbanizacionPlanificada(int idBarrio, String nombreBarrio, TipoBarrio barrio, int hectareas) {
		super(idBarrio, nombreBarrio, barrio, hectareas);
		
	}
	public int getNumeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA() {
		return numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA;
	}
	public void setNumeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA(int numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA) {
		this.numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA = numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA;
	}
	public boolean getCuentaConConexiónFormalALaRedDeAguaPotable() {
		return cuentaConConexiónFormalALaRedDeAguaPotable;
	}
	public void setCuentaConConexiónFormalALaRedDeAguaPotable(boolean cuentaConConexiónFormalALaRedDeAguaPotable) {
		this.cuentaConConexiónFormalALaRedDeAguaPotable = cuentaConConexiónFormalALaRedDeAguaPotable;
	}

}
