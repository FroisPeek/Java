package application;
import java.util.Scanner;

public class Exer033 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, resultado;
		
		System.out.print("Deseja a tabuada para qual valor: ");
		n = sc.nextInt();
		
		
		for (i = 1; i < 11; i++) {
			resultado = n * i;
			System.out.printf("%d x %d = %d\n", n, i, resultado);
		}
		
		sc.close();
	}
}