package Exercicio07;

public class Main {
	
	public static void main(String[] args) {

		Cliente cliente = new Cliente(new Adaptador());
		System.out.println("----------------");
		cliente.executar();
		System.out.println("----------------");
	}
}
