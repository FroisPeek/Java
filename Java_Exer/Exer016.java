package application;
import java.util.Scanner;

public class Exer016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeiro valor: ");
		int x1 = sc.nextInt();
		System.out.print("Segundo valor: ");
		int x2 = sc.nextInt();
		System.out.print("Terceiro valor: ");
		int x3 = sc.nextInt();
		
		if (x1 < x2 && x1 < x3) {
			System.out.printf("Menor: %d", x1);
		}
		else if(x2 < x1 && x2 < x3) {
			System.out.printf("Menor: %d", x2);
		}
		else if(x3 < x1 && x3 < x2) {
			System.out.printf("Menor: %d", x3);
		} else {
			System.out.println("Algum dos valores sao iguais!");
		}
		
		sc.close();
	}

}
