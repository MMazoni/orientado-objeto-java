package lista01.ex3;

public class Complexo {
	
	double a; //numero real
	double b; //numero imaginario
	
	public Complexo(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public void soma(double c, double d) {
		this.a += c;
		this.b += d;
	}
	
	public void multiplica(double c, double d) {
		this.a = (this.a * c) - (this.b * d);
		this.b = (this.a * d) + (this.b * c);
	}
	
	public void paraString(double a, double b) {
		System.out.println(a + " + " + b + "i");
	}
	
	public double modulo(double c, double d) {
		double resultado = Math.sqrt(Math.pow(c, 2) + Math.pow(d, 2));
		return resultado;
	}
	
	public double argumentoPrincipal(double c, double d) {
		double resultado = Math.atan((c/d));
		return resultado;
	}
}
