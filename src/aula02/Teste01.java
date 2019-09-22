package aula02;

public class Teste01{
		public static void main(String[] args){
		Calculadora c = new Calculadora();
		System.out.println(c.soma()); // 0
		c.n1 = 7;
		c.n2 =10;
		System.out.println(c.soma());  //7
		c.n2=0;
		System.out.println(c.divisao());//NaN
		
    	}
}