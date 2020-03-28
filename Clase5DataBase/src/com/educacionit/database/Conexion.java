package com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	static String db = "personas";
	static String login = "root";
	static String password = "";
	// Java DataBase Connectivity
	static String urlConexion = "jdbc:mysql://localhost/" + db;
	Connection conn = null;
	public Conexion() {
		try {
			// obtenemos el driver para mysql
			Class.forName("com.mysql.jdbc.Driver");
			// Obtenemos la conexion a la db
			conn = DriverManager.getConnection(urlConexion, login, password);
			if (conn != null) {
				System.out.println("Conexion Exitosa a la base de datos " + db);
			}
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	/** metodo que me permite retornar la connection */
	public Connection getConnection() {
		return conn;
	}
	public void desconectar() {
		conn = null;
		System.out.println("desconexion exitosa ");
	}

}
