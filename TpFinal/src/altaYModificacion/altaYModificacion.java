package altaYModificacion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import clasesPrincipales.barrio;
import clasesPrincipales.comuna;
import clasesPrincipales.persona;
import dao.dao;

public class altaYModificacion {
	String sql = "";
	dao daoo = new dao();
	public void agregarPersona(persona p) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`persona`(`dnipersona`,`nombrepersona`,`fechadenacimiento`,`situacionlaboral`)VALUES(?,?,?,?);";
		try {
			Date sqlDate = Date.valueOf(p.getFechaDeNacimiento());
			String estadoLaboral = String.valueOf(p.getEstadoLaboral());
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, p.getDniPersona());
			stmt.setString(2, p.getNombrePersona());
			stmt.setDate(3, sqlDate);
			stmt.setString(4, estadoLaboral);
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
	
	public void agregarComuna(comuna c) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`comuna`(`numero_comuna`,`nombre_sedecomunal`,`junta_responsable`)VALUES(?,?,?;";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, c.getNumeroComuna());
			stmt.setString(2, c.getNombreComuna());
			stmt.setString(3, c.getJuntaComunal());
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
	
	public void agregarBarrio(barrio b) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`barrio`(`idbarrio`,`tipodebarrio`,`nombrebarrio`,`superficiebarrio`,`cantidadedificios`,`porcentajeasfaltado`,`numerodeley`,`cuentaconconexion`,`cantidaddemonoblocks`,`poseeconsorcio`)VALUES(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			String tipoBarrio = String.valueOf(b.getBarrio());
			stmt.setInt(1, b.getIdBarrio());
			stmt.setString(2, tipoBarrio);
			stmt.setString(3, b.getNombreBarrio());
			stmt.setInt(4, b.getHectareas());
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
