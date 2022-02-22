package Exercicio02;

public class Empregado {

    private String nome;
    private String cargo;
    private double salario;

    public Empregado(String nome, String cargo, double salario) {
        super();
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    //-------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //-------------------------------------
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    //-------------------------------------
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    //-------------------------------------
    public String toString() {
        return "[ Nome: " + getNome() + " | Cargo: " + getCargo() + " | Salario: " + getSalario() + " ]";
    }
    //-------------------------------------
}
