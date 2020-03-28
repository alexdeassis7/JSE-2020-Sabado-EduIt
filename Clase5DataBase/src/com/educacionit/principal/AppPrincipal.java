package com.educacionit.principal;

import com.educacionit.database.Conexion;
import com.educacionit.database.PersonaDAO;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {
	public static void main(String[] args) {
//		Conexion cn = new Conexion();
//		cn.desconectar();
		PersonaVO p1 =  new PersonaVO();
		
		PersonaDAO dao = new PersonaDAO();

		dao.eliminarPersona(1);
		
//		dao.registrarPersona(p1);
		
//		System.out.println(p1.toString());
//		
//		p1 = dao.buscarPersona(26);
//		
//		System.out.println(p1.toString());
//		
//		
	}
}
