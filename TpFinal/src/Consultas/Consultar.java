package Consultas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import clasesPrincipales.Barrio;
import clasesPrincipales.Comuna;
import clasesPrincipales.DeComplejoHabitacional;
import clasesPrincipales.DeTrazadoFormal;
import clasesPrincipales.DeUbanizacionPlanificada;
import clasesPrincipales.Persona;
import dao.dao;
import enumeradores.SituacionLaboral;

public class Consultar {
	String sql = "";
	dao daoo = new dao();
	/**
	 * 
	 * @return
	 */
	public ArrayList<Persona> consultarPersona() {
		ArrayList<Persona> solucion = new ArrayList<>();
		Connection conexion = null;
		sql = "SELECT * FROM personas;"; 
		
		try {
			conexion = daoo.conectar();
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Persona p = null;
				Date sqlDate = Date.valueOf(p.getFechaDeNacimiento());
				String estadoLaboral = String.valueOf(p.getEstadoLaboral());
				SituacionLaboral estadoLaborall = p.getEstadoLaboral();
				LocalDate fecha = p.getFechaDeNacimiento();
				int dniPersona = rs.getInt("DNI");
				String nombrePersona = rs.getString("Nombre");
				sqlDate = rs.getDate("Nacimiento");
				estadoLaboral = rs.getString("Estado Laboral");
				int idBarrio = rs.getInt("idBarrio");
				p = new Persona(dniPersona, nombrePersona, fecha, estadoLaborall, idBarrio);
				solucion.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return solucion;
	}
	
	public ArrayList<Comuna> consultarComuna() {
		ArrayList<Comuna> solucion = new ArrayList<>();
		Connection conexion = null;
		sql = "SELECT * FROM personas;"; 
		
		try {
			conexion = daoo.conectar();
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Comuna c = null;
				int cantidadBarrios = c.cantidadBarrios();
				int numeroComuna = rs.getInt("numero");
				String nombreComuna = rs.getString("nombre");
				cantidadBarrios = rs.getInt("cantidad barrios");
				c = new Comuna(nombreComuna, cantidadBarrios);
				solucion.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return solucion;
	}
	
	public ArrayList<Barrio> consultarBarrioDeComplejoHabitacional() {
		ArrayList<Barrio> solucion = new ArrayList<>();
		Connection conexion = null;
		sql = "SELECT * FROM personas;"; 
		
		try {
			conexion = daoo.conectar();
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String nombreBarrio = rs.getString("nombre");
				int hectareas = rs.getInt("hectareas");
				int numero_comuna = rs.getInt("numero comuna");
				int cantidadDeMonoblocksConstruidos = rs.getInt("Cantidad de Monoblocks");
				boolean poseeConsorcioDeAdministracionMacroActivo = rs.getBoolean("¿Posee consorcio?");
				DeComplejoHabitacional c = new DeComplejoHabitacional(nombreBarrio, hectareas, numero_comuna, cantidadDeMonoblocksConstruidos, poseeConsorcioDeAdministracionMacroActivo);
				solucion.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return solucion;
	}
	
	public ArrayList<Barrio> consultarBarrioDeTrazadoFormal() {
		ArrayList<Barrio> solucion = new ArrayList<>();
		Connection conexion = null;
		sql = "SELECT * FROM personas;"; 
		
		try {
			conexion = daoo.conectar();
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String nombreBarrio = rs.getString("nombre");
				int hectareas = rs.getInt("hectareas");
				int numero_comuna = rs.getInt("numero comuna");
				int cantidadEdificiosDePropiedadHorizontal = rs.getInt("Cantidad de edificios");
				int porcentajeDeAsfaltadoEnCalles = rs.getInt("Porcentaje asfaltado");
				DeTrazadoFormal c = new DeTrazadoFormal(nombreBarrio, hectareas, numero_comuna, cantidadEdificiosDePropiedadHorizontal, porcentajeDeAsfaltadoEnCalles);
				solucion.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return solucion;
	}
	
	public ArrayList<Barrio> consultarBarrioDeUrbanizacionPlanificada() {
		ArrayList<Barrio> solucion = new ArrayList<>();
		Connection conexion = null;
		sql = "SELECT * FROM personas;"; 
		
		try {
			conexion = daoo.conectar();
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String nombreBarrio = rs.getString("nombre");
				int hectareas = rs.getInt("hectareas");
				int numero_comuna = rs.getInt("numero comuna");
				int numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA = rs.getInt("numero de ley");
				boolean cuentaConConexiónFormalALaRedDeAguaPotable = rs.getBoolean("cuenta con conexion?");
				DeUbanizacionPlanificada c = new DeUbanizacionPlanificada(nombreBarrio, hectareas, numero_comuna, numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA, cuentaConConexiónFormalALaRedDeAguaPotable);
				solucion.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return solucion;
	}
}
