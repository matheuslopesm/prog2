package Exercicio06;

public class ContaExcecao<LimiteException> {

    public String nome;
    public double saldo;

    public double deposito(double qnt) {

        try {
            if(qnt > 0){
                qnt = qnt + saldo;
            }
        }catch(IllegalArgumentException e){
            System.out.println("Não é possível depositar esse valor.");
        }
        return qnt;
    }

    public boolean saca(double qnt) throws Exception {

        if(qnt > saldo) {
            LimiteException lim = (LimiteException) "Saldo insuficiente para realizar esse saque";
            throw (Exception) lim;
        }

        try {
            if(qnt > 0) {
                qnt = qnt - saldo;
            }
        }catch(IllegalArgumentException a){
            System.out.println("Não é possível sacar um número negativo.");
        }
        return true;
    }

    public void mostraSaldo() {
        System.out.println("Saldo na conta: " + getSaldo());
    }
//----------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
//----------------------------------------
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
//----------------------------------------
}
