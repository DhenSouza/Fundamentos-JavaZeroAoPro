package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	
	static Connection conexao;
	static PreparedStatement stmt;
	static ResultSet resultado;
	
	public static Connection open() {
		try {
			Properties prop = getProperties();
			String url = prop.getProperty("banco.url");
			String usuario = prop.getProperty("banco.usuario");
			String senha = prop.getProperty("banco.senha");

			conexao = DriverManager.getConnection(url, usuario, senha);
			
		} catch (SQLException | IOException ex) {
			ex.printStackTrace();
		}
		return conexao;
	}
	
	public static void close() throws SQLException {
		conexao.close();
	}
	
	public static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String path = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(path));
		return prop;
	}

}
