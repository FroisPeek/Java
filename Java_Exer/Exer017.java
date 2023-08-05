package application;
import java.util.Scanner;

public class Exer017 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de minutos: ");
		int minutos = sc.nextInt();
		
		if (minutos <= 100) {
			System.out.printf("Valor a pagar: 50,00");
		}
		else if (minutos > 100) {
			int valor = minutos - 100;
			int multa = valor * 2;
			System.out.printf("Valor a pagar: %d", 50 + multa);
		}
		
		sc.close();
	}
}
