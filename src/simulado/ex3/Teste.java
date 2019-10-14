package simulado.ex3;

import simulado.ex2.Acao;
import simulado.ex2.Comando;

public class Teste {

    public static void main(String[] args) {
        Comando c = new Comando(2, Acao.INCREMENTAR);
        Comando d = new Comando(4, Acao.INCREMENTAR);
        Comando e = new Comando(1, Acao.DECREMENTAR);
        Comando f = new Comando(8, Acao.DECREMENTAR);
        Comando g = new Comando(5, Acao.INCREMENTAR);
        Comando h = new Comando(12, Acao.INCREMENTAR);

        Processador pro = new Processador();
        pro.inserirComandos(c);
        pro.inserirComandos(d);
        pro.inserirComandos(e);
        pro.inserirComandos(f);
        pro.inserirComandos(g);
        pro.inserirComandos(h);
        pro.listarComandos();
        System.out.println(pro.executar(10));
    }
}
