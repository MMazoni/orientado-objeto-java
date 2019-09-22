package aula03;


public class Aluno {

		String nome;
		Curso curso;
		
		void mostrarDados(){
			System.out.println("Nome:" + nome);
			System.out.println("Curso:" + curso);
		}
		
		void mostrarCurso() {
			switch(curso) {
				case ADS:
					System.out.println("CURSO DE COBOL");
					break;
				case SI:
					System.out.println("CURSO DE DESIGNER");
					break;
				case LOG:
					System.out.println("CURSO DE CAMINHONEIRO");
					break;
				case GP:
					System.out.println("CURSO DE NAVIO");
					break;
				default:
					System.out.println("Curso inexistente!");
					break;
			}
		}

}

