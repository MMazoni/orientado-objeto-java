package aula08;

public class Animal {

	protected String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}

	public void dormir() {
		System.out.println("ZZZ");
	}
	
	public void comer() {
		System.out.println("COMER...");
	}
	
	public void emitirSom() {
		System.out.println("SOM GENERICO");
	}
	
	public void verificar() {
		System.out.println("EH GENERICO");
	}
	
}
