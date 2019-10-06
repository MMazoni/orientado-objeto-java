package aula06;

import java.util.HashMap;
import java.util.Map.Entry;

public class Foo {
	private HashMap<String, Integer> hm;
	
	public Foo() {
		hm = new HashMap<String, Integer>();
	}
	
	public void adicionar(String ix, Integer v) {
		hm.put(ix, v);
	}
	
	public Integer obter(String ix) {
		return hm.get(ix);
	}
	
	public void listar() {
		for(Entry<String, Integer> registro : hm.entrySet()) {
			System.out.println("Chave: " + registro.getKey() + ", Valor: " + registro.getValue());			
		}
	}
}
