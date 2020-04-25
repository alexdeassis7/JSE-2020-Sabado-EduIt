package com.educacionit.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionit.database.PersonaDAO;
import com.educacionit.models.PersonaVO;

@WebServlet("/init.do") // anotations
public class ProcesoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProcesoLogin() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("llego el request al metodo doGet");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("llego el request al metodo doPost del servlet");

		String nombreUsuario = null;
		Integer passwordUsuario = null;

		if ((request.getParameter("pass") != "" && request.getParameter("uname") != "")) {
			passwordUsuario = Integer.parseInt(request.getParameter("pass"));
			nombreUsuario = request.getParameter("uname");
		}

		if (nombreUsuario != null & passwordUsuario != null) {
			PersonaDAO dao = new PersonaDAO();

			PersonaVO p = new PersonaVO();
			p.setIdName(nombreUsuario);
			p.setPassword(passwordUsuario);
			dao.registrarUsuario(p);
			// Redireccionamos la petidion a la pagina de bienvenida
			response.sendRedirect("index.html");

		} else {
			System.out.println("no se puede guardar null en la base! ");
			response.sendRedirect("error.html");
		}

		System.out.println("llegaron los siguiente datos :");
		System.out.println(nombreUsuario + "  " + passwordUsuario);
	}

}
