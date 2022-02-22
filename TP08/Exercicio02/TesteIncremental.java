package Exercicio02;

public class TesteIncremental extends Incremental {

    public static void main (String[] args) throws Exception {

        for(int i = 0; i < 10; i++) {
            Incremental inc = Incremental.GetInstance();
            System.out.println(inc);
        }
    }
}
