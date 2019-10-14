package simulado.ex4;

import simulado.ex2.Acao;
import simulado.ex2.Comando;
import simulado.ex3.Processador;

public class Teste {

    public static void main(String[] args) {
        Comando c1 = new Comando(7, Acao.INCREMENTAR);
        Comando c2 = new Comando(3, Acao.DECREMENTAR);
        Comando c3 = new Comando(1, Acao.ZERAR);
        Comando c4 = new Comando(5, Acao.INCREMENTAR);
        Comando c5 = new Comando(2, Acao.DECREMENTAR);

        Processador pro = new Processador();
        pro.inserirComandos(c1);
        pro.inserirComandos(c2);
        pro.inserirComandos(c3);
        pro.inserirComandos(c4);
        pro.inserirComandos(c5);
        pro.listarComandos();
        System.out.println(pro.executar(0));
    }
}
