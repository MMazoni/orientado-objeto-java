package lista01.ex7;

public class Porta {
    private boolean isOpen = false;
    private int numAberturas;

    public void abrir(){
        if (!isOpen) {
            numAberturas++;
            isOpen = true;
        } else {
            System.out.println("A porta já está aberta!");
        }
    }

    public void fechar() {
        if (isOpen) {
            isOpen = false;
        } else {
            System.out.println("A porta já está fechada");
        }
    }
}
