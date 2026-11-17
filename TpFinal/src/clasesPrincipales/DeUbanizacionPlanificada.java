package clasesPrincipales;

public class DeUbanizacionPlanificada extends Barrio{
	private int numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA;
	private boolean  cuentaConConexiónFormalALaRedDeAguaPotable;
	public DeUbanizacionPlanificada(String nombreBarrio, int hectareas, int numero_comuna, int numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA, boolean cuentaConConexiónFormalALaRedDeAguaPotable) {
		super(nombreBarrio, hectareas, numero_comuna);
		this.cuentaConConexiónFormalALaRedDeAguaPotable = cuentaConConexiónFormalALaRedDeAguaPotable;
		this.numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA = numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA;
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
