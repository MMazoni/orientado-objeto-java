
package aula08;

public class Cachorro extends Animal{
	
	private String raca;
	
	public Cachorro(String nome, String raca) {
		super(nome);
		this.raca = raca;
	}
	
	@Override
	public void emitirSom() {
		System.out.println(super.nome + ": AU AU");
	}
	
	public void cavar() {
		System.out.println("CAVOU...");
	}

	public String getRaca() {
		return raca;
	}
	
	@Override
	public void verificar() {
		System.out.println("EH CACHORRO");
	}
}
