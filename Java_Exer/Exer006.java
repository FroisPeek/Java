package application;
import java.util.Scanner;

public class Exer006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dados da primeira pessoa: ");
		
		System.out.print("\nNome: ");
		String nome1 = sc.next();
		String sobrenome1 = sc.next();
		
		System.out.print("Idade: ");
		int idade1 = sc.nextInt();
		
		System.out.print("Dados da segunda pessoa: ");
		
		System.out.print("\nNome: ");
		String nome2 = sc.next();
		String sobrenome2 = sc.next();
		
		System.out.print("Idade: ");
		int idade2 = sc.nextInt();
		
		double media = (double)(idade1 + idade2)/2;
		
		System.out.printf("A idade media de %s %s e %s %s é de %.1f", nome1, sobrenome1, nome2, sobrenome2, media);
		
		sc.close();
	}

}
