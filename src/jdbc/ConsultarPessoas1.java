package jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 extends FabricaConexao {

	public static void main(String[] args) throws SQLException {

		open();
		String sql = "SELECT * FROM PESSOAS";

		stmt = conexao.prepareStatement(sql);
		resultado = stmt.executeQuery(sql);

		List<Pessoa> pessoas = new ArrayList<>();
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");

			pessoas.add(new Pessoa(codigo, nome));
		}

		pessoas.forEach(p -> System.out.println("Codigo " + p.getCodigo() + " ==> " + p.getNome()));

		stmt.close();
		close();

	}

}
