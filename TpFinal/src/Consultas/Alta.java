package Consultas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import clasesPrincipales.Barrio;
import clasesPrincipales.Comuna;
import clasesPrincipales.DeComplejoHabitacional;
import clasesPrincipales.DeTrazadoFormal;
import clasesPrincipales.DeUrbanizacionPlanificada;
import clasesPrincipales.Persona;
import dao.dao;

public class Alta {
	String sql = "";
	dao daoo = new dao();
	public void agregarPersona(Persona p) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`persona`(`dnipersona`,`nombrepersona`,`fechadenacimiento`,`situacionlaboral`,`idBarrio`)VALUES(?,?,?,?,?);";
		try {
			Date sqlDate = Date.valueOf(p.getFechaDeNacimiento());
			String estadoLaboral = String.valueOf(p.getEstadoLaboral());
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, p.getDniPersona());
			stmt.setString(2, p.getNombrePersona());
			stmt.setDate(3, sqlDate);
			stmt.setString(4, estadoLaboral);
			stmt.setInt(5, p.getIdBarrio());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void agregarComuna(Comuna c) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`comuna`(`numero_comuna`,`nombre_sedecomunal`)VALUES(?,?);";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, c.getNumeroComuna());
			stmt.setString(2, c.getNombreComuna());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void agregarBarrioDeTrazadoFormal(DeTrazadoFormal b) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`barrio`(`tipodebarrio`,`nombrebarrio`,`superficiebarrio`,`cantidaddeedificios`,`porcentajeasfaltado`, `numero_comuna`)VALUES(?,?,?,?,?,?);";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, "DeTrazadoFormal");
			stmt.setString(2, b.getNombreBarrio());
			stmt.setInt(3, b.getHectareas());
			stmt.setInt(4, b.getCantidadEdificiosDePropiedadHorizontal());
			stmt.setInt(5, b.getPorcentajeDeAsfaltadoEnCalles());
			stmt.setInt(6, b.getNumero_comuna());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void agregarBarrioDeComplejoHabitacional(DeComplejoHabitacional b) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`barrio`(`tipodebarrio`,`nombrebarrio`,`superficiebarrio`,`cantidaddemonoblocks`,`poseeconsorcio`, `numero_comuna`)VALUES(?,?,?,?,?,?);";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, "DeComplejoHabitacional");
			stmt.setString(2, b.getNombreBarrio());
			stmt.setInt(3, b.getHectareas());
			stmt.setInt(4, b.getCantidadDeMonoblocksConstruidos());
			stmt.setBoolean(5, b.getPoseeConsorcioDeAdministracionMacroActivo());
			stmt.setInt(6, b.getNumero_comuna());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void agregarBarrioDeUrbanizacionPlanificada(DeUrbanizacionPlanificada b) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`barrio`(`tipodebarrio`,`nombrebarrio`,`superficiebarrio`,`numerodeley`,`cuentaconconexion`, `numero_comuna`)VALUES(?,?,?,?,?,?);";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, "DeUrbanizacionPlanificada");
			stmt.setString(2, b.getNombreBarrio());
			stmt.setInt(3, b.getHectareas());
			stmt.setInt(4, b.getNumeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA());
			stmt.setBoolean(5, b.getCuentaConConexiónFormalALaRedDeAguaPotable());
			stmt.setInt(6, b.getNumero_comuna());
			stmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
