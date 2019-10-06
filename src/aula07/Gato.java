package aula07;

public class Gato extends Animal{
	
	public Gato(String nome, int idade) {
		super(nome, idade);
	}

	public void arranhar() {
		System.out.println("zararapo");
	}
	
	public void miar() {
		System.out.println("miau");
	}
}
