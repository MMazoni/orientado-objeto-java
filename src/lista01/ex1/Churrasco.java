package lista01.ex1;

class Churrasco {
	
	double qtdCarne;
	
	public Churrasco(double qtdCarne) {
		this.qtdCarne = qtdCarne;
	}

	void verificarConsumo(Pessoa people) {
		if (people.idade >= 0 && people.idade < 4 || people.vegetariana==true) {
			System.out.println(people.nome + " não consome carne!");
		}
		else if (people.idade > 3 && people.idade < 13) {
			System.out.println(people.nome + " consome 1kg de carne em média");
		}
		else if (people.idade > 12) {
			System.out.println(people.nome + " consome 2kg de carne em média");
		}
	}
}