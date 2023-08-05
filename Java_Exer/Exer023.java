package application;
import java.util.Scanner;

public class Exer023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numero inteiros: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x % y == 0 || y % x == 0) {
			System.out.println("Sao multiplos.");
		} else {
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();
	}
}
