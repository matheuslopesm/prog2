package Exercicio01;

public class MetodoSingleton {

    private static MetodoSingleton instancia = null;

    private String nome;
    private String pais;
    private String idade;

    private MetodoSingleton(){
    }

    public static MetodoSingleton GetInstance() {
        if(instancia == null) {
            instancia = new MetodoSingleton();
        }
        return instancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String toString() {
        return "[ Nome: " + this.nome + " | Idade: " + this.idade + " | País: " + this.pais + " ]";
    }
}
