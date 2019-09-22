package aula01;

class Churrasco {
	public static void main(String[] args) {
		Pessoa people = new Pessoa("Matheus", "masculino", 21, false);

		
		// Consumação média de carne/dia
		
		if (people.idade >= 0 && people.idade < 4 || people.vegetariana==true) {
			System.out.println("Não consome carne!");
		}
		else if (people.idade > 3 && people.idade < 13) {
			System.out.println("Consome 1kg de carne por dia.");
		}
		else if (people.idade > 12) {
			System.out.println("Consome 2kg de carne por dia");
		}
	}
}