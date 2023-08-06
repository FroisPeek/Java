package application;
import java.util.Scanner;

public class Exer028 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = 0, ct = 0, soma = 0;
		
		System.out.println("Digite as idades: ");
		idade = sc.nextInt();
		
		if (idade < 0) {
			System.out.println("Impossivel de calcular!");
		} else {
			while (idade > 0) {
			ct += 1;
			soma += idade;
			idade = sc.nextInt();
			}
			
			double media = (double)soma / ct;
			System.out.printf("Media = %.2f", media);
		}
				
		sc.close();
	}
}
