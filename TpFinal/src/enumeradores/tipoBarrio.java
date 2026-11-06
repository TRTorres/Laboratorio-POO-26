package enumeradores;

public enum tipoBarrio {
	DeTrazadoFormal(1),
	DeUrbanizacionPlanificada(2),
	DeComplejosHabitacionales(3);
	
	int idBarrio;
	
	tipoBarrio(int idBarrio){
		this.idBarrio = idBarrio;
	}

	public int getIdBarrio() {
		return idBarrio;
	}

	public void setIdBarrio(int idBarrio) {
		this.idBarrio = idBarrio;
	}
}
