package application;
import java.util.Scanner;

public class Exercicio002 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Informe o valor de x: ");
		int x = sc.nextInt();
		System.out.println("O valor informado foi: "+ x);
			
		sc.close();
	}
}
