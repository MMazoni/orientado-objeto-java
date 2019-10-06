package lista01.ex3;

public class Teste {

	public static void main(String[] args) {
		
		Complexo c = new Complexo(10, 6);
		c.paraString(c.a, c.b);
		
		//soma
		c.soma(3.5, 8);
		c.paraString(c.a, c.b);
		
		//multiplica
		c.multiplica(2, 1.7);
		c.paraString(c.a, c.b);
		
		//modulo
		System.out.println(c.modulo(3, 5));
		
		//argumentoPrincipal
		System.out.println(c.argumentoPrincipal(1.5, 2));

	}

}
