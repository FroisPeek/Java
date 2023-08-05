package application;
import java.util.Scanner;

public class Exer008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preco unitario do produto: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		int quantidade = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		double recebido = sc.nextDouble();
		
		double total = preco * quantidade;
		double troco = recebido - total;
		
		System.out.printf("Troco: %.2f", troco);
		
		sc.close();
	}

}
