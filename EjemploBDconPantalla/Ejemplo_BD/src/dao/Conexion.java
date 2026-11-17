package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Persona;

public class Conexion {

	String user = "root";
	String psw = "123456";
	String path = "jdbc:mysql://localhost:3306/bd_52";

	public Connection conectar() {
		Connection c = null;
		try {
			c = DriverManager.getConnection(path, user, psw);
			System.out.println("Se conectó");
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return c;
	}

	public void agregarPersona() {

		Connection c = null;
		String sql = "INSERT INTO personas (nombre,locura,secretos,ubicacion)VALUES ('Lautaro',0,0,-1);";
		try {
			c = conectar();
			Statement stmt = c.createStatement();
			stmt.executeUpdate(sql);
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

	public ArrayList<Persona> consultar() {
		Connection c = null;
		String sql = "SELECT * from persona";
		ArrayList<Persona> solucion = new ArrayList<>();
		try {
			c = conectar();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String nombre = rs.getString("nombre");
				float locura = (float)rs.getInt("locura");
				float secretos = (float)rs.getInt("secretos");
				float ubicacion = (float)rs.getInt("ubicacion");
				Persona p = new Persona(nombre,locura,secretos,ubicacion);
				solucion.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return solucion;
	}
	public void agregarPersonaParametrizada(Persona p) {
		Connection c = null;
		String SQL = "INSERT INTO persona (nombre, locura, secretos, ubicacion) VALUES (?,?,?,?);";
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			stmt.setString(1,p.getNombre());
			stmt.setFloat(2,p.getLocura());
			stmt.setFloat(3,p.getSecretos());
			stmt.setFloat(4,p.getUbicacion());
			
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
	
	
	

	public int agregarPersonaPorParametro(Persona p) {
		Connection c = null;
		int filas = 0;
		String SQL = "INSERT INTO personas (nombre, locura) VALUES (?,?);"; // Cada ? corresponde a un valor
																			// parametrizable
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(SQL); // precompila la query
			stmt.setString(1, p.getNombre()); // Primero va el "numero" de "?" y luego el valor que toma la consulta
			stmt.setFloat(2, p.getLocura()); // Tener en cuenta los tipos de dato
			filas = stmt.executeUpdate(); // Se ejecuta sin reinstanciar el String SQL ya que se "prepara" antes
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return filas; // devuelve las filas afectadas

	}
	
	public void eliminarPorParametro (int id) {
		Connection c = null;
		String SQL = "DELETE from persona WHERE id = ?";
		try {
			c = conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			stmt.setInt(1,id);
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
