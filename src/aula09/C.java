package aula09;

public interface C extends A{
	default void metodo() {
		System.out.println("METODO DE C");
	}
}
