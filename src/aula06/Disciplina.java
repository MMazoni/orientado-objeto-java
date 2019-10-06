package aula06;

public class Disciplina {
	//Professor seria outra classe
	private String nome, prof;

	public Disciplina(String nome, String prof) {
		this.nome = nome;
		this.prof = prof;
	}
	
	public void mostrar() {
		System.out.println("Nome " + nome + ", Prof: " + prof);
	}
}
