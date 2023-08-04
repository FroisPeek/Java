package java_aula01;
import java.util.Scanner;

public class Aula001 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double C, K, F, Re, Ra; 
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		 C= scanner.nextDouble();
		 
		 F = C * 1.8 + 32;
		 K = C + 273.15;
		 Re = C * 0.8;
		 Ra = C * 1.8 + 32 + 459.67;
		 
		 System.out.printf("A temperatura em Fahrenheit: %.2f%n", F);
		 System.out.printf("A temperatura em Kelvin: %.2f%n", K);
		 System.out.printf("A temperatura em Reaumur: %.2f%n", Ra);
		 System.out.printf("A temperatura em Rankine: %.2f%n", Re);
		 scanner.close();
	}
}
