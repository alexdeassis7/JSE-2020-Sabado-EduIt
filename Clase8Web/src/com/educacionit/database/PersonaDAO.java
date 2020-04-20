package com.educacionit.database;

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

}
