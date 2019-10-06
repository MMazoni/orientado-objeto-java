package aula06;

import java.util.ArrayList;
import java.util.HashMap;

public class Matricula {

	private HashMap<Disciplina, ArrayList<Aluno>> discAlu;
	private HashMap<Aluno, ArrayList<Disciplina>> aluDisc;
	
	public Matricula() {
		discAlu = new HashMap<Disciplina, ArrayList<Aluno>>();
		aluDisc = new HashMap<Aluno, ArrayList<Disciplina>>();
	}
	
	public void matricular(Aluno a, Disciplina d) {
		ArrayList<Aluno> alunos;
		if(discAlu.containsKey(d)) {
			alunos = discAlu.get(d);
			
		} else {
			alunos = new ArrayList<Aluno>();
		}
		alunos.add(a);
		discAlu.put(d,alunos);
		// controle de alunos
		ArrayList<Disciplina> discs;
		if (aluDisc.containsKey(a)) {
			discs = aluDisc.get(a);
		} else {
			discs = new ArrayList<Disciplina>();
		}
		discs.add(d);
		aluDisc.put(a, discs);
	}
	
	public void listarAlunosPorDisc(Disciplina d) {
		ArrayList<Aluno> alunos = discAlu.get(d);
		d.mostrar();
		for(Aluno aluno : alunos) {
			aluno.mostrar();
		}
	}
	//listar disciplina por alunos
}
