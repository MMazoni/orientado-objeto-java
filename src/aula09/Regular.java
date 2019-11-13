package aula09;

public class Regular extends Usuario{

	public Regular(String dtAcesso) {
		super(dtAcesso);
	}
	
	@Override
	public void cadastro() {
		System.out.println("REDIRECIONA PARA LOGIN");
	}
	
	@Override
	public void painel() {
		System.out.println("PAINEL PROIBIDO - 403");
	}
	
	public void perfil() {
		System.out.println("PAGINA DE PERFIL");
	}

}
