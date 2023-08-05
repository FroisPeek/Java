package application;

import java.util.Scanner;

public class Exer020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as tres distancias: ");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		double d3 = sc.nextDouble();
		
		if (d1 > d2 && d1 > d3) {
			System.out.printf("MAIOR DISTANCIA = %f", d1);
		} else if (d2 > d1 && d2 > d3) {
			System.out.printf("MAIOR DISTANCIA = %f", d2);
		} else if (d3 > d1 && d3 > d2) {
			System.out.printf("MAIOR DISTANCIA = %.2f", d3);
		} else {
			System.out.println("Algum dos valores sao iguais!");
		}
		
		sc.close();
	}

}
