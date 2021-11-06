package es.studium.GestorConexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class GestorConexiones {
		
	        private final static String MySQL_DB_USUARIO = "root";
	        private final static String MySQL_DB_PASSWORD = "Studium2020;";
	        
	        private final static String MySQL_DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	        private final static String MySQL_DB_URL = "jdbc:mysql://localhost/";

	        public static Connection getMySQL_Connection(String database) {
	                
	                Connection connMySQL = null;
	                try {
	                        Class.forName(MySQL_DB_DRIVER);
	                        connMySQL = DriverManager.getConnection(MySQL_DB_URL + database + "?&useSSL=false", MySQL_DB_USUARIO,
	                                        MySQL_DB_PASSWORD);
	                
	                        System.out.println("La conexión a la base de datos " + database + " se ha realizado correctamente.");
	                } catch (ClassNotFoundException e) {
	                        e.printStackTrace();
	                } catch (SQLException eq) {
	                        eq.printStackTrace();
	                }
	                return connMySQL;
	        }
	        
	        public static void main(String[] args) {
	                getMySQL_Connection("Tiendecita");
	        }
	}


