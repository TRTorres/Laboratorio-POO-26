package Consultas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import clasesPrincipales.Persona;
import dao.dao;

public class Modificacion {
	String sql = "";
	dao daoo = new dao();
	public void modificarPersona(Persona p) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "UPDATE `tpfinalruiztorres`.`persona` SET `dnipersona` = '', `nombrepersona` = '', `fechadenacimiento` = '',`situacionlaboral` = '' WHERE `dnipersona` = '';";
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
}
