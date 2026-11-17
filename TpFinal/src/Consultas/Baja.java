package Consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.dao;

public class Baja {
	dao daoo = new dao();
	public void eliminarPersona (int dni) {
		Connection c = null;
		String SQL = "DELETE from persona WHERE dni = ?";
		try {
			c = daoo.conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			stmt.setInt(1,dni);
			stmt.executeUpdate();
			System.out.println("Se elimino el registro con exito");
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
}
