package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMySQL {
	 private static final String USERNAME = "root";
	    private static final String PASSWORD = "12345";
	    private static final String URL = "jdbc:mysql://localhost:3306/realizeSonhos";
	    
	    public static Connection createConnectionMySQL() throws Exception {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	
	    	Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	    	return connection;
	    }
	    public static void main(String[] args) throws Exception{
	    	Connection con = createConnectionMySQL();
	    	
	    	if (con != null) {
	    		System.out.println(con + "/n/n * CONEXAO OBTIDA *** ");
	    		con.close();
	    	                 }
	    }
}