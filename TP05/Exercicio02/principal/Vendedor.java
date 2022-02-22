package Exercicio02.principal;

public class Vendedor extends Empregado{

    private double valorVendas;
    private int qntVendas;

    public Vendedor(String nome, double salario, double valorVendas, int qntVendas) {
        super(nome, qntVendas, nome, salario);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }

    public Vendedor(String nome, int salario) {
        super(nome, salario);

    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double ValorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    public String toString() {
        return "Vendedor [Nome: " + getNome() + ", Salario: " + getSalario() + ", Valor vendas: " + getValorVendas() +
                ", Quantidade de vendas: " + qntVendas + " ]";
    }
}
