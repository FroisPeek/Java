package application;
import java.util.Scanner;

public class Exer034 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int i, num1, num2, ct = 0;
			
			System.out.println("Digite dois numeros: ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			if (num1 < num2) {
				for(i = num1; i < num2; i++) {
					System.out.print(i);
					if(i % 2 != 0) {
						ct += i;
					}
				}
				System.out.printf("\nA soma dos impares: %d", ct);
				
			} else if (num1 > num2) {
				for(i = num1; i > num2; i--) {
					System.out.print(i);
					if(i % 2 != 0) {
						ct += i;
					}
				}
				System.out.printf("\nA soma dos impares: %d", ct);
			}
	
			sc.close();
		}
	}
}