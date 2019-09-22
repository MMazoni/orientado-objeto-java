package aula05;


public class Carrinho {
	private Produto[] produtos;
	//AUXILIAR PARA CONTROLE DE INDICE.
	private int qtd;
	
	
	public Carrinho(int tamanhoMax) {
		produtos = new Produto[tamanhoMax];
		
	}
	
	public void adicionar(Produto p) {
		if(qtd < produtos.length && p!= null) {
		//INSERE p DEPOIS INCREMENTA
		produtos[qtd] = p;
		qtd++;
	    }
	}
	
	public Produto remover() {
		if(qtd > 0) {
		// DIMINUI E DEPOIS IBTIVE
		return  produtos[--qtd];
		}
		return null;
	}
	
	public double calcularValorTotal() {
		double soma= 0;
		for(int i=0;i<qtd;i++) {
			soma = soma + produtos[i].getPreco();		
		} 
		return soma;
	}
	
	//.equals() o mesmo que ==.
	public int buscarProdutoPeloNome(String s) {
		for (int i=0;i< qtd;i++) {
			if (produtos[i].getNome().equals(s)) {
				return i;
			}
		}
		return -1;
			
	}
}
