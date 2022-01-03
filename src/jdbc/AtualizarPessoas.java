package jdbc;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarPessoas extends FabricaConexao {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		System.out.println("Informe o codigo da pessoa que deseja alterar o nome: ");
		String info = scan.nextLine();

		int codigo = retornaCodigoPessoa(info);

		Pessoa pessoa = procurarPeloId(codigo);
		
		System.out.println("Nome encontrado: " + pessoa.getNome());

		System.out.println("Informa o novo nome dessa pessoa: ");
		String novoNome = scan.nextLine();

		pessoa.setNome(novoNome);
		atualizar(pessoa);

		List<Pessoa> pessoas = mostrarPessoas();
		pessoas.forEach(p -> System.out.println(p.getCodigo() + " " + p.getNome()));

	}

	public static void atualizar(Pessoa pessoa) throws SQLException {
		open();
		String sql = "UPDATE pessoas SET nome = ? WHERE codigo= ?";

		stmt = conexao.prepareStatement(sql);
		stmt.setString(1, pessoa.getNome());
		stmt.setInt(2, pessoa.getCodigo());

		stmt.executeUpdate();
		close();
	}

	public static Pessoa procurarPeloId(int codigo) throws SQLException {
		open();

		String sql = "SELECT * FROM pessoas WHERE codigo=?";
		stmt = conexao.prepareStatement(sql);

		stmt.setInt(1, codigo);
		resultado = stmt.executeQuery();

		Pessoa pessoa = null;
		while (resultado.next()) {
			pessoa = new Pessoa();
			pessoa.setCodigo(resultado.getInt(1));
			pessoa.setNome(resultado.getString(2));
		}

		return pessoa;
	}

	public static List<Pessoa> mostrarPessoas() throws Exception {
		open();
		stmt = conexao.prepareStatement("SELECT * FROM pessoas");
		resultado = stmt.executeQuery();
		List<Pessoa> lista = new ArrayList<>();
		Pessoa pessoa = null;
		while (resultado.next()) {
			pessoa = new Pessoa();
			pessoa.setCodigo(resultado.getInt(1));
			pessoa.setNome(resultado.getString(2));
			lista.add(pessoa);
		}
		return lista;
	}

	public static int retornaCodigoPessoa(String informacao) {
		return Integer.parseInt(informacao);
	}
}
