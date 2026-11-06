package enumeradores;

public enum TipoBarrio {
	DeTrazadoFormal(1),
	DeUrbanizacionPlanificada(2),
	DeComplejosHabitacionales(3);
	
	int idBarrio;
	
	TipoBarrio(int idBarrio){
		this.idBarrio = idBarrio;
	}

	public int getIdBarrio() {
		return idBarrio;
	}

	public void setIdBarrio(int idBarrio) {
		this.idBarrio = idBarrio;
	}
}
