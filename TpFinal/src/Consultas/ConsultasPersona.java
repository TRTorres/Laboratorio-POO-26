package Consultas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import clasesPrincipales.Persona;
import dao.dao;
import enumeradores.SituacionLaboral;

public class ConsultasPersona {
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
			int fila = stmt.executeUpdate();
			System.out.println(fila);
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
	
	public void eliminarPersona(int dni) {
		Connection c = null;
		String SQL = "DELETE FROM persona WHERE dnipersona = ?";
		try {
			c = daoo.conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			stmt.setInt(1,dni);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
	
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
	
	public void modificarPersona(Persona p) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "UPDATE `tpfinalruiztorres`.`persona` SET `nombrepersona` = ?, `fechadenacimiento` = ?,`situacionlaboral` = ?, `idBarrio` = ? WHERE `dnipersona` = ?;";
		try {
			Date sqlDate = Date.valueOf(p.getFechaDeNacimiento());
			String estadoLaboral = String.valueOf(p.getEstadoLaboral());
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, p.getNombrePersona());
			stmt.setDate(2, sqlDate);
			stmt.setString(3, estadoLaboral);
			stmt.setInt(4, p.getIdBarrio());
			stmt.setInt(5, p.getDniPersona());
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
