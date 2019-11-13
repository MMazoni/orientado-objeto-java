package aula09;

public class Teste {

	public static void main(String[] args) {
		Animal a = new Cachorro();
		a.dormir();
		a.emitirSom();
		/**Usuario u = new Regular("11/11/2019");
		u.painel();
		u.principal();
		u.cadastro();
		//DOWNCAST -> RECUPERA UMA REFERENCIA A UM OBJETO
		//O OBJETO DEVE SER O MESMO (OU SUPERIOR).
		Regular r = (Regular) u;
		r.perfil();
		System.out.println(r);
		System.out.println(u);
		//UPCAST -> DEIXA A REFERENCIA MAIS ABSTRATA
		Convidado c = new Convidado("5/11/2019");
		Usuario v = (Usuario) c;
		v.cadastro();
		v.painel();
		v.principal();
		//NAO -> Usuario w = new Usuario("01/01/2020");
		***/
	}

}
