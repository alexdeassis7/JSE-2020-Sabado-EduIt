package com.educacionit.principal;

import javax.swing.JOptionPane;
import com.educacionit.database.PersonaDAO;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {
	public static void main(String[] args) {
		
		//Solicitamos los datos al usuario 
		int idIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Por Favor el id"));
		String nombreIngresado = JOptionPane.showInputDialog("Ingrese Por Favor el nombre");
		int edadIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Por Favor la edad"));
		String ProfesionIngresada = JOptionPane.showInputDialog("Ingrese Por Favor la profesion");
		int telefonoIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Por Favor el telefono"));
		
		//creamnos una intancia para transportala a la base de datos 
		PersonaVO p1 = new PersonaVO(idIngresado , edadIngresada ,telefonoIngresado ,  nombreIngresado , ProfesionIngresada);
				
		PersonaDAO dao = new PersonaDAO();
		dao.registrarPersona(p1);

//		dao.eliminarPersona(1);

//		System.out.println(p1.toString());
//		
//		p1 = dao.buscarPersona(26);
//		
//		System.out.println(p1.toString());
//		
//		
	}
}
