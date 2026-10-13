package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DAO {
	String user = "root";
	String psw = "admin";
	String path = "jdbc:mysql://localhost:3306/bd_53";
	Connection conexion = null;
	String sql = "INSERT INTO `table`(`id`,`name`,`dni`)VALUES(69,'Rubi','49856729');";
	int fila = 0;
	
	public int agregar() {
		conexion = conectar();
		try {
			conexion = DriverManager.getConnection(path, user, psw);
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
		try {
			conexion = DriverManager.getConnection(path, user, psw);
			Statement stmt = conexion.createStatement();
			int fila = stmt.executeUpdate(sql);
			System.out.println(fila);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return conexion;
	}
}
