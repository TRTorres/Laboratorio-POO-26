package clasesPrincipales;

public class DeUrbanizacionPlanificada extends Barrio{
	private int numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA;
	private boolean  cuentaConConexiónFormalALaRedDeAguaPotable;
	public DeUrbanizacionPlanificada(String nombreBarrio, int hectareas, int numero_comuna,String tipoBarrio ,int numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA, boolean cuentaConConexiónFormalALaRedDeAguaPotable) {
		super(nombreBarrio, hectareas, numero_comuna, tipoBarrio = "DeUrbanizacionPlanificada");
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
