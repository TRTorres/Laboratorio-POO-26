package Consultas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import clasesPrincipales.Persona;
import dao.dao;

public class Consultar {
	String sql = "";
	dao daoo = new dao();
	/**
	 * 
	 * @return
	 */
	public ArrayList<Persona> consultar() {
		ArrayList<Persona> solucion = new ArrayList<>();
		Connection conexion = null;
		sql = "SELECT * FROM personas;"; 
		
		try {
			conexion = daoo.conectar();
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String idPersona = rs.getString("idPersona");
				String nombre = rs.getString("nombre");
				String fecha = rs.getString("nacimiento");
				String tieneHijos = rs.getString("hijoas");
				String idEstudio = rs.getString("idEstudio");
				String dni = rs.getString("dni");
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
