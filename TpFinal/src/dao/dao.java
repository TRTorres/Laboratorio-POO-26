package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dao {
	String user = "root";
	String psw = "admin";
	String path = "jdbc:mysql://localhost:3306/tpfinalpooruiztorres";
	String sql = "";
	int fila;
	
	
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
