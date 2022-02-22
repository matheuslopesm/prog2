package Exercicio02.principal;

public class Cliente extends Pessoa {

    private double valorDivida;
    private int anoNascimento;

    public Cliente(String nome, int idade, String sexo, double valorDivida, int anoNascimento) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }

    public Cliente(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public double getValorDivida(){
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String toString() {
        return "Cliente [Nome: " + getNome() + ", Idade: " + getIdade() + ", Sexo: " + getSexo() +
                ", Valor da Divida: " + valorDivida + ", Ano nascimento: " + anoNascimento + " ]";
    }


}