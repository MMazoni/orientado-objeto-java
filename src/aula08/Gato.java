
package aula08;

public class Gato extends Animal{

	public Gato(String nome) {
		super(nome);
	}

	public void miar() {
		System.out.println("MIOU");
	}
	
	public void arranhar() {
		System.out.println("ARRANHOU..");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("MIAUUU");
	}
	
	@Override
	public void verificar() {
		System.out.println("EH GATO");
	}
}
