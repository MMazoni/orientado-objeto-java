package lista01.ex2;

public class Teste {

	public static void main(String[] args) {
		Lampada p = new Lampada();
		p.acender();
		p.mostrar();
		p.apagar();
		p.mostrar();
		
		for (int i = 0; i < 50; i++) {
			p.acender();
			p.apagar();
		}
		
		p.mostrar();

	}

}
