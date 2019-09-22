package aula04;


public class Pessoa {
	private String nome;
	private Endereco endereco;
	public Pessoa(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public void mostrarDados() {
		System.out.println("NOME: " + nome);
		if(endereco != null) {
			endereco.mostrarDados();
		}
		else {
			System.out.println("HOMELESS");
		}
		System.out.println("-----------------");
	}
}
