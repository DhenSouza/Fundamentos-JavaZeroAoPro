package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class NovasPessoas extends FabricaConexao {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {

		open();
		boolean flag = true;

		while (flag) {
			System.out.println("Informe um nome: ");
			String nome = scan.nextLine();

			String sql = "INSERT INTO pessoas (nome) VALUES (?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, nome);

			stmt.execute();

			System.out.println("Pessoa incluida com sucesso!");

			System.out.println("Deseja continuar?");
			String resposta = scan.nextLine();
			if ("nao".equalsIgnoreCase(resposta)) {
				System.out.println("Inserção finalizada!");
				flag = false;
			}
		}

	}

}
