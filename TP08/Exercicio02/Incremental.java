package Exercicio02;

public class Incremental {

    private static Incremental instancia = null;

    private static int count = 0;
    private int numero;

    public Incremental(){
        numero = count++;
    }

    public static Incremental GetInstance() {
        if(instancia == null) {
            instancia = new Incremental();
        }
        return instancia;
    }

    public String toString() {
        return "Incremental " + count;
    }
}
