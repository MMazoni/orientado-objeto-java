package aula04;


public class Teste {
	public static void main(String[] args) {
		Endereco e = new Endereco("Rua: teste",
								  "11111-111",
								  "PRAIA GRANDE",
								  Estado.SP);
		Pessoa p = new Pessoa("Joao",e);
		p.mostrarDados();
		Pessoa q = new Pessoa("BUG",null);
		q.mostrarDados();
	}
}
