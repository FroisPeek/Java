package application;
import java.util.Scanner;

public class Exer024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario da pessoa: ");
		double salario = sc.nextDouble();
		
		if(salario <= 1000) {
			double aumento = (salario / 100) * 20;
			System.out.printf("Novo salario: %.2f", salario + aumento );
			System.out.printf("\nAumento: %.2f", aumento);
			System.out.printf("\nPorcentagem = 20%%");
			
		} else if(salario <= 3000) {
			double aumento = (salario / 100) * 15;
			System.out.printf("Novo salario: %.2f", salario + aumento );
			System.out.printf("\nAumento: %.2f", aumento);
			System.out.printf("\nPorcentagem = 15%%");
		} else if(salario <= 8000) {
			double aumento = (salario / 100) * 10;
			System.out.printf("Novo salario: %.2f", salario + aumento );
			System.out.printf("\nAumento: %.2f", aumento);
			System.out.printf("\nPorcentagem = 10%%");
		} else if(salario > 8000) {
			double aumento = (salario / 100) * 5;
			System.out.printf("Novo salario: %.2f", salario + aumento );
			System.out.printf("\nAumento: %.2f", aumento);
			System.out.printf("\nPorcentagem = 5%%");
		}
		
		sc.close();
	}
}
