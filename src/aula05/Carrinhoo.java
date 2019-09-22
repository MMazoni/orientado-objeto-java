package aula05;

import java.util.ArrayList;



public class Carrinhoo {
	private ArrayList<Produto> produtos;
	
	public Carrinhoo() {
		produtos = new ArrayList<Produto>();
	}
	
	public void adicionar(Produto p) {
		if(p != null) {
			produtos.add(p);
		}
			
	}
	
	public Produto remover(int ix) {
		return produtos.remove(ix);
	}
	
	public double valorTotal() {
		double soma = 0;
		//for(int i = 0;i < produtos.size();i++) {
		//	soma = soma + produtos.get(i).getPreco();
	   for(Produto p : produtos) {
		   soma = soma + p.getPreco();
	}
		return soma;
	}
	
	public int buscarPeloNome(String s) {
		for (Produto p : produtos) {
			if(p.getNome().equals(s)) {
				return produtos.indexOf(p);
			}
		}
		return -1;
	}
}
