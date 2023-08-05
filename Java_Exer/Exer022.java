package application;
import java.util.Scanner;


public class Exer022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor = 0;
		
		System.out.print("Codigo do produto comprado: ");
		int codg = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		int quant = sc.nextInt();
		
		switch (codg) {
		case 1: 
			valor = 5 * quant;
			System.out.printf("Valor a pagar: %.2f", valor);
			break;
		case 2: 
			valor = 3.5 * quant;
			System.out.printf("Valor a pagar: %.2f", valor);
			break;
		case 3: 
			valor = 4.8 * quant;
			System.out.printf("Valor a pagar: %.2f", valor);
			break; 
		case 4: 
			valor = 8.9 * quant;
			System.out.printf("Valor a pagar: %.2f", valor);
			break;
		case 5: 
			valor = 7.32 * quant;
			System.out.printf("Valor a pagar: %.2f", valor);
			break;
		}
		
		
		sc.close();
	}
}
