package aula09;

public class Root extends Usuario {

	public Root(String dtAcesso) {
		super(dtAcesso);
	}
	
	@Override
	public void cadastro() {
		System.out.println("REDIRECIONA PARA LOGIN DO ROOT");
	}
	
	@Override
	public void painel() {
		System.out.println("PAINEL OK - 200");
	}
	
	public void banir() {
		System.out.println("BANIR USUARIOS");
	}

}
