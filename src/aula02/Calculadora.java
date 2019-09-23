package aula02;

public class Calculadora{
    double n1,n2;	
	//return necessário para método sem void 	
	public double soma(){
			return n1+n2;
	}
	public double subtracao(){
		return n1-n2;
	}
	public double multiplicacao(){
		return n1*n2;
	}
	public double divisao(){
		if (n2!=0)
			return n1/n2;
		else{
			System.out.println("Não é possível dividir por zero");
			return Double.NaN;
		}
    }
 }
