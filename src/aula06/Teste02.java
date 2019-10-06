package aula06;

public class Teste02 {

	public static void main(String[] args) {
		Disciplina d1 = new Disciplina("Java", "Garcia");
		Disciplina d2 = new Disciplina("Cobol", "Guto");
		Aluno a1 = new Aluno("HENRIQUE", "0050481811025");
		Aluno a2 = new Aluno("PAULA", "528938535389235");
		Aluno a3 = new Aluno("JBLO", "32657059532990");
		Matricula m = new Matricula();
		m.matricular(a1, d1);
		m.matricular(a2, d1);
		m.matricular(a3, d1);
		m.listarAlunosPorDisc(d1);

	}

}
