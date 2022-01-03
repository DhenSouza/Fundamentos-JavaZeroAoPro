package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		String usuario = "root";
		String senha = "Sei@la.com201";

		Connection conexao = DriverManager.getConnection(url, usuario, senha);

		
		Statement stmt = conexao.createStatement();
		stmt.execute("DROP DATABASE IF EXISTS curso_java");
		
		
		conexao.close();
	}

}
