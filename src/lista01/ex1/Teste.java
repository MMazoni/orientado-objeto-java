package lista01.ex1;

class Teste {
	public static void main(String[] args) {
		Pessoa people = new Pessoa("Matheus", "masculino", 21, false);
		Churrasco meat = new Churrasco(10.0);
		System.out.println("Há " + meat.qtdCarne + " kg de carne para o churrasco");
		meat.verificarConsumo(people);
		
	}
}