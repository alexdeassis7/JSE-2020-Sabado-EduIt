package com.educacionit.utils;

import javax.swing.JOptionPane;

import com.educacionit.modelos.PersonaVO;

public class UtilPersonas {

	public static PersonaVO solicitarDatosPersona() {		
		//Solicitamos los datos al usuario 
		int idIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Por Favor el id de la persona a modificar"));
		String nombreIngresado = JOptionPane.showInputDialog("Ingrese Por Favor el nombre de la persona a modificar");
		int edadIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Por Favor la edad de la persona a modificar "));
		String ProfesionIngresada = JOptionPane.showInputDialog("Ingrese Por Favor la profesion de la persona a modificar ");
		int telefonoIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Por Favor el telefono de la persona a modificar "));
		
		
		//creamnos una intancia para transportala a la base de datos 
		PersonaVO p1 = new PersonaVO(idIngresado , edadIngresada ,telefonoIngresado ,  nombreIngresado , ProfesionIngresada);
				
		return p1;
	
	}
}
