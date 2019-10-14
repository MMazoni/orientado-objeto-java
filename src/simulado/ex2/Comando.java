package simulado.ex2;


public class Comando {
    private int valor;
    private Acao acao;

    public Comando (int valor, Acao acao){
        this.valor = valor;
        this.acao = acao;
    }

    public Acao fazerAcao(Acao acao){
        switch (acao) {
            case ZERAR:
                this.valor = 0;
                break;
            case INCREMENTAR:
                this.valor++;
                break;
            case DECREMENTAR:
                this.valor--;
                break;
        }
        return acao;
    }


    public void mostrar(){
        System.out.println("Valor: " + valor + " - Acao: " + acao);
    }

    public Acao getAcao() {
        return acao;
    }

    public int getValor() {
        return valor;
    }
}
