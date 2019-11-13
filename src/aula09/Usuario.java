package aula09;

public abstract class Usuario {
	
	private String dtAcesso;
	
	public Usuario(String dtAcesso) {
		this.dtAcesso = dtAcesso;
	}
	//O OVERRIDE SOH OCORRE NA CLASSE CONVIDADO.
	//RESPOSTA PARA 1 -> N. M�TODO CONCRETO.+-
	public void principal() {
		System.out.println("PAGINA PRINCIPAL " + getDtAcesso());
	}
	//O OVERRIDE SOH OCORRE NA CLASSE ROOT.
	//RESPOSTA PARA 1 -> N. M�TODO CONCRETO.+-
	public void painel() {
		System.out.println("PAINEL PROIBIDO - 403");
	}
	//RESPOSTA PARA 1: SIM.
	//TEM SENTIDO ESSE M�TODO AQUI? 2: N
	//A CLASSE TEM ATRIBUTO? S => M�TODO ABSTRATO
	//E A CLASSE Usuario EH ABSTRATA
	public abstract void cadastro();

	public String getDtAcesso() {
		return dtAcesso;
	}
	
}
