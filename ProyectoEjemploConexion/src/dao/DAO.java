package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DAO {
	String user = "root";
	String psw = "admin";
	String path = "jdbc:mysql://localhost:3306/bd53";
	String sql = "";
	int fila;
	public int actualizar(String id) {
		Connection conexion = null;
		conexion = conectar();
		sql = "UPDATE `bd53`.`persona` SET `id`= 69 WHERE `id` = '"+id+"';";
		try {
			Statement stmt = conexion.createStatement();
			int fila = stmt.executeUpdate(sql);
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
		return fila;
	}
	
	public int eliminar(String id) {
		sql = "DELETE FROM `persona` WHERE id = '" + id + "';";
		Connection conexion = null;
		conexion = conectar();
		try {
			Statement stmt = conexion.createStatement();
			int fila = stmt.executeUpdate(sql);
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
		return fila;
	}
	
	public int agregar(String id, String apellido, String nombre) {
		Connection conexion = null;
		conexion = conectar();
		sql = "INSERT INTO `bd53`.`persona`(`id`,`nombre`,`apellido`)VALUES('"+id+"','"+apellido+"','"+nombre+"');";
		try {
			Statement stmt = conexion.createStatement();
			int fila = stmt.executeUpdate(sql);
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
		return fila;
	}
	public Connection conectar(){
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(path, user, psw);
		}catch(SQLException e){
			e.printStackTrace();
		} 
		return conexion;
	}
}
