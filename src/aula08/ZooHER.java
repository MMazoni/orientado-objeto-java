
package aula08;

public class ZooHER {
	
	//USO DE DE POLIMORFISMO, POREM ERRADO
	//ESTE METODO ACEITARA: GATOS E CACHORROS
	public void verificarAnimal(Animal a) {
		if(a instanceof Cachorro) {
			System.out.println("EH UM CACHORRO");
		}else if(a instanceof Gato) {
			System.out.println("EH UM GATO");
		}
	}
	
}
