package aula09;

public class Convidado extends Usuario{

	public Convidado(String dtAcesso) {
		super(dtAcesso);
	}
	
	@Override
	public void principal() {
		System.out.println("PAGINA PRINCIPAL COM PEDIDO CADASTRO");
	}
	
	@Override
	public void cadastro() {
		System.out.println("PAGINA DE CADASTRO DE USUARIO");
	}
	
	@Override
	public void painel() {
		System.out.println("PAINEL PROIBIDO - 403");
	}
	
}
