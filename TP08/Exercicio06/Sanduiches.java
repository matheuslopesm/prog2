package Exercicio06;

public class Sanduiches {

    private String pao;
    private String queijo;
    private String presunto;
    private String salada;

    protected Sanduiches(String pao, String queijo, String presunto, String salada) {
        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.salada = salada;
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }


    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public String getPresunto() {
        return presunto;
    }

    public void setPresunto(String presunto) {
        this.presunto = presunto;
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public String toString() {
        return "[ Pão: " + this.pao + " | Queijo: " + this.queijo + " | Presunto: " + this.presunto + " | Salada: " + this.salada + " ]";
    }
}

