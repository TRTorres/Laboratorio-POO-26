package Consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import clasesPrincipales.Barrio;
import clasesPrincipales.Comuna;
import clasesPrincipales.DeComplejoHabitacional;
import clasesPrincipales.DeTrazadoFormal;
import clasesPrincipales.DeUrbanizacionPlanificada;
import dao.dao;

public class ConsultasBarrio {
	String sql = "";
	dao daoo = new dao();
	
	public void agregarBarrioDeTrazadoFormal(DeTrazadoFormal b) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`barrio`(`tipodebarrio`,`nombrebarrio`,`superficiebarrio`,`cantidaddeedificios`,`porcentajeasfaltado`, `numero_comuna`)VALUES(?,?,?,?,?,?);";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, "DeTrazadoFormal");
			stmt.setString(2, b.getNombreBarrio());
			stmt.setInt(3, b.getHectareas());
			stmt.setInt(4, b.getCantidadEdificiosDePropiedadHorizontal());
			stmt.setInt(5, b.getPorcentajeDeAsfaltadoEnCalles());
			stmt.setInt(6, b.getNumero_comuna());
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
	public void agregarBarrioDeComplejoHabitacional(DeComplejoHabitacional b) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`barrio`(`tipodebarrio`,`nombrebarrio`,`superficiebarrio`,`cantidaddemonoblocks`,`poseeconsorcio`, `numero_comuna`)VALUES(?,?,?,?,?,?);";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, "DeComplejoHabitacional");
			stmt.setString(2, b.getNombreBarrio());
			stmt.setInt(3, b.getHectareas());
			stmt.setInt(4, b.getCantidadDeMonoblocksConstruidos());
			stmt.setBoolean(5, b.getPoseeConsorcioDeAdministracionMacroActivo());
			stmt.setInt(6, b.getNumero_comuna());
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
	
	public void agregarBarrioDeUrbanizacionPlanificada(DeUrbanizacionPlanificada b) {
		Connection conexion = null;
		conexion = daoo.conectar();
		sql = "INSERT INTO `tpfinalruiztorres`.`barrio`(`tipodebarrio`,`nombrebarrio`,`superficiebarrio`,`numerodeley`,`cuentaconconexion`, `numero_comuna`)VALUES(?,?,?,?,?,?);";
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, "DeUrbanizacionPlanificada");
			stmt.setString(2, b.getNombreBarrio());
			stmt.setInt(3, b.getHectareas());
			stmt.setInt(4, b.getNumeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA());
			stmt.setBoolean(5, b.getCuentaConConexiónFormalALaRedDeAguaPotable());
			stmt.setInt(6, b.getNumero_comuna());
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
	
	public void eliminarBarrio(int idBarrio) {
		Connection c = null;
		String SQL = "DELETE FROM barrio WHERE idBarrio = ?";
		try {
			c = daoo.conectar();
			PreparedStatement stmt = c.prepareStatement(SQL);
			stmt.setInt(1,idBarrio);
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
	
	public ArrayList<Barrio> consultarBarrio() {
		ArrayList<Barrio> solucion = new ArrayList<>();
		Connection conexion = null;
		sql = "SELECT * FROM barrio;"; 
		try {
			conexion = daoo.conectar();
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int idBarrio = rs.getInt("idbarrio");
				String nombreBarrio = rs.getString("nombrebarrio");
				int hectareas = rs.getInt("superficiebarrio");
				int numero_comuna = rs.getInt("numero_comuna");
				String tipoBarrio = rs.getString("tipodebarrio");
				Barrio b = null;
				switch(tipoBarrio) {
				case "DeTrazadoFormal":
					int cantidadEdificiosDePropiedadHorizontal = rs.getInt("cantidaddeedificios");
					int porcentajeDeAsfaltadoEnCalles = rs.getInt("porcentajeasfaltado");
					b = new DeTrazadoFormal(nombreBarrio, hectareas, numero_comuna, tipoBarrio, cantidadEdificiosDePropiedadHorizontal, porcentajeDeAsfaltadoEnCalles);
					b.setIdBarrio(idBarrio);
					solucion.add(b); 
					break;
				case "DeUrbanizacionPlanificada":
					int numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA = rs.getInt("numerodeley");
					boolean cuentaConConexiónFormalALaRedDeAguaPotable = rs.getBoolean("cuentaconconexion");
					b = new DeUrbanizacionPlanificada(nombreBarrio, hectareas, numero_comuna,tipoBarrio, numeroDeLeyDeIntegraciónDeLaLegislaturaDeCABA, cuentaConConexiónFormalALaRedDeAguaPotable);
					b.setIdBarrio(idBarrio);
					solucion.add(b); 
					break;
				case "DeComplejoHabitacional":
					int cantidadDeMonoblocksConstruidos = rs.getInt("cantidaddemonoblocks");
					boolean poseeConsorcioDeAdministracionMacroActivo = rs.getBoolean("poseeconsorcio");
					b = new DeComplejoHabitacional(nombreBarrio, hectareas, numero_comuna, tipoBarrio, cantidadDeMonoblocksConstruidos, poseeConsorcioDeAdministracionMacroActivo);
					b.setIdBarrio(idBarrio);
					solucion.add(b); 
					break;
				}
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
	
	public ArrayList<Barrio> consultarBarriosDeUnaComuna(int numeroComuna) {
		ArrayList<Barrio> solucion = new ArrayList<>();
		Connection conexion = null;
		sql = "SELECT comuna.numero_comuna, comuna.nombre_sedecomunal, barrio.nombrebarrio,barrio.tipodebarrio FROM comuna LEFT JOIN barrio ON comuna.numero_comuna = barrio.numero_comuna WHERE comuna.numero_comuna = ?;";
		try {
			conexion = daoo.conectar();
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1,numeroComuna);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				int numero_comuna = rs.getInt("numero_comuna");
				String nombre_sedecomunal = rs.getString("nombre_sedecomunal");
				String nombreBarrio = rs.getString("nombrebarrio");
				String tipoBarrio = rs.getString("tipodebarrio");
				Barrio b = new Barrio(nombreBarrio, 0, numero_comuna, tipoBarrio);
				b.setNombreSedeComunal(nombre_sedecomunal);
				solucion.add(b);
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
	
	public void modificarBarrio(Barrio b,int idBarrio) {
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
			stmt.setInt(11, idBarrio);
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
