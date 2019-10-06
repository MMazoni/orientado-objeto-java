package aula06;

public class Teste {

	public static void main(String[] args) {
		Foo f = new Foo();
		f.adicionar("ABC", 5);
		f.adicionar("FATEC", 6);
		f.adicionar("D", 9);
		System.out.println(f.obter("FATEC"));
		f.listar();

	}

}
