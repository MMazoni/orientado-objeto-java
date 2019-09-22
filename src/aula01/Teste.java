package aula01;

class Teste {
	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.raça = "SRD";
		c.nome = "Rex";
		c.latir();
		c.mostrarRaça();
		Cachorro d = new Cachorro();
		d.nome = "Benji";
		d.raça = "Pitbull";
		d.latir();
		d.mostrarRaça();
	}
}