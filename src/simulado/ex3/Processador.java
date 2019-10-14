package simulado.ex3;

import simulado.ex2.Comando;

import java.util.ArrayList;

public class Processador {
    private ArrayList<Comando> command;

    public Processador() {
        this.command = new ArrayList<Comando>();
    }

    public void inserirComandos(Comando command) {
        if(command != null) {
            this.command.add(command);
        } else {
            System.out.println("Comando não aceito!");
        }
    }

    public void listarComandos() {
        System.out.println("Lista de comandos: ");
        for (Comando i: command) {
            System.out.println(i.getAcao());
        }
    }

    public int executar(int x) {
        for (Comando i: command) {
            switch (i.getAcao()) {
                case ZERAR:
                    x = 0;
                    break;
                case DECREMENTAR:
                    x--;
                    break;
                case INCREMENTAR:
                    x++;
                    break;
            }
        }
        return x;
    }
}
