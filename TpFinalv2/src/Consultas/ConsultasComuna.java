package Consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import clasesPrincipales.Barrio;
import clasesPrincipales.Comuna;
import dao.dao;

public class ConsultasComuna {
	String sql = "";
	dao daoo = new dao();
	public void agregarComuna(Comuna c) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`comuna`(`numero_comuna`,`nombre_sedecomunal`)VALUES(?,?);";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, c.getNumeroComuna());
			stmt.setString(2, c.getNombreComuna());
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
	
	
	public void eliminarComuna(int numero_comuna) {
		ConsultasBarrio cb = new ConsultasBarrio();
		for (Barrio b : cb.consultarBarrio()) {
			if(b.getNumero_comuna() == numero_comuna) {
				cb.cambiarNumeroComunaDeBarrios(numero_comuna);
			}
		}
		Connection c = null;
		String SQL = "DELETE FROM comuna WHERE numero_comuna = ?";
		try {
			c = daoo.conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			stmt.setInt(1,numero_comuna);
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
	
	public void modificarComuna(Comuna c, int numeroComuna) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "UPDATE `tpfinalruiztorres`.`comuna` SET `numero_comuna` = ? ,`nombre_sedecomunal` = ? WHERE `numero_comuna` = ?;";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(2, c.getNombreComuna());
			stmt.setInt(1, c.getNumeroComuna());
			stmt.setInt(3, numeroComuna);
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
	
	public int consultarNumeroDeComunaParaBarrio(String nombreSedeComunal) {
		Connection conexion = null;
		int numeroComuna = 0;
		sql = "SELECT `comuna`.numero_comuna FROM `comuna` WHERE `comuna`.nombre_sedecomunal = ?;"; 
		try {
			conexion = daoo.conectar();
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1,nombreSedeComunal);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				numeroComuna = rs.getInt("numero_comuna");
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
		return numeroComuna;
	}
}
