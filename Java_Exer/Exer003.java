package application;
import java.util.Scanner;

public class Exer003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		int x = sc.nextInt();
		System.out.println("Informe o segundo valor: ");
		int y = sc.nextInt();
		
		System.out.printf("A soma dos valores: %d", y+x);
		
		sc.close();
	}

}
