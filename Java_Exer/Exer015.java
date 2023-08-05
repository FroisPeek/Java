package application;
import java.util.Scanner;

public class Exer015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Coeficiente a: ");
		double a = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		double b = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		double c = sc.nextDouble();
		
		double delta = (b*b) - (4 * a * c);
		
		if (delta > 0) { 
			double x1 = (-b + Math.sqrt(delta)) / (2*a);
			double x2 = (-b - Math.sqrt(delta)) / (2*a);
			
			System.out.printf("X1: %.4f", x1);
			System.out.printf("\nX2: %.4f", x2);
		}else {
			System.out.println("Esta equacao nao possui raizes reais");
		}
		
		sc.close();
	}
}
