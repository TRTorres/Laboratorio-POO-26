package clasesPrincipales;

import java.time.LocalDate;

import enumeradores.situacionLaboral;

public class persona {
	private int dniPersona;
	private String nombrePersona;
	private LocalDate fechaDeNacimiento;
	private situacionLaboral estadoLaboral;
	public int getDniPersona() {
		return dniPersona;
	}
	public void setDniPersona(int dniPersona) {
		this.dniPersona = dniPersona;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public situacionLaboral getEstadoLaboral() {
		return estadoLaboral;
	}
	public void setEstadoLaboral(situacionLaboral estadoLaboral) {
		this.estadoLaboral = estadoLaboral;
	}
}
