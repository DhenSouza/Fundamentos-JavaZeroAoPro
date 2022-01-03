package jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas extends FabricaConexao {
	
	public static void main(String[] args) throws SQLException {
		open();
		
		String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
				+ "codigo INT AUTO_INCREMENT PRIMARY KEY, "
				+ "nome varchar(80) NOT NULL"
				+ ")";
		
		 stmt = conexao.prepareStatement(sql);
		stmt.execute(sql);
		
		System.out.println("Tabela criada com sucesso!");
		close();
	}

}
