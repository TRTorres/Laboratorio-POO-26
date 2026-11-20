package Consultas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import clasesPrincipales.Barrio;
import clasesPrincipales.Comuna;
import clasesPrincipales.DeComplejoHabitacional;
import clasesPrincipales.DeTrazadoFormal;
import clasesPrincipales.DeUrbanizacionPlanificada;
import clasesPrincipales.Persona;
import dao.dao;

public class Modificacion {
	String sql = "";
	dao daoo = new dao();
	public void modificarPersona(Persona p) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "UPDATE `tpfinalruiztorres`.`persona` SET `nombrepersona` = ?, `fechadenacimiento` = ?,`situacionlaboral` = ?, `idBarrio` = ? WHERE `dnipersona` = ?;";
		try {
			Date sqlDate = Date.valueOf(p.getFechaDeNacimiento());
			String estadoLaboral = String.valueOf(p.getEstadoLaboral());
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, p.getNombrePersona());
			stmt.setDate(2, sqlDate);
			stmt.setString(3, estadoLaboral);
			stmt.setInt(4, p.getIdBarrio());
			stmt.setInt(5, p.getDniPersona());
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
	
	public void modificarComuna(Comuna c) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "UPDATE `tpfinalruiztorres`.`comuna` SET `nombre_sedecomunal` = ? WHERE `numero_comuna` = ?;";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, c.getNombreComuna());
			stmt.setInt(2, c.getNumeroComuna());
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
	
	public void modificarBarrio(Barrio b) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "UPDATE `tpfinalruiztorres`.`barrio` SET `tipodebarrio` = ?,`nombrebarrio` = ?,`superficiebarrio` = ?,`cantidaddeedificios` = ?,`porcentajeasfaltado` = ?,`numerodeley` = ?,`cuentaconconexion` = ?,`cantidaddemonoblocks` = ?,`poseeconsorcio` = ?,`numero_comuna` = ? WHERE `idbarrio` = ?;";
		try {
			String a = b.getTipoBarrio();
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1,b.getTipoBarrio());
			stmt.setString(2, b.getNombreBarrio());
			stmt.setInt(3, b.getHectareas());
			stmt.setNull(4, java.sql.Types.INTEGER);
	        stmt.setNull(5, java.sql.Types.INTEGER);
	        stmt.setNull(6, java.sql.Types.INTEGER);
	        stmt.setNull(7, java.sql.Types.BOOLEAN);
	        stmt.setNull(8, java.sql.Types.INTEGER);
	        stmt.setNull(9, java.sql.Types.BOOLEAN);
			stmt.setInt(10, b.getNumero_comuna());
			stmt.setInt(11, b.getIdBarrio());
			switch(a) {
			case "DeComplejoHabitacional":
				stmt.setInt(8, ((DeComplejoHabitacional)b).getCantidadDeMonoblocksConstruidos());
				stmt.setBoolean(9, ((DeComplejoHabitacional)b).getPoseeConsorcioDeAdministracionMacroActivo());
				break;
			case "DeTrazadoFormal":
				stmt.setInt(4,((DeTrazadoFormal)b).getCantidadEdificiosDePropiedadHorizontal());
				stmt.setInt(5, ((DeTrazadoFormal)b).getPorcentajeDeAsfaltadoEnCalles());
				break;
			case "DeUrbanizacionPlanificada":
				stmt.setInt(6, ((DeUrbanizacionPlanificada)b).getNumeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA());
				stmt.setBoolean(7, ((DeUrbanizacionPlanificada)b).getCuentaConConexiónFormalALaRedDeAguaPotable());
				break;
			}
			int filasAfectadas = stmt.executeUpdate();
			System.out.println("Filas afectadas: " + filasAfectadas);
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
