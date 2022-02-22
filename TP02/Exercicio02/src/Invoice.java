package Exercicio02.src;

public class Invoice {

    private int num;
    private String desc;
    private int quant;
    private double preco;

    public Invoice (int qtd, double valor) {

        if(qtd > 0) {
            quant = qtd;
        }else{
            quant = 0;
        }

        if(valor > 0.0) {
            preco = (int) valor;
        }
        else{
            preco = (int) 0.0;
        }
    }

    public void setNum(int num) {

        this.num = num;
    }

    public int getNum() {

        return num;
    }
    //---------------------------------------
    public void setDesc(String desc) {

        this.desc = desc;
    }

    public String getDesc() {

        return desc;
    }
    //---------------------------------------
    public void setQuant(int quant) {

        this.quant = quant;
    }

    public int getQuant() {

        return quant;
    }
    //---------------------------------------
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    //---------------------------------------
    public double getInvoiceAmount (){
        double total = this.quant * this.preco;
        return total;
    }
}
