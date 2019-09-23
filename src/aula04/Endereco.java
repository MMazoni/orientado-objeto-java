
package aula04;


public class Endereco {
	private String logradouro, cidade, cep;
	private Estado estado;
	public Endereco(String logradouro, String cidade, String cep, Estado estado) {
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.cep = cep;
		this.estado = estado;
	}
	
	public void mostrarDados() {
		System.out.println("LOG: " + logradouro);
		System.out.println("CIDADE: " + cidade);
		System.out.println("CEP: " + cep);
		System.out.println("ESTADO: " + estado);
	}
	
	
}
