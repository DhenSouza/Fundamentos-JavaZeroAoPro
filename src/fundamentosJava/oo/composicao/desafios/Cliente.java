package fundamentosJava.oo.composicao.desafios;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	 Integer idCliente;
	 String nome;
	 String email;

	 List<Compra> compras = new ArrayList<>();

	public Cliente() {
	}

	public Cliente(Integer idCliente, String nome, String email) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
	}
	
	void adiciona(Compra compra) {
		if(this.compras != null) {
			this.compras.add(compra);
		}
	}
	
	Double obterValorTotal(Compra c) {
		double total = 0.;
		if(this.compras != null) {
				total +=  c.retornaValorItens();
			return total;
		}
		return null;
	}
	

	@Override
	public String toString() {
		return  nome;
	}
	
}
