package Repetição;
import java.util.Scanner;

public class Exer40 {
	public static void main(String[] args) {
		// proposta de exercicio: 
		// Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o 
		// fatorial de N. 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de N: ");
		int n = sc.nextInt();
		if (n == 0) { // verificar se o valor inserido vai ser 0, pois fatorial de 0 é 1
			System.out.println("Fatorial: 0");
		} else {
			int fatorial = 1; 
			for (int i = n; i >= 1; i--) { // estrutura de repeticao for que ir passar do valor informado ate o 1
				fatorial *= i; // vai adicionar multiplicando os valores em um contador
			}
			System.out.print("Fatorial: "+ fatorial);
		}
		
		sc.close();
	}
}