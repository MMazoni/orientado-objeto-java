package lista01.ex5;

import java.util.Random;

public class Adivinhacao {
	Random rand = new Random();
	private int certo = rand.nextInt(99);
	
	
	public void chutar(int chute) {
		if(chute > 99 || chute < 0) {
			System.out.println("Por favor, chute entre 0 e 99!");
			return;
		}
		if (chute > certo) {
			System.out.println("Seu chute é maior que o número correto!");
		} else if (chute < certo) {
			System.out.println("Seu chute é menor que o número correto!");
		} else {
			System.out.println("Parabéns! Você acertou o número.");
		}
		
	}
}
