package Exercicio02.principal;

public class Gerente extends Empregado {

    private static final double salario = 0;
    private String nomeGerencia;

    public Gerente(String nome, int idade, String matricula, String nomeGerencia, double salario) {
        super(nome, idade, matricula, salario);
        this.nomeGerencia = nomeGerencia;
    }

    public Gerente(String nome, int idade, String matricula) {
        super(nome, idade, matricula, salario);
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    public String toString() {
        return "Gerente [Nome: " + getNome() + ", Idade: " + getIdade() + ", Matricula: " + getMatricula() +
                ", Nome gerencia: " + nomeGerencia + ", Valor Inss: " + getValorInss() + " ]";
    }
}