package aula05;


public class Produto {
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	
	public double getPreco() {
		return preco;
	}

	
	public void darDesconto (double pct) {
		if(pct >0 && pct < 1 ) {
			preco = preco*(1- pct);
		}
	}
	
	
}
