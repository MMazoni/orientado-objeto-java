package aula01;

class Teste {
	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.raca = "SRD";
		c.nome = "Rex";
		c.latir();
		c.mostrarRaca();
		Cachorro d = new Cachorro();
		d.nome = "Benji";
		d.raca = "Pitbull";
		d.latir();
		d.mostrarRaca();
	}
}