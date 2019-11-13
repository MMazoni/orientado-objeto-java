package aula09;

public interface SerVivo {
	//METODOS DEFAULT NAO SOBRESCREVEM
	//METODOS ABSTRATOS SERVEM APENAS P/ SOBRESCRITA
	default void respirar() {
		System.out.println("UNFFFFFF");
	}
}
