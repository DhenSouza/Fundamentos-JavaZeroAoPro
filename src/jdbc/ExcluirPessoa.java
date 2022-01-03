package jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcluirPessoa extends FabricaConexao {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		
		open();
		
		String sql = "SELECT * FROM pessoas WHERE codigo = ?"; 
		stmt = conexao.prepareStatement(sql);
		
		System.out.println("Informe o codigo da pessoa: ");
		int codigo = scan.nextInt();
		stmt.setInt(1, codigo);
		
		resultado = stmt.executeQuery();
		
		List<Pessoa> lista = new ArrayList<>();
		
		while(resultado.next()) {
			Pessoa pessoa = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("Pessoa Selecionada: " + pessoa.getNome());
			lista.add(pessoa);
		}
			
//		lista.stream().forEach(p -> System.out.println("Codigo: " + p.getCodigo() + " Nome: " + p.getNome()));
		
		if(!lista.isEmpty()) {
			System.out.println("Deseja excluir contato selecionado?");
			String resp = scan.next();
			
			if("sim".equalsIgnoreCase(resp)) {
				stmt = conexao.prepareStatement("DELETE FROM pessoas WHERE codigo = ?");
				stmt.setInt(1, codigo);
				stmt.execute();
				
				System.out.println("Contato excluido com sucesso!");
			} else {
				System.out.println("Exclusão cancelada!");
			}
		}
		
		lista.stream().forEach(p -> System.out.println("Codigo: " + p.getCodigo() + " Nome: " + p.getNome()));
		
		
		close();

	}

}
