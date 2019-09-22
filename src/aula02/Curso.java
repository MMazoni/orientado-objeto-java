package aula02;

public class Curso{
		Tipo nome;
		int	carga;
		public	void mostrar(){
		switch(nome){
			case ADS: System.out.println("Curso de Cobol");
				break;
			case SI: System.out.println("Curso de disigner");
				break;
			case LOG: System.out.println("Curso de container");
				break;
			case GP: System.out.println("Curso de navio");
				break;
			case GE: System.out.println("Curso de ADM");
				break;
			default: System.out.println("Não é curso.");
		}
	}	
	public void mostrarCarga(){
		System.out.println(carga);
	}
} 	