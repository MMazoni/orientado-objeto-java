package simulado.ex2;

public class Teste {
    public static void main(String[] args) {
        Comando c = new Comando(3,Acao.DECREMENTAR);
        c.mostrar();
        System.out.println(c.getValor());
        c.fazerAcao(Acao.INCREMENTAR);
        System.out.println(c.getAcao());
        System.out.println(c.getValor());
        c.fazerAcao(Acao.ZERAR);
        c.mostrar();

    }
}
