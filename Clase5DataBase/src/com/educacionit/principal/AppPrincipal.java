package com.educacionit.principal;

import javax.swing.JOptionPane;
import com.educacionit.database.PersonaDAO;
import com.educacionit.modelos.PersonaVO;
import com.educacionit.utils.UtilPersonas;

public class AppPrincipal {
	public static void main(String[] args) {
		
	
		PersonaVO p1 = new PersonaVO();
		p1 = UtilPersonas.solicitarDatosPersona();
		
		PersonaDAO dao = new PersonaDAO();
		dao.modificarPersona(p1);

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
