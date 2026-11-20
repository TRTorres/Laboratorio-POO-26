package Consultas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import clasesPrincipales.Barrio;
import clasesPrincipales.Comuna;
import clasesPrincipales.DeComplejoHabitacional;
import clasesPrincipales.DeTrazadoFormal;
import clasesPrincipales.DeUrbanizacionPlanificada;
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
		sql = "SELECT * FROM persona;"; 
		
		try {
			conexion = daoo.conectar();
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int dniPersona = rs.getInt("dnipersona");
				String nombrePersona = rs.getString("nombrepersona");
				LocalDate fecha = rs.getDate("fechadenacimiento").toLocalDate();
				SituacionLaboral estadoLaboral = SituacionLaboral.valueOf(rs.getString("situacionlaboral"));
				int idBarrio = rs.getInt("idBarrio");
				Persona p = new Persona(dniPersona, nombrePersona, fecha, estadoLaboral, idBarrio);
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
		sql = "SELECT `comuna`.numero_comuna, `comuna`.nombre_sedecomunal, COUNT(`barrio`.numero_comuna) AS cantidad_barrios FROM comuna LEFT JOIN barrio  ON `comuna`.numero_comuna = `barrio`.numero_comuna GROUP BY `comuna`.numero_comuna, `comuna`.nombre_sedecomunal;"; 
		try {
			conexion = daoo.conectar();
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int numeroComuna = rs.getInt("numero_comuna");
				String nombreComuna = rs.getString("nombre_sedecomunal");
				int cantidadBarrios = rs.getInt("cantidad_barrios");
				Comuna c = new Comuna(numeroComuna,nombreComuna, cantidadBarrios);
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
	
	public ArrayList<Barrio> consultarBarrio() {
		ArrayList<Barrio> solucion = new ArrayList<>();
		Connection conexion = null;
		sql = "SELECT * FROM barrio;"; 
		try {
			conexion = daoo.conectar();
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int idBarrio = rs.getInt("idbarrio");
				String nombreBarrio = rs.getString("nombrebarrio");
				int hectareas = rs.getInt("superficiebarrio");
				int numero_comuna = rs.getInt("numero_comuna");
				String tipoBarrio = rs.getString("tipodebarrio");
				Barrio b = null;
				switch(tipoBarrio) {
				case "DeTrazadoFormal":
					int cantidadEdificiosDePropiedadHorizontal = rs.getInt("cantidaddeedificios");
					int porcentajeDeAsfaltadoEnCalles = rs.getInt("porcentajeasfaltado");
					b = new DeTrazadoFormal(nombreBarrio, hectareas, numero_comuna, tipoBarrio, cantidadEdificiosDePropiedadHorizontal, porcentajeDeAsfaltadoEnCalles);
					b.setIdBarrio(idBarrio);
					solucion.add(b); 
					break;
				case "DeUrbanizacionPlanificada":
					int numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA = rs.getInt("numerodeley");
					boolean cuentaConConexiónFormalALaRedDeAguaPotable = rs.getBoolean("cuentaconconexion");
					b = new DeUrbanizacionPlanificada(nombreBarrio, hectareas, numero_comuna,tipoBarrio, numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA, cuentaConConexiónFormalALaRedDeAguaPotable);
					b.setIdBarrio(idBarrio);
					solucion.add(b); 
					break;
				case "DeComplejoHabitacional":
					int cantidadDeMonoblocksConstruidos = rs.getInt("cantidaddemonoblocks");
					boolean poseeConsorcioDeAdministracionMacroActivo = rs.getBoolean("poseeconsorcio");
					b = new DeComplejoHabitacional(nombreBarrio, hectareas, numero_comuna, tipoBarrio, cantidadDeMonoblocksConstruidos, poseeConsorcioDeAdministracionMacroActivo);
					b.setIdBarrio(idBarrio);
					solucion.add(b); 
					break;
				}
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
	
	public ArrayList<Barrio> consultarBarriosDeUnaComuna(int numeroComuna) {
		ArrayList<Barrio> solucion = new ArrayList<>();
		Connection conexion = null;
		sql = "SELECT * FROM barrio WHERE numero_comuna = ?;"; 
		try {
			conexion = daoo.conectar();
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1,numeroComuna);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				int idBarrio = rs.getInt("idbarrio");
				String nombreBarrio = rs.getString("nombrebarrio");
				int hectareas = rs.getInt("superficiebarrio");
				int numero_comuna = rs.getInt("numero_comuna");
				String tipoBarrio = rs.getString("tipodebarrio");
				Barrio b = null;
				switch(tipoBarrio) {
				case "DeTrazadoFormal":
					int cantidadEdificiosDePropiedadHorizontal = rs.getInt("cantidaddeedificios");
					int porcentajeDeAsfaltadoEnCalles = rs.getInt("porcentajeasfaltado");
					b = new DeTrazadoFormal(nombreBarrio, hectareas, numero_comuna, tipoBarrio, cantidadEdificiosDePropiedadHorizontal, porcentajeDeAsfaltadoEnCalles);
					b.setIdBarrio(idBarrio);
					solucion.add(b); 
					break;
				case "DeUrbanizacionPlanificada":
					int numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA = rs.getInt("numerodeley");
					boolean cuentaConConexiónFormalALaRedDeAguaPotable = rs.getBoolean("cuentaconconexion");
					b = new DeUrbanizacionPlanificada(nombreBarrio, hectareas, numero_comuna,tipoBarrio, numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA, cuentaConConexiónFormalALaRedDeAguaPotable);
					b.setIdBarrio(idBarrio);
					solucion.add(b); 
					break;
				case "DeComplejoHabitacional":
					int cantidadDeMonoblocksConstruidos = rs.getInt("cantidaddemonoblocks");
					boolean poseeConsorcioDeAdministracionMacroActivo = rs.getBoolean("poseeconsorcio");
					b = new DeComplejoHabitacional(nombreBarrio, hectareas, numero_comuna, tipoBarrio, cantidadDeMonoblocksConstruidos, poseeConsorcioDeAdministracionMacroActivo);
					b.setIdBarrio(idBarrio);
					solucion.add(b); 
					break;
				}
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
