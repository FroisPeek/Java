package application;
import java.util.Scanner;

public class Exer018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preco unitario do produto: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		double quantidade = sc.nextDouble();
		System.out.print("Dinheiro recebido: ");
		double recebido = sc.nextDouble();
		
		double precoTotal = preco * quantidade;
		
		if (recebido > precoTotal) {
			System.out.printf("Troco = %.2f", recebido - precoTotal);
		} 
		else {
			System.out.printf("Dinheiro insuficiente, faltam %.2f", precoTotal - recebido);
		}
		
		sc.close();
	}

}
