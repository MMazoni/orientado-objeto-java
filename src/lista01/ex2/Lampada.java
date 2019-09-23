package lista01.ex2;

public class Lampada {
	private Estado estado = Estado.DESLIGADO;
	private int qntUso;
	
	public void acender() {
		if (estado != Estado.LIGADO && qntUso < 50) {
			estado = Estado.LIGADO;
			qntUso++;
		} else if (qntUso == 50) {
			estado = Estado.QUEBRADO;
		}
	}
	
	public void apagar() {
		if (estado != Estado.DESLIGADO && qntUso < 50) {
			estado = Estado.DESLIGADO;
		}
	}
	
	public void mostrar() {
		switch(estado) {
			case LIGADO:
				System.out.println("A lampada esta ligada!");
				break;
			case DESLIGADO:
				System.out.println("A lampada esta desligada!");
				break;
			case QUEBRADO:
				System.out.println("A lampada esta quebrada!");
			
		}
	}
		
	
	
}
