package aula09;

//TODOS OS METODOS DE UMA INTERFACE SAO PUBLICOS.
//SE NAO DEFAULT, NEM ESTATICO, ELE EH AUTOMATICAMENTE ABSTRATO!

//INTERFACE EXTENDS INTERFACE
//CLASSE EXTENDS CLASSE
//CLASSE IMPLEMENTS INTERFACE
public interface Animal extends SerVivo{
	void emitirSom();
	
	default void dormir() {
		System.out.println("ZZZZz....");
	}
}
