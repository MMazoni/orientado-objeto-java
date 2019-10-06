package lista01.ex4;

public class TrianguloEquilatero {
	private double lado;
	private double area;
	private double perimetro;

	public TrianguloEquilatero(double lado) {
		this.lado = lado;
	}
	
	public void calcArea() {
		area = lado * (Math.sqrt(3)/2); 
	}
	
	public void calcPerimetro() {
		perimetro = lado * 3;
	}
	
	public double getArea() {
		return area;
	}
	
	public double getPerimetro() {
		return perimetro;
	}
	
	
	
	
}
