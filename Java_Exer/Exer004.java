package application;

import java.util.Scanner;

public class Exer004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		double valor = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = valor * area;
		
		System.out.printf("\nArea do terreno: %.2f", area);
		System.out.printf("\nPreco do terreno: %.2f", preco);
		
		sc.close();
	}
}
