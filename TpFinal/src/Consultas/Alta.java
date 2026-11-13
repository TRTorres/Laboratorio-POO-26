package Consultas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import clasesPrincipales.Barrio;
import clasesPrincipales.BarrioDeComplejoHabitacional;
import clasesPrincipales.BarrioDeTrazadoFormal;
import clasesPrincipales.BarrioDeUbanizacionPlanificada;
import clasesPrincipales.Comuna;
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
		sql = "INSERT INTO `tpfinalruiztorres`.`comuna`(`numero_comuna`,`nombre_sedecomunal`,`junta_responsable`)VALUES(?,?,?;";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, c.getNumeroComuna());
			stmt.setString(2, c.getNombreComuna());
			stmt.setString(3, c.getJuntaComunal());
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
	
	public void agregarBarrio(Barrio b,BarrioDeTrazadoFormal bt, BarrioDeUbanizacionPlanificada bu, BarrioDeComplejoHabitacional bc) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`barrio`(`idbarrio`,`tipodebarrio`,`nombrebarrio`,`superficiebarrio`,`cantidadedificios`,`porcentajeasfaltado`,`numerodeley`,`cuentaconconexion`,`cantidaddemonoblocks`,`poseeconsorcio`)VALUES(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			String tipoBarrio = String.valueOf(b.getBarrio());
			stmt.setString(1, tipoBarrio);
			stmt.setString(2, b.getNombreBarrio());
			stmt.setInt(3, b.getHectareas());
			stmt.setInt(4, bt.getCantidadEdificiosDePropiedadHorizontal());
			stmt.setInt(5, bt.getPorcentajeDeAsfaltadoEnCalles());
			stmt.setInt(6, bu.getNumeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA());
			stmt.setBoolean(7, bu.getCuentaConConexiónFormalALaRedDeAguaPotable());
			stmt.setInt(8, bc.getCantidadDeMonoblocksConstruidos());
			stmt.setBoolean(9, bc.getPoseeConsorcioDeAdministracionMacroActivo());
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
