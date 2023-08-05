package application;
import java.util.Scanner;

public class Exer007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor de X: ");
		int x = sc.nextInt();
		System.out.println("Digite o valor de Y: ");
		int y = sc.nextInt();
		
		System.out.printf("Soma: %d", y+x);		
		sc.close();
	}
}
