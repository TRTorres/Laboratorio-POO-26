package enumm;

public enum NombreEstudio {
	SecundarioIncompleto(1),
	SecundarioCompleto(2),
	TerciarioNoUniversitario(3),
	UniversidadCompleta(4),
	UniversidadIncompleta(5);
	
	private int idEstudio;

	NombreEstudio(int idEstudio) {
		this.setIdEstudio(idEstudio);
	}

	public int getIdEstudio() {
		return idEstudio;
	}

	public void setIdEstudio(int idEstudio) {
		this.idEstudio = idEstudio;
	}
}
