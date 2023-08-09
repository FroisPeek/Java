package contaBancaria;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria c1 = new ContaBancaria();
		c1.agencia = "45-789";
		c1.conta = "567.000-3";
		c1.nBanco = "45-3";
		c1.saldo = 16890.00;
		
		System.out.println(c1.conta);
		c1.entrarConta(1);
		
		System.out.println("------------------------------");
		
		ContaBancaria c2 = new ContaBancaria();
		
		System.out.println("[1] para entrar ou [0] para sair: ");
		c2.entrarConta(sc.nextInt());
		
		System.out.print("Informe a agencia: ");
		c2.agencia = sc.next();
		System.out.print("Informe a conta: ");
		c2.conta = sc.next();
		System.out.print("Informe o numero do banco: ");
		c2.nBanco = sc.next();
		System.out.print("Informe o saldo: ");
		c2.saldo = sc.nextDouble();
		
		
		
		sc.close();
	}

}
