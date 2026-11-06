package clasesPrincipales;

import java.time.LocalDate;

import enumeradores.SituacionLaboral;

public class Persona {
	private int dniPersona;
	private String nombrePersona;
	private LocalDate fechaDeNacimiento;
	private SituacionLaboral estadoLaboral;
	public Persona(int dniPersona, String nombrePersona, LocalDate fechaDeNacimiento, SituacionLaboral estadoLaboral) {
		this.dniPersona = dniPersona;
		this.nombrePersona = nombrePersona;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.estadoLaboral = estadoLaboral;
	}
	
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
	public SituacionLaboral getEstadoLaboral() {
		return estadoLaboral;
	}
	public void setEstadoLaboral(SituacionLaboral estadoLaboral) {
		this.estadoLaboral = estadoLaboral;
	}
	
}
