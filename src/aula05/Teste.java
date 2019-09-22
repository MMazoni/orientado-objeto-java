package aula05;


public class Teste {
		public static void main(String[] args) {
			Produto p1 = new Produto("LAPIS",5);
			Produto p2 = new Produto("CADERNO",13);
			Produto p3 = new Produto("BORRACHA",1.5);
			Produto p4 = new Produto("CANETA",850);
			Carrinho c = new Carrinho(10);
			c.adicionar(p1);
			c.adicionar(p2);
			c.adicionar(p3);
			c.adicionar(p4);
			System.out.println(c.calcularValorTotal());
			int i = c.buscarProdutoPeloNome("LAPIS");
			System.out.println(i);
		}
		
}
