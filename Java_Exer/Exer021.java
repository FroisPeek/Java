package application;

import java.util.Scanner;

public class Exer021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Voce vai digitar a temperatura em qual escala (C/F)? ");
		char temp = sc.next().charAt(0);
		
		if(temp == 'F' || temp == 'f') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			double f = sc.nextDouble();
			double celsius = (f - 32) / 1.8;
			System.out.printf("Temperatura equivalente em Celsius: %.2f", celsius);
			
		} else if(temp == 'C' || temp == 'c') {
			System.out.println("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double fahr = c * 1.8 + 32;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", fahr);
		} else {
			System.out.println("Opcao invalida!");
		}
		
		sc.close();
	}
}
