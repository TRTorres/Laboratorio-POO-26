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
	
	public void eliminarComuna(int numero_comuna) {
		Connection c = null;
		String SQL = "DELETE from comuna WHERE numero_comuna = ?";
		try {
			c = daoo.conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			stmt.setInt(1,numero_comuna);
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
	
	public void eliminarBarrio(int idBarrio) {
		Connection c = null;
		String SQL = "DELETE from barrio WHERE idBarrio = ?";
		try {
			c = daoo.conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			stmt.setInt(1,idBarrio);
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
