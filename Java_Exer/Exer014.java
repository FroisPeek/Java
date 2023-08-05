package application;
import java.util.Scanner;

public class Exer014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = nota1 + nota2;
		
		if (media >= 60) {
			System.out.printf("Nota final: %.1f", media);
		} else {
			System.out.printf("Nota final: %.1f", media);
			System.out.print("\nREPROVADO!");
		}
		
		sc.close();
	}
}
