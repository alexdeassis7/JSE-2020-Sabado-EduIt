package com.educacionit.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.educacionit.modelos.PersonaVO;

//Data Access Object 
//CRUD
public class PersonaDAO {

	public void registrarPersona(PersonaVO miPersona) {
		Conexion conex = new Conexion();

		try {
			Statement estatuto = conex.getConnection().createStatement();

			estatuto.executeUpdate("INSERT INTO persona VALUES ('" + miPersona.getIdPersona() + "','"
					+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
					+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "')");

			JOptionPane.showMessageDialog(null, "Se ah registrado Exitosamente a " + miPersona.getNombrePersona(),
					"Informacion", JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se registro a " + miPersona.getNombrePersona());

		}

	}

	public PersonaVO buscarPersona(int codigo) {
		Conexion conex = new Conexion();
		PersonaVO persona = new PersonaVO();
		boolean existe = false;

		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM persona where id = ? ");
			consulta.setInt(1, codigo);

			ResultSet res = consulta.executeQuery();

			if (res.next()) {
				existe = true;
				persona.setIdPersona(Integer.parseInt(res.getString("id")));
				persona.setNombrePersona(res.getString("nombre"));
				persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
				persona.setProfesionPersona(res.getString("profesion"));
				persona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));

			}
			res.close();
			consulta.close();
			conex.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conecto ");
			System.out.println(e);
			e.printStackTrace();
		}

		if (existe) {
			return persona;
		} else {
			return null;
		}

	}

	public void eliminarPersona(int codigo) {
		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			String sql = "DELETE FROM persona WHERE id = " + codigo;
			estatuto.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Se ah eliminado correctamente el registro cuyo id es " + codigo,
					"infomacion delete", JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "no se logro eliminar el registro con id " + codigo);
			System.out.println(e);
			e.printStackTrace();
		}

	}

	public void modificarPersona(PersonaVO miPersona) {
		Conexion conex = new Conexion();

		try {
			String consulta = "UPDATE persona SET id = ? , nombre = ? , edad = ?,profesion = ? ,telefono = ? WHERE id = ? ";
			
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);
			
			estatuto.setInt(1, miPersona.getIdPersona());
			estatuto.setString(2, miPersona.getNombrePersona());
			estatuto.setInt(3, miPersona.getEdadPersona());
			estatuto.setString(4, miPersona.getProfesionPersona());
			estatuto.setInt(5, miPersona.getTelefonoPersona());
			estatuto.setInt(6, miPersona.getIdPersona());
			
			estatuto.executeUpdate();
			
JOptionPane.showMessageDialog(null, "Se ah modificado Correctamente el Registro " , "Comfirmacion" , JOptionPane.INFORMATION_MESSAGE);
			
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
			
			e.getCause();
			System.out.println(e.getMessage());
	JOptionPane.showMessageDialog(null, "Error al MOdificar Elregistro , no inpacto en la DB" ,"ERROR",JOptionPane.ERROR_MESSAGE );
		
		}

	}

}













