package pacote;
import java.util.Scanner;

public class Exer038 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Informar um saldo e imprimir o saldo com reajuste de 1%.
		
		System.out.println("Informe um saldo para o reajuste de 1%: ");
		double saldo = sc.nextDouble();
		double reajuste = saldo/ 100;
		System.out.printf("Novo saldo = %.2f", saldo + reajuste);
		
		sc.close();
	}

}
