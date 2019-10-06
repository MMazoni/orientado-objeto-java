package lista01.ex6;

import javax.naming.NameNotFoundException;

public class Eq2Grau {
    private double a;
    private double b;
    private double c;

    public Eq2Grau(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("O 'a' não pode ser 0!");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double delta() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double raiz1(){
        double delta = delta();
        if (delta >= 0) {
            return (- b + Math.sqrt(delta)) / 2 * a;
        } else {
            return 0 / 0;
        }
    }

    public double raiz2() {
        double delta = delta();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / 2 * a;
        } else {
            return 0 / 0;
        }
    }
}
