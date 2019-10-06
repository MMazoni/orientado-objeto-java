package aula07;

public class Animal {
	
	String nome;
	int idade;
	
	
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	
	public void dormir() {
		System.out.println("zZZZZzzzZZ");
	}
	public void comer() {
		System.out.println("YummiYummi");
	}
}
