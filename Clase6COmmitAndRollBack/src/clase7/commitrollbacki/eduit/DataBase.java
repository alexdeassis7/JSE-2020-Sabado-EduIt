package clase7.commitrollbacki.eduit;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {

	private static String url = "jdbc:sqlite:basededatos.s3db";

	public static Connection getConnection() {
			//nombre del jar sqlite-jdbc-3.7.2.jar
			try {
				Connection conn = null;
				Class.forName("org.sqlite.JDBC");
				conn.DriverManager.getConnection(url);
			}
			
		}

}
