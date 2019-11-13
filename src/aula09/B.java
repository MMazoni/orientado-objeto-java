package aula09;

public interface B extends A{
	default void metodo() {
		System.out.println("Metodo B");
	}
}
