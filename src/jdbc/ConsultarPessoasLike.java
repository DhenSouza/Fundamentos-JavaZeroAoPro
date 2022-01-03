package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoasLike extends FabricaConexao {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {

		open();

		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

		System.out.println("Informe algo para a pesquisa: ");
		String valor = scan.nextLine();

		stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + valor + "%");

		resultado = stmt.executeQuery();

		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa pessoa = null;

		int cont = 0;
		while (resultado.next()) {
			pessoa = new Pessoa();

			pessoa.setCodigo(resultado.getInt(1));
			pessoa.setNome(resultado.getString(2));

			cont++;
			pessoas.add(pessoa);
		}

		System.out.println("Numero de pessoas encontradas na pesquisa: " + cont);
		if (!pessoas.isEmpty()) {
			pessoas.forEach(p -> System.out.println("Codigo: " + p.getCodigo() + " Nome: " + p.getNome()));
		} else {
			System.out.println("Não foi encontrado a pesquisa");
		}

		stmt.close();
		close();
	}

}
