package Exercicio01.B;

public class Principal {

    private String nome;
    private String preco;
    private int codigo;
    private String Principal;

    public void escreveNaTela() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Preco: " + this.getPreco());
        System.out.println("Codigo: " + this.getCodigo());
    }
    //-------------------------------------------
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    //-------------------------------------------
    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    //-------------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //-------------------------------------------

    public boolean equals (Object prod) {
        Principal p = (Principal)prod;
        if(this.getCodigo() == p.getCodigo()) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.getCodigo();
    }
}
