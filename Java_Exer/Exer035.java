package application;
import java.util.Scanner;

public class Exer035 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x, i;
			System.out.println("Digite o valor de x: ");
			x = sc.nextInt();
			for (i = 0; i <= x; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
			
			sc.close();
		}
	}
}
