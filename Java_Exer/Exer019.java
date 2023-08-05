package application;
import java.util.Scanner;

public class Exer019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a medida da glicose: ");
		double glicose = sc.nextDouble();
		
		if (glicose <= 100) {
			System.out.println("Classificacao: normal");
		} else if (glicose <= 140) {
			System.out.println("Classificacao: elevado");
		} else if (glicose > 140) {
			System.out.println("Classicacao: diabetes");
		}
		
		sc.close();
	}

}
