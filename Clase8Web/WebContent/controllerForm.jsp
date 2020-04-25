<%@page import="com.educacionit.database.PersonaDAO"%>
<%@page import="com.educacionit.models.PersonaVO"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Estilos Customizados -->
<link rel="stylesheet" type="text/css" href="estilos/styles.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- Scriptlets -->
Soy mi primer pagina JSP y la fecha es : <%=new java.util.Date()  %>

<%
	String user = request.getParameter("user");
	int pass = Integer.parseInt(request.getParameter("pass"));
	
	PersonaDAO pd = new PersonaDAO();
	PersonaVO p = new PersonaVO(user,pass);
	
	boolean existe = pd.validarUsuario(p);
	if(existe){
		out.print("<h1>WELCOME TO APPLICATION</h1>");
	}else{
		out.print("<h1>USER INVALID OR PASSWORD INVALID</h1>");
	}
	

%>

</body>
</html>