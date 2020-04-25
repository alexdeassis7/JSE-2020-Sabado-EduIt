package com.educacionit.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.educacionit.models.PersonaVO;
//capa de acceso a datos 
public class PersonaDAO {


	public boolean registrarUsuario(PersonaVO miPersona) {

		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate(
					"INSERT INTO user VALUE('" + miPersona.getIdName() + "','" + miPersona.getPassword() + "')");
			estatuto.close();
			conex.desconectar();
			System.out.println("se logro guardar el registro en la base ");
			return true;
		} catch (SQLException e) {
			System.out.println("Ocurrio un Error en el DAO , no pudimos persistir el dato ");
			e.printStackTrace();
			return false;
		}
	}
	
	//SELECT * FROM user where usuario='Alex' AND clave = 1425;
	public boolean validarUsuario(PersonaVO persona) {
		Conexion conex = new Conexion();
		try {
			//preparamos la consulta a ejecutar 
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM user where usuario=? AND clave = ?");
			consulta.setString(1, persona.getIdName());
			consulta.setInt(2, persona.getPassword());
			//ejecutamos la query contra la db 
			ResultSet res = consulta.executeQuery();
			
			if(res.next()) {
				res.close();
				return true ;
				
			}else {
				res.close();
				return false;
		
			}			
		} catch (SQLException e) {
			System.out.println("Ocurrio un Error en la validacion de usuario  , no se logro validar nada");
			e.printStackTrace();
			return false;
		}finally {
			conex.desconectar();
		}
		
		
	}
	
//	public static void main(String[] args) {
//		PersonaDAO pd = new PersonaDAO();
//		
//		boolean existe =pd.validarUsuario(new PersonaVO("pepito", 5555));
//		
//		System.out.println(existe);
//	}
//	
//	
//	
}
