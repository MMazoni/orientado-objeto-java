package aula03;

public class Teste {

	public static void main(String[] args) {

		Aluno a = new Aluno();
		a.nome = "Ygor";
		a.curso = Curso.ADS;
		a.mostrarCurso();
		a.mostrarDados();
	}
}
