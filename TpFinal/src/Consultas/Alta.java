package Consultas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import clasesPrincipales.Barrio;
import clasesPrincipales.Comuna;
import clasesPrincipales.DeComplejoHabitacional;
import clasesPrincipales.DeTrazadoFormal;
import clasesPrincipales.DeUbanizacionPlanificada;
import clasesPrincipales.Persona;
import dao.dao;

public class Alta {
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
	
	public void agregarComuna(Comuna c) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`comuna`(`nombre_sedecomunal`)VALUES(?);";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, c.getNombreComuna());
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
	
	public void agregarBarrioDeTrazadoFormal(Barrio b,DeTrazadoFormal bt) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`barrio`(`tipodebarrio`,`nombrebarrio`,`superficiebarrio`,`cantidadedificios`,`porcentajeasfaltado`)VALUES(?,?,?,?,?)";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, "DeTrazadoFormal");
			stmt.setString(2, b.getNombreBarrio());
			stmt.setInt(3, b.getHectareas());
			stmt.setInt(4, bt.getCantidadEdificiosDePropiedadHorizontal());
			stmt.setInt(5, bt.getPorcentajeDeAsfaltadoEnCalles());
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
	public void agregarBarrioDeComplejoHabitacional(Barrio b,DeComplejoHabitacional bc) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`barrio`(`tipodebarrio`,`nombrebarrio`,`superficiebarrio`,`cantidaddemonoblocks`,`poseeconsorcio`)VALUES(?,?,?,?,?)";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, "DeComplejoHabitacional");
			stmt.setString(2, b.getNombreBarrio());
			stmt.setInt(3, b.getHectareas());
			stmt.setInt(4, bc.getCantidadDeMonoblocksConstruidos());
			stmt.setBoolean(5, bc.getPoseeConsorcioDeAdministracionMacroActivo());
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
	
	public void agregarBarrioDeUrbanizacionPlanificada(Barrio b,DeUbanizacionPlanificada bu) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`barrio`(`tipodebarrio`,`nombrebarrio`,`superficiebarrio`,`numerodeley`,`cuentaconconexion`)VALUES(?,?,?,?,?)";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, "DeComplejoHabitacional");
			stmt.setString(2, b.getNombreBarrio());
			stmt.setInt(3, b.getHectareas());
			stmt.setInt(4, bu.getNumeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA());
			stmt.setBoolean(5, bu.getCuentaConConexiónFormalALaRedDeAguaPotable());
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
